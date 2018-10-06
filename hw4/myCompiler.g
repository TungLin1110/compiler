grammar myCompiler;

options {
    language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    boolean TRACEON = false;
    HashMap<String,Integer> symtab = new HashMap<String,Integer>();
    int labelCount = 0;
    String str = "";
  int print_count = 0;
  int arg_count = 0;
  int addr_reg_num;

	  /*
    public enum TypeInfo {
    StringConstant,
    Integer,
		Float,
		Unknown,
		No_Exist,
		Error
    }
    */

    /* attr_type:
       1 => integer,
       2 => float,
       3 => String constant,
       -1 => do not exist,
       -2 => error
     */
     
    List<String> DataCode = new ArrayList<String>();
    List<String> TextCode = new ArrayList<String>();
 
    public static register reg = new register(0, 10);
   
    /*
     * Output prologue.
     */
    void prologue(String id)
    {
   	   TextCode.add("\n\n/* Text section */");
       TextCode.add("\t.section .text");
       TextCode.add("\t.global " + id);
       TextCode.add("\t.type " + id + ",@function");
       TextCode.add(id + ":");
       
       /* Follow x86 calling convention */
       TextCode.add("\t pushq \%rbp");
       TextCode.add("\t movq \%rsp,\%rbp");
       TextCode.add("\t pushq \%rbx"); //callee saved registers.
       TextCode.add("\t pushq \%r12"); //callee saved registers.
       TextCode.add("\t pushq \%r13"); //callee saved registers.
       TextCode.add("\t pushq \%r14"); //callee saved registers.
       TextCode.add("\t pushq \%r15"); //callee saved registers.
       TextCode.add("\t subq $8,\%rsp\n"); // aligned 16-byte boundary.
    }
    
    /*
     * Output epilogue.
     */
    void epilogue()
    {
       /* handle epilogue */
       
       /* Follow x86 calling convention */
       TextCode.add("\n\t addq $8,\%rsp");
       TextCode.add("\t popq \%r15");
       TextCode.add("\t popq \%r14");
       TextCode.add("\t popq \%r13");
       TextCode.add("\t popq \%r12");
       TextCode.add("\t popq \%rbx");
       TextCode.add("\t popq \%rbp");
	     TextCode.add("\t ret");
    }
    
    
    /* Generate a new label */
    String newLabel()
    {
       labelCount ++;
       return (new String("L")) + Integer.toString(labelCount);
    } 
    
    
    public List<String> getDataCode()
    {
       return DataCode;
    }
    
    public List<String> getTextCode()
    {
       return TextCode;
    }
}


program
    : declarations functions
    ;


functions
    : function functions
    |
    ;
				  
function
    : type Identifier '(' ')' '{'
      {
         /* output function prologue */
         prologue($Identifier.text);
      }
      l_declarations statements '}'
      {
	     if (TRACEON)
		     System.out.println("type Identifier () {declarations statements}");
	    
		 /* output function epilogue */	  
	     epilogue();
	  }
	;


/* global declaraction */
declarations
    :
	  type Identifier ';' declarations
      { 
	    if (TRACEON) System.out.println("declarations: type Identifier : declarations");
		if (symtab.containsKey($Identifier.text)) {
		    System.out.println("Type Error: " + 
				                $Identifier.getLine() + 
							    ": Redeclared identifier.");
	    } else {
			/* Add ID and its attr_type into the symbol table. */
			symtab.put($Identifier.text, $type.attr_type);	   
	    }
		
		/* code generation */
		switch($type.attr_type) {
		case 1: /* Type: integer, size=> 4 bytes, alignment=> 4 byte boundary. */
		        DataCode.add("\t .common " + $Identifier.text + ",4,4\n");
				break;
		case 2: /* Type: float, size=> 4 bytes, alignment=> 4 byte boundary. */
		        DataCode.add("\t .common " + $Identifier.text + ",4,4\n");
				break;
		default:
		}
	  }
    | { if (TRACEON) System.out.println("declarations: ");}
    ;


l_declarations
    :
    type Identifier ';' l_declarations
    {
      /* If you want to handle local variables, fix it. */ 
    }
    | 
    ;


type returns [int attr_type]
    : INT   { if (TRACEON) System.out.println("type: INT");  $attr_type=1; }
    | FLOAT { if (TRACEON) System.out.println("type: FLOAT");  $attr_type=2; }
    | VOID
    | CHAR
    ;

statements: statement statements
    |
    ;
		
statement returns [int attr_type]
    : Identifier '=' arith_expression ';'
	

    {
    if (TRACEON) System.out.println("expr: " + $Identifier.text + " = " + $arith_expression.text);
    if (symtab.containsKey($Identifier.text)) {
      if (symtab.get($Identifier.text) != $arith_expression.attr_type) {
        System.out.println("Type Error: Type mismatch for = in an expression.");
      }
      $attr_type = symtab.get($Identifier.text);
      /* code generation */
      TextCode.add("\t movl " + "\%r" + $arith_expression.reg_num + "d"  + "," + $Identifier.text + "(\%rip)");
	  
    } else {
      System.out.println("Type Error:"+ $Identifier.text + " undeclared");
    }
  }
    | IF '(' arith_expression ')' if_then_statements
    | Identifier func_argument
    {
      /* code generation */
      TextCode.add("\t movq " + "$" + $func_argument.label + ",\%rdi");
      TextCode.add("\t call " + $Identifier.text);
    }
    | 'printf' '('
  
      STRING_LITERAL
       {
         arg_count = 1;
         DataCode.add(".PRINT" + print_count + ":");
         str = "";
         str = '"' + $STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length() - 1) + '"';
         DataCode.add("\t.string " + str);
         TextCode.add("\tmovq " + "$.PRINT" + print_count + ", \%rdi");
       }

       (',' arg)+ ')' ';'
     {
       TextCode.add("\txor \%rax ,\%rax");
       TextCode.add("\tcall printf");
       print_count++;
     }
    ;


func_argument returns [String label]
    : '(' ')' ';'
      {
        /* handle function calls here. */
      }
    | '(' a = arith_expression 
      {
         /* handle function calls here. */
         if ($a.attr_type == 3) { // handle string type.
            label = newLabel();
            DataCode.add(label + ":");
            DataCode.add("\t .string " + $a.str);
         }
      }
	        ( ',' arith_expression )*
	    ')' ';' 
    ;

	
arith_expression returns [int attr_type, int reg_num, String str]
	: a = multExpr
	      {
	         $attr_type = $a.attr_type;
	         $reg_num = $a.reg_num;
	         $str = $a.str;
	      }
    ( '+' b = multExpr
	      { 
	        if ($a.attr_type != $b.attr_type) {
			       System.out.println("Type Error: " + 
				                 $a.start.getLine() +
						            ": Type mismatch for the operator + in an expression.");
		         $attr_type = -2;
		      }
		  
		      /* code generation */
          TextCode.add("\t addl " + "\%r" + $b.reg_num + "d"  + ", \%r" + $reg_num+"d");
        }
	  | '-' c = multExpr
		{ 
	        if ($a.attr_type != $c.attr_type) {
			       System.out.println("Type Error: " + 
				                 $a.start.getLine() +
						            ": Type mismatch for the operator + in an expression.");
		         $attr_type = -2;
		      }
		  
		      /* code generation */
          TextCode.add("\t subl " + "\%r" + $c.reg_num + "d"  + ", \%r" + $reg_num+"d");
        }
	| '*' d = multExpr
		{ 
	        if ($a.attr_type != $d.attr_type) {
			       System.out.println("Type Error: " + 
				                 $a.start.getLine() +
						            ": Type mismatch for the operator + in an expression.");
		         $attr_type = -2;
		      }
		  
		      /* code generation */
          TextCode.add("\t imull " + "\%r" + $d.reg_num + "d"  + ", \%r" + $reg_num+"d");
        }
	
	| '/' e = multExpr
		{ 
	        if ($a.attr_type != $e.attr_type) {
			       System.out.println("Type Error: " + 
				                 $a.start.getLine() +
						            ": Type mismatch for the operator + in an expression.");
		         $attr_type = -2;
		      }
		  
         TextCode.add("\t movl " + "\%EAX" + ", \%r" + $reg_num + "d" );
        TextCode.add("\t divl " + "\%r" + $e.reg_num + "d");
         TextCode.add("\t movl " + "\%r" + $e.reg_num + "d ," + "\%EAX" );
	
        }
	
	  )*
	;

	
multExpr returns [int attr_type, int reg_num, String str]
	: a = signExpr 
	  { 
	     $attr_type = $a.attr_type;
	     $reg_num = $a.reg_num;
	     $str = $a.str;
	  }
/*
      ( '*' signExpr
      | '/' signExpr
	  )*
*/
	;


signExpr returns [int attr_type, int reg_num, String str]
	: primaryExpr
	  { 
	     $attr_type = $primaryExpr.attr_type;
	     $reg_num = $primaryExpr.reg_num;
	     $str = $primaryExpr.str;
	  }
	| '-' primaryExpr
	;


primaryExpr returns [int attr_type, int reg_num, String str]
    : Integer_constant
      { 
         $attr_type = 1;
         $str = null;
         
         /* code generation */
         $reg_num = reg.get();  /* get an register */
	 $reg_num = $reg_num + 8;
         TextCode.add("\t movl " + "\$" + $Integer_constant.text + ", \%r" + $reg_num + "d" ); 
      }
    | Floating_point_constant { $attr_type = 2; }
    | STRING_LITERAL { $attr_type = 3; $str = $STRING_LITERAL.text; }
    | Identifier
      {
         $attr_type = symtab.get($Identifier.text);
         $str = null;
         
         /* code generation */

         $reg_num = reg.get(); /* get an register */
	 $reg_num = $reg_num + 8;
         TextCode.add("\t movl " + $Identifier.text + "(\%rip), \%r" + $reg_num + "d" );
	 if(arg_count == 1)
		     TextCode.add("\t movl " + $Identifier.text + "(\%rip), \%esi" );
	}
	  | '(' arith_expression ')' { $attr_type = $arith_expression.attr_type; }
    ;

	
if_then_statements
	: statement
	| '{' statements '}'
	;
arg
  : arith_expression
  {
   /* TextCode.add("\tmov " + "\%r" + arg_count +"d" + ", \%r" + $arith_expression.reg_num + "d");*/
    arg_count = 0;
  }
  ;
	
/* description of the tokens */
FLOAT:'float';
INT:'int';
VOID: 'void';
CHAR: 'char';
IF: 'if';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;


WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};
