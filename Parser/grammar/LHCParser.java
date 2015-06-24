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
		IntegerType=1, DoubleType=2, BooleanType=3, WS=4, Print=5, Init=6, Bool=7, 
		Void=8, Return=9, Begin=10, End=11, ParBeg=12, ParEnd=13, Semicolon=14, 
		Plus=15, Minus=16, Times=17, Divide=18, Integer=19, Or=20, And=21, Equal=22, 
		NEqual=23, Less=24, LessE=25, Greater=26, GreaterE=27, Not=28, Gets=29, 
		Quote=30, SQuote=31, Comma=32, Dot=33, Double=34, ID=35, IDChar=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'int'", "'double'", "'bool'", "WS", "'print'", "'LHC+-'", 
		"Bool", "'void'", "'return'", "'{'", "'}'", "'('", "')'", "';'", "'+'", 
		"'-'", "'*'", "'/'", "Integer", "'|'", "'&'", "Equal", "NEqual", "'<'", 
		"LessE", "'>'", "GreaterE", "'!'", "'='", "'\"'", "'''", "','", "'.'", 
		"Double", "ID", "IDChar"
	};
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_print = 2, RULE_methodCall = 3, 
		RULE_exp = 4, RULE_methodDef = 5, RULE_paramList = 6, RULE_paramDecl = 7, 
		RULE_expressionList = 8, RULE_decl = 9, RULE_attr = 10, RULE_rightSide = 11, 
		RULE_value = 12, RULE_type = 13;
	public static final String[] ruleNames = {
		"program", "stmt", "print", "methodCall", "exp", "methodDef", "paramList", 
		"paramDecl", "expressionList", "decl", "attr", "rightSide", "value", "type"
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public MethodDefContext methodDef(int i) {
			return getRuleContext(MethodDefContext.class,i);
		}
		public TerminalNode Init() { return getToken(LHCParser.Init, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(Init);
			setState(29); match(Begin);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Void))) != 0)) {
				{
				{
				setState(30); methodDef();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36); match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); attr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); print();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40); exp(0);
				setState(41); match(Semicolon);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43); decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExpContext argument;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode Print() { return getToken(LHCParser.Print, 0); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(Print);
			setState(47); match(ParBeg);
			setState(48); ((PrintContext)_localctx).argument = exp(0);
			setState(49); match(ParEnd);
			setState(50); match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public Token funcName1;
		public Token funcName2;
		public ExpressionListContext argList;
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public List<TerminalNode> ID() { return getTokens(LHCParser.ID); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode ID(int i) {
			return getToken(LHCParser.ID, i);
		}
		public TerminalNode Dot() { return getToken(LHCParser.Dot, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); ((MethodCallContext)_localctx).funcName1 = match(ID);
			setState(55);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(53); match(Dot);
				setState(54); ((MethodCallContext)_localctx).funcName2 = match(ID);
				}
			}

			setState(57); match(ParBeg);
			setState(59);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << ParBeg) | (1L << Integer) | (1L << Double) | (1L << ID))) != 0)) {
				{
				setState(58); ((MethodCallContext)_localctx).argList = expressionList();
				}
			}

			setState(61); match(ParEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessE_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode LessE() { return getToken(LHCParser.LessE, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LessE_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterLessE_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitLessE_rule(this);
		}
	}
	public static class VariableContext extends ExpContext {
		public Token varName;
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
		public VariableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitVariable(this);
		}
	}
	public static class Less_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode Less() { return getToken(LHCParser.Less, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Less_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterLess_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitLess_rule(this);
		}
	}
	public static class Equal_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode Equal() { return getToken(LHCParser.Equal, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Equal_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterEqual_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitEqual_rule(this);
		}
	}
	public static class Plus_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode Plus() { return getToken(LHCParser.Plus, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Plus_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterPlus_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitPlus_rule(this);
		}
	}
	public static class And_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode And() { return getToken(LHCParser.And, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public And_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterAnd_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitAnd_rule(this);
		}
	}
	public static class ParExp_ruleContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public ParExp_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterParExp_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitParExp_rule(this);
		}
	}
	public static class Value_ruleContext extends ExpContext {
		public ValueContext value_;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Value_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterValue_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitValue_rule(this);
		}
	}
	public static class Method_ruleContext extends ExpContext {
		public MethodCallContext method;
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public Method_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterMethod_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitMethod_rule(this);
		}
	}
	public static class NEqual__ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode NEqual() { return getToken(LHCParser.NEqual, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public NEqual__ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterNEqual__rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitNEqual__rule(this);
		}
	}
	public static class Times_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public TerminalNode Times() { return getToken(LHCParser.Times, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Times_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterTimes_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitTimes_rule(this);
		}
	}
	public static class Minus_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode Minus() { return getToken(LHCParser.Minus, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Minus_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterMinus_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitMinus_rule(this);
		}
	}
	public static class Greater_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode Greater() { return getToken(LHCParser.Greater, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Greater_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterGreater_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitGreater_rule(this);
		}
	}
	public static class Divide_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode Divide() { return getToken(LHCParser.Divide, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Divide_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterDivide_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitDivide_rule(this);
		}
	}
	public static class Or_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode Or() { return getToken(LHCParser.Or, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Or_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterOr_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitOr_rule(this);
		}
	}
	public static class GreaterE_ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode GreaterE() { return getToken(LHCParser.GreaterE, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public GreaterE_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterGreaterE_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitGreaterE_rule(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new ParExp_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(64); match(ParBeg);
				setState(65); exp(0);
				setState(66); match(ParEnd);
				}
				break;

			case 2:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68); ((VariableContext)_localctx).varName = match(ID);
				}
				break;

			case 3:
				{
				_localctx = new Value_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69); ((Value_ruleContext)_localctx).value_ = value();
				}
				break;

			case 4:
				{
				_localctx = new Method_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70); ((Method_ruleContext)_localctx).method = methodCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Or_ruleContext(new ExpContext(_parentctx, _parentState));
						((Or_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(73);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(74); match(Or);
						setState(75); ((Or_ruleContext)_localctx).right = exp(16);
						}
						break;

					case 2:
						{
						_localctx = new And_ruleContext(new ExpContext(_parentctx, _parentState));
						((And_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(76);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(77); match(And);
						setState(78); ((And_ruleContext)_localctx).right = exp(15);
						}
						break;

					case 3:
						{
						_localctx = new Times_ruleContext(new ExpContext(_parentctx, _parentState));
						((Times_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(79);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(80); match(Times);
						setState(81); ((Times_ruleContext)_localctx).right = exp(14);
						}
						break;

					case 4:
						{
						_localctx = new Divide_ruleContext(new ExpContext(_parentctx, _parentState));
						((Divide_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(82);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(83); match(Divide);
						setState(84); ((Divide_ruleContext)_localctx).right = exp(13);
						}
						break;

					case 5:
						{
						_localctx = new Plus_ruleContext(new ExpContext(_parentctx, _parentState));
						((Plus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(85);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(86); match(Plus);
						setState(87); ((Plus_ruleContext)_localctx).right = exp(12);
						}
						break;

					case 6:
						{
						_localctx = new Minus_ruleContext(new ExpContext(_parentctx, _parentState));
						((Minus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(88);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(89); match(Minus);
						setState(90); ((Minus_ruleContext)_localctx).right = exp(11);
						}
						break;

					case 7:
						{
						_localctx = new Equal_ruleContext(new ExpContext(_parentctx, _parentState));
						((Equal_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(91);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(92); match(Equal);
						setState(93); ((Equal_ruleContext)_localctx).right = exp(10);
						}
						break;

					case 8:
						{
						_localctx = new NEqual__ruleContext(new ExpContext(_parentctx, _parentState));
						((NEqual__ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(94);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(95); match(NEqual);
						setState(96); ((NEqual__ruleContext)_localctx).right = exp(9);
						}
						break;

					case 9:
						{
						_localctx = new Less_ruleContext(new ExpContext(_parentctx, _parentState));
						((Less_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(97);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(98); match(Less);
						setState(99); ((Less_ruleContext)_localctx).right = exp(8);
						}
						break;

					case 10:
						{
						_localctx = new Greater_ruleContext(new ExpContext(_parentctx, _parentState));
						((Greater_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(100);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(101); match(Greater);
						setState(102); ((Greater_ruleContext)_localctx).right = exp(7);
						}
						break;

					case 11:
						{
						_localctx = new LessE_ruleContext(new ExpContext(_parentctx, _parentState));
						((LessE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(103);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(104); match(LessE);
						setState(105); ((LessE_ruleContext)_localctx).right = exp(6);
						}
						break;

					case 12:
						{
						_localctx = new GreaterE_ruleContext(new ExpContext(_parentctx, _parentState));
						((GreaterE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(106);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(107); match(GreaterE);
						setState(108); ((GreaterE_ruleContext)_localctx).right = exp(5);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class MethodDefContext extends ParserRuleContext {
		public Token typeVoid;
		public TypeContext type_;
		public Token funcName;
		public ParamListContext params;
		public StmtContext stmtList;
		public ExpContext returnExp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public TerminalNode Void() { return getToken(LHCParser.Void, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Return() { return getToken(LHCParser.Return, 0); }
		public MethodDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterMethodDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitMethodDef(this);
		}
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			switch (_input.LA(1)) {
			case Void:
				{
				setState(114); ((MethodDefContext)_localctx).typeVoid = match(Void);
				}
				break;
			case IntegerType:
			case DoubleType:
			case BooleanType:
				{
				setState(115); ((MethodDefContext)_localctx).type_ = type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(118); ((MethodDefContext)_localctx).funcName = match(ID);
			setState(119); match(ParBeg);
			setState(121);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
				{
				setState(120); ((MethodDefContext)_localctx).params = paramList();
				}
			}

			setState(123); match(ParEnd);
			setState(139);
			switch (_input.LA(1)) {
			case Begin:
				{
				setState(124); match(Begin);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << Bool) | (1L << ParBeg) | (1L << Integer) | (1L << Double) | (1L << ID))) != 0)) {
					{
					{
					setState(125); ((MethodDefContext)_localctx).stmtList = stmt();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				_la = _input.LA(1);
				if (_la==Return) {
					{
					setState(131); match(Return);
					setState(132); ((MethodDefContext)_localctx).returnExp = exp(0);
					setState(133); match(Semicolon);
					}
				}

				setState(137); match(End);
				}
				break;
			case Semicolon:
				{
				setState(138); match(Semicolon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public ParamDeclContext declarations;
		public TerminalNode Comma(int i) {
			return getToken(LHCParser.Comma, i);
		}
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LHCParser.Comma); }
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); ((ParamListContext)_localctx).declarations = paramDecl();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(142); match(Comma);
				setState(143); ((ParamListContext)_localctx).declarations = paramDecl();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDeclContext extends ParserRuleContext {
		public TypeContext type_;
		public Token varName;
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitParamDecl(this);
		}
	}

	public final ParamDeclContext paramDecl() throws RecognitionException {
		ParamDeclContext _localctx = new ParamDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); ((ParamDeclContext)_localctx).type_ = type();
			setState(150); ((ParamDeclContext)_localctx).varName = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode Comma(int i) {
			return getToken(LHCParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(LHCParser.Comma); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); exp(0);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(153); match(Comma);
				setState(154); exp(0);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarMultDeclContext extends DeclContext {
		public TypeContext type_;
		public Token varName;
		public List<TerminalNode> ID() { return getTokens(LHCParser.ID); }
		public TerminalNode Comma(int i) {
			return getToken(LHCParser.Comma, i);
		}
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(LHCParser.ID, i);
		}
		public List<TerminalNode> Comma() { return getTokens(LHCParser.Comma); }
		public VarMultDeclContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterVarMultDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitVarMultDecl(this);
		}
	}
	public static class VarDeclContext extends DeclContext {
		public TypeContext type_;
		public Token varName;
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitVarDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decl);
		try {
			int _alt;
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160); ((VarDeclContext)_localctx).type_ = type();
				setState(161); ((VarDeclContext)_localctx).varName = match(ID);
				setState(162); match(Semicolon);
				}
				break;

			case 2:
				_localctx = new VarMultDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164); ((VarMultDeclContext)_localctx).type_ = type();
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(165); ((VarMultDeclContext)_localctx).varName = match(ID);
						setState(166); match(Comma);
						}
						} 
					}
					setState(171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(172); ((VarMultDeclContext)_localctx).varName = match(ID);
				setState(173); match(Semicolon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext {
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
	 
		public AttrContext() { }
		public void copyFrom(AttrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends AttrContext {
		public TypeContext type_;
		public Token varName;
		public RightSideContext rightSide_;
		public TerminalNode Gets() { return getToken(LHCParser.Gets, 0); }
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
		public RightSideContext rightSide() {
			return getRuleContext(RightSideContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitAssignment(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attr);
		int _la;
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
				{
				setState(177); ((AssignmentContext)_localctx).type_ = type();
				}
			}

			setState(180); ((AssignmentContext)_localctx).varName = match(ID);
			setState(181); match(Gets);
			setState(182); ((AssignmentContext)_localctx).rightSide_ = rightSide();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightSideContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public RightSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterRightSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitRightSide(this);
		}
	}

	public final RightSideContext rightSide() throws RecognitionException {
		RightSideContext _localctx = new RightSideContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rightSide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); exp(0);
			setState(185); match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_ruleContext extends ValueContext {
		public Token value_;
		public TerminalNode Double() { return getToken(LHCParser.Double, 0); }
		public Double_ruleContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterDouble_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitDouble_rule(this);
		}
	}
	public static class Bool_ruleContext extends ValueContext {
		public Token value_;
		public TerminalNode Bool() { return getToken(LHCParser.Bool, 0); }
		public Bool_ruleContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterBool_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitBool_rule(this);
		}
	}
	public static class Int_ruleContext extends ValueContext {
		public Token value_;
		public TerminalNode Integer() { return getToken(LHCParser.Integer, 0); }
		public Int_ruleContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterInt_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitInt_rule(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		try {
			setState(190);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new Int_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187); ((Int_ruleContext)_localctx).value_ = match(Integer);
				}
				break;
			case Bool:
				_localctx = new Bool_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188); ((Bool_ruleContext)_localctx).value_ = match(Bool);
				}
				break;
			case Double:
				_localctx = new Double_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(189); ((Double_ruleContext)_localctx).value_ = match(Double);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DoubleType() { return getToken(LHCParser.DoubleType, 0); }
		public TerminalNode IntegerType() { return getToken(LHCParser.IntegerType, 0); }
		public TerminalNode BooleanType() { return getToken(LHCParser.BooleanType, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 15);

		case 1: return precpred(_ctx, 14);

		case 2: return precpred(_ctx, 13);

		case 3: return precpred(_ctx, 12);

		case 4: return precpred(_ctx, 11);

		case 5: return precpred(_ctx, 10);

		case 6: return precpred(_ctx, 9);

		case 7: return precpred(_ctx, 8);

		case 8: return precpred(_ctx, 7);

		case 9: return precpred(_ctx, 6);

		case 10: return precpred(_ctx, 5);

		case 11: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2"+
		"%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\5\5>\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s\13\6\3\7\3\7\5\7w\n\7\3\7"+
		"\3\7\3\7\5\7|\n\7\3\7\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084\13\7\3\7\3"+
		"\7\3\7\3\7\5\7\u008a\n\7\3\7\3\7\5\7\u008e\n\7\3\b\3\b\3\b\7\b\u0093\n"+
		"\b\f\b\16\b\u0096\13\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u009e\n\n\f\n\16\n"+
		"\u00a1\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00aa\n\13\f\13\16"+
		"\13\u00ad\13\13\3\13\3\13\3\13\5\13\u00b2\n\13\3\f\5\f\u00b5\n\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00c1\n\16\3\17\3\17\3\17\2"+
		"\3\n\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\3\5\u00d7\2\36\3\2"+
		"\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\66\3\2\2\2\nI\3\2\2\2\fv\3\2\2\2\16\u008f"+
		"\3\2\2\2\20\u0097\3\2\2\2\22\u009a\3\2\2\2\24\u00b1\3\2\2\2\26\u00b4\3"+
		"\2\2\2\30\u00ba\3\2\2\2\32\u00c0\3\2\2\2\34\u00c2\3\2\2\2\36\37\7\b\2"+
		"\2\37#\7\f\2\2 \"\5\f\7\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3"+
		"\2\2\2%#\3\2\2\2&\'\7\r\2\2\'\3\3\2\2\2(/\5\26\f\2)/\5\6\4\2*+\5\n\6\2"+
		"+,\7\20\2\2,/\3\2\2\2-/\5\24\13\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.-\3\2"+
		"\2\2/\5\3\2\2\2\60\61\7\7\2\2\61\62\7\16\2\2\62\63\5\n\6\2\63\64\7\17"+
		"\2\2\64\65\7\20\2\2\65\7\3\2\2\2\669\7%\2\2\678\7#\2\28:\7%\2\29\67\3"+
		"\2\2\29:\3\2\2\2:;\3\2\2\2;=\7\16\2\2<>\5\22\n\2=<\3\2\2\2=>\3\2\2\2>"+
		"?\3\2\2\2?@\7\17\2\2@\t\3\2\2\2AB\b\6\1\2BC\7\16\2\2CD\5\n\6\2DE\7\17"+
		"\2\2EJ\3\2\2\2FJ\7%\2\2GJ\5\32\16\2HJ\5\b\5\2IA\3\2\2\2IF\3\2\2\2IG\3"+
		"\2\2\2IH\3\2\2\2Jq\3\2\2\2KL\f\21\2\2LM\7\26\2\2Mp\5\n\6\22NO\f\20\2\2"+
		"OP\7\27\2\2Pp\5\n\6\21QR\f\17\2\2RS\7\23\2\2Sp\5\n\6\20TU\f\16\2\2UV\7"+
		"\24\2\2Vp\5\n\6\17WX\f\r\2\2XY\7\21\2\2Yp\5\n\6\16Z[\f\f\2\2[\\\7\22\2"+
		"\2\\p\5\n\6\r]^\f\13\2\2^_\7\30\2\2_p\5\n\6\f`a\f\n\2\2ab\7\31\2\2bp\5"+
		"\n\6\13cd\f\t\2\2de\7\32\2\2ep\5\n\6\nfg\f\b\2\2gh\7\34\2\2hp\5\n\6\t"+
		"ij\f\7\2\2jk\7\33\2\2kp\5\n\6\blm\f\6\2\2mn\7\35\2\2np\5\n\6\7oK\3\2\2"+
		"\2oN\3\2\2\2oQ\3\2\2\2oT\3\2\2\2oW\3\2\2\2oZ\3\2\2\2o]\3\2\2\2o`\3\2\2"+
		"\2oc\3\2\2\2of\3\2\2\2oi\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2r\13\3\2\2\2sq\3\2\2\2tw\7\n\2\2uw\5\34\17\2vt\3\2\2\2vu\3\2\2\2wx\3"+
		"\2\2\2xy\7%\2\2y{\7\16\2\2z|\5\16\b\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u008d"+
		"\7\17\2\2~\u0082\7\f\2\2\177\u0081\5\4\3\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0089\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\13\2\2\u0086\u0087\5\n\6\2\u0087\u0088\7"+
		"\20\2\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008e\7\r\2\2\u008c\u008e\7\20\2\2\u008d~\3\2\2\2"+
		"\u008d\u008c\3\2\2\2\u008e\r\3\2\2\2\u008f\u0094\5\20\t\2\u0090\u0091"+
		"\7\"\2\2\u0091\u0093\5\20\t\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\17\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7%\2\2\u0099\21\3\2\2\2\u009a"+
		"\u009f\5\n\6\2\u009b\u009c\7\"\2\2\u009c\u009e\5\n\6\2\u009d\u009b\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\23\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4\7%\2"+
		"\2\u00a4\u00a5\7\20\2\2\u00a5\u00b2\3\2\2\2\u00a6\u00ab\5\34\17\2\u00a7"+
		"\u00a8\7%\2\2\u00a8\u00aa\7\"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\7%\2\2\u00af\u00b0\7\20\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00a2\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b5"+
		"\5\34\17\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b7\7%\2\2\u00b7\u00b8\7\37\2\2\u00b8\u00b9\5\30\r\2\u00b9\27"+
		"\3\2\2\2\u00ba\u00bb\5\n\6\2\u00bb\u00bc\7\20\2\2\u00bc\31\3\2\2\2\u00bd"+
		"\u00c1\7\25\2\2\u00be\u00c1\7\t\2\2\u00bf\u00c1\7$\2\2\u00c0\u00bd\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\33\3\2\2\2\u00c2\u00c3"+
		"\t\2\2\2\u00c3\35\3\2\2\2\24#.9=Ioqv{\u0082\u0089\u008d\u0094\u009f\u00ab"+
		"\u00b1\u00b4\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}