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
		Void=8, Return=9, Switch=10, Case=11, Default=12, Begin=13, End=14, ParBeg=15, 
		ParEnd=16, Semicolon=17, Plus=18, Minus=19, Times=20, Divide=21, Integer=22, 
		Or=23, And=24, Equal=25, NEqual=26, Less=27, LessE=28, Greater=29, GreaterE=30, 
		Not=31, Gets=32, Quote=33, SQuote=34, Comma=35, Dot=36, Double=37, ID=38, 
		IDChar=39;
	public static final String[] tokenNames = {
		"<INVALID>", "'int'", "'double'", "'bool'", "WS", "'print'", "'LHC+-'", 
		"Bool", "'void'", "'return'", "'switch'", "'case'", "'default'", "'{'", 
		"'}'", "'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'", "Integer", "'|'", 
		"'&'", "Equal", "NEqual", "'<'", "LessE", "'>'", "GreaterE", "'!'", "'='", 
		"'\"'", "'''", "','", "'.'", "Double", "ID", "IDChar"
	};
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_print = 2, RULE_exp = 3, RULE_methodDef = 4, 
		RULE_methodCall = 5, RULE_paramList = 6, RULE_paramDecl = 7, RULE_expressionList = 8, 
		RULE_decl = 9, RULE_attr = 10, RULE_rightSide = 11, RULE_switch1 = 12, 
		RULE_case1 = 13, RULE_default1 = 14, RULE_value = 15, RULE_type = 16;
	public static final String[] ruleNames = {
		"program", "stmt", "print", "exp", "methodDef", "methodCall", "paramList", 
		"paramDecl", "expressionList", "decl", "attr", "rightSide", "switch1", 
		"case1", "default1", "value", "type"
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
			setState(34); match(Init);
			setState(35); match(Begin);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Void))) != 0)) {
				{
				{
				setState(36); methodDef();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); match(End);
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
		public Switch1Context switch1() {
			return getRuleContext(Switch1Context.class,0);
		}
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
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); attr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); print();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46); exp(0);
				setState(47); match(Semicolon);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49); decl();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50); switch1();
				setState(51); match(Semicolon);
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
			setState(55); match(Print);
			setState(56); match(ParBeg);
			setState(57); ((PrintContext)_localctx).argument = exp(0);
			setState(58); match(ParEnd);
			setState(59); match(Semicolon);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ParExp_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62); match(ParBeg);
				setState(63); exp(0);
				setState(64); match(ParEnd);
				}
				break;

			case 2:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66); ((VariableContext)_localctx).varName = match(ID);
				}
				break;

			case 3:
				{
				_localctx = new Value_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67); ((Value_ruleContext)_localctx).value_ = value();
				}
				break;

			case 4:
				{
				_localctx = new Method_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68); ((Method_ruleContext)_localctx).method = methodCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Or_ruleContext(new ExpContext(_parentctx, _parentState));
						((Or_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(71);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(72); match(Or);
						setState(73); ((Or_ruleContext)_localctx).right = exp(16);
						}
						break;

					case 2:
						{
						_localctx = new And_ruleContext(new ExpContext(_parentctx, _parentState));
						((And_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(74);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(75); match(And);
						setState(76); ((And_ruleContext)_localctx).right = exp(15);
						}
						break;

					case 3:
						{
						_localctx = new Times_ruleContext(new ExpContext(_parentctx, _parentState));
						((Times_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(77);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(78); match(Times);
						setState(79); ((Times_ruleContext)_localctx).right = exp(14);
						}
						break;

					case 4:
						{
						_localctx = new Divide_ruleContext(new ExpContext(_parentctx, _parentState));
						((Divide_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(80);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(81); match(Divide);
						setState(82); ((Divide_ruleContext)_localctx).right = exp(13);
						}
						break;

					case 5:
						{
						_localctx = new Plus_ruleContext(new ExpContext(_parentctx, _parentState));
						((Plus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(83);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(84); match(Plus);
						setState(85); ((Plus_ruleContext)_localctx).right = exp(12);
						}
						break;

					case 6:
						{
						_localctx = new Minus_ruleContext(new ExpContext(_parentctx, _parentState));
						((Minus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(86);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(87); match(Minus);
						setState(88); ((Minus_ruleContext)_localctx).right = exp(11);
						}
						break;

					case 7:
						{
						_localctx = new Equal_ruleContext(new ExpContext(_parentctx, _parentState));
						((Equal_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(89);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(90); match(Equal);
						setState(91); ((Equal_ruleContext)_localctx).right = exp(10);
						}
						break;

					case 8:
						{
						_localctx = new NEqual__ruleContext(new ExpContext(_parentctx, _parentState));
						((NEqual__ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(92);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(93); match(NEqual);
						setState(94); ((NEqual__ruleContext)_localctx).right = exp(9);
						}
						break;

					case 9:
						{
						_localctx = new Less_ruleContext(new ExpContext(_parentctx, _parentState));
						((Less_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(95);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(96); match(Less);
						setState(97); ((Less_ruleContext)_localctx).right = exp(8);
						}
						break;

					case 10:
						{
						_localctx = new Greater_ruleContext(new ExpContext(_parentctx, _parentState));
						((Greater_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(98);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(99); match(Greater);
						setState(100); ((Greater_ruleContext)_localctx).right = exp(7);
						}
						break;

					case 11:
						{
						_localctx = new LessE_ruleContext(new ExpContext(_parentctx, _parentState));
						((LessE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(101);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(102); match(LessE);
						setState(103); ((LessE_ruleContext)_localctx).right = exp(6);
						}
						break;

					case 12:
						{
						_localctx = new GreaterE_ruleContext(new ExpContext(_parentctx, _parentState));
						((GreaterE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(104);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(105); match(GreaterE);
						setState(106); ((GreaterE_ruleContext)_localctx).right = exp(5);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 8, RULE_methodDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch (_input.LA(1)) {
			case Void:
				{
				setState(112); ((MethodDefContext)_localctx).typeVoid = match(Void);
				}
				break;
			case IntegerType:
			case DoubleType:
			case BooleanType:
				{
				setState(113); ((MethodDefContext)_localctx).type_ = type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116); ((MethodDefContext)_localctx).funcName = match(ID);
			setState(117); match(ParBeg);
			setState(119);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
				{
				setState(118); ((MethodDefContext)_localctx).params = paramList();
				}
			}

			setState(121); match(ParEnd);
			setState(137);
			switch (_input.LA(1)) {
			case Begin:
				{
				setState(122); match(Begin);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << Bool) | (1L << Switch) | (1L << ParBeg) | (1L << Integer) | (1L << Double) | (1L << ID))) != 0)) {
					{
					{
					setState(123); ((MethodDefContext)_localctx).stmtList = stmt();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				_la = _input.LA(1);
				if (_la==Return) {
					{
					setState(129); match(Return);
					setState(130); ((MethodDefContext)_localctx).returnExp = exp(0);
					setState(131); match(Semicolon);
					}
				}

				setState(135); match(End);
				}
				break;
			case Semicolon:
				{
				setState(136); match(Semicolon);
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
		enterRule(_localctx, 10, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); ((MethodCallContext)_localctx).funcName1 = match(ID);
			setState(142);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(140); match(Dot);
				setState(141); ((MethodCallContext)_localctx).funcName2 = match(ID);
				}
			}

			setState(144); match(ParBeg);
			setState(146);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << ParBeg) | (1L << Integer) | (1L << Double) | (1L << ID))) != 0)) {
				{
				setState(145); ((MethodCallContext)_localctx).argList = expressionList();
				}
			}

			setState(148); match(ParEnd);
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
			setState(150); ((ParamListContext)_localctx).declarations = paramDecl();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(151); match(Comma);
				setState(152); ((ParamListContext)_localctx).declarations = paramDecl();
				}
				}
				setState(157);
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
			setState(158); ((ParamDeclContext)_localctx).type_ = type();
			setState(159); ((ParamDeclContext)_localctx).varName = match(ID);
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
			setState(161); exp(0);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(162); match(Comma);
				setState(163); exp(0);
				}
				}
				setState(168);
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
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169); ((VarDeclContext)_localctx).type_ = type();
				setState(170); ((VarDeclContext)_localctx).varName = match(ID);
				setState(171); match(Semicolon);
				}
				break;

			case 2:
				_localctx = new VarMultDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173); ((VarMultDeclContext)_localctx).type_ = type();
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(174); ((VarMultDeclContext)_localctx).varName = match(ID);
						setState(175); match(Comma);
						}
						} 
					}
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(181); ((VarMultDeclContext)_localctx).varName = match(ID);
				setState(182); match(Semicolon);
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
			setState(187);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
				{
				setState(186); ((AssignmentContext)_localctx).type_ = type();
				}
			}

			setState(189); ((AssignmentContext)_localctx).varName = match(ID);
			setState(190); match(Gets);
			setState(191); ((AssignmentContext)_localctx).rightSide_ = rightSide();
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
			setState(193); exp(0);
			setState(194); match(Semicolon);
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

	public static class Switch1Context extends ParserRuleContext {
		public Case1Context case_;
		public Default1Context else_;
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public TerminalNode Switch() { return getToken(LHCParser.Switch, 0); }
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public List<Case1Context> case1() {
			return getRuleContexts(Case1Context.class);
		}
		public Case1Context case1(int i) {
			return getRuleContext(Case1Context.class,i);
		}
		public Default1Context default1() {
			return getRuleContext(Default1Context.class,0);
		}
		public Switch1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterSwitch1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitSwitch1(this);
		}
	}

	public final Switch1Context switch1() throws RecognitionException {
		Switch1Context _localctx = new Switch1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_switch1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(Switch);
			setState(197); match(Begin);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198); ((Switch1Context)_localctx).case_ = case1();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			{
			setState(203); ((Switch1Context)_localctx).else_ = default1();
			}
			setState(204); match(End);
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

	public static class Case1Context extends ParserRuleContext {
		public Case1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case1; }
	 
		public Case1Context() { }
		public void copyFrom(Case1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Case_ruleContext extends Case1Context {
		public ExpContext condition_;
		public StmtContext stmtList;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Case() { return getToken(LHCParser.Case, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Case_ruleContext(Case1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterCase_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitCase_rule(this);
		}
	}

	public final Case1Context case1() throws RecognitionException {
		Case1Context _localctx = new Case1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_case1);
		int _la;
		try {
			_localctx = new Case_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(Case);
			setState(207); match(ParBeg);
			setState(208); ((Case_ruleContext)_localctx).condition_ = exp(0);
			setState(209); match(ParEnd);
			setState(210); match(Begin);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << Bool) | (1L << Switch) | (1L << ParBeg) | (1L << Integer) | (1L << Double) | (1L << ID))) != 0)) {
				{
				{
				setState(211); ((Case_ruleContext)_localctx).stmtList = stmt();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217); match(End);
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

	public static class Default1Context extends ParserRuleContext {
		public Default1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default1; }
	 
		public Default1Context() { }
		public void copyFrom(Default1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Default_ruleContext extends Default1Context {
		public StmtContext stmtList;
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public TerminalNode Default() { return getToken(LHCParser.Default, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Default_ruleContext(Default1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).enterDefault_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LHCListener ) ((LHCListener)listener).exitDefault_rule(this);
		}
	}

	public final Default1Context default1() throws RecognitionException {
		Default1Context _localctx = new Default1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_default1);
		int _la;
		try {
			_localctx = new Default_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(Default);
			setState(220); match(Begin);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << Bool) | (1L << Switch) | (1L << ParBeg) | (1L << Integer) | (1L << Double) | (1L << ID))) != 0)) {
				{
				{
				setState(221); ((Default_ruleContext)_localctx).stmtList = stmt();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(End);
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
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new Int_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229); ((Int_ruleContext)_localctx).value_ = match(Integer);
				}
				break;
			case Bool:
				_localctx = new Bool_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230); ((Bool_ruleContext)_localctx).value_ = match(Bool);
				}
				break;
			case Double:
				_localctx = new Double_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231); ((Double_ruleContext)_localctx).value_ = match(Double);
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
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		case 3: return exp_sempred((ExpContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5n\n\5\f\5\16\5q\13\5\3\6\3\6\5\6u\n\6\3\6\3\6"+
		"\3\6\5\6z\n\6\3\6\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0088\n\6\3\6\3\6\5\6\u008c\n\6\3\7\3\7\3\7\5\7\u0091\n\7\3\7"+
		"\3\7\5\7\u0095\n\7\3\7\3\7\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00a7\n\n\f\n\16\n\u00aa\13\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00b3\n\13\f\13\16\13\u00b6\13\13\3\13"+
		"\3\13\3\13\5\13\u00bb\n\13\3\f\5\f\u00be\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\6\16\u00ca\n\16\r\16\16\16\u00cb\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00d7\n\17\f\17\16\17\u00da\13\17\3\17"+
		"\3\17\3\20\3\20\3\20\7\20\u00e1\n\20\f\20\16\20\u00e4\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\5\21\u00eb\n\21\3\22\3\22\3\22\2\3\b\23\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"\2\3\3\2\3\5\u0102\2$\3\2\2\2\4\67\3\2\2\2"+
		"\69\3\2\2\2\bG\3\2\2\2\nt\3\2\2\2\f\u008d\3\2\2\2\16\u0098\3\2\2\2\20"+
		"\u00a0\3\2\2\2\22\u00a3\3\2\2\2\24\u00ba\3\2\2\2\26\u00bd\3\2\2\2\30\u00c3"+
		"\3\2\2\2\32\u00c6\3\2\2\2\34\u00d0\3\2\2\2\36\u00dd\3\2\2\2 \u00ea\3\2"+
		"\2\2\"\u00ec\3\2\2\2$%\7\b\2\2%)\7\17\2\2&(\5\n\6\2\'&\3\2\2\2(+\3\2\2"+
		"\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\20\2\2-\3\3\2\2\2.8\5"+
		"\26\f\2/8\5\6\4\2\60\61\5\b\5\2\61\62\7\23\2\2\628\3\2\2\2\638\5\24\13"+
		"\2\64\65\5\32\16\2\65\66\7\23\2\2\668\3\2\2\2\67.\3\2\2\2\67/\3\2\2\2"+
		"\67\60\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\28\5\3\2\2\29:\7\7\2\2:;\7\21"+
		"\2\2;<\5\b\5\2<=\7\22\2\2=>\7\23\2\2>\7\3\2\2\2?@\b\5\1\2@A\7\21\2\2A"+
		"B\5\b\5\2BC\7\22\2\2CH\3\2\2\2DH\7(\2\2EH\5 \21\2FH\5\f\7\2G?\3\2\2\2"+
		"GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2Ho\3\2\2\2IJ\f\21\2\2JK\7\31\2\2Kn\5\b\5"+
		"\22LM\f\20\2\2MN\7\32\2\2Nn\5\b\5\21OP\f\17\2\2PQ\7\26\2\2Qn\5\b\5\20"+
		"RS\f\16\2\2ST\7\27\2\2Tn\5\b\5\17UV\f\r\2\2VW\7\24\2\2Wn\5\b\5\16XY\f"+
		"\f\2\2YZ\7\25\2\2Zn\5\b\5\r[\\\f\13\2\2\\]\7\33\2\2]n\5\b\5\f^_\f\n\2"+
		"\2_`\7\34\2\2`n\5\b\5\13ab\f\t\2\2bc\7\35\2\2cn\5\b\5\nde\f\b\2\2ef\7"+
		"\37\2\2fn\5\b\5\tgh\f\7\2\2hi\7\36\2\2in\5\b\5\bjk\f\6\2\2kl\7 \2\2ln"+
		"\5\b\5\7mI\3\2\2\2mL\3\2\2\2mO\3\2\2\2mR\3\2\2\2mU\3\2\2\2mX\3\2\2\2m"+
		"[\3\2\2\2m^\3\2\2\2ma\3\2\2\2md\3\2\2\2mg\3\2\2\2mj\3\2\2\2nq\3\2\2\2"+
		"om\3\2\2\2op\3\2\2\2p\t\3\2\2\2qo\3\2\2\2ru\7\n\2\2su\5\"\22\2tr\3\2\2"+
		"\2ts\3\2\2\2uv\3\2\2\2vw\7(\2\2wy\7\21\2\2xz\5\16\b\2yx\3\2\2\2yz\3\2"+
		"\2\2z{\3\2\2\2{\u008b\7\22\2\2|\u0080\7\17\2\2}\177\5\4\3\2~}\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0087\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u0085\5\b\5\2\u0085"+
		"\u0086\7\23\2\2\u0086\u0088\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\7\20\2\2\u008a\u008c\7\23\2\2\u008b"+
		"|\3\2\2\2\u008b\u008a\3\2\2\2\u008c\13\3\2\2\2\u008d\u0090\7(\2\2\u008e"+
		"\u008f\7&\2\2\u008f\u0091\7(\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2"+
		"\2\u0091\u0092\3\2\2\2\u0092\u0094\7\21\2\2\u0093\u0095\5\22\n\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\22"+
		"\2\2\u0097\r\3\2\2\2\u0098\u009d\5\20\t\2\u0099\u009a\7%\2\2\u009a\u009c"+
		"\5\20\t\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\17\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1"+
		"\5\"\22\2\u00a1\u00a2\7(\2\2\u00a2\21\3\2\2\2\u00a3\u00a8\5\b\5\2\u00a4"+
		"\u00a5\7%\2\2\u00a5\u00a7\5\b\5\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\23\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00ad\7(\2\2\u00ad\u00ae\7\23\2\2"+
		"\u00ae\u00bb\3\2\2\2\u00af\u00b4\5\"\22\2\u00b0\u00b1\7(\2\2\u00b1\u00b3"+
		"\7%\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7("+
		"\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00ab\3\2\2\2\u00ba"+
		"\u00af\3\2\2\2\u00bb\25\3\2\2\2\u00bc\u00be\5\"\22\2\u00bd\u00bc\3\2\2"+
		"\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0\u00c1"+
		"\7\"\2\2\u00c1\u00c2\5\30\r\2\u00c2\27\3\2\2\2\u00c3\u00c4\5\b\5\2\u00c4"+
		"\u00c5\7\23\2\2\u00c5\31\3\2\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c9\7\17"+
		"\2\2\u00c8\u00ca\5\34\17\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\5\36"+
		"\20\2\u00ce\u00cf\7\20\2\2\u00cf\33\3\2\2\2\u00d0\u00d1\7\r\2\2\u00d1"+
		"\u00d2\7\21\2\2\u00d2\u00d3\5\b\5\2\u00d3\u00d4\7\22\2\2\u00d4\u00d8\7"+
		"\17\2\2\u00d5\u00d7\5\4\3\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00dc\7\20\2\2\u00dc\35\3\2\2\2\u00dd\u00de\7\16\2\2\u00de"+
		"\u00e2\7\17\2\2\u00df\u00e1\5\4\3\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7\20\2\2\u00e6\37\3\2\2\2\u00e7\u00eb\7\30"+
		"\2\2\u00e8\u00eb\7\t\2\2\u00e9\u00eb\7\'\2\2\u00ea\u00e7\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb!\3\2\2\2\u00ec\u00ed\t\2\2\2"+
		"\u00ed#\3\2\2\2\27)\67Gmoty\u0080\u0087\u008b\u0090\u0094\u009d\u00a8"+
		"\u00b4\u00ba\u00bd\u00cb\u00d8\u00e2\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}