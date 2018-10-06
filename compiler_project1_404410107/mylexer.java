// $ANTLR 3.5.2 mylexer.g 2018-04-09 08:02:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int AMPERSAND=5;
	public static final int ASSIGN_OP=6;
	public static final int BETTER_OP=7;
	public static final int BREAK=8;
	public static final int CARET=9;
	public static final int CHAR_TYPE=10;
	public static final int CLOSE_brace=11;
	public static final int CLOSE_bracket=12;
	public static final int CLOSE_parenthesis=13;
	public static final int COLON=14;
	public static final int COMMA=15;
	public static final int COMMENT1=16;
	public static final int COMMENT2=17;
	public static final int CONTINUE=18;
	public static final int DEC_NUM=19;
	public static final int DIGIT=20;
	public static final int DIVIDE=21;
	public static final int DOUBLE_TYPE=22;
	public static final int EQ_OP=23;
	public static final int EXCLAMATION=24;
	public static final int EscapeSequence=25;
	public static final int FLOAT_NUM=26;
	public static final int FLOAT_NUM1=27;
	public static final int FLOAT_NUM2=28;
	public static final int FLOAT_NUM3=29;
	public static final int FLOAT_TYPE=30;
	public static final int GE_OP=31;
	public static final int ID=32;
	public static final int INT_TYPE=33;
	public static final int LETTER=34;
	public static final int LE_OP=35;
	public static final int LINE_COMMAND=36;
	public static final int LONG_TYPE=37;
	public static final int LSHIFT_OP=38;
	public static final int MM_OP=39;
	public static final int MULTIPLY=40;
	public static final int NEW_LINE=41;
	public static final int NE_OP=42;
	public static final int OPEN_brace=43;
	public static final int OPEN_bracket=44;
	public static final int OPEN_parenthesis=45;
	public static final int OctalEscape=46;
	public static final int PERCENT=47;
	public static final int PP_OP=48;
	public static final int QUESTION=49;
	public static final int QUOTE=50;
	public static final int RETURN1=51;
	public static final int RSHIFT_OP=52;
	public static final int SEMICOLON=53;
	public static final int SHORT_TYPE=54;
	public static final int SIGNED_TYPE=55;
	public static final int SMALLER_OP=56;
	public static final int STRING_LITERAL=57;
	public static final int STRUCT=58;
	public static final int SUBSTRACT=59;
	public static final int UNDERSCORE=60;
	public static final int UNION=61;
	public static final int UNSIGNED_TYPE=62;
	public static final int VOID_TYPE=63;
	public static final int WHILE_=64;
	public static final int WS=65;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:10:11: ( 'integer' )
			// mylexer.g:10:13: 'integer'
			{
			match("integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:11:11: ( 'char' )
			// mylexer.g:11:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:12:11: ( 'void' )
			// mylexer.g:12:13: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:13:11: ( 'float' )
			// mylexer.g:13:13: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:14:13: ( 'double' )
			// mylexer.g:14:15: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "SIGNED_TYPE"
	public final void mSIGNED_TYPE() throws RecognitionException {
		try {
			int _type = SIGNED_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:15:13: ( 'signed' )
			// mylexer.g:15:15: 'signed'
			{
			match("signed"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGNED_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:16:11: ( 'long' )
			// mylexer.g:16:13: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "UNSIGNED_TYPE"
	public final void mUNSIGNED_TYPE() throws RecognitionException {
		try {
			int _type = UNSIGNED_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:15: ( 'unsigned' )
			// mylexer.g:17:17: 'unsigned'
			{
			match("unsigned"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNSIGNED_TYPE"

	// $ANTLR start "SHORT_TYPE"
	public final void mSHORT_TYPE() throws RecognitionException {
		try {
			int _type = SHORT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:18:12: ( 'short' )
			// mylexer.g:18:14: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT_TYPE"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:19:11: ( 'WHILE' )
			// mylexer.g:19:13: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_"

	// $ANTLR start "STRUCT"
	public final void mSTRUCT() throws RecognitionException {
		try {
			int _type = STRUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:8: ( 'struct' )
			// mylexer.g:22:10: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCT"

	// $ANTLR start "UNION"
	public final void mUNION() throws RecognitionException {
		try {
			int _type = UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:23:7: ( 'union' )
			// mylexer.g:23:9: 'union'
			{
			match("union"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNION"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:29:7: ( '==' )
			// mylexer.g:29:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:30:7: ( '<=' )
			// mylexer.g:30:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:31:7: ( '>=' )
			// mylexer.g:31:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:32:7: ( '!=' )
			// mylexer.g:32:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:33:7: ( '++' )
			// mylexer.g:33:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:34:7: ( '--' )
			// mylexer.g:34:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:35:11: ( '<<' )
			// mylexer.g:35:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:36:11: ( '>>' )
			// mylexer.g:36:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "SMALLER_OP"
	public final void mSMALLER_OP() throws RecognitionException {
		try {
			int _type = SMALLER_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:37:12: ( '<' )
			// mylexer.g:37:14: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SMALLER_OP"

	// $ANTLR start "BETTER_OP"
	public final void mBETTER_OP() throws RecognitionException {
		try {
			int _type = BETTER_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:38:11: ( '>' )
			// mylexer.g:38:13: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BETTER_OP"

	// $ANTLR start "ASSIGN_OP"
	public final void mASSIGN_OP() throws RecognitionException {
		try {
			int _type = ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:42:11: ( '=' )
			// mylexer.g:42:13: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN_OP"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:45:10: ( 'continue' ';' )
			// mylexer.g:45:12: 'continue' ';'
			{
			match("continue"); 

			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:46:7: ( 'break' ';' )
			// mylexer.g:46:9: 'break' ';'
			{
			match("break"); 

			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "RETURN1"
	public final void mRETURN1() throws RecognitionException {
		try {
			int _type = RETURN1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:47:9: ( 'return' ';' )
			// mylexer.g:47:11: 'return' ';'
			{
			match("return"); 

			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN1"

	// $ANTLR start "OPEN_parenthesis"
	public final void mOPEN_parenthesis() throws RecognitionException {
		try {
			int _type = OPEN_parenthesis;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:50:18: ( '(' )
			// mylexer.g:50:20: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_parenthesis"

	// $ANTLR start "CLOSE_parenthesis"
	public final void mCLOSE_parenthesis() throws RecognitionException {
		try {
			int _type = CLOSE_parenthesis;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:51:19: ( ')' )
			// mylexer.g:51:21: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_parenthesis"

	// $ANTLR start "OPEN_bracket"
	public final void mOPEN_bracket() throws RecognitionException {
		try {
			int _type = OPEN_bracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:14: ( '[' )
			// mylexer.g:54:16: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_bracket"

	// $ANTLR start "CLOSE_bracket"
	public final void mCLOSE_bracket() throws RecognitionException {
		try {
			int _type = CLOSE_bracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:55:15: ( ']' )
			// mylexer.g:55:17: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_bracket"

	// $ANTLR start "OPEN_brace"
	public final void mOPEN_brace() throws RecognitionException {
		try {
			int _type = OPEN_brace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:58:12: ( '{' )
			// mylexer.g:58:14: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_brace"

	// $ANTLR start "CLOSE_brace"
	public final void mCLOSE_brace() throws RecognitionException {
		try {
			int _type = CLOSE_brace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:59:13: ( '}' )
			// mylexer.g:59:15: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_brace"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:62:7: ( '\"' )
			// mylexer.g:62:9: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:63:7: ( ',' )
			// mylexer.g:63:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "EXCLAMATION"
	public final void mEXCLAMATION() throws RecognitionException {
		try {
			int _type = EXCLAMATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:64:13: ( '!' )
			// mylexer.g:64:15: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXCLAMATION"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:65:10: ( '?' )
			// mylexer.g:65:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:66:11: ( ';' )
			// mylexer.g:66:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			int _type = UNDERSCORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:67:12: ( '_' )
			// mylexer.g:67:14: '_'
			{
			match('_'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:68:9: ( '%' )
			// mylexer.g:68:11: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERCENT"

	// $ANTLR start "AMPERSAND"
	public final void mAMPERSAND() throws RecognitionException {
		try {
			int _type = AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:69:11: ( '&' )
			// mylexer.g:69:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPERSAND"

	// $ANTLR start "CARET"
	public final void mCARET() throws RecognitionException {
		try {
			int _type = CARET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:70:7: ( '^' )
			// mylexer.g:70:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CARET"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:71:7: ( ':' )
			// mylexer.g:71:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:75:5: ( '+' )
			// mylexer.g:75:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUBSTRACT"
	public final void mSUBSTRACT() throws RecognitionException {
		try {
			int _type = SUBSTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:76:11: ( '-' )
			// mylexer.g:76:13: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBSTRACT"

	// $ANTLR start "MULTIPLY"
	public final void mMULTIPLY() throws RecognitionException {
		try {
			int _type = MULTIPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:77:10: ( '*' )
			// mylexer.g:77:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTIPLY"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:78:8: ( '/' )
			// mylexer.g:78:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:81:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// mylexer.g:81:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// mylexer.g:81:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='0') ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// mylexer.g:81:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:81:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:81:28: ( DIGIT )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// mylexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:83:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:83:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:83:14: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:85:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt4=3;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// mylexer.g:85:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:85:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// mylexer.g:85:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mylexer.g:86:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:86:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:86:22: ( DIGIT )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			match('.'); 
			// mylexer.g:86:33: ( DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mylexer.g:87:20: ( '.' ( DIGIT )+ )
			// mylexer.g:87:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:87:25: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// mylexer.g:88:20: ( ( DIGIT )+ )
			// mylexer.g:88:22: ( DIGIT )+
			{
			// mylexer.g:88:22: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:91:16: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// mylexer.g:91:18: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// mylexer.g:91:22: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\\') ) {
					alt9=1;
				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// mylexer.g:91:24: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// mylexer.g:91:41: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// mylexer.g:93:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\\') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='\"'||LA10_1=='\''||LA10_1=='\\'||LA10_1=='b'||LA10_1=='f'||LA10_1=='n'||LA10_1=='r'||LA10_1=='t') ) {
					alt10=1;
				}
				else if ( ((LA10_1 >= '0' && LA10_1 <= '7')) ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// mylexer.g:93:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// mylexer.g:93:53: OctalEscape
					{
					mOctalEscape(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "OctalEscape"
	public final void mOctalEscape() throws RecognitionException {
		try {
			// mylexer.g:95:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt11=3;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\\') ) {
				int LA11_1 = input.LA(2);
				if ( ((LA11_1 >= '0' && LA11_1 <= '3')) ) {
					int LA11_2 = input.LA(3);
					if ( ((LA11_2 >= '0' && LA11_2 <= '7')) ) {
						int LA11_4 = input.LA(4);
						if ( ((LA11_4 >= '0' && LA11_4 <= '7')) ) {
							alt11=1;
						}

						else {
							alt11=2;
						}

					}

					else {
						alt11=3;
					}

				}
				else if ( ((LA11_1 >= '4' && LA11_1 <= '7')) ) {
					int LA11_3 = input.LA(3);
					if ( ((LA11_3 >= '0' && LA11_3 <= '7')) ) {
						alt11=2;
					}

					else {
						alt11=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// mylexer.g:95:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// mylexer.g:96:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// mylexer.g:97:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OctalEscape"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:102:10: ( '//' ( . )* '\\n' )
			// mylexer.g:102:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:102:16: ( . )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\n') ) {
					alt12=2;
				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mylexer.g:102:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop12;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:103:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// mylexer.g:103:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// mylexer.g:103:17: ( options {greedy=false; } : . )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='*') ) {
					int LA13_1 = input.LA(2);
					if ( (LA13_1=='/') ) {
						alt13=2;
					}
					else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
						alt13=1;
					}

				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:103:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop13;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "LINE_COMMAND"
	public final void mLINE_COMMAND() throws RecognitionException {
		try {
			int _type = LINE_COMMAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:106:14: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// mylexer.g:106:16: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match('#'); 
			// mylexer.g:106:20: (~ ( '\\n' | '\\r' ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			// mylexer.g:106:34: ( '\\r' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\r') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// mylexer.g:106:34: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMAND"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:109:9: ( '\\n' )
			// mylexer.g:109:11: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mylexer.g:111:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mylexer.g:112:16: ( '0' .. '9' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:114:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// mylexer.g:114:7: ( ' ' | '\\r' | '\\t' )+
			{
			// mylexer.g:114:7: ( ' ' | '\\r' | '\\t' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\t'||LA16_0=='\r'||LA16_0==' ') ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// mylexer.g:1:8: ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | SIGNED_TYPE | LONG_TYPE | UNSIGNED_TYPE | SHORT_TYPE | WHILE_ | STRUCT | UNION | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | SMALLER_OP | BETTER_OP | ASSIGN_OP | CONTINUE | BREAK | RETURN1 | OPEN_parenthesis | CLOSE_parenthesis | OPEN_bracket | CLOSE_bracket | OPEN_brace | CLOSE_brace | QUOTE | COMMA | EXCLAMATION | QUESTION | SEMICOLON | UNDERSCORE | PERCENT | AMPERSAND | CARET | COLON | ADD | SUBSTRACT | MULTIPLY | DIVIDE | DEC_NUM | ID | FLOAT_NUM | STRING_LITERAL | COMMENT1 | COMMENT2 | LINE_COMMAND | NEW_LINE | WS )
		int alt17=55;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// mylexer.g:1:10: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 2 :
				// mylexer.g:1:19: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 3 :
				// mylexer.g:1:29: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 4 :
				// mylexer.g:1:39: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 5 :
				// mylexer.g:1:50: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 6 :
				// mylexer.g:1:62: SIGNED_TYPE
				{
				mSIGNED_TYPE(); 

				}
				break;
			case 7 :
				// mylexer.g:1:74: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 8 :
				// mylexer.g:1:84: UNSIGNED_TYPE
				{
				mUNSIGNED_TYPE(); 

				}
				break;
			case 9 :
				// mylexer.g:1:98: SHORT_TYPE
				{
				mSHORT_TYPE(); 

				}
				break;
			case 10 :
				// mylexer.g:1:109: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 11 :
				// mylexer.g:1:116: STRUCT
				{
				mSTRUCT(); 

				}
				break;
			case 12 :
				// mylexer.g:1:123: UNION
				{
				mUNION(); 

				}
				break;
			case 13 :
				// mylexer.g:1:129: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 14 :
				// mylexer.g:1:135: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 15 :
				// mylexer.g:1:141: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 16 :
				// mylexer.g:1:147: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 17 :
				// mylexer.g:1:153: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 18 :
				// mylexer.g:1:159: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 19 :
				// mylexer.g:1:165: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 20 :
				// mylexer.g:1:175: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 21 :
				// mylexer.g:1:185: SMALLER_OP
				{
				mSMALLER_OP(); 

				}
				break;
			case 22 :
				// mylexer.g:1:196: BETTER_OP
				{
				mBETTER_OP(); 

				}
				break;
			case 23 :
				// mylexer.g:1:206: ASSIGN_OP
				{
				mASSIGN_OP(); 

				}
				break;
			case 24 :
				// mylexer.g:1:216: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 25 :
				// mylexer.g:1:225: BREAK
				{
				mBREAK(); 

				}
				break;
			case 26 :
				// mylexer.g:1:231: RETURN1
				{
				mRETURN1(); 

				}
				break;
			case 27 :
				// mylexer.g:1:239: OPEN_parenthesis
				{
				mOPEN_parenthesis(); 

				}
				break;
			case 28 :
				// mylexer.g:1:256: CLOSE_parenthesis
				{
				mCLOSE_parenthesis(); 

				}
				break;
			case 29 :
				// mylexer.g:1:274: OPEN_bracket
				{
				mOPEN_bracket(); 

				}
				break;
			case 30 :
				// mylexer.g:1:287: CLOSE_bracket
				{
				mCLOSE_bracket(); 

				}
				break;
			case 31 :
				// mylexer.g:1:301: OPEN_brace
				{
				mOPEN_brace(); 

				}
				break;
			case 32 :
				// mylexer.g:1:312: CLOSE_brace
				{
				mCLOSE_brace(); 

				}
				break;
			case 33 :
				// mylexer.g:1:324: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 34 :
				// mylexer.g:1:330: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 35 :
				// mylexer.g:1:336: EXCLAMATION
				{
				mEXCLAMATION(); 

				}
				break;
			case 36 :
				// mylexer.g:1:348: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 37 :
				// mylexer.g:1:357: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 38 :
				// mylexer.g:1:367: UNDERSCORE
				{
				mUNDERSCORE(); 

				}
				break;
			case 39 :
				// mylexer.g:1:378: PERCENT
				{
				mPERCENT(); 

				}
				break;
			case 40 :
				// mylexer.g:1:386: AMPERSAND
				{
				mAMPERSAND(); 

				}
				break;
			case 41 :
				// mylexer.g:1:396: CARET
				{
				mCARET(); 

				}
				break;
			case 42 :
				// mylexer.g:1:402: COLON
				{
				mCOLON(); 

				}
				break;
			case 43 :
				// mylexer.g:1:408: ADD
				{
				mADD(); 

				}
				break;
			case 44 :
				// mylexer.g:1:412: SUBSTRACT
				{
				mSUBSTRACT(); 

				}
				break;
			case 45 :
				// mylexer.g:1:422: MULTIPLY
				{
				mMULTIPLY(); 

				}
				break;
			case 46 :
				// mylexer.g:1:431: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 47 :
				// mylexer.g:1:438: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 48 :
				// mylexer.g:1:446: ID
				{
				mID(); 

				}
				break;
			case 49 :
				// mylexer.g:1:449: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 50 :
				// mylexer.g:1:459: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 51 :
				// mylexer.g:1:474: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 52 :
				// mylexer.g:1:483: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 53 :
				// mylexer.g:1:492: LINE_COMMAND
				{
				mLINE_COMMAND(); 

				}
				break;
			case 54 :
				// mylexer.g:1:505: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 55 :
				// mylexer.g:1:514: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA4_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA4_eofS =
		"\5\uffff";
	static final String DFA4_minS =
		"\2\56\3\uffff";
	static final String DFA4_maxS =
		"\2\71\3\uffff";
	static final String DFA4_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA4_specialS =
		"\5\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "85:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA17_eotS =
		"\1\uffff\11\45\1\67\1\72\1\75\1\77\1\101\1\103\2\45\6\uffff\1\106\3\uffff"+
		"\1\110\5\uffff\1\113\2\114\5\uffff\14\45\16\uffff\2\45\7\uffff\1\114\20"+
		"\45\1\155\1\45\1\157\5\45\1\165\6\45\1\uffff\1\45\1\uffff\1\175\2\45\1"+
		"\u0080\1\45\1\uffff\1\45\1\u0083\1\u0084\4\45\1\uffff\1\u0089\1\u008a"+
		"\1\uffff\1\u008b\1\45\3\uffff\1\45\1\u008e\1\45\3\uffff\1\45\2\uffff\1"+
		"\45\1\u0092\2\uffff";
	static final String DFA17_eofS =
		"\u0093\uffff";
	static final String DFA17_minS =
		"\1\11\1\156\1\150\1\157\1\154\1\157\1\150\1\157\1\156\1\110\1\75\1\74"+
		"\2\75\1\53\1\55\1\162\1\145\6\uffff\1\0\3\uffff\1\60\5\uffff\1\52\2\56"+
		"\5\uffff\1\164\1\141\1\156\1\151\1\157\1\165\1\147\1\157\1\162\1\156\1"+
		"\151\1\111\16\uffff\1\145\1\164\7\uffff\1\56\1\145\1\162\1\164\1\144\1"+
		"\141\1\142\1\156\1\162\1\165\1\147\1\151\1\157\1\114\1\141\1\165\1\147"+
		"\1\60\1\151\1\60\1\164\1\154\1\145\1\164\1\143\1\60\1\147\1\156\1\105"+
		"\1\153\1\162\1\145\1\uffff\1\156\1\uffff\1\60\1\145\1\144\1\60\1\164\1"+
		"\uffff\1\156\2\60\1\73\1\156\1\162\1\165\1\uffff\2\60\1\uffff\1\60\1\145"+
		"\3\uffff\1\73\1\60\1\145\3\uffff\1\144\2\uffff\1\73\1\60\2\uffff";
	static final String DFA17_maxS =
		"\1\175\1\156\2\157\1\154\1\157\1\164\1\157\1\156\1\110\2\75\1\76\1\75"+
		"\1\53\1\55\1\162\1\145\6\uffff\1\uffff\3\uffff\1\172\5\uffff\1\57\2\71"+
		"\5\uffff\1\164\1\141\1\156\1\151\1\157\1\165\1\147\1\157\1\162\1\156\1"+
		"\163\1\111\16\uffff\1\145\1\164\7\uffff\1\71\1\145\1\162\1\164\1\144\1"+
		"\141\1\142\1\156\1\162\1\165\1\147\1\151\1\157\1\114\1\141\1\165\1\147"+
		"\1\172\1\151\1\172\1\164\1\154\1\145\1\164\1\143\1\172\1\147\1\156\1\105"+
		"\1\153\1\162\1\145\1\uffff\1\156\1\uffff\1\172\1\145\1\144\1\172\1\164"+
		"\1\uffff\1\156\2\172\1\73\1\156\1\162\1\165\1\uffff\2\172\1\uffff\1\172"+
		"\1\145\3\uffff\1\73\1\172\1\145\3\uffff\1\144\2\uffff\1\73\1\172\2\uffff";
	static final String DFA17_acceptS =
		"\22\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1\uffff\1\42\1\44\1\45\1\uffff"+
		"\1\47\1\50\1\51\1\52\1\55\3\uffff\1\60\1\61\1\65\1\66\1\67\14\uffff\1"+
		"\15\1\27\1\16\1\23\1\25\1\17\1\24\1\26\1\20\1\43\1\21\1\53\1\22\1\54\2"+
		"\uffff\1\41\1\62\1\46\1\63\1\64\1\56\1\57\40\uffff\1\2\1\uffff\1\3\5\uffff"+
		"\1\7\7\uffff\1\4\2\uffff\1\11\2\uffff\1\14\1\12\1\31\3\uffff\1\5\1\6\1"+
		"\13\1\uffff\1\32\1\1\2\uffff\1\30\1\10";
	static final String DFA17_specialS =
		"\30\uffff\1\0\172\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\51\1\50\2\uffff\1\51\22\uffff\1\51\1\15\1\30\1\47\1\uffff\1\35\1\36"+
			"\1\uffff\1\22\1\23\1\41\1\16\1\31\1\17\1\46\1\42\1\43\11\44\1\40\1\33"+
			"\1\13\1\12\1\14\1\32\1\uffff\26\45\1\11\3\45\1\24\1\uffff\1\25\1\37\1"+
			"\34\1\uffff\1\45\1\20\1\2\1\5\1\45\1\4\2\45\1\1\2\45\1\7\5\45\1\21\1"+
			"\6\1\45\1\10\1\3\4\45\1\26\1\uffff\1\27",
			"\1\52",
			"\1\53\6\uffff\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\61\1\60\12\uffff\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\71\1\70",
			"\1\73\1\74",
			"\1\76",
			"\1\100",
			"\1\102",
			"\1\104",
			"\1\105",
			"",
			"",
			"",
			"",
			"",
			"",
			"\0\107",
			"",
			"",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"",
			"",
			"",
			"",
			"\1\112\4\uffff\1\111",
			"\1\46\1\uffff\12\46",
			"\1\46\1\uffff\12\115",
			"",
			"",
			"",
			"",
			"",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\131\11\uffff\1\130",
			"\1\132",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\133",
			"\1\134",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\46\1\uffff\12\115",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\156",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"",
			"\1\174",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\176",
			"\1\177",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u0081",
			"",
			"\1\u0082",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u008c",
			"",
			"",
			"",
			"\1\u008d",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u008f",
			"",
			"",
			"",
			"\1\u0090",
			"",
			"",
			"\1\u0091",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | SIGNED_TYPE | LONG_TYPE | UNSIGNED_TYPE | SHORT_TYPE | WHILE_ | STRUCT | UNION | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | SMALLER_OP | BETTER_OP | ASSIGN_OP | CONTINUE | BREAK | RETURN1 | OPEN_parenthesis | CLOSE_parenthesis | OPEN_bracket | CLOSE_bracket | OPEN_brace | CLOSE_brace | QUOTE | COMMA | EXCLAMATION | QUESTION | SEMICOLON | UNDERSCORE | PERCENT | AMPERSAND | CARET | COLON | ADD | SUBSTRACT | MULTIPLY | DIVIDE | DEC_NUM | ID | FLOAT_NUM | STRING_LITERAL | COMMENT1 | COMMENT2 | LINE_COMMAND | NEW_LINE | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_24 = input.LA(1);
						s = -1;
						if ( ((LA17_24 >= '\u0000' && LA17_24 <= '\uFFFF')) ) {s = 71;}
						else s = 70;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
