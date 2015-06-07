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
		BOOL=1, WS=2, Print=3, Init=4, Begin=5, End=6, ParBeg=7, ParEnd=8, Semicolon=9, 
		Plus=10, Minus=11, Times=12, Divide=13, Num=14, Or=15, And=16, Equal=17, 
		NEqual=18, Less=19, LessE=20, Greater=21, GreaterE=22, Not=23;
	public static final String[] tokenNames = {
		"<INVALID>", "BOOL", "WS", "'print'", "'LHC+-'", "'{'", "'}'", "'('", 
		"')'", "';'", "'+'", "'-'", "'*'", "'/'", "Num", "'|'", "'&'", "Equal", 
		"NEqual", "'<'", "LessE", "'>'", "GreaterE", "'!'"
	};
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_print = 2, RULE_exp1 = 3, RULE_exp2 = 4, 
		RULE_exp3 = 5, RULE_exp4 = 6, RULE_exp5 = 7, RULE_exp6 = 8, RULE_exp7 = 9;
	public static final String[] ruleNames = {
		"program", "stmt", "print", "exp1", "exp2", "exp3", "exp4", "exp5", "exp6", 
		"exp7"
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
			setState(20); match(Init);
			setState(21); match(Begin);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << Print) | (1L << ParBeg) | (1L << Num))) != 0)) {
				{
				{
				setState(22); stmt();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28); match(End);
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
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(LHCParser.Semicolon); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode Semicolon(int i) {
			return getToken(LHCParser.Semicolon, i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
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
			int _alt;
			setState(38);
			switch (_input.LA(1)) {
			case BOOL:
			case ParBeg:
			case Num:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); exp1(0);
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(31); print();
						setState(32); match(Semicolon);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(36); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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

	public static class PrintContext extends ParserRuleContext {
		public Exp1Context argument;
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode Print() { return getToken(LHCParser.Print, 0); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
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
			setState(40); match(Print);
			setState(41); match(ParBeg);
			setState(42); ((PrintContext)_localctx).argument = exp1(0);
			setState(43); match(ParEnd);
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
	public static class NextExp2Context extends Exp1Context {
		public Exp2Context exit;
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public NextExp2Context(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNextExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Or_ruleContext extends Exp1Context {
		public Exp1Context left;
		public Exp2Context right;
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode Or() { return getToken(LHCParser.Or, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Or_ruleContext(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitOr_rule(this);
			else return visitor.visitChildren(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextExp2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(46); ((NextExp2Context)_localctx).exit = exp2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_ruleContext(new Exp1Context(_parentctx, _parentState));
					((Or_ruleContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp1);
					setState(48);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(49); match(Or);
					setState(50); ((Or_ruleContext)_localctx).right = exp2(0);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class NextExp3Context extends Exp2Context {
		public Exp3Context exit;
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public NextExp3Context(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNextExp3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class And_ruleContext extends Exp2Context {
		public Exp2Context left;
		public Exp3Context right;
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public TerminalNode And() { return getToken(LHCParser.And, 0); }
		public And_ruleContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitAnd_rule(this);
			else return visitor.visitChildren(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextExp3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(57); ((NextExp3Context)_localctx).exit = exp3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_ruleContext(new Exp2Context(_parentctx, _parentState));
					((And_ruleContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(59);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(60); match(And);
					setState(61); ((And_ruleContext)_localctx).right = exp3(0);
					}
					} 
				}
				setState(66);
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

	public static class Exp3Context extends ParserRuleContext {
		public Exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp3; }
	 
		public Exp3Context() { }
		public void copyFrom(Exp3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextExp4Context extends Exp3Context {
		public Exp4Context exit;
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public NextExp4Context(Exp3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNextExp4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Equal_ruleContext extends Exp3Context {
		public Exp3Context left;
		public Exp4Context right;
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public TerminalNode Equal() { return getToken(LHCParser.Equal, 0); }
		public Equal_ruleContext(Exp3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitEqual_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NEqual__ruleContext extends Exp3Context {
		public Exp3Context left;
		public Exp4Context right;
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public TerminalNode NEqual() { return getToken(LHCParser.NEqual, 0); }
		public NEqual__ruleContext(Exp3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNEqual__rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp3Context exp3() throws RecognitionException {
		return exp3(0);
	}

	private Exp3Context exp3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp3Context _localctx = new Exp3Context(_ctx, _parentState);
		Exp3Context _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exp3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextExp4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(68); ((NextExp4Context)_localctx).exit = exp4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Equal_ruleContext(new Exp3Context(_parentctx, _parentState));
						((Equal_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp3);
						setState(70);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(71); match(Equal);
						setState(72); ((Equal_ruleContext)_localctx).right = exp4(0);
						}
						break;

					case 2:
						{
						_localctx = new NEqual__ruleContext(new Exp3Context(_parentctx, _parentState));
						((NEqual__ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp3);
						setState(73);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(74); match(NEqual);
						setState(75); ((NEqual__ruleContext)_localctx).right = exp4(0);
						}
						break;
					}
					} 
				}
				setState(80);
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

	public static class Exp4Context extends ParserRuleContext {
		public Exp4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp4; }
	 
		public Exp4Context() { }
		public void copyFrom(Exp4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessE_ruleContext extends Exp4Context {
		public Exp4Context left;
		public Exp5Context right;
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public TerminalNode LessE() { return getToken(LHCParser.LessE, 0); }
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public LessE_ruleContext(Exp4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitLessE_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NextExp5Context extends Exp4Context {
		public Exp5Context exit;
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public NextExp5Context(Exp4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNextExp5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Less_ruleContext extends Exp4Context {
		public Exp4Context left;
		public Exp5Context right;
		public TerminalNode Less() { return getToken(LHCParser.Less, 0); }
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public Less_ruleContext(Exp4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitLess_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Greater_ruleContext extends Exp4Context {
		public Exp4Context left;
		public Exp5Context right;
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public TerminalNode Greater() { return getToken(LHCParser.Greater, 0); }
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public Greater_ruleContext(Exp4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitGreater_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterE_ruleContext extends Exp4Context {
		public Exp4Context left;
		public Exp5Context right;
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public TerminalNode GreaterE() { return getToken(LHCParser.GreaterE, 0); }
		public GreaterE_ruleContext(Exp4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitGreaterE_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp4Context exp4() throws RecognitionException {
		return exp4(0);
	}

	private Exp4Context exp4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp4Context _localctx = new Exp4Context(_ctx, _parentState);
		Exp4Context _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exp4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextExp5Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(82); ((NextExp5Context)_localctx).exit = exp5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new Less_ruleContext(new Exp4Context(_parentctx, _parentState));
						((Less_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp4);
						setState(84);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(85); match(Less);
						setState(86); ((Less_ruleContext)_localctx).right = exp5(0);
						}
						break;

					case 2:
						{
						_localctx = new Greater_ruleContext(new Exp4Context(_parentctx, _parentState));
						((Greater_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp4);
						setState(87);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(88); match(Greater);
						setState(89); ((Greater_ruleContext)_localctx).right = exp5(0);
						}
						break;

					case 3:
						{
						_localctx = new LessE_ruleContext(new Exp4Context(_parentctx, _parentState));
						((LessE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp4);
						setState(90);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(91); match(LessE);
						setState(92); ((LessE_ruleContext)_localctx).right = exp5(0);
						}
						break;

					case 4:
						{
						_localctx = new GreaterE_ruleContext(new Exp4Context(_parentctx, _parentState));
						((GreaterE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp4);
						setState(93);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(94); match(GreaterE);
						setState(95); ((GreaterE_ruleContext)_localctx).right = exp5(0);
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Exp5Context extends ParserRuleContext {
		public Exp5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp5; }
	 
		public Exp5Context() { }
		public void copyFrom(Exp5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextExp6Context extends Exp5Context {
		public Exp6Context exit;
		public Exp6Context exp6() {
			return getRuleContext(Exp6Context.class,0);
		}
		public NextExp6Context(Exp5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNextExp6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Times_ruleContext extends Exp5Context {
		public Exp5Context left;
		public Exp6Context right;
		public TerminalNode Times() { return getToken(LHCParser.Times, 0); }
		public Exp6Context exp6() {
			return getRuleContext(Exp6Context.class,0);
		}
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public Times_ruleContext(Exp5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitTimes_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Divide_ruleContext extends Exp5Context {
		public Exp5Context left;
		public Exp6Context right;
		public Exp6Context exp6() {
			return getRuleContext(Exp6Context.class,0);
		}
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public TerminalNode Divide() { return getToken(LHCParser.Divide, 0); }
		public Divide_ruleContext(Exp5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitDivide_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp5Context exp5() throws RecognitionException {
		return exp5(0);
	}

	private Exp5Context exp5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp5Context _localctx = new Exp5Context(_ctx, _parentState);
		Exp5Context _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exp5, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextExp6Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(102); ((NextExp6Context)_localctx).exit = exp6(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Times_ruleContext(new Exp5Context(_parentctx, _parentState));
						((Times_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp5);
						setState(104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(105); match(Times);
						setState(106); ((Times_ruleContext)_localctx).right = exp6(0);
						}
						break;

					case 2:
						{
						_localctx = new Divide_ruleContext(new Exp5Context(_parentctx, _parentState));
						((Divide_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp5);
						setState(107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(108); match(Divide);
						setState(109); ((Divide_ruleContext)_localctx).right = exp6(0);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Exp6Context extends ParserRuleContext {
		public Exp6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp6; }
	 
		public Exp6Context() { }
		public void copyFrom(Exp6Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextExp7Context extends Exp6Context {
		public Exp7Context exit;
		public Exp7Context exp7() {
			return getRuleContext(Exp7Context.class,0);
		}
		public NextExp7Context(Exp6Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNextExp7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Plus_ruleContext extends Exp6Context {
		public Exp6Context left;
		public Exp7Context right;
		public Exp6Context exp6() {
			return getRuleContext(Exp6Context.class,0);
		}
		public TerminalNode Plus() { return getToken(LHCParser.Plus, 0); }
		public Exp7Context exp7() {
			return getRuleContext(Exp7Context.class,0);
		}
		public Plus_ruleContext(Exp6Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitPlus_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Minus_ruleContext extends Exp6Context {
		public Exp6Context left;
		public Exp7Context right;
		public Exp6Context exp6() {
			return getRuleContext(Exp6Context.class,0);
		}
		public TerminalNode Minus() { return getToken(LHCParser.Minus, 0); }
		public Exp7Context exp7() {
			return getRuleContext(Exp7Context.class,0);
		}
		public Minus_ruleContext(Exp6Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitMinus_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp6Context exp6() throws RecognitionException {
		return exp6(0);
	}

	private Exp6Context exp6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp6Context _localctx = new Exp6Context(_ctx, _parentState);
		Exp6Context _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp6, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextExp7Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(116); ((NextExp7Context)_localctx).exit = exp7();
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Plus_ruleContext(new Exp6Context(_parentctx, _parentState));
						((Plus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp6);
						setState(118);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(119); match(Plus);
						setState(120); ((Plus_ruleContext)_localctx).right = exp7();
						}
						break;

					case 2:
						{
						_localctx = new Minus_ruleContext(new Exp6Context(_parentctx, _parentState));
						((Minus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp6);
						setState(121);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(122); match(Minus);
						setState(123); ((Minus_ruleContext)_localctx).right = exp7();
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Exp7Context extends ParserRuleContext {
		public Exp7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp7; }
	 
		public Exp7Context() { }
		public void copyFrom(Exp7Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Num_ruleContext extends Exp7Context {
		public TerminalNode Num() { return getToken(LHCParser.Num, 0); }
		public Num_ruleContext(Exp7Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNum_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends Exp7Context {
		public TerminalNode BOOL() { return getToken(LHCParser.BOOL, 0); }
		public BoolContext(Exp7Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExp_ruleContext extends Exp7Context {
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ParExp_ruleContext(Exp7Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitParExp_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp7Context exp7() throws RecognitionException {
		Exp7Context _localctx = new Exp7Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_exp7);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case ParBeg:
				_localctx = new ParExp_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129); match(ParBeg);
				setState(130); exp1(0);
				setState(131); match(ParEnd);
				}
				break;
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133); match(BOOL);
				}
				break;
			case Num:
				_localctx = new Num_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134); match(Num);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return exp1_sempred((Exp1Context)_localctx, predIndex);

		case 4: return exp2_sempred((Exp2Context)_localctx, predIndex);

		case 5: return exp3_sempred((Exp3Context)_localctx, predIndex);

		case 6: return exp4_sempred((Exp4Context)_localctx, predIndex);

		case 7: return exp5_sempred((Exp5Context)_localctx, predIndex);

		case 8: return exp6_sempred((Exp6Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp6_sempred(Exp6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 3);

		case 11: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp5_sempred(Exp5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 3);

		case 9: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp4_sempred(Exp4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 5);

		case 5: return precpred(_ctx, 4);

		case 6: return precpred(_ctx, 3);

		case 7: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp3_sempred(Exp3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp2_sempred(Exp2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\6\3%\n\3\r\3\16\3&\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\66\n\5\f\5\16\59\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6A\n\6\f\6\16\6"+
		"D\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7O\n\7\f\7\16\7R\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bc\n\b\f\b"+
		"\16\bf\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tq\n\t\f\t\16\tt\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n\16\n\u0082\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\13\2\b\b\n\f\16\20\22"+
		"\f\2\4\6\b\n\f\16\20\22\24\2\2\u0092\2\26\3\2\2\2\4(\3\2\2\2\6*\3\2\2"+
		"\2\b/\3\2\2\2\n:\3\2\2\2\fE\3\2\2\2\16S\3\2\2\2\20g\3\2\2\2\22u\3\2\2"+
		"\2\24\u0089\3\2\2\2\26\27\7\6\2\2\27\33\7\7\2\2\30\32\5\4\3\2\31\30\3"+
		"\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3"+
		"\2\2\2\36\37\7\b\2\2\37\3\3\2\2\2 )\5\b\5\2!\"\5\6\4\2\"#\7\13\2\2#%\3"+
		"\2\2\2$!\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2( \3\2\2\2("+
		"$\3\2\2\2)\5\3\2\2\2*+\7\5\2\2+,\7\t\2\2,-\5\b\5\2-.\7\n\2\2.\7\3\2\2"+
		"\2/\60\b\5\1\2\60\61\5\n\6\2\61\67\3\2\2\2\62\63\f\4\2\2\63\64\7\21\2"+
		"\2\64\66\5\n\6\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28"+
		"\t\3\2\2\29\67\3\2\2\2:;\b\6\1\2;<\5\f\7\2<B\3\2\2\2=>\f\4\2\2>?\7\22"+
		"\2\2?A\5\f\7\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DB\3"+
		"\2\2\2EF\b\7\1\2FG\5\16\b\2GP\3\2\2\2HI\f\5\2\2IJ\7\23\2\2JO\5\16\b\2"+
		"KL\f\4\2\2LM\7\24\2\2MO\5\16\b\2NH\3\2\2\2NK\3\2\2\2OR\3\2\2\2PN\3\2\2"+
		"\2PQ\3\2\2\2Q\r\3\2\2\2RP\3\2\2\2ST\b\b\1\2TU\5\20\t\2Ud\3\2\2\2VW\f\7"+
		"\2\2WX\7\25\2\2Xc\5\20\t\2YZ\f\6\2\2Z[\7\27\2\2[c\5\20\t\2\\]\f\5\2\2"+
		"]^\7\26\2\2^c\5\20\t\2_`\f\4\2\2`a\7\30\2\2ac\5\20\t\2bV\3\2\2\2bY\3\2"+
		"\2\2b\\\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\17\3\2\2\2fd"+
		"\3\2\2\2gh\b\t\1\2hi\5\22\n\2ir\3\2\2\2jk\f\5\2\2kl\7\16\2\2lq\5\22\n"+
		"\2mn\f\4\2\2no\7\17\2\2oq\5\22\n\2pj\3\2\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2s\21\3\2\2\2tr\3\2\2\2uv\b\n\1\2vw\5\24\13\2w\u0080\3\2"+
		"\2\2xy\f\5\2\2yz\7\f\2\2z\177\5\24\13\2{|\f\4\2\2|}\7\r\2\2}\177\5\24"+
		"\13\2~x\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\23\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\t\2\2\u0084"+
		"\u0085\5\b\5\2\u0085\u0086\7\n\2\2\u0086\u008a\3\2\2\2\u0087\u008a\7\3"+
		"\2\2\u0088\u008a\7\20\2\2\u0089\u0083\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\25\3\2\2\2\20\33&(\67BNPbdpr~\u0080\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}