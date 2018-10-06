lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'integer';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
DOUBLE_TYPE : 'double';
SIGNED_TYPE : 'signed';
LONG_TYPE : 'long';
UNSIGNED_TYPE : 'unsigned';
SHORT_TYPE : 'short';
WHILE_    : 'WHILE';

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


DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;

/* STRING */
STRING_LITERAL : '"' ( EscapeSequence | ~('\\'|'"') )* '"';
fragment EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | OctalEscape ;
fragment OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7');

 

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';

/* Command start with '#' */
LINE_COMMAND : '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};


NEW_LINE: '\n';

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';

WS  : (' '|'\r'|'\t')+
    ;
