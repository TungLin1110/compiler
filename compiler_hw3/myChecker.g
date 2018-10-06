grammar myChecker;

@header {
 import java.util.HashMap;
}

@members {
  boolean TRACEON = false;
  HashMap<String,Integer> symtab = new HashMap<String,Integer>();
  public enum TypeInfo {
	Int,
	Char,
	Void,
	FLOAT,
	Double,
	SIGNED,
	LONG,
	UNSIGNED,
	SHORT,
	Unknown,
	No_Exist,
	Error
    }
    /*
	attr_type:
	1 => integer,
        2 => float,
        -1 => do not exist,
        -2 => error
     */	 
}



program
  : (statements | function)+ EOF
  ;

statements
  : 'for' '(' expr? ';' expr? ';' expr? ')' statements
  | '{' statements* '}'
  | declaration '(' pList? ')' '{' statements* '}'
  | declaration ';'
  | 'if' parenexpr statements
  | 'if' parenexpr statements 'else' statements
  | 'while' parenexpr statements
  | expr ';'
  | 'return' expr? ';'{ if (TRACEON) System.out.println("return: " + $expr.text); }
  | ';'
  ;

arith_expression: multExpr
	( '+' multExpr
	| '-' multExpr
	)*
        ;

multExpr: signExpr
        ( '*' signExpr
        | '/' signExpr
	)*
	;

signExpr: primaryExpr
        | '-' primaryExpr
	;
		  
primaryExpr: Integer_constant
        | Floating_point_constant
        | Identifier
	| '(' arith_expression ')'
        ;

declaration : type id
  { 
	if (TRACEON) System.out.println("declarations: type Identifier : declarations");
   	if (symtab.containsKey($id.text)) {
     		System.out.println("Type Error: " + $id.start.getLine() + ": ID Redeclared ");
    	} else {
     	 /* Add ID and its attr_type into the symbol table. */
    	  symtab.put($id.text, $type.attr_type);
  	}
	
  };

function : type id '('pList? ')' '{' statements* '}'
  {
    	if (TRACEON) System.out.println("function: " + $type.text + " " + $id.text);
    	if (symtab.containsKey($id.text)) {
        	System.out.println("Error: " + $id.start.getLine() + ": Redefinition of ‘" + $id.text + "’");
    	} else {
      	/* Add ID and its attr_type into the symbol table. */
      	symtab.put($id.text, $type.attr_type);
    	}
  };


type returns [int attr_type]
  : Int {if (TRACEON) System.out.println("type: INT"); $attr_type = 1;}
  | Char {if (TRACEON) System.out.println("type: Char"); $attr_type = 2;}
  | Void {if (TRACEON) System.out.println("type: Void"); $attr_type = 3;}
  | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); $attr_type = 4;}
  | Double {if (TRACEON) System.out.println("type: Double"); $attr_type = 5;}
  | SIGNED {if (TRACEON) System.out.println("type: SIGNED"); $attr_type = 6;}
  | LONG {if (TRACEON) System.out.println("type: LONG"); $attr_type = 7;}
  | UNSIGNED {if (TRACEON) System.out.println("type: UNSIGNED"); $attr_type = 8;}
  | SHORT {if (TRACEON) System.out.println("type: SHORT"); $attr_type = 9;}
  ;

pList
  : declaration
  | declaration ',' pList
  ;

argumentList
  : term
  | term ',' argumentList
  ;

parenexpr
  : '(' expr ')'
  ;

expr returns [int attr_type]
  : compare {$attr_type = $compare.attr_type; }
  | var=id '=' func=id '(' argumentList? ')'
    {
      if (TRACEON) System.out.println("expr: " + $var.text + " = " + $func.text + "(" + $argumentList.text + ")");
      if (symtab.containsKey($var.text) && symtab.containsKey($func.text)) {
        if (symtab.get($var.text) != symtab.get($func.text)) {
          System.out.println("Type Error: " + $var.start.getLine() + ": Type not match : = in an expression.");
        }
        $attr_type = symtab.get($var.text);
      } else if (!symtab.containsKey($var.text)) {
        System.out.println("Type Error: " + $id.start.getLine() + ": ‘" + $var.text + "’ is undeclared");
      } else {
        System.out.println("Error: " + $id.start.getLine() + ": ‘" + $func.text + "’ is undeclared");
      }
    }
  | id '=' expr
    {
      if (TRACEON) System.out.println("expr: " + $id.text + " = " + $expr.text);
      if (symtab.containsKey($id.text)) {
        if (symtab.get($id.text) != $expr.attr_type) {
          System.out.println("Type Error: " + $id.start.getLine() + ": Type not match : = in an expression.");
        }
        $attr_type = symtab.get($id.text);
      } else {
        System.out.println("Type Error: " + $id.start.getLine() + ": ‘" + $id.text + "’ is undeclared");
      }
    }
  ;
//124
compare returns [int attr_type]
  : i { $attr_type = $i.attr_type; }
  | a=i '<' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " < " + $b.text); }
  | a=i '<=' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " <= " + $b.text); }
  | a=i '>' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " > " + $b.text); }
  | a=i '>=' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " >= " + $b.text); }
  | a=i '==' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " == " + $b.text); }
  | a=i '!=' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " != " + $b.text); }
  ;



i returns [int attr_type]
  : a = j { $attr_type = $a.attr_type; }
  ('+' b = j
  {
    if ($a.attr_type != $b.attr_type) {
      System.out.println("Type Error: " + $a.start.getLine() + ": Type not match : the operator + in an expression.");
      $attr_type = -2;
    }
  }
  | '-' c = j
  {
    if ($a.attr_type != $c.attr_type) {
      System.out.println("Type Error: " + $a.start.getLine() + ": Type not match : the operator - in an expression.");
      $attr_type = -2;
    }
  }
  | '*' d = j
  {
    if ($a.attr_type != $d.attr_type) {
      System.out.println("Type Error: " + $a.start.getLine() + ": Type not match : the operator * in an expression.");
      $attr_type = -2;
    }
  }
  | '/' e = j
  {
    if ($a.attr_type != $e.attr_type) {
      System.out.println("Type Error: " + $a.start.getLine() + ": Type not match : the operator / in an expression.");
      $attr_type = -2;
    }
  }
  )*
  ;

j returns [int attr_type]
  : a = term  {  $attr_type = $a.attr_type;  }
  | j '*' term
  | j '/' term
  ;

term returns [int attr_type]
  : a = id
  {
    if (symtab.containsKey($a.text)) 
    {
        $attr_type = symtab.get($a.text);
    } 
    else 
    {
        System.out.println("Type Error: " + $a.start.getLine() + ": ‘" + $a.text + "’ is undeclared");
    }
  }
  | integer
  {
    $attr_type = 1;
  }
  | parenexpr
  ;

Int  : 'int';
Char : 'char';
Void : 'void';
FLOAT:'float';
Double : 'double';
SIGNED : 'signed';
LONG : 'long';
UNSIGNED : 'unsigned';
SHORT : 'short';


If : 'if';
Else : 'else';
For : 'for';
While : 'while';

/* struct union */
STRUCT : 'struct';
UNION : 'union';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
SMALLER_OP : '<';
BETTER_OP : '>';


/* Assign */
ASSIGN_OP : '=';

/* jump */
CONTINUE : 'continue' ';';
BREAK : 'break' ';';
RETURN1 : 'return' ';';

/* parenthesis   */
OPEN_parenthesis : '(';
CLOSE_parenthesis : ')';

/* bracket   */
OPEN_bracket : '[';
CLOSE_bracket : ']';

/* brace   */
OPEN_brace : '{';
CLOSE_brace : '}';

/* symbol */
QUOTE : '"';
COMMA : ',';
EXCLAMATION : '!';
QUESTION : '?';
SEMICOLON : ';';
UNDERSCORE : '_';
PERCENT : '%';
AMPERSAND : '&';
CARET : '^';
COLON : ':';


/* operator */
ADD : '+';
SUBSTRACT : '-';
MULTIPLY : '*';
DIVIDE : '/';


id : Identifier;
integer : Integer_constant;

Identifier: [a-z]+;
Integer_constant: [0-9]+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;
Whitespace : [ \t]+ -> skip;
Newline : ('\r' '\n'? | '\n' ) -> skip;
BlockComment : '/*' .*? '*/' -> skip;
LineComment : '//' ~[\r\n]* -> skip;
