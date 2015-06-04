// Generated from LHC.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LHCParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, BOOL=5, WS=6;
	public static final String[] tokenNames = {
		"<INVALID>", "'&'", "'('", "')'", "'|'", "BOOL", "WS"
	};
	public static final int
		RULE_exp1 = 0, RULE_exp2 = 1;
	public static final String[] ruleNames = {
		"exp1", "exp2"
	};

	@Override
	public String getGrammarFileName() { return "LHC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LHCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Exp1Context extends ParserRuleContext {
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	 
		public Exp1Context() { }
		public void copyFrom(Exp1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextAndContext extends Exp1Context {
		public Exp2Context exit;
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public NextAndContext(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterNextAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitNextAnd(this);
		}
	}
	public static class Or_ruleContext extends Exp1Context {
		public Exp1Context left;
		public Exp2Context right;
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Or_ruleContext(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterOr_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitOr_rule(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		return exp1(0);
	}

	private Exp1Context exp1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp1Context _localctx = new Exp1Context(_ctx, _parentState);
		Exp1Context _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_exp1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(5); ((NextAndContext)_localctx).exit = exp2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(12);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_ruleContext(new Exp1Context(_parentctx, _parentState));
					((Or_ruleContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp1);
					setState(7);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(8); match(4);
					setState(9); ((Or_ruleContext)_localctx).right = exp2(0);
					}
					} 
				}
				setState(14);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp2Context extends ParserRuleContext {
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
	 
		public Exp2Context() { }
		public void copyFrom(Exp2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolContext extends Exp2Context {
		public Token bool;
		public TerminalNode BOOL() { return getToken(LHCParser.BOOL, 0); }
		public BoolContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitBool(this);
		}
	}
	public static class NextOrContext extends Exp2Context {
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public NextOrContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterNextOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitNextOr(this);
		}
	}
	public static class ASUHContext extends Exp2Context {
		public Exp2Context left;
		public Token right;
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode BOOL() { return getToken(LHCParser.BOOL, 0); }
		public ASUHContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterASUH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitASUH(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		return exp2(0);
	}

	private Exp2Context exp2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp2Context _localctx = new Exp2Context(_ctx, _parentState);
		Exp2Context _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			switch (_input.LA(1)) {
			case BOOL:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(16); ((BoolContext)_localctx).bool = match(BOOL);
				}
				break;
			case 2:
				{
				_localctx = new NextOrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17); match(2);
				setState(18); exp1(0);
				setState(19); match(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ASUHContext(new Exp2Context(_parentctx, _parentState));
					((ASUHContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(23);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(24); match(1);
					setState(25); ((ASUHContext)_localctx).right = match(BOOL);
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return exp1_sempred((Exp1Context)_localctx, predIndex);

		case 1: return exp2_sempred((Exp2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp2_sempred(Exp2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp1_sempred(Exp1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b\"\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\30\n\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\2\4\2\4"+
		"\4\2\4\2\2\"\2\6\3\2\2\2\4\27\3\2\2\2\6\7\b\2\1\2\7\b\5\4\3\2\b\16\3\2"+
		"\2\2\t\n\f\4\2\2\n\13\7\6\2\2\13\r\5\4\3\2\f\t\3\2\2\2\r\20\3\2\2\2\16"+
		"\f\3\2\2\2\16\17\3\2\2\2\17\3\3\2\2\2\20\16\3\2\2\2\21\22\b\3\1\2\22\30"+
		"\7\7\2\2\23\24\7\4\2\2\24\25\5\2\2\2\25\26\7\5\2\2\26\30\3\2\2\2\27\21"+
		"\3\2\2\2\27\23\3\2\2\2\30\36\3\2\2\2\31\32\f\5\2\2\32\33\7\3\2\2\33\35"+
		"\7\7\2\2\34\31\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\5\3"+
		"\2\2\2 \36\3\2\2\2\5\16\27\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}