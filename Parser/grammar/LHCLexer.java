// Generated from LHC.g4 by ANTLR 4.2
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
		Void=8, Return=9, Switch=10, Case=11, Default=12, Begin=13, End=14, ParBeg=15, 
		ParEnd=16, Semicolon=17, Plus=18, Minus=19, Times=20, Divide=21, Integer=22, 
		Or=23, And=24, Equal=25, NEqual=26, Less=27, LessE=28, Greater=29, GreaterE=30, 
		Not=31, Gets=32, Quote=33, SQuote=34, Comma=35, Dot=36, Double=37, ID=38, 
		IDChar=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'int'", "'double'", "'bool'", "WS", "'print'", "'LHC+-'", "Bool", "'void'", 
		"'return'", "'switch'", "'case'", "'default'", "'{'", "'}'", "'('", "')'", 
		"';'", "'+'", "'-'", "'*'", "'/'", "Integer", "'|'", "'&'", "Equal", "NEqual", 
		"'<'", "LessE", "'>'", "GreaterE", "'!'", "'='", "'\"'", "'''", "','", 
		"'.'", "Double", "ID", "IDChar"
	};
	public static final String[] ruleNames = {
		"IntegerType", "DoubleType", "BooleanType", "WS", "Print", "Init", "Bool", 
		"Void", "Return", "Switch", "Case", "Default", "Begin", "End", "ParBeg", 
		"ParEnd", "Semicolon", "Plus", "Minus", "Times", "Divide", "Integer", 
		"Or", "And", "Equal", "NEqual", "Less", "LessE", "Greater", "GreaterE", 
		"Not", "Gets", "Quote", "SQuote", "Comma", "Dot", "Double", "ID", "IDChar"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u00ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\6\5c\n\5\r\5\16\5d\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27\u00b3\n\27\r\27"+
		"\16\27\u00b4\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u00e0\n&\3\'\3\'\3\'\7\'\u00e5"+
		"\n\'\f\'\16\'\u00e8\13\'\3(\5(\u00eb\n(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2"+
		"\4\5\2\13\f\17\17\"\"\5\2C\\aac|\u00f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2\7\\\3\2\2\2\tb\3\2\2\2\13h\3\2\2\2"+
		"\rn\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0084\3\2\2\2\25\u008b\3\2\2"+
		"\2\27\u0092\3\2\2\2\31\u0097\3\2\2\2\33\u009f\3\2\2\2\35\u00a1\3\2\2\2"+
		"\37\u00a3\3\2\2\2!\u00a5\3\2\2\2#\u00a7\3\2\2\2%\u00a9\3\2\2\2\'\u00ab"+
		"\3\2\2\2)\u00ad\3\2\2\2+\u00af\3\2\2\2-\u00b2\3\2\2\2/\u00b6\3\2\2\2\61"+
		"\u00b8\3\2\2\2\63\u00ba\3\2\2\2\65\u00bd\3\2\2\2\67\u00c0\3\2\2\29\u00c2"+
		"\3\2\2\2;\u00c5\3\2\2\2=\u00c7\3\2\2\2?\u00ca\3\2\2\2A\u00cc\3\2\2\2C"+
		"\u00ce\3\2\2\2E\u00d0\3\2\2\2G\u00d2\3\2\2\2I\u00d4\3\2\2\2K\u00df\3\2"+
		"\2\2M\u00e1\3\2\2\2O\u00ea\3\2\2\2QR\7k\2\2RS\7p\2\2ST\7v\2\2T\4\3\2\2"+
		"\2UV\7f\2\2VW\7q\2\2WX\7w\2\2XY\7d\2\2YZ\7n\2\2Z[\7g\2\2[\6\3\2\2\2\\"+
		"]\7d\2\2]^\7q\2\2^_\7q\2\2_`\7n\2\2`\b\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\5\2\2g\n\3\2\2\2hi\7r\2\2ij\7"+
		"t\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2m\f\3\2\2\2no\7N\2\2op\7J\2\2pq\7E\2\2"+
		"qr\7-\2\2rs\7/\2\2s\16\3\2\2\2tu\7v\2\2uv\7t\2\2vw\7w\2\2w~\7g\2\2xy\7"+
		"h\2\2yz\7c\2\2z{\7n\2\2{|\7u\2\2|~\7g\2\2}t\3\2\2\2}x\3\2\2\2~\20\3\2"+
		"\2\2\177\u0080\7x\2\2\u0080\u0081\7q\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7f\2\2\u0083\22\3\2\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7v\2\2\u0087\u0088\7w\2\2\u0088\u0089\7t\2\2\u0089\u008a\7p\2\2\u008a"+
		"\24\3\2\2\2\u008b\u008c\7u\2\2\u008c\u008d\7y\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7e\2\2\u0090\u0091\7j\2\2\u0091\26\3\2\2\2\u0092"+
		"\u0093\7e\2\2\u0093\u0094\7c\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2"+
		"\u0096\30\3\2\2\2\u0097\u0098\7f\2\2\u0098\u0099\7g\2\2\u0099\u009a\7"+
		"h\2\2\u009a\u009b\7c\2\2\u009b\u009c\7w\2\2\u009c\u009d\7n\2\2\u009d\u009e"+
		"\7v\2\2\u009e\32\3\2\2\2\u009f\u00a0\7}\2\2\u00a0\34\3\2\2\2\u00a1\u00a2"+
		"\7\177\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7*\2\2\u00a4 \3\2\2\2\u00a5\u00a6"+
		"\7+\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\7=\2\2\u00a8$\3\2\2\2\u00a9\u00aa"+
		"\7-\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7"+
		",\2\2\u00ae*\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0,\3\2\2\2\u00b1\u00b3\4"+
		"\62;\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7~\2\2\u00b7\60\3\2\2\2\u00b8"+
		"\u00b9\7(\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\7?\2\2\u00bc"+
		"\64\3\2\2\2\u00bd\u00be\7#\2\2\u00be\u00bf\7?\2\2\u00bf\66\3\2\2\2\u00c0"+
		"\u00c1\7>\2\2\u00c18\3\2\2\2\u00c2\u00c3\7>\2\2\u00c3\u00c4\7?\2\2\u00c4"+
		":\3\2\2\2\u00c5\u00c6\7@\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8\u00c9"+
		"\7?\2\2\u00c9>\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb@\3\2\2\2\u00cc\u00cd\7"+
		"?\2\2\u00cdB\3\2\2\2\u00ce\u00cf\7$\2\2\u00cfD\3\2\2\2\u00d0\u00d1\7)"+
		"\2\2\u00d1F\3\2\2\2\u00d2\u00d3\7.\2\2\u00d3H\3\2\2\2\u00d4\u00d5\7\60"+
		"\2\2\u00d5J\3\2\2\2\u00d6\u00d7\5-\27\2\u00d7\u00d8\7\60\2\2\u00d8\u00d9"+
		"\5-\27\2\u00d9\u00e0\3\2\2\2\u00da\u00db\7\60\2\2\u00db\u00e0\5-\27\2"+
		"\u00dc\u00dd\5-\27\2\u00dd\u00de\7\60\2\2\u00de\u00e0\3\2\2\2\u00df\u00d6"+
		"\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0L\3\2\2\2\u00e1"+
		"\u00e6\5O(\2\u00e2\u00e5\5-\27\2\u00e3\u00e5\5O(\2\u00e4\u00e2\3\2\2\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7N\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\t\3\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00ebP\3\2\2\2\n\2d}\u00b4\u00df\u00e4\u00e6\u00ea\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}