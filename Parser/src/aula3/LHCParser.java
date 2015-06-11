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
		StringType=1, IntegerType=2, DoubleType=3, BooleanType=4, WS=5, Print=6, 
		Init=7, BOOL=8, Char=9, String=10, Begin=11, End=12, ParBeg=13, ParEnd=14, 
		Semicolon=15, Plus=16, Minus=17, Times=18, Divide=19, Or=20, And=21, Equal=22, 
		NEqual=23, Less=24, LessE=25, Greater=26, GreaterE=27, Not=28, Gets=29, 
		Quote=30, SQuote=31, Comma=32, Dot=33, ID=34, IDChar=35, Double=36, Integer=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'string'", "'int'", "'double'", "'bool'", "WS", "'print'", 
		"'LHC+-'", "BOOL", "Char", "String", "'{'", "'}'", "'('", "')'", "';'", 
		"'+'", "'-'", "'*'", "'/'", "'|'", "'&'", "Equal", "NEqual", "'<'", "LessE", 
		"'>'", "GreaterE", "'!'", "'='", "'\"'", "'''", "','", "'.'", "ID", "IDChar", 
		"Double", "Integer"
	};
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_print = 2, RULE_exp = 3, RULE_decl = 4, 
		RULE_attr = 5, RULE_rightSide = 6, RULE_value = 7, RULE_type = 8;
	public static final String[] ruleNames = {
		"program", "stmt", "print", "exp", "decl", "attr", "rightSide", "value", 
		"type"
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
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
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
			setState(18); match(Init);
			setState(19); match(Begin);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << BOOL) | (1L << ParBeg) | (1L << ID) | (1L << Double) | (1L << Integer))) != 0)) {
				{
				{
				setState(20); stmt();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26); match(End);
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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CleanContext extends StmtContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public CleanContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitClean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new CleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28); exp(0);
				setState(29); match(Semicolon);
				}
				break;

			case 2:
				_localctx = new CleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31); print();
				}
				break;

			case 3:
				_localctx = new CleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32); attr();
				}
				break;

			case 4:
				_localctx = new CleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33); decl();
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
			setState(36); match(Print);
			setState(37); match(ParBeg);
			setState(38); ((PrintContext)_localctx).argument = exp(0);
			setState(39); match(ParEnd);
			setState(40); match(Semicolon);
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
	public static class Value_Context extends ExpContext {
		public ValueContext value_;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Value_Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitValue_(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			switch (_input.LA(1)) {
			case ParBeg:
				{
				_localctx = new ParExp_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(43); match(ParBeg);
				setState(44); exp(0);
				setState(45); match(ParEnd);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47); ((VariableContext)_localctx).varName = match(ID);
				}
				break;
			case BOOL:
			case Double:
			case Integer:
				{
				_localctx = new Value_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48); ((Value_Context)_localctx).value_ = value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Or_ruleContext(new ExpContext(_parentctx, _parentState));
						((Or_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(51);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(52); match(Or);
						setState(53); ((Or_ruleContext)_localctx).right = exp(15);
						}
						break;

					case 2:
						{
						_localctx = new And_ruleContext(new ExpContext(_parentctx, _parentState));
						((And_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(54);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(55); match(And);
						setState(56); ((And_ruleContext)_localctx).right = exp(14);
						}
						break;

					case 3:
						{
						_localctx = new Times_ruleContext(new ExpContext(_parentctx, _parentState));
						((Times_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(57);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(58); match(Times);
						setState(59); ((Times_ruleContext)_localctx).right = exp(13);
						}
						break;

					case 4:
						{
						_localctx = new Divide_ruleContext(new ExpContext(_parentctx, _parentState));
						((Divide_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(60);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(61); match(Divide);
						setState(62); ((Divide_ruleContext)_localctx).right = exp(12);
						}
						break;

					case 5:
						{
						_localctx = new Plus_ruleContext(new ExpContext(_parentctx, _parentState));
						((Plus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(63);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(64); match(Plus);
						setState(65); ((Plus_ruleContext)_localctx).right = exp(11);
						}
						break;

					case 6:
						{
						_localctx = new Minus_ruleContext(new ExpContext(_parentctx, _parentState));
						((Minus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(66);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(67); match(Minus);
						setState(68); ((Minus_ruleContext)_localctx).right = exp(10);
						}
						break;

					case 7:
						{
						_localctx = new Equal_ruleContext(new ExpContext(_parentctx, _parentState));
						((Equal_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(69);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(70); match(Equal);
						setState(71); ((Equal_ruleContext)_localctx).right = exp(9);
						}
						break;

					case 8:
						{
						_localctx = new NEqual__ruleContext(new ExpContext(_parentctx, _parentState));
						((NEqual__ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(72);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(73); match(NEqual);
						setState(74); ((NEqual__ruleContext)_localctx).right = exp(8);
						}
						break;

					case 9:
						{
						_localctx = new Less_ruleContext(new ExpContext(_parentctx, _parentState));
						((Less_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(75);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(76); match(Less);
						setState(77); ((Less_ruleContext)_localctx).right = exp(7);
						}
						break;

					case 10:
						{
						_localctx = new Greater_ruleContext(new ExpContext(_parentctx, _parentState));
						((Greater_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(78);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(79); match(Greater);
						setState(80); ((Greater_ruleContext)_localctx).right = exp(6);
						}
						break;

					case 11:
						{
						_localctx = new LessE_ruleContext(new ExpContext(_parentctx, _parentState));
						((LessE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(81);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(82); match(LessE);
						setState(83); ((LessE_ruleContext)_localctx).right = exp(5);
						}
						break;

					case 12:
						{
						_localctx = new GreaterE_ruleContext(new ExpContext(_parentctx, _parentState));
						((GreaterE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85); match(GreaterE);
						setState(86); ((GreaterE_ruleContext)_localctx).right = exp(4);
						}
						break;
					}
					} 
				}
				setState(91);
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
		enterRule(_localctx, 8, RULE_decl);
		try {
			int _alt;
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92); ((VarDeclContext)_localctx).type_ = type();
				setState(93); ((VarDeclContext)_localctx).varName = match(ID);
				setState(94); match(Semicolon);
				}
				break;

			case 2:
				_localctx = new VarMultDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96); ((VarMultDeclContext)_localctx).type_ = type();
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(97); ((VarMultDeclContext)_localctx).varName = match(ID);
						setState(98); match(Comma);
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(104); ((VarMultDeclContext)_localctx).varName = match(ID);
				setState(105); match(Semicolon);
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
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
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
		enterRule(_localctx, 10, RULE_attr);
		int _la;
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
				{
				setState(109); ((AssignmentContext)_localctx).type_ = type();
				}
			}

			setState(112); ((AssignmentContext)_localctx).varName = match(ID);
			setState(113); match(Gets);
			setState(114); ((AssignmentContext)_localctx).rightSide_ = rightSide();
			setState(115); match(Semicolon);
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
		public TerminalNode Quote(int i) {
			return getToken(LHCParser.Quote, i);
		}
		public List<TerminalNode> Quote() { return getTokens(LHCParser.Quote); }
		public TerminalNode String() { return getToken(LHCParser.String, 0); }
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
		enterRule(_localctx, 12, RULE_rightSide);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case BOOL:
			case ParBeg:
			case ID:
			case Double:
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); exp(0);
				}
				break;
			case Quote:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); match(Quote);
				setState(119); match(String);
				setState(120); match(Quote);
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
	public static class Real_Context extends ValueContext {
		public TerminalNode Double() { return getToken(LHCParser.Double, 0); }
		public Real_Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitReal_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Integer_Context extends ValueContext {
		public TerminalNode Integer() { return getToken(LHCParser.Integer, 0); }
		public Integer_Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitInteger_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ValueContext {
		public TerminalNode BOOL() { return getToken(LHCParser.BOOL, 0); }
		public BoolContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new Integer_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123); match(Integer);
				}
				break;
			case Double:
				_localctx = new Real_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(Double);
				}
				break;
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125); match(BOOL);
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
		public TerminalNode StringType() { return getToken(LHCParser.StringType, 0); }
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
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) ) {
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
		case 0: return precpred(_ctx, 14);

		case 1: return precpred(_ctx, 13);

		case 2: return precpred(_ctx, 12);

		case 3: return precpred(_ctx, 11);

		case 4: return precpred(_ctx, 10);

		case 5: return precpred(_ctx, 9);

		case 6: return precpred(_ctx, 8);

		case 7: return precpred(_ctx, 7);

		case 8: return precpred(_ctx, 6);

		case 9: return precpred(_ctx, 5);

		case 10: return precpred(_ctx, 4);

		case 11: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u0085\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3%"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5Z\n\5\f\5\16\5]\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6f\n\6\f\6\16"+
		"\6i\13\6\3\6\3\6\3\6\5\6n\n\6\3\7\5\7q\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\5\t\u0081\n\t\3\n\3\n\3\n\2\3\b\13\2\4\6"+
		"\b\n\f\16\20\22\2\3\3\2\3\6\u0093\2\24\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b"+
		"\63\3\2\2\2\nm\3\2\2\2\fp\3\2\2\2\16{\3\2\2\2\20\u0080\3\2\2\2\22\u0082"+
		"\3\2\2\2\24\25\7\t\2\2\25\31\7\r\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33"+
		"\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35"+
		"\7\16\2\2\35\3\3\2\2\2\36\37\5\b\5\2\37 \7\21\2\2 %\3\2\2\2!%\5\6\4\2"+
		"\"%\5\f\7\2#%\5\n\6\2$\36\3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5\3"+
		"\2\2\2&\'\7\b\2\2\'(\7\17\2\2()\5\b\5\2)*\7\20\2\2*+\7\21\2\2+\7\3\2\2"+
		"\2,-\b\5\1\2-.\7\17\2\2./\5\b\5\2/\60\7\20\2\2\60\64\3\2\2\2\61\64\7$"+
		"\2\2\62\64\5\20\t\2\63,\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64[\3\2\2"+
		"\2\65\66\f\20\2\2\66\67\7\26\2\2\67Z\5\b\5\2189\f\17\2\29:\7\27\2\2:Z"+
		"\5\b\5\20;<\f\16\2\2<=\7\24\2\2=Z\5\b\5\17>?\f\r\2\2?@\7\25\2\2@Z\5\b"+
		"\5\16AB\f\f\2\2BC\7\22\2\2CZ\5\b\5\rDE\f\13\2\2EF\7\23\2\2FZ\5\b\5\fG"+
		"H\f\n\2\2HI\7\30\2\2IZ\5\b\5\13JK\f\t\2\2KL\7\31\2\2LZ\5\b\5\nMN\f\b\2"+
		"\2NO\7\32\2\2OZ\5\b\5\tPQ\f\7\2\2QR\7\34\2\2RZ\5\b\5\bST\f\6\2\2TU\7\33"+
		"\2\2UZ\5\b\5\7VW\f\5\2\2WX\7\35\2\2XZ\5\b\5\6Y\65\3\2\2\2Y8\3\2\2\2Y;"+
		"\3\2\2\2Y>\3\2\2\2YA\3\2\2\2YD\3\2\2\2YG\3\2\2\2YJ\3\2\2\2YM\3\2\2\2Y"+
		"P\3\2\2\2YS\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2"+
		"\2][\3\2\2\2^_\5\22\n\2_`\7$\2\2`a\7\21\2\2an\3\2\2\2bg\5\22\n\2cd\7$"+
		"\2\2df\7\"\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2"+
		"\2\2jk\7$\2\2kl\7\21\2\2ln\3\2\2\2m^\3\2\2\2mb\3\2\2\2n\13\3\2\2\2oq\5"+
		"\22\n\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7$\2\2st\7\37\2\2tu\5\16\b\2u"+
		"v\7\21\2\2v\r\3\2\2\2w|\5\b\5\2xy\7 \2\2yz\7\f\2\2z|\7 \2\2{w\3\2\2\2"+
		"{x\3\2\2\2|\17\3\2\2\2}\u0081\7\'\2\2~\u0081\7&\2\2\177\u0081\7\n\2\2"+
		"\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\21\3\2\2\2\u0082"+
		"\u0083\t\2\2\2\u0083\23\3\2\2\2\f\31$\63Y[gmp{\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}