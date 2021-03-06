// Generated from D:/Laci/egyetem/szakdolgozat/SML/src/main/java/antlr\SML.g4 by ANTLR 4.6
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMMENT=2, STATE_DELIMITER=3, STATE_ATTRIBUTES_DELIMITER=4, STATE_START_DELIMITER=5, 
		STATE_GOAL_DELIMITER=6, OPERATOR_DELIMITER=7, OPERATOR_DESCRIPTION_DELIMITER=8, 
		OPERATOR_PRECONDITION_DELIMITER=9, OPERATOR_EFFECT_DELIMITER=10, KEYWORD_IF=11, 
		KEYWORD_ELSE=12, KEYWORD_FOR=13, KEYWORD_PARAM=14, KEYWORD_FROM=15, KEYWORD_TO=16, 
		KEYWORD_BY=17, KEYWORD_TIMES=18, KEYWORD_ATTRIBUTE=19, KEYWORD_VAR=20, 
		KEYWORD_COST=21, KEYWORD_IS=22, KEYWORD_OF=23, KEYWORD_SET=24, KEYWORD_MATRIX=25, 
		KEYWORD_WORD=26, KEYWORD_NUMBER=27, KEYWORD_MINIMUM=28, KEYWORD_MAXIMUM=29, 
		KEYWORD_SUM=30, KEYWORD_AVERAGE=31, KEYWORD_ABS=32, KEYWORD_UNION=33, 
		KEYWORD_INTERSECT=34, KEYWORD_DIFFERENCE=35, KEYWORD_ADD=36, KEYWORD_REMOVE=37, 
		KEYWORD_CARDINALITY=38, KEYWORD_CHAR_AT=39, KEYWORD_LENGTH=40, KEYWORD_AND=41, 
		KEYWORD_OR=42, KEYWORD_NOT=43, KEYWORD_INF=44, SYMBOL_EQUAL=45, SYMBOL_NOT_EQUAL=46, 
		SYMBOL_LESSER=47, SYMBOL_GREATER=48, SYMBOL_LESSER_OR_EQUAL=49, SYMBOL_GREATER_OR_EQUAL=50, 
		SYMBOL_ADDITION=51, SYMBOL_SUBSTRACT=52, SYMBOL_MULTIPLICATION=53, SYMBOL_DIVISION=54, 
		SYMBOL_POWER=55, SYMBOL_ASSIGN=56, SYMBOL_REFERENCE=57, SYMBOL_COMMA=58, 
		SYMBOL_QUOTE=59, SYMBOL_SINGLE_QOUTE=60, SYMBOL_LPAREN=61, SYMBOL_RPAREN=62, 
		SYMBOL_LBRACE=63, SYMBOL_RBRACE=64, SYMBOL_LBRACK=65, SYMOBL_RBRACK=66, 
		SYMBOL_COMMENT_START=67, SYMBOL_COMMENT_END=68, INT=69, FLOAT=70, PARAM_NAME=71, 
		WS=72;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "COMMENT", "STATE_DELIMITER", "STATE_ATTRIBUTES_DELIMITER", "STATE_START_DELIMITER", 
		"STATE_GOAL_DELIMITER", "OPERATOR_DELIMITER", "OPERATOR_DESCRIPTION_DELIMITER", 
		"OPERATOR_PRECONDITION_DELIMITER", "OPERATOR_EFFECT_DELIMITER", "KEYWORD_IF", 
		"KEYWORD_ELSE", "KEYWORD_FOR", "KEYWORD_PARAM", "KEYWORD_FROM", "KEYWORD_TO", 
		"KEYWORD_BY", "KEYWORD_TIMES", "KEYWORD_ATTRIBUTE", "KEYWORD_VAR", "KEYWORD_COST", 
		"KEYWORD_IS", "KEYWORD_OF", "KEYWORD_SET", "KEYWORD_MATRIX", "KEYWORD_WORD", 
		"KEYWORD_NUMBER", "KEYWORD_MINIMUM", "KEYWORD_MAXIMUM", "KEYWORD_SUM", 
		"KEYWORD_AVERAGE", "KEYWORD_ABS", "KEYWORD_UNION", "KEYWORD_INTERSECT", 
		"KEYWORD_DIFFERENCE", "KEYWORD_ADD", "KEYWORD_REMOVE", "KEYWORD_CARDINALITY", 
		"KEYWORD_CHAR_AT", "KEYWORD_LENGTH", "KEYWORD_AND", "KEYWORD_OR", "KEYWORD_NOT", 
		"KEYWORD_INF", "SYMBOL_EQUAL", "SYMBOL_NOT_EQUAL", "SYMBOL_LESSER", "SYMBOL_GREATER", 
		"SYMBOL_LESSER_OR_EQUAL", "SYMBOL_GREATER_OR_EQUAL", "SYMBOL_ADDITION", 
		"SYMBOL_SUBSTRACT", "SYMBOL_MULTIPLICATION", "SYMBOL_DIVISION", "SYMBOL_POWER", 
		"SYMBOL_ASSIGN", "SYMBOL_REFERENCE", "SYMBOL_COMMA", "SYMBOL_QUOTE", "SYMBOL_SINGLE_QOUTE", 
		"SYMBOL_LPAREN", "SYMBOL_RPAREN", "SYMBOL_LBRACE", "SYMBOL_RBRACE", "SYMBOL_LBRACK", 
		"SYMOBL_RBRACK", "SYMBOL_COMMENT_START", "SYMBOL_COMMENT_END", "INT", 
		"FLOAT", "PARAM_NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\'", null, "'STATE:'", "'STATE_ATTRIBUTES:'", "'STATE_START:'", 
		"'STATE_GOAL:'", "'OPERATORS:'", "'OPERATOR_DESCRIPTION:'", "'OPERATOR_PRECONDITION:'", 
		"'OPERATOR_EFFECT:'", "'if'", "'else'", "'for'", "'param'", "'from'", 
		"'to'", "'by'", "'times'", "'attr'", "'var'", "'cost'", "'is'", "'of'", 
		"'set'", "'matrix'", "'word'", "'number'", "'min'", "'max'", "'sum'", 
		"'avg'", "'abs'", "'union'", "'intersect'", "'difference'", "'add'", "'remove'", 
		"'card'", "'charAt'", "'length'", "'and'", "'or'", "'not'", "'inf'", "'=='", 
		"'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'^'", 
		"'='", "'$'", "','", "'\"'", "'''", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "'/*'", "'*/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "COMMENT", "STATE_DELIMITER", "STATE_ATTRIBUTES_DELIMITER", 
		"STATE_START_DELIMITER", "STATE_GOAL_DELIMITER", "OPERATOR_DELIMITER", 
		"OPERATOR_DESCRIPTION_DELIMITER", "OPERATOR_PRECONDITION_DELIMITER", "OPERATOR_EFFECT_DELIMITER", 
		"KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_FOR", "KEYWORD_PARAM", "KEYWORD_FROM", 
		"KEYWORD_TO", "KEYWORD_BY", "KEYWORD_TIMES", "KEYWORD_ATTRIBUTE", "KEYWORD_VAR", 
		"KEYWORD_COST", "KEYWORD_IS", "KEYWORD_OF", "KEYWORD_SET", "KEYWORD_MATRIX", 
		"KEYWORD_WORD", "KEYWORD_NUMBER", "KEYWORD_MINIMUM", "KEYWORD_MAXIMUM", 
		"KEYWORD_SUM", "KEYWORD_AVERAGE", "KEYWORD_ABS", "KEYWORD_UNION", "KEYWORD_INTERSECT", 
		"KEYWORD_DIFFERENCE", "KEYWORD_ADD", "KEYWORD_REMOVE", "KEYWORD_CARDINALITY", 
		"KEYWORD_CHAR_AT", "KEYWORD_LENGTH", "KEYWORD_AND", "KEYWORD_OR", "KEYWORD_NOT", 
		"KEYWORD_INF", "SYMBOL_EQUAL", "SYMBOL_NOT_EQUAL", "SYMBOL_LESSER", "SYMBOL_GREATER", 
		"SYMBOL_LESSER_OR_EQUAL", "SYMBOL_GREATER_OR_EQUAL", "SYMBOL_ADDITION", 
		"SYMBOL_SUBSTRACT", "SYMBOL_MULTIPLICATION", "SYMBOL_DIVISION", "SYMBOL_POWER", 
		"SYMBOL_ASSIGN", "SYMBOL_REFERENCE", "SYMBOL_COMMA", "SYMBOL_QUOTE", "SYMBOL_SINGLE_QOUTE", 
		"SYMBOL_LPAREN", "SYMBOL_RPAREN", "SYMBOL_LBRACE", "SYMBOL_RBRACE", "SYMBOL_LBRACK", 
		"SYMOBL_RBRACK", "SYMBOL_COMMENT_START", "SYMBOL_COMMENT_END", "INT", 
		"FLOAT", "PARAM_NAME", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2J\u021e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\3\3\3\7\3\u0098\n\3\f\3\16\3\u009b\13\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3"+
		"E\3E\3E\3F\3F\7F\u01fe\nF\fF\16F\u0201\13F\3G\3G\7G\u0205\nG\fG\16G\u0208"+
		"\13G\3G\3G\7G\u020c\nG\fG\16G\u020f\13G\3H\3H\7H\u0213\nH\fH\16H\u0216"+
		"\13H\3I\6I\u0219\nI\rI\16I\u021a\3I\3I\3\u0099\2J\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\3\2\4\5\2C\\"+
		"aac|\5\2\13\f\17\17\"\"\u0223\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093"+
		"\3\2\2\2\5\u0095\3\2\2\2\7\u00a0\3\2\2\2\t\u00a7\3\2\2\2\13\u00b9\3\2"+
		"\2\2\r\u00c6\3\2\2\2\17\u00d2\3\2\2\2\21\u00dd\3\2\2\2\23\u00f3\3\2\2"+
		"\2\25\u010a\3\2\2\2\27\u011b\3\2\2\2\31\u011e\3\2\2\2\33\u0123\3\2\2\2"+
		"\35\u0127\3\2\2\2\37\u012d\3\2\2\2!\u0132\3\2\2\2#\u0135\3\2\2\2%\u0138"+
		"\3\2\2\2\'\u013e\3\2\2\2)\u0143\3\2\2\2+\u0147\3\2\2\2-\u014c\3\2\2\2"+
		"/\u014f\3\2\2\2\61\u0152\3\2\2\2\63\u0156\3\2\2\2\65\u015d\3\2\2\2\67"+
		"\u0162\3\2\2\29\u0169\3\2\2\2;\u016d\3\2\2\2=\u0171\3\2\2\2?\u0175\3\2"+
		"\2\2A\u0179\3\2\2\2C\u017d\3\2\2\2E\u0183\3\2\2\2G\u018d\3\2\2\2I\u0198"+
		"\3\2\2\2K\u019c\3\2\2\2M\u01a3\3\2\2\2O\u01a8\3\2\2\2Q\u01af\3\2\2\2S"+
		"\u01b6\3\2\2\2U\u01ba\3\2\2\2W\u01bd\3\2\2\2Y\u01c1\3\2\2\2[\u01c5\3\2"+
		"\2\2]\u01c8\3\2\2\2_\u01cb\3\2\2\2a\u01cd\3\2\2\2c\u01cf\3\2\2\2e\u01d2"+
		"\3\2\2\2g\u01d5\3\2\2\2i\u01d7\3\2\2\2k\u01d9\3\2\2\2m\u01db\3\2\2\2o"+
		"\u01dd\3\2\2\2q\u01df\3\2\2\2s\u01e1\3\2\2\2u\u01e3\3\2\2\2w\u01e5\3\2"+
		"\2\2y\u01e7\3\2\2\2{\u01e9\3\2\2\2}\u01eb\3\2\2\2\177\u01ed\3\2\2\2\u0081"+
		"\u01ef\3\2\2\2\u0083\u01f1\3\2\2\2\u0085\u01f3\3\2\2\2\u0087\u01f5\3\2"+
		"\2\2\u0089\u01f8\3\2\2\2\u008b\u01fb\3\2\2\2\u008d\u0202\3\2\2\2\u008f"+
		"\u0210\3\2\2\2\u0091\u0218\3\2\2\2\u0093\u0094\7^\2\2\u0094\4\3\2\2\2"+
		"\u0095\u0099\5\u0087D\2\u0096\u0098\13\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5\u0089E\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\b\3\2\2\u009f\6\3\2\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7V\2\2\u00a2"+
		"\u00a3\7C\2\2\u00a3\u00a4\7V\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\7<\2\2"+
		"\u00a6\b\3\2\2\2\u00a7\u00a8\7U\2\2\u00a8\u00a9\7V\2\2\u00a9\u00aa\7C"+
		"\2\2\u00aa\u00ab\7V\2\2\u00ab\u00ac\7G\2\2\u00ac\u00ad\7a\2\2\u00ad\u00ae"+
		"\7C\2\2\u00ae\u00af\7V\2\2\u00af\u00b0\7V\2\2\u00b0\u00b1\7T\2\2\u00b1"+
		"\u00b2\7K\2\2\u00b2\u00b3\7D\2\2\u00b3\u00b4\7W\2\2\u00b4\u00b5\7V\2\2"+
		"\u00b5\u00b6\7G\2\2\u00b6\u00b7\7U\2\2\u00b7\u00b8\7<\2\2\u00b8\n\3\2"+
		"\2\2\u00b9\u00ba\7U\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc\7C\2\2\u00bc\u00bd"+
		"\7V\2\2\u00bd\u00be\7G\2\2\u00be\u00bf\7a\2\2\u00bf\u00c0\7U\2\2\u00c0"+
		"\u00c1\7V\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3\7T\2\2\u00c3\u00c4\7V\2\2"+
		"\u00c4\u00c5\7<\2\2\u00c5\f\3\2\2\2\u00c6\u00c7\7U\2\2\u00c7\u00c8\7V"+
		"\2\2\u00c8\u00c9\7C\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc"+
		"\7a\2\2\u00cc\u00cd\7I\2\2\u00cd\u00ce\7Q\2\2\u00ce\u00cf\7C\2\2\u00cf"+
		"\u00d0\7N\2\2\u00d0\u00d1\7<\2\2\u00d1\16\3\2\2\2\u00d2\u00d3\7Q\2\2\u00d3"+
		"\u00d4\7R\2\2\u00d4\u00d5\7G\2\2\u00d5\u00d6\7T\2\2\u00d6\u00d7\7C\2\2"+
		"\u00d7\u00d8\7V\2\2\u00d8\u00d9\7Q\2\2\u00d9\u00da\7T\2\2\u00da\u00db"+
		"\7U\2\2\u00db\u00dc\7<\2\2\u00dc\20\3\2\2\2\u00dd\u00de\7Q\2\2\u00de\u00df"+
		"\7R\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1\7T\2\2\u00e1\u00e2\7C\2\2\u00e2"+
		"\u00e3\7V\2\2\u00e3\u00e4\7Q\2\2\u00e4\u00e5\7T\2\2\u00e5\u00e6\7a\2\2"+
		"\u00e6\u00e7\7F\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7U\2\2\u00e9\u00ea"+
		"\7E\2\2\u00ea\u00eb\7T\2\2\u00eb\u00ec\7K\2\2\u00ec\u00ed\7R\2\2\u00ed"+
		"\u00ee\7V\2\2\u00ee\u00ef\7K\2\2\u00ef\u00f0\7Q\2\2\u00f0\u00f1\7P\2\2"+
		"\u00f1\u00f2\7<\2\2\u00f2\22\3\2\2\2\u00f3\u00f4\7Q\2\2\u00f4\u00f5\7"+
		"R\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7\7T\2\2\u00f7\u00f8\7C\2\2\u00f8\u00f9"+
		"\7V\2\2\u00f9\u00fa\7Q\2\2\u00fa\u00fb\7T\2\2\u00fb\u00fc\7a\2\2\u00fc"+
		"\u00fd\7R\2\2\u00fd\u00fe\7T\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100\7E\2\2"+
		"\u0100\u0101\7Q\2\2\u0101\u0102\7P\2\2\u0102\u0103\7F\2\2\u0103\u0104"+
		"\7K\2\2\u0104\u0105\7V\2\2\u0105\u0106\7K\2\2\u0106\u0107\7Q\2\2\u0107"+
		"\u0108\7P\2\2\u0108\u0109\7<\2\2\u0109\24\3\2\2\2\u010a\u010b\7Q\2\2\u010b"+
		"\u010c\7R\2\2\u010c\u010d\7G\2\2\u010d\u010e\7T\2\2\u010e\u010f\7C\2\2"+
		"\u010f\u0110\7V\2\2\u0110\u0111\7Q\2\2\u0111\u0112\7T\2\2\u0112\u0113"+
		"\7a\2\2\u0113\u0114\7G\2\2\u0114\u0115\7H\2\2\u0115\u0116\7H\2\2\u0116"+
		"\u0117\7G\2\2\u0117\u0118\7E\2\2\u0118\u0119\7V\2\2\u0119\u011a\7<\2\2"+
		"\u011a\26\3\2\2\2\u011b\u011c\7k\2\2\u011c\u011d\7h\2\2\u011d\30\3\2\2"+
		"\2\u011e\u011f\7g\2\2\u011f\u0120\7n\2\2\u0120\u0121\7u\2\2\u0121\u0122"+
		"\7g\2\2\u0122\32\3\2\2\2\u0123\u0124\7h\2\2\u0124\u0125\7q\2\2\u0125\u0126"+
		"\7t\2\2\u0126\34\3\2\2\2\u0127\u0128\7r\2\2\u0128\u0129\7c\2\2\u0129\u012a"+
		"\7t\2\2\u012a\u012b\7c\2\2\u012b\u012c\7o\2\2\u012c\36\3\2\2\2\u012d\u012e"+
		"\7h\2\2\u012e\u012f\7t\2\2\u012f\u0130\7q\2\2\u0130\u0131\7o\2\2\u0131"+
		" \3\2\2\2\u0132\u0133\7v\2\2\u0133\u0134\7q\2\2\u0134\"\3\2\2\2\u0135"+
		"\u0136\7d\2\2\u0136\u0137\7{\2\2\u0137$\3\2\2\2\u0138\u0139\7v\2\2\u0139"+
		"\u013a\7k\2\2\u013a\u013b\7o\2\2\u013b\u013c\7g\2\2\u013c\u013d\7u\2\2"+
		"\u013d&\3\2\2\2\u013e\u013f\7c\2\2\u013f\u0140\7v\2\2\u0140\u0141\7v\2"+
		"\2\u0141\u0142\7t\2\2\u0142(\3\2\2\2\u0143\u0144\7x\2\2\u0144\u0145\7"+
		"c\2\2\u0145\u0146\7t\2\2\u0146*\3\2\2\2\u0147\u0148\7e\2\2\u0148\u0149"+
		"\7q\2\2\u0149\u014a\7u\2\2\u014a\u014b\7v\2\2\u014b,\3\2\2\2\u014c\u014d"+
		"\7k\2\2\u014d\u014e\7u\2\2\u014e.\3\2\2\2\u014f\u0150\7q\2\2\u0150\u0151"+
		"\7h\2\2\u0151\60\3\2\2\2\u0152\u0153\7u\2\2\u0153\u0154\7g\2\2\u0154\u0155"+
		"\7v\2\2\u0155\62\3\2\2\2\u0156\u0157\7o\2\2\u0157\u0158\7c\2\2\u0158\u0159"+
		"\7v\2\2\u0159\u015a\7t\2\2\u015a\u015b\7k\2\2\u015b\u015c\7z\2\2\u015c"+
		"\64\3\2\2\2\u015d\u015e\7y\2\2\u015e\u015f\7q\2\2\u015f\u0160\7t\2\2\u0160"+
		"\u0161\7f\2\2\u0161\66\3\2\2\2\u0162\u0163\7p\2\2\u0163\u0164\7w\2\2\u0164"+
		"\u0165\7o\2\2\u0165\u0166\7d\2\2\u0166\u0167\7g\2\2\u0167\u0168\7t\2\2"+
		"\u01688\3\2\2\2\u0169\u016a\7o\2\2\u016a\u016b\7k\2\2\u016b\u016c\7p\2"+
		"\2\u016c:\3\2\2\2\u016d\u016e\7o\2\2\u016e\u016f\7c\2\2\u016f\u0170\7"+
		"z\2\2\u0170<\3\2\2\2\u0171\u0172\7u\2\2\u0172\u0173\7w\2\2\u0173\u0174"+
		"\7o\2\2\u0174>\3\2\2\2\u0175\u0176\7c\2\2\u0176\u0177\7x\2\2\u0177\u0178"+
		"\7i\2\2\u0178@\3\2\2\2\u0179\u017a\7c\2\2\u017a\u017b\7d\2\2\u017b\u017c"+
		"\7u\2\2\u017cB\3\2\2\2\u017d\u017e\7w\2\2\u017e\u017f\7p\2\2\u017f\u0180"+
		"\7k\2\2\u0180\u0181\7q\2\2\u0181\u0182\7p\2\2\u0182D\3\2\2\2\u0183\u0184"+
		"\7k\2\2\u0184\u0185\7p\2\2\u0185\u0186\7v\2\2\u0186\u0187\7g\2\2\u0187"+
		"\u0188\7t\2\2\u0188\u0189\7u\2\2\u0189\u018a\7g\2\2\u018a\u018b\7e\2\2"+
		"\u018b\u018c\7v\2\2\u018cF\3\2\2\2\u018d\u018e\7f\2\2\u018e\u018f\7k\2"+
		"\2\u018f\u0190\7h\2\2\u0190\u0191\7h\2\2\u0191\u0192\7g\2\2\u0192\u0193"+
		"\7t\2\2\u0193\u0194\7g\2\2\u0194\u0195\7p\2\2\u0195\u0196\7e\2\2\u0196"+
		"\u0197\7g\2\2\u0197H\3\2\2\2\u0198\u0199\7c\2\2\u0199\u019a\7f\2\2\u019a"+
		"\u019b\7f\2\2\u019bJ\3\2\2\2\u019c\u019d\7t\2\2\u019d\u019e\7g\2\2\u019e"+
		"\u019f\7o\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7x\2\2\u01a1\u01a2\7g\2\2"+
		"\u01a2L\3\2\2\2\u01a3\u01a4\7e\2\2\u01a4\u01a5\7c\2\2\u01a5\u01a6\7t\2"+
		"\2\u01a6\u01a7\7f\2\2\u01a7N\3\2\2\2\u01a8\u01a9\7e\2\2\u01a9\u01aa\7"+
		"j\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7C\2\2\u01ad\u01ae"+
		"\7v\2\2\u01aeP\3\2\2\2\u01af\u01b0\7n\2\2\u01b0\u01b1\7g\2\2\u01b1\u01b2"+
		"\7p\2\2\u01b2\u01b3\7i\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7j\2\2\u01b5"+
		"R\3\2\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7p\2\2\u01b8\u01b9\7f\2\2\u01b9"+
		"T\3\2\2\2\u01ba\u01bb\7q\2\2\u01bb\u01bc\7t\2\2\u01bcV\3\2\2\2\u01bd\u01be"+
		"\7p\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0\7v\2\2\u01c0X\3\2\2\2\u01c1\u01c2"+
		"\7k\2\2\u01c2\u01c3\7p\2\2\u01c3\u01c4\7h\2\2\u01c4Z\3\2\2\2\u01c5\u01c6"+
		"\7?\2\2\u01c6\u01c7\7?\2\2\u01c7\\\3\2\2\2\u01c8\u01c9\7#\2\2\u01c9\u01ca"+
		"\7?\2\2\u01ca^\3\2\2\2\u01cb\u01cc\7>\2\2\u01cc`\3\2\2\2\u01cd\u01ce\7"+
		"@\2\2\u01ceb\3\2\2\2\u01cf\u01d0\7>\2\2\u01d0\u01d1\7?\2\2\u01d1d\3\2"+
		"\2\2\u01d2\u01d3\7@\2\2\u01d3\u01d4\7?\2\2\u01d4f\3\2\2\2\u01d5\u01d6"+
		"\7-\2\2\u01d6h\3\2\2\2\u01d7\u01d8\7/\2\2\u01d8j\3\2\2\2\u01d9\u01da\7"+
		",\2\2\u01dal\3\2\2\2\u01db\u01dc\7\61\2\2\u01dcn\3\2\2\2\u01dd\u01de\7"+
		"`\2\2\u01dep\3\2\2\2\u01df\u01e0\7?\2\2\u01e0r\3\2\2\2\u01e1\u01e2\7&"+
		"\2\2\u01e2t\3\2\2\2\u01e3\u01e4\7.\2\2\u01e4v\3\2\2\2\u01e5\u01e6\7$\2"+
		"\2\u01e6x\3\2\2\2\u01e7\u01e8\7)\2\2\u01e8z\3\2\2\2\u01e9\u01ea\7*\2\2"+
		"\u01ea|\3\2\2\2\u01eb\u01ec\7+\2\2\u01ec~\3\2\2\2\u01ed\u01ee\7}\2\2\u01ee"+
		"\u0080\3\2\2\2\u01ef\u01f0\7\177\2\2\u01f0\u0082\3\2\2\2\u01f1\u01f2\7"+
		"]\2\2\u01f2\u0084\3\2\2\2\u01f3\u01f4\7_\2\2\u01f4\u0086\3\2\2\2\u01f5"+
		"\u01f6\7\61\2\2\u01f6\u01f7\7,\2\2\u01f7\u0088\3\2\2\2\u01f8\u01f9\7,"+
		"\2\2\u01f9\u01fa\7\61\2\2\u01fa\u008a\3\2\2\2\u01fb\u01ff\4\62;\2\u01fc"+
		"\u01fe\4\62;\2\u01fd\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2"+
		"\2\2\u01ff\u0200\3\2\2\2\u0200\u008c\3\2\2\2\u0201\u01ff\3\2\2\2\u0202"+
		"\u0206\4\62;\2\u0203\u0205\4\62;\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2"+
		"\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020d\7\60\2\2\u020a\u020c\4\62;\2\u020b\u020a\3"+
		"\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u008e\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0214\4c|\2\u0211\u0213\t\2\2"+
		"\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0090\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\t\3\2\2\u0218"+
		"\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\u021c\3\2\2\2\u021c\u021d\bI\2\2\u021d\u0092\3\2\2\2\t\2\u0099"+
		"\u01ff\u0206\u020d\u0214\u021a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}