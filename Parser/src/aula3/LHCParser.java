// Generated from LHC.g4 by ANTLR 4.2
package aula3;
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
		RULE_exp = 4, RULE_methodDef = 5, RULE_paramList = 6, RULE_args = 7, RULE_decl = 8, 
		RULE_attr = 9, RULE_rightSide = 10, RULE_value = 11, RULE_type = 12;
	public static final String[] ruleNames = {
		"program", "stmt", "print", "methodCall", "exp", "methodDef", "paramList", 
		"args", "decl", "attr", "rightSide", "value", "type"
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(Init);
			setState(27); match(Begin);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Void))) != 0)) {
				{
				{
				setState(28); methodDef();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); match(End);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); attr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); print();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); exp(0);
				setState(39); match(Semicolon);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41); decl();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(Print);
			setState(45); match(ParBeg);
			setState(46); ((PrintContext)_localctx).argument = exp(0);
			setState(47); match(ParEnd);
			setState(48); match(Semicolon);
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
		public ArgsContext argList;
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public List<TerminalNode> ID() { return getTokens(LHCParser.ID); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode ID(int i) {
			return getToken(LHCParser.ID, i);
		}
		public TerminalNode Dot() { return getToken(LHCParser.Dot, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); ((MethodCallContext)_localctx).funcName1 = match(ID);
			setState(53);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(51); match(Dot);
				setState(52); ((MethodCallContext)_localctx).funcName2 = match(ID);
				}
			}

			setState(55); match(ParBeg);
			setState(57);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(56); ((MethodCallContext)_localctx).argList = args();
				}
			}

			setState(59); match(ParEnd);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitLessE_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpContext {
		public Token varName;
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
		public VariableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitLess_rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitEqual_rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitPlus_rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitAnd_rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitParExp_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_ruleContext extends ExpContext {
		public ValueContext value_;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Value_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitValue_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_ruleContext extends ExpContext {
		public MethodCallContext method;
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public Method_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitMethod_rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNEqual__rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitTimes_rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitMinus_rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitGreater_rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitDivide_rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitOr_rule(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitGreaterE_rule(this);
			else return visitor.visitChildren(this);
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
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
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
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitMethodDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDef);
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << Bool) | (1L << ParBeg) | (1L << Integer) | (1L << Double) | (1L << ID))) != 0)) {
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

	public static class ParamListContext extends ParserRuleContext {
		public TypeContext type_;
		public Token varName;
		public ParamListContext params;
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Comma() { return getToken(LHCParser.Comma, 0); }
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); ((ParamListContext)_localctx).type_ = type();
			setState(140); ((ParamListContext)_localctx).varName = match(ID);
			setState(143);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(141); match(Comma);
				setState(142); ((ParamListContext)_localctx).params = paramList();
				}
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LHCParser.ID); }
		public TerminalNode Comma(int i) {
			return getToken(LHCParser.Comma, i);
		}
		public TerminalNode ID(int i) {
			return getToken(LHCParser.ID, i);
		}
		public List<TerminalNode> Comma() { return getTokens(LHCParser.Comma); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(145); match(ID);
					setState(146); match(Comma);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(152); match(ID);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitVarMultDecl(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decl);
		try {
			int _alt;
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154); ((VarDeclContext)_localctx).type_ = type();
				setState(155); ((VarDeclContext)_localctx).varName = match(ID);
				setState(156); match(Semicolon);
				}
				break;

			case 2:
				_localctx = new VarMultDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158); ((VarMultDeclContext)_localctx).type_ = type();
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(159); ((VarMultDeclContext)_localctx).varName = match(ID);
						setState(160); match(Comma);
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(166); ((VarMultDeclContext)_localctx).varName = match(ID);
				setState(167); match(Semicolon);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attr);
		int _la;
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
				{
				setState(171); ((AssignmentContext)_localctx).type_ = type();
				}
			}

			setState(174); ((AssignmentContext)_localctx).varName = match(ID);
			setState(175); match(Gets);
			setState(176); ((AssignmentContext)_localctx).rightSide_ = rightSide();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitRightSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightSideContext rightSide() throws RecognitionException {
		RightSideContext _localctx = new RightSideContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rightSide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); exp(0);
			setState(179); match(Semicolon);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitDouble_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_ruleContext extends ValueContext {
		public Token value_;
		public TerminalNode Bool() { return getToken(LHCParser.Bool, 0); }
		public Bool_ruleContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitBool_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int_ruleContext extends ValueContext {
		public Token value_;
		public TerminalNode Integer() { return getToken(LHCParser.Integer, 0); }
		public Int_ruleContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitInt_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(184);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new Int_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181); ((Int_ruleContext)_localctx).value_ = match(Integer);
				}
				break;
			case Bool:
				_localctx = new Bool_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182); ((Bool_ruleContext)_localctx).value_ = match(Bool);
				}
				break;
			case Double:
				_localctx = new Double_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183); ((Double_ruleContext)_localctx).value_ = match(Double);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\5\58\n\5\3\5\3\5\5\5<\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\7\3\7\5\7u\n\7\3\7\3\7\3\7\5"+
		"\7z\n\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0088\n\7\3\7\3\7\5\7\u008c\n\7\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\t\3"+
		"\t\7\t\u0096\n\t\f\t\16\t\u0099\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00a4\n\n\f\n\16\n\u00a7\13\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\13\5"+
		"\13\u00af\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00bb\n"+
		"\r\3\16\3\16\3\16\2\3\n\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\3"+
		"\5\u00d2\2\34\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\64\3\2\2\2\nG\3\2\2\2\f"+
		"t\3\2\2\2\16\u008d\3\2\2\2\20\u0097\3\2\2\2\22\u00ab\3\2\2\2\24\u00ae"+
		"\3\2\2\2\26\u00b4\3\2\2\2\30\u00ba\3\2\2\2\32\u00bc\3\2\2\2\34\35\7\b"+
		"\2\2\35!\7\f\2\2\36 \5\f\7\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3"+
		"\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\r\2\2%\3\3\2\2\2&-\5\24\13\2\'-\5\6\4"+
		"\2()\5\n\6\2)*\7\20\2\2*-\3\2\2\2+-\5\22\n\2,&\3\2\2\2,\'\3\2\2\2,(\3"+
		"\2\2\2,+\3\2\2\2-\5\3\2\2\2./\7\7\2\2/\60\7\16\2\2\60\61\5\n\6\2\61\62"+
		"\7\17\2\2\62\63\7\20\2\2\63\7\3\2\2\2\64\67\7%\2\2\65\66\7#\2\2\668\7"+
		"%\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29;\7\16\2\2:<\5\20\t\2;:\3\2"+
		"\2\2;<\3\2\2\2<=\3\2\2\2=>\7\17\2\2>\t\3\2\2\2?@\b\6\1\2@A\7\16\2\2AB"+
		"\5\n\6\2BC\7\17\2\2CH\3\2\2\2DH\7%\2\2EH\5\30\r\2FH\5\b\5\2G?\3\2\2\2"+
		"GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2Ho\3\2\2\2IJ\f\21\2\2JK\7\26\2\2Kn\5\n\6"+
		"\22LM\f\20\2\2MN\7\27\2\2Nn\5\n\6\21OP\f\17\2\2PQ\7\23\2\2Qn\5\n\6\20"+
		"RS\f\16\2\2ST\7\24\2\2Tn\5\n\6\17UV\f\r\2\2VW\7\21\2\2Wn\5\n\6\16XY\f"+
		"\f\2\2YZ\7\22\2\2Zn\5\n\6\r[\\\f\13\2\2\\]\7\30\2\2]n\5\n\6\f^_\f\n\2"+
		"\2_`\7\31\2\2`n\5\n\6\13ab\f\t\2\2bc\7\32\2\2cn\5\n\6\nde\f\b\2\2ef\7"+
		"\34\2\2fn\5\n\6\tgh\f\7\2\2hi\7\33\2\2in\5\n\6\bjk\f\6\2\2kl\7\35\2\2"+
		"ln\5\n\6\7mI\3\2\2\2mL\3\2\2\2mO\3\2\2\2mR\3\2\2\2mU\3\2\2\2mX\3\2\2\2"+
		"m[\3\2\2\2m^\3\2\2\2ma\3\2\2\2md\3\2\2\2mg\3\2\2\2mj\3\2\2\2nq\3\2\2\2"+
		"om\3\2\2\2op\3\2\2\2p\13\3\2\2\2qo\3\2\2\2ru\7\n\2\2su\5\32\16\2tr\3\2"+
		"\2\2ts\3\2\2\2uv\3\2\2\2vw\7%\2\2wy\7\16\2\2xz\5\16\b\2yx\3\2\2\2yz\3"+
		"\2\2\2z{\3\2\2\2{\u008b\7\17\2\2|\u0080\7\f\2\2}\177\5\4\3\2~}\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0087\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u0085\5\n\6\2\u0085"+
		"\u0086\7\20\2\2\u0086\u0088\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\7\r\2\2\u008a\u008c\7\20\2\2\u008b"+
		"|\3\2\2\2\u008b\u008a\3\2\2\2\u008c\r\3\2\2\2\u008d\u008e\5\32\16\2\u008e"+
		"\u0091\7%\2\2\u008f\u0090\7\"\2\2\u0090\u0092\5\16\b\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\17\3\2\2\2\u0093\u0094\7%\2\2\u0094\u0096"+
		"\7\"\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7%"+
		"\2\2\u009b\21\3\2\2\2\u009c\u009d\5\32\16\2\u009d\u009e\7%\2\2\u009e\u009f"+
		"\7\20\2\2\u009f\u00ac\3\2\2\2\u00a0\u00a5\5\32\16\2\u00a1\u00a2\7%\2\2"+
		"\u00a2\u00a4\7\"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7%\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ac\3\2\2\2\u00ab\u009c\3\2"+
		"\2\2\u00ab\u00a0\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00af\5\32\16\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7%"+
		"\2\2\u00b1\u00b2\7\37\2\2\u00b2\u00b3\5\26\f\2\u00b3\25\3\2\2\2\u00b4"+
		"\u00b5\5\n\6\2\u00b5\u00b6\7\20\2\2\u00b6\27\3\2\2\2\u00b7\u00bb\7\25"+
		"\2\2\u00b8\u00bb\7\t\2\2\u00b9\u00bb\7$\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00bd\t\2\2"+
		"\2\u00bd\33\3\2\2\2\24!,\67;Gmoty\u0080\u0087\u008b\u0091\u0097\u00a5"+
		"\u00ab\u00ae\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}