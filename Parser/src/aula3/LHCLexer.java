// Generated from LHC.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StringType=1, IntegerType=2, DoubleType=3, BooleanType=4, WS=5, Print=6, 
		Init=7, Bool=8, Void=9, Return=10, Switch=11, Case=12, Default=13, Begin=14, 
		End=15, ParBeg=16, ParEnd=17, Semicolon=18, Plus=19, Minus=20, Times=21, 
		Divide=22, Integer=23, Or=24, And=25, Equal=26, NEqual=27, Less=28, LessE=29, 
		Greater=30, GreaterE=31, Not=32, Gets=33, Quote=34, SQuote=35, Comma=36, 
		Dot=37, Break=38, Continue=39, For=40, Increment=41, Decrement=42, Double=43, 
		ID=44, IDChar=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"StringType", "IntegerType", "DoubleType", "BooleanType", "WS", "Print", 
		"Init", "Bool", "Void", "Return", "Switch", "Case", "Default", "Begin", 
		"End", "ParBeg", "ParEnd", "Semicolon", "Plus", "Minus", "Times", "Divide", 
		"Integer", "Or", "And", "Equal", "NEqual", "Less", "LessE", "Greater", 
		"GreaterE", "Not", "Gets", "Quote", "SQuote", "Comma", "Dot", "Break", 
		"Continue", "For", "Increment", "Decrement", "Double", "ID", "IDChar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'string'", "'int'", "'double'", "'bool'", null, "'print'", "'LHC+-'", 
		null, "'void'", "'return'", "'switch'", "'case'", "'default'", "'{'", 
		"'}'", "'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'", null, "'|'", "'&'", 
		null, null, "'<'", null, "'>'", null, "'!'", "'='", "'\"'", "'''", "','", 
		"'.'", "'break'", "'continue'", "'for'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StringType", "IntegerType", "DoubleType", "BooleanType", "WS", 
		"Print", "Init", "Bool", "Void", "Return", "Switch", "Case", "Default", 
		"Begin", "End", "ParBeg", "ParEnd", "Semicolon", "Plus", "Minus", "Times", 
		"Divide", "Integer", "Or", "And", "Equal", "NEqual", "Less", "LessE", 
		"Greater", "GreaterE", "Not", "Gets", "Quote", "SQuote", "Comma", "Dot", 
		"Break", "Continue", "For", "Increment", "Decrement", "Double", "ID", 
		"IDChar"
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


	public LHCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LHC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0118\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\6\6v\n\6\r\6\16\6w\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0091\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\6\30\u00c6\n\30"+
		"\r\30\16\30\u00c7\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u010c\n,\3-\3-\3"+
		"-\7-\u0111\n-\f-\16-\u0114\13-\3.\5.\u0117\n.\2\2/\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/\3\2\4\5\2\13\f\17\17\"\"\5\2C\\aac|\u011e\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5d\3\2\2\2\7h\3\2\2\2\to\3\2"+
		"\2\2\13u\3\2\2\2\r{\3\2\2\2\17\u0081\3\2\2\2\21\u0090\3\2\2\2\23\u0092"+
		"\3\2\2\2\25\u0097\3\2\2\2\27\u009e\3\2\2\2\31\u00a5\3\2\2\2\33\u00aa\3"+
		"\2\2\2\35\u00b2\3\2\2\2\37\u00b4\3\2\2\2!\u00b6\3\2\2\2#\u00b8\3\2\2\2"+
		"%\u00ba\3\2\2\2\'\u00bc\3\2\2\2)\u00be\3\2\2\2+\u00c0\3\2\2\2-\u00c2\3"+
		"\2\2\2/\u00c5\3\2\2\2\61\u00c9\3\2\2\2\63\u00cb\3\2\2\2\65\u00cd\3\2\2"+
		"\2\67\u00d0\3\2\2\29\u00d3\3\2\2\2;\u00d5\3\2\2\2=\u00d8\3\2\2\2?\u00da"+
		"\3\2\2\2A\u00dd\3\2\2\2C\u00df\3\2\2\2E\u00e1\3\2\2\2G\u00e3\3\2\2\2I"+
		"\u00e5\3\2\2\2K\u00e7\3\2\2\2M\u00e9\3\2\2\2O\u00ef\3\2\2\2Q\u00f8\3\2"+
		"\2\2S\u00fc\3\2\2\2U\u00ff\3\2\2\2W\u010b\3\2\2\2Y\u010d\3\2\2\2[\u0116"+
		"\3\2\2\2]^\7u\2\2^_\7v\2\2_`\7t\2\2`a\7k\2\2ab\7p\2\2bc\7i\2\2c\4\3\2"+
		"\2\2de\7k\2\2ef\7p\2\2fg\7v\2\2g\6\3\2\2\2hi\7f\2\2ij\7q\2\2jk\7w\2\2"+
		"kl\7d\2\2lm\7n\2\2mn\7g\2\2n\b\3\2\2\2op\7d\2\2pq\7q\2\2qr\7q\2\2rs\7"+
		"n\2\2s\n\3\2\2\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3"+
		"\2\2\2yz\b\6\2\2z\f\3\2\2\2{|\7r\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177"+
		"\u0080\7v\2\2\u0080\16\3\2\2\2\u0081\u0082\7N\2\2\u0082\u0083\7J\2\2\u0083"+
		"\u0084\7E\2\2\u0084\u0085\7-\2\2\u0085\u0086\7/\2\2\u0086\20\3\2\2\2\u0087"+
		"\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a\7w\2\2\u008a\u0091\7g\2\2"+
		"\u008b\u008c\7h\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\u008f"+
		"\7u\2\2\u008f\u0091\7g\2\2\u0090\u0087\3\2\2\2\u0090\u008b\3\2\2\2\u0091"+
		"\22\3\2\2\2\u0092\u0093\7x\2\2\u0093\u0094\7q\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7f\2\2\u0096\24\3\2\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\7v\2\2\u009a\u009b\7w\2\2\u009b\u009c\7t\2\2\u009c\u009d\7p\2\2"+
		"\u009d\26\3\2\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7"+
		"k\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7j\2\2\u00a4\30"+
		"\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7u\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7h\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7n\2\2"+
		"\u00b0\u00b1\7v\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7}\2\2\u00b3\36\3\2\2"+
		"\2\u00b4\u00b5\7\177\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7*\2\2\u00b7\"\3\2"+
		"\2\2\u00b8\u00b9\7+\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7=\2\2\u00bb&\3\2\2"+
		"\2\u00bc\u00bd\7-\2\2\u00bd(\3\2\2\2\u00be\u00bf\7/\2\2\u00bf*\3\2\2\2"+
		"\u00c0\u00c1\7,\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3.\3\2\2\2"+
		"\u00c4\u00c6\4\62;\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\60\3\2\2\2\u00c9\u00ca\7~\2\2\u00ca"+
		"\62\3\2\2\2\u00cb\u00cc\7(\2\2\u00cc\64\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce"+
		"\u00cf\7?\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\7?\2\2\u00d2"+
		"8\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4:\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6\u00d7"+
		"\7?\2\2\u00d7<\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9>\3\2\2\2\u00da\u00db\7"+
		"@\2\2\u00db\u00dc\7?\2\2\u00dc@\3\2\2\2\u00dd\u00de\7#\2\2\u00deB\3\2"+
		"\2\2\u00df\u00e0\7?\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7$\2\2\u00e2F\3\2\2"+
		"\2\u00e3\u00e4\7)\2\2\u00e4H\3\2\2\2\u00e5\u00e6\7.\2\2\u00e6J\3\2\2\2"+
		"\u00e7\u00e8\7\60\2\2\u00e8L\3\2\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7"+
		"t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7m\2\2\u00eeN"+
		"\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7p\2\2\u00f2"+
		"\u00f3\7v\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7w\2\2"+
		"\u00f6\u00f7\7g\2\2\u00f7P\3\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7q\2"+
		"\2\u00fa\u00fb\7t\2\2\u00fbR\3\2\2\2\u00fc\u00fd\7-\2\2\u00fd\u00fe\7"+
		"-\2\2\u00feT\3\2\2\2\u00ff\u0100\7/\2\2\u0100\u0101\7/\2\2\u0101V\3\2"+
		"\2\2\u0102\u0103\5/\30\2\u0103\u0104\7\60\2\2\u0104\u0105\5/\30\2\u0105"+
		"\u010c\3\2\2\2\u0106\u0107\7\60\2\2\u0107\u010c\5/\30\2\u0108\u0109\5"+
		"/\30\2\u0109\u010a\7\60\2\2\u010a\u010c\3\2\2\2\u010b\u0102\3\2\2\2\u010b"+
		"\u0106\3\2\2\2\u010b\u0108\3\2\2\2\u010cX\3\2\2\2\u010d\u0112\5[.\2\u010e"+
		"\u0111\5/\30\2\u010f\u0111\5[.\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2"+
		"\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113Z"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\t\3\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\\\3\2\2\2\n\2w\u0090\u00c7\u010b\u0110\u0112\u0116\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}