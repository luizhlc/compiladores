// Generated from LHC.g4 by ANTLR 4.2
package aula3;
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerType=1, DoubleType=2, BooleanType=3, WS=4, Print=5, Init=6, Bool=7, 
		Void=8, Return=9, Begin=10, End=11, ParBeg=12, ParEnd=13, Semicolon=14, 
		Plus=15, Minus=16, Times=17, Divide=18, Integer=19, Or=20, And=21, Equal=22, 
		NEqual=23, Less=24, LessE=25, Greater=26, GreaterE=27, Not=28, Gets=29, 
		Quote=30, SQuote=31, Comma=32, Dot=33, Double=34, ID=35, IDChar=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'int'", "'double'", "'bool'", "WS", "'print'", "'LHC+-'", "Bool", "'void'", 
		"'return'", "'{'", "'}'", "'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'", 
		"Integer", "'|'", "'&'", "Equal", "NEqual", "'<'", "LessE", "'>'", "GreaterE", 
		"'!'", "'='", "'\"'", "'''", "','", "'.'", "Double", "ID", "IDChar"
	};
	public static final String[] ruleNames = {
		"IntegerType", "DoubleType", "BooleanType", "WS", "Print", "Init", "Bool", 
		"Void", "Return", "Begin", "End", "ParBeg", "ParEnd", "Semicolon", "Plus", 
		"Minus", "Times", "Divide", "Integer", "Or", "And", "Equal", "NEqual", 
		"Less", "LessE", "Greater", "GreaterE", "Not", "Gets", "Quote", "SQuote", 
		"Comma", "Dot", "Double", "ID", "IDChar"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00d2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\6\5]\n\5\r\5\16\5^\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bx\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\6\24\u0099\n\24\r\24\16\24\u009a\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\5#\u00c6\n#\3$\3$\3$\7$\u00cb\n$\f$\16$\u00ce\13$\3%\5%\u00d1"+
		"\n%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&\3\2\4\5\2\13\f\17\17\"\"\5\2C\\aac|\u00d8\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\3K\3\2\2\2\5O\3\2\2\2\7V\3\2\2\2\t\\\3\2\2\2\13b\3\2\2\2\rh"+
		"\3\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23~\3\2\2\2\25\u0085\3\2\2\2\27\u0087"+
		"\3\2\2\2\31\u0089\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3"+
		"\2\2\2!\u0091\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0098\3\2\2\2)\u009c"+
		"\3\2\2\2+\u009e\3\2\2\2-\u00a0\3\2\2\2/\u00a3\3\2\2\2\61\u00a6\3\2\2\2"+
		"\63\u00a8\3\2\2\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00b0\3\2\2\2;\u00b2"+
		"\3\2\2\2=\u00b4\3\2\2\2?\u00b6\3\2\2\2A\u00b8\3\2\2\2C\u00ba\3\2\2\2E"+
		"\u00c5\3\2\2\2G\u00c7\3\2\2\2I\u00d0\3\2\2\2KL\7k\2\2LM\7p\2\2MN\7v\2"+
		"\2N\4\3\2\2\2OP\7f\2\2PQ\7q\2\2QR\7w\2\2RS\7d\2\2ST\7n\2\2TU\7g\2\2U\6"+
		"\3\2\2\2VW\7d\2\2WX\7q\2\2XY\7q\2\2YZ\7n\2\2Z\b\3\2\2\2[]\t\2\2\2\\[\3"+
		"\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\5\2\2a\n\3\2\2\2b"+
		"c\7r\2\2cd\7t\2\2de\7k\2\2ef\7p\2\2fg\7v\2\2g\f\3\2\2\2hi\7N\2\2ij\7J"+
		"\2\2jk\7E\2\2kl\7-\2\2lm\7/\2\2m\16\3\2\2\2no\7v\2\2op\7t\2\2pq\7w\2\2"+
		"qx\7g\2\2rs\7h\2\2st\7c\2\2tu\7n\2\2uv\7u\2\2vx\7g\2\2wn\3\2\2\2wr\3\2"+
		"\2\2x\20\3\2\2\2yz\7x\2\2z{\7q\2\2{|\7k\2\2|}\7f\2\2}\22\3\2\2\2~\177"+
		"\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7v\2\2\u0081\u0082\7w\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7p\2\2\u0084\24\3\2\2\2\u0085\u0086\7}\2\2\u0086\26"+
		"\3\2\2\2\u0087\u0088\7\177\2\2\u0088\30\3\2\2\2\u0089\u008a\7*\2\2\u008a"+
		"\32\3\2\2\2\u008b\u008c\7+\2\2\u008c\34\3\2\2\2\u008d\u008e\7=\2\2\u008e"+
		"\36\3\2\2\2\u008f\u0090\7-\2\2\u0090 \3\2\2\2\u0091\u0092\7/\2\2\u0092"+
		"\"\3\2\2\2\u0093\u0094\7,\2\2\u0094$\3\2\2\2\u0095\u0096\7\61\2\2\u0096"+
		"&\3\2\2\2\u0097\u0099\4\62;\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b(\3\2\2\2\u009c\u009d\7"+
		"~\2\2\u009d*\3\2\2\2\u009e\u009f\7(\2\2\u009f,\3\2\2\2\u00a0\u00a1\7?"+
		"\2\2\u00a1\u00a2\7?\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\62\3\2\2\2\u00a8\u00a9"+
		"\7>\2\2\u00a9\u00aa\7?\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac\66"+
		"\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae\u00af\7?\2\2\u00af8\3\2\2\2\u00b0\u00b1"+
		"\7#\2\2\u00b1:\3\2\2\2\u00b2\u00b3\7?\2\2\u00b3<\3\2\2\2\u00b4\u00b5\7"+
		"$\2\2\u00b5>\3\2\2\2\u00b6\u00b7\7)\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7."+
		"\2\2\u00b9B\3\2\2\2\u00ba\u00bb\7\60\2\2\u00bbD\3\2\2\2\u00bc\u00bd\5"+
		"\'\24\2\u00bd\u00be\7\60\2\2\u00be\u00bf\5\'\24\2\u00bf\u00c6\3\2\2\2"+
		"\u00c0\u00c1\7\60\2\2\u00c1\u00c6\5\'\24\2\u00c2\u00c3\5\'\24\2\u00c3"+
		"\u00c4\7\60\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c0\3"+
		"\2\2\2\u00c5\u00c2\3\2\2\2\u00c6F\3\2\2\2\u00c7\u00cc\5I%\2\u00c8\u00cb"+
		"\5\'\24\2\u00c9\u00cb\5I%\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cdH\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00cf\u00d1\t\3\2\2\u00d0\u00cf\3\2\2\2\u00d1J\3"+
		"\2\2\2\n\2^w\u009a\u00c5\u00ca\u00cc\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}