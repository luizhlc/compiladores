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
		StringType=1, IntegerType=2, DoubleType=3, BooleanType=4, WS=5, Print=6, 
		Init=7, BOOL=8, Void=9, Return=10, Begin=11, End=12, ParBeg=13, ParEnd=14, 
		Semicolon=15, Plus=16, Minus=17, Times=18, Divide=19, Num=20, Or=21, And=22, 
		Equal=23, NEqual=24, Less=25, LessE=26, Greater=27, GreaterE=28, Not=29, 
		Gets=30, Quote=31, SQuote=32, Comma=33, Dot=34, Char=35, String=36, Double=37, 
		Integer=38, ID=39, IDChar=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('"
	};
	public static final String[] ruleNames = {
		"StringType", "IntegerType", "DoubleType", "BooleanType", "WS", "Print", 
		"Init", "BOOL", "Void", "Return", "Begin", "End", "ParBeg", "ParEnd", 
		"Semicolon", "Plus", "Minus", "Times", "Divide", "Num", "Or", "And", "Equal", 
		"NEqual", "Less", "LessE", "Greater", "GreaterE", "Not", "Gets", "Quote", 
		"SQuote", "Comma", "Dot", "Char", "String", "Double", "Integer", "ID", 
		"IDChar"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u00f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\6\6l\n\6\r\6\16\6m\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0087\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\6\25\u00a8\n\25\r\25\16\25\u00a9\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\7%\u00d2"+
		"\n%\f%\16%\u00d5\13%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u00e2\n&\3\'"+
		"\6\'\u00e5\n\'\r\'\16\'\u00e6\3(\3(\3(\7(\u00ec\n(\f(\16(\u00ef\13(\3"+
		")\5)\u00f2\n)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\5\5\2\13\f\17\17\"\""+
		"\4\2\2#%\0\5\2C\\aac|\u00fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\3S\3\2\2\2\5Z\3\2\2\2\7^\3\2\2\2\te\3\2\2\2\13k\3\2\2"+
		"\2\rq\3\2\2\2\17w\3\2\2\2\21\u0086\3\2\2\2\23\u0088\3\2\2\2\25\u008d\3"+
		"\2\2\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33\u0098\3\2\2\2\35\u009a\3\2"+
		"\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00a4"+
		"\3\2\2\2)\u00a7\3\2\2\2+\u00ab\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61"+
		"\u00b2\3\2\2\2\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00ba\3\2\2\29\u00bc"+
		"\3\2\2\2;\u00bf\3\2\2\2=\u00c1\3\2\2\2?\u00c3\3\2\2\2A\u00c5\3\2\2\2C"+
		"\u00c7\3\2\2\2E\u00c9\3\2\2\2G\u00cb\3\2\2\2I\u00cf\3\2\2\2K\u00e1\3\2"+
		"\2\2M\u00e4\3\2\2\2O\u00e8\3\2\2\2Q\u00f1\3\2\2\2ST\7u\2\2TU\7v\2\2UV"+
		"\7t\2\2VW\7k\2\2WX\7p\2\2XY\7i\2\2Y\4\3\2\2\2Z[\7k\2\2[\\\7p\2\2\\]\7"+
		"v\2\2]\6\3\2\2\2^_\7f\2\2_`\7q\2\2`a\7w\2\2ab\7d\2\2bc\7n\2\2cd\7g\2\2"+
		"d\b\3\2\2\2ef\7d\2\2fg\7q\2\2gh\7q\2\2hi\7n\2\2i\n\3\2\2\2jl\t\2\2\2k"+
		"j\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\6\2\2p\f\3\2\2\2"+
		"qr\7r\2\2rs\7t\2\2st\7k\2\2tu\7p\2\2uv\7v\2\2v\16\3\2\2\2wx\7N\2\2xy\7"+
		"J\2\2yz\7E\2\2z{\7-\2\2{|\7/\2\2|\20\3\2\2\2}~\7v\2\2~\177\7t\2\2\177"+
		"\u0080\7w\2\2\u0080\u0087\7g\2\2\u0081\u0082\7h\2\2\u0082\u0083\7c\2\2"+
		"\u0083\u0084\7n\2\2\u0084\u0085\7u\2\2\u0085\u0087\7g\2\2\u0086}\3\2\2"+
		"\2\u0086\u0081\3\2\2\2\u0087\22\3\2\2\2\u0088\u0089\7x\2\2\u0089\u008a"+
		"\7q\2\2\u008a\u008b\7k\2\2\u008b\u008c\7f\2\2\u008c\24\3\2\2\2\u008d\u008e"+
		"\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090\u0091\7w\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\7p\2\2\u0093\26\3\2\2\2\u0094\u0095\7}\2\2\u0095"+
		"\30\3\2\2\2\u0096\u0097\7\177\2\2\u0097\32\3\2\2\2\u0098\u0099\7*\2\2"+
		"\u0099\34\3\2\2\2\u009a\u009b\7+\2\2\u009b\36\3\2\2\2\u009c\u009d\7=\2"+
		"\2\u009d \3\2\2\2\u009e\u009f\7-\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7/\2"+
		"\2\u00a1$\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7\61\2"+
		"\2\u00a5(\3\2\2\2\u00a6\u00a8\4\62;\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa*\3\2\2\2\u00ab"+
		"\u00ac\7~\2\2\u00ac,\3\2\2\2\u00ad\u00ae\7(\2\2\u00ae.\3\2\2\2\u00af\u00b0"+
		"\7?\2\2\u00b0\u00b1\7?\2\2\u00b1\60\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\64\3\2\2\2\u00b7\u00b8"+
		"\7>\2\2\u00b8\u00b9\7?\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb8"+
		"\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd\u00be\7?\2\2\u00be:\3\2\2\2\u00bf\u00c0"+
		"\7#\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2>\3\2\2\2\u00c3\u00c4\7"+
		"$\2\2\u00c4@\3\2\2\2\u00c5\u00c6\7)\2\2\u00c6B\3\2\2\2\u00c7\u00c8\7."+
		"\2\2\u00c8D\3\2\2\2\u00c9\u00ca\7\60\2\2\u00caF\3\2\2\2\u00cb\u00cc\5"+
		"A!\2\u00cc\u00cd\4\2\0\2\u00cd\u00ce\5A!\2\u00ceH\3\2\2\2\u00cf\u00d3"+
		"\5? \2\u00d0\u00d2\t\3\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d7\5? \2\u00d7J\3\2\2\2\u00d8\u00d9\5M\'\2\u00d9\u00da\7"+
		"\60\2\2\u00da\u00db\5M\'\2\u00db\u00e2\3\2\2\2\u00dc\u00dd\7\60\2\2\u00dd"+
		"\u00e2\5M\'\2\u00de\u00df\5M\'\2\u00df\u00e0\7\60\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2"+
		"L\3\2\2\2\u00e3\u00e5\5)\25\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7N\3\2\2\2\u00e8\u00ed\5"+
		"Q)\2\u00e9\u00ec\5)\25\2\u00ea\u00ec\5Q)\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"P\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\t\4\2\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2R\3\2\2\2\f\2m\u0086\u00a9\u00d3\u00e1\u00e6\u00eb\u00ed\u00f1\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}