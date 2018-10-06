grammar myparser;

@header {
// import packages here.
}

@members {
boolean TRACEON = true;
}

eval : program;

program
  : statements +
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
  | 'return' expr? ';'
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



declaration : type Identifier
  { if (TRACEON) System.out.println("declare: " + $type.text + " " + $Identifier.text); };


expr
  : compare
  | var=Identifier '=' func=Identifier '(' argumentList? ')'
    { if (TRACEON) System.out.println("expr: " + $var.text + " = " + $func.text + "(" + $argumentList.text + ")"); }
  | Identifier '=' expr { if (TRACEON) System.out.println("expr: " + $Identifier.text + " = " + $expr.text); }

  ;

pList
  : declaration
  | declaration ',' pList
  ;




compare
  : i
  | a=i '<' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " < " + $b.text); }
  | a=i '<=' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " <=" + $b.text); }
  | a=i '>' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " > " + $b.text); }
  | a=i '>=' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " >= " + $b.text); }
  | a=i '==' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " == " + $b.text); }
  | a=i '!=' b=i { if (TRACEON) System.out.println("compare: " + $a.text + " != " + $b.text); }
  ;

i
  : j
  | i '+' j
  | i '-' j
  ;

j
  : term
  | j '*' term
  | j '/' term
  ;

term
  : Identifier
  | parenexpr
  | integer
  ;

argumentList
  : term
  | term ',' argumentList
  ;

parenexpr
  : '(' expr ')'
  ;

type : (Int | Char | Void| Double| FLOAT | SIGNED | LONG | UNSIGNED | SHORT );

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
