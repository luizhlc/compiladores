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
		BOOL=1, WS=2, Print=3, Init=4, Begin=5, End=6, ParBeg=7, ParEnd=8, Semicolon=9, 
		Plus=10, Minus=11, Times=12, Divide=13, Num=14, Or=15, And=16, Equal=17, 
		NEqual=18, Less=19, LessE=20, Greater=21, GreaterE=22, Not=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"BOOL", "WS", "'print'", "'LHC+-'", "'{'", "'}'", "'('", "')'", "';'", 
		"'+'", "'-'", "'*'", "'/'", "Num", "'|'", "'&'", "Equal", "NEqual", "'<'", 
		"LessE", "'>'", "GreaterE", "'!'"
	};
	public static final String[] ruleNames = {
		"BOOL", "WS", "Print", "Init", "Begin", "End", "ParBeg", "ParEnd", "Semicolon", 
		"Plus", "Minus", "Times", "Divide", "Num", "Or", "And", "Equal", "NEqual", 
		"Less", "LessE", "Greater", "GreaterE", "Not"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\6\3>\n\3\r\3\16\3?\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17c\n\17\r\17"+
		"\16\17d\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\2\2\31\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\3\2\3\5\2\13\f\17\17\"\"~\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3:\3\2\2\2\5=\3\2"+
		"\2\2\7C\3\2\2\2\tI\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2"+
		"\2\2\23W\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35b\3"+
		"\2\2\2\37f\3\2\2\2!h\3\2\2\2#j\3\2\2\2%m\3\2\2\2\'p\3\2\2\2)r\3\2\2\2"+
		"+u\3\2\2\2-w\3\2\2\2/z\3\2\2\2\61\62\7v\2\2\62\63\7t\2\2\63\64\7w\2\2"+
		"\64;\7g\2\2\65\66\7h\2\2\66\67\7c\2\2\678\7n\2\289\7u\2\29;\7g\2\2:\61"+
		"\3\2\2\2:\65\3\2\2\2;\4\3\2\2\2<>\t\2\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@A\3\2\2\2AB\b\3\2\2B\6\3\2\2\2CD\7r\2\2DE\7t\2\2EF\7k\2\2"+
		"FG\7p\2\2GH\7v\2\2H\b\3\2\2\2IJ\7N\2\2JK\7J\2\2KL\7E\2\2LM\7-\2\2MN\7"+
		"/\2\2N\n\3\2\2\2OP\7}\2\2P\f\3\2\2\2QR\7\177\2\2R\16\3\2\2\2ST\7*\2\2"+
		"T\20\3\2\2\2UV\7+\2\2V\22\3\2\2\2WX\7=\2\2X\24\3\2\2\2YZ\7-\2\2Z\26\3"+
		"\2\2\2[\\\7/\2\2\\\30\3\2\2\2]^\7,\2\2^\32\3\2\2\2_`\7\61\2\2`\34\3\2"+
		"\2\2ac\4\62;\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\36\3\2\2\2fg\7"+
		"~\2\2g \3\2\2\2hi\7(\2\2i\"\3\2\2\2jk\7?\2\2kl\7?\2\2l$\3\2\2\2mn\7#\2"+
		"\2no\7?\2\2o&\3\2\2\2pq\7>\2\2q(\3\2\2\2rs\7>\2\2st\7?\2\2t*\3\2\2\2u"+
		"v\7@\2\2v,\3\2\2\2wx\7@\2\2xy\7?\2\2y.\3\2\2\2z{\7#\2\2{\60\3\2\2\2\6"+
		"\2:?d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}