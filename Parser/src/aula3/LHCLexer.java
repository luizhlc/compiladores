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
		Init=7, BOOL=8, Char=9, String=10, Begin=11, End=12, ParBeg=13, ParEnd=14, 
		Semicolon=15, Plus=16, Minus=17, Times=18, Divide=19, Num=20, Or=21, And=22, 
		Equal=23, NEqual=24, Less=25, LessE=26, Greater=27, GreaterE=28, Not=29, 
		Gets=30, Quote=31, SQuote=32, Comma=33, Dot=34, ID=35, IDChar=36, Double=37, 
		Integer=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"StringType", "IntegerType", "DoubleType", "BooleanType", "WS", "Print", 
		"Init", "BOOL", "Char", "String", "Begin", "End", "ParBeg", "ParEnd", 
		"Semicolon", "Plus", "Minus", "Times", "Divide", "Num", "Or", "And", "Equal", 
		"NEqual", "Less", "LessE", "Greater", "GreaterE", "Not", "Gets", "Quote", 
		"SQuote", "Comma", "Dot", "ID", "IDChar", "Double", "Integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'string'", "'int'", "'double'", "'bool'", null, "'print'", "'LHC+-'", 
		null, null, null, "'{'", "'}'", "'('", "')'", "';'", "'+'", "'-'", "'*'", 
		"'/'", null, "'|'", "'&'", null, null, "'<'", null, "'>'", null, "'!'", 
		"'='", "'\"'", "'''", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StringType", "IntegerType", "DoubleType", "BooleanType", "WS", 
		"Print", "Init", "BOOL", "Char", "String", "Begin", "End", "ParBeg", "ParEnd", 
		"Semicolon", "Plus", "Minus", "Times", "Divide", "Num", "Or", "And", "Equal", 
		"NEqual", "Less", "LessE", "Greater", "GreaterE", "Not", "Gets", "Quote", 
		"SQuote", "Comma", "Dot", "ID", "IDChar", "Double", "Integer"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00e3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\6\6h\n\6\r\6\16\6i\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e\13\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\6\25\u00a5\n\25\r\25\16\25\u00a6\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\7$\u00cc"+
		"\n$\f$\16$\u00cf\13$\3%\5%\u00d2\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u00dd"+
		"\n&\3\'\6\'\u00e0\n\'\r\'\16\'\u00e1\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\5"+
		"\5\2\13\f\17\17\"\"\4\2\2#%\0\5\2C\\aac|\u00eb\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\3O\3\2\2\2\5V\3\2\2\2\7Z\3\2\2\2\ta\3\2\2\2\13g\3\2\2\2\r"+
		"m\3\2\2\2\17s\3\2\2\2\21\u0082\3\2\2\2\23\u0084\3\2\2\2\25\u0088\3\2\2"+
		"\2\27\u0091\3\2\2\2\31\u0093\3\2\2\2\33\u0095\3\2\2\2\35\u0097\3\2\2\2"+
		"\37\u0099\3\2\2\2!\u009b\3\2\2\2#\u009d\3\2\2\2%\u009f\3\2\2\2\'\u00a1"+
		"\3\2\2\2)\u00a4\3\2\2\2+\u00a8\3\2\2\2-\u00aa\3\2\2\2/\u00ac\3\2\2\2\61"+
		"\u00af\3\2\2\2\63\u00b2\3\2\2\2\65\u00b4\3\2\2\2\67\u00b7\3\2\2\29\u00b9"+
		"\3\2\2\2;\u00bc\3\2\2\2=\u00be\3\2\2\2?\u00c0\3\2\2\2A\u00c2\3\2\2\2C"+
		"\u00c4\3\2\2\2E\u00c6\3\2\2\2G\u00c8\3\2\2\2I\u00d1\3\2\2\2K\u00dc\3\2"+
		"\2\2M\u00df\3\2\2\2OP\7u\2\2PQ\7v\2\2QR\7t\2\2RS\7k\2\2ST\7p\2\2TU\7i"+
		"\2\2U\4\3\2\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\6\3\2\2\2Z[\7f\2\2[\\\7q\2"+
		"\2\\]\7w\2\2]^\7d\2\2^_\7n\2\2_`\7g\2\2`\b\3\2\2\2ab\7d\2\2bc\7q\2\2c"+
		"d\7q\2\2de\7n\2\2e\n\3\2\2\2fh\t\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2i"+
		"j\3\2\2\2jk\3\2\2\2kl\b\6\2\2l\f\3\2\2\2mn\7r\2\2no\7t\2\2op\7k\2\2pq"+
		"\7p\2\2qr\7v\2\2r\16\3\2\2\2st\7N\2\2tu\7J\2\2uv\7E\2\2vw\7-\2\2wx\7/"+
		"\2\2x\20\3\2\2\2yz\7v\2\2z{\7t\2\2{|\7w\2\2|\u0083\7g\2\2}~\7h\2\2~\177"+
		"\7c\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0083\7g\2\2\u0082y"+
		"\3\2\2\2\u0082}\3\2\2\2\u0083\22\3\2\2\2\u0084\u0085\5A!\2\u0085\u0086"+
		"\4\2\0\2\u0086\u0087\5A!\2\u0087\24\3\2\2\2\u0088\u008c\5? \2\u0089\u008b"+
		"\t\3\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5?"+
		" \2\u0090\26\3\2\2\2\u0091\u0092\7}\2\2\u0092\30\3\2\2\2\u0093\u0094\7"+
		"\177\2\2\u0094\32\3\2\2\2\u0095\u0096\7*\2\2\u0096\34\3\2\2\2\u0097\u0098"+
		"\7+\2\2\u0098\36\3\2\2\2\u0099\u009a\7=\2\2\u009a \3\2\2\2\u009b\u009c"+
		"\7-\2\2\u009c\"\3\2\2\2\u009d\u009e\7/\2\2\u009e$\3\2\2\2\u009f\u00a0"+
		"\7,\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2(\3\2\2\2\u00a3\u00a5"+
		"\4\62;\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7~\2\2\u00a9,\3\2\2\2\u00aa"+
		"\u00ab\7(\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad\u00ae\7?\2\2\u00ae"+
		"\60\3\2\2\2\u00af\u00b0\7#\2\2\u00b0\u00b1\7?\2\2\u00b1\62\3\2\2\2\u00b2"+
		"\u00b3\7>\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5\u00b6\7?\2\2\u00b6"+
		"\66\3\2\2\2\u00b7\u00b8\7@\2\2\u00b88\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba"+
		"\u00bb\7?\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd<\3\2\2\2\u00be\u00bf"+
		"\7?\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7$\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7"+
		")\2\2\u00c3B\3\2\2\2\u00c4\u00c5\7.\2\2\u00c5D\3\2\2\2\u00c6\u00c7\7\60"+
		"\2\2\u00c7F\3\2\2\2\u00c8\u00cd\5I%\2\u00c9\u00cc\5)\25\2\u00ca\u00cc"+
		"\5I%\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ceH\3\2\2\2\u00cf\u00cd\3\2\2\2"+
		"\u00d0\u00d2\t\4\2\2\u00d1\u00d0\3\2\2\2\u00d2J\3\2\2\2\u00d3\u00d4\5"+
		"M\'\2\u00d4\u00d5\7\60\2\2\u00d5\u00d6\5M\'\2\u00d6\u00dd\3\2\2\2\u00d7"+
		"\u00d8\7\60\2\2\u00d8\u00dd\5M\'\2\u00d9\u00da\5M\'\2\u00da\u00db\7\60"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc"+
		"\u00d9\3\2\2\2\u00ddL\3\2\2\2\u00de\u00e0\5)\25\2\u00df\u00de\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2N\3"+
		"\2\2\2\f\2i\u0082\u008c\u00a6\u00cb\u00cd\u00d1\u00dc\u00e1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}