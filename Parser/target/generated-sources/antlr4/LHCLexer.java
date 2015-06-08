// Generated from LHC.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LHCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StringType=1, IntegerType=2, DoubleType=3, WS=4, Print=5, Init=6, BOOL=7, 
		Char=8, String=9, Begin=10, End=11, ParBeg=12, ParEnd=13, Semicolon=14, 
		Plus=15, Minus=16, Times=17, Divide=18, Num=19, Or=20, And=21, Equal=22, 
		NEqual=23, Less=24, LessE=25, Greater=26, GreaterE=27, Not=28, Gets=29, 
		Quote=30, SQuote=31, Comma=32, Dot=33, ID=34, IDChar=35, Double=36, Integer=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'"
	};
	public static final String[] ruleNames = {
		"StringType", "IntegerType", "DoubleType", "WS", "Print", "Init", "BOOL", 
		"Char", "String", "Begin", "End", "ParBeg", "ParEnd", "Semicolon", "Plus", 
		"Minus", "Times", "Divide", "Num", "Or", "And", "Equal", "NEqual", "Less", 
		"LessE", "Greater", "GreaterE", "Not", "Gets", "Quote", "SQuote", "Comma", 
		"Dot", "ID", "IDChar", "Double", "Integer"
	};


	public LHCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LHC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u00dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5a\n\5\r\5\16\5b\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u0084\n\n\f\n\16\n"+
		"\u0087\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u009e\n\24\r\24\16\24\u009f"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\7#\u00c5\n#\f#\16#\u00c8\13#\3$\5$\u00cb\n$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\5%\u00d6\n%\3&\6&\u00d9\n&\r&\16&\u00da\2\2\'\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'\3\2\5\5\2\13\f\17\17\"\"\4\2\2#%\0\5\2C\\aac|\u00e4"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5T\3\2\2\2\7X\3\2\2\2\t`\3\2\2\2\13"+
		"f\3\2\2\2\rl\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\u0081\3\2\2\2\25\u008a"+
		"\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0092\3"+
		"\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'"+
		"\u009d\3\2\2\2)\u00a1\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a8\3\2"+
		"\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00b0\3\2\2\2\67\u00b2\3\2\2"+
		"\29\u00b5\3\2\2\2;\u00b7\3\2\2\2=\u00b9\3\2\2\2?\u00bb\3\2\2\2A\u00bd"+
		"\3\2\2\2C\u00bf\3\2\2\2E\u00c1\3\2\2\2G\u00ca\3\2\2\2I\u00d5\3\2\2\2K"+
		"\u00d8\3\2\2\2MN\7u\2\2NO\7v\2\2OP\7t\2\2PQ\7k\2\2QR\7p\2\2RS\7i\2\2S"+
		"\4\3\2\2\2TU\7k\2\2UV\7p\2\2VW\7v\2\2W\6\3\2\2\2XY\7f\2\2YZ\7q\2\2Z[\7"+
		"w\2\2[\\\7d\2\2\\]\7n\2\2]^\7g\2\2^\b\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\5\2\2e\n\3\2\2\2fg\7r\2\2gh\7"+
		"t\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2k\f\3\2\2\2lm\7N\2\2mn\7J\2\2no\7E\2\2"+
		"op\7-\2\2pq\7/\2\2q\16\3\2\2\2rs\7v\2\2st\7t\2\2tu\7w\2\2u|\7g\2\2vw\7"+
		"h\2\2wx\7c\2\2xy\7n\2\2yz\7u\2\2z|\7g\2\2{r\3\2\2\2{v\3\2\2\2|\20\3\2"+
		"\2\2}~\5? \2~\177\4\2\0\2\177\u0080\5? \2\u0080\22\3\2\2\2\u0081\u0085"+
		"\5=\37\2\u0082\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\5=\37\2\u0089\24\3\2\2\2\u008a\u008b\7}\2\2\u008b\26"+
		"\3\2\2\2\u008c\u008d\7\177\2\2\u008d\30\3\2\2\2\u008e\u008f\7*\2\2\u008f"+
		"\32\3\2\2\2\u0090\u0091\7+\2\2\u0091\34\3\2\2\2\u0092\u0093\7=\2\2\u0093"+
		"\36\3\2\2\2\u0094\u0095\7-\2\2\u0095 \3\2\2\2\u0096\u0097\7/\2\2\u0097"+
		"\"\3\2\2\2\u0098\u0099\7,\2\2\u0099$\3\2\2\2\u009a\u009b\7\61\2\2\u009b"+
		"&\3\2\2\2\u009c\u009e\4\62;\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7"+
		"~\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7(\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7?"+
		"\2\2\u00a6\u00a7\7?\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7#\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\62\3\2\2\2\u00ad\u00ae"+
		"\7>\2\2\u00ae\u00af\7?\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\66"+
		"\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4\7?\2\2\u00b48\3\2\2\2\u00b5\u00b6"+
		"\7#\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7"+
		"$\2\2\u00ba>\3\2\2\2\u00bb\u00bc\7)\2\2\u00bc@\3\2\2\2\u00bd\u00be\7."+
		"\2\2\u00beB\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0D\3\2\2\2\u00c1\u00c6\5"+
		"G$\2\u00c2\u00c5\5\'\24\2\u00c3\u00c5\5G$\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7F\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\t\4\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cbH\3\2\2\2\u00cc\u00cd\5K&\2\u00cd\u00ce\7\60\2\2\u00ce\u00cf"+
		"\5K&\2\u00cf\u00d6\3\2\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d6\5K&\2\u00d2"+
		"\u00d3\5K&\2\u00d3\u00d4\7\60\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00cc\3\2"+
		"\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6J\3\2\2\2\u00d7\u00d9"+
		"\5\'\24\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00dbL\3\2\2\2\f\2b{\u0085\u009f\u00c4\u00c6\u00ca"+
		"\u00d5\u00da\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}