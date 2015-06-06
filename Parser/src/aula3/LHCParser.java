// Generated from LHC.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, WS=2, Print=3, Init=4, Begin=5, End=6, ParBeg=7, ParEnd=8, Semicolon=9, 
		Plus=10, Minus=11, Times=12, Divide=13, Or=14, And=15, Num=16;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_print = 2, RULE_exp = 3, RULE_expArit = 4, 
		RULE_expLogic = 5, RULE_expAnd = 6, RULE_expOr = 7;
	public static final String[] ruleNames = {
		"program", "stmt", "print", "exp", "expArit", "expLogic", "expAnd", "expOr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'print'", "'LHC+-'", "'{'", "'}'", "'('", "')'", "';'", 
		"'+'", "'-'", "'*'", "'/'", "'|'", "'&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOL", "WS", "Print", "Init", "Begin", "End", "ParBeg", "ParEnd", 
		"Semicolon", "Plus", "Minus", "Times", "Divide", "Or", "And", "Num"
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

	@Override
	public String getGrammarFileName() { return "LHC.g4"; }

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
		public TerminalNode Init() { return getToken(LHCParser.Init, 0); }
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(Init);
			setState(17);
			match(Begin);
			setState(18);
			stmt();
			setState(19);
			match(End);
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
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(LHCParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(LHCParser.Semicolon, i);
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
		int _la;
		try {
			setState(29);
			switch (_input.LA(1)) {
			case BOOL:
			case ParBeg:
			case Num:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				exp();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 2);
				{
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(22);
					print();
					setState(23);
					match(Semicolon);
					}
					}
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Print );
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
		public ExpContext argument;
		public TerminalNode Print() { return getToken(LHCParser.Print, 0); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
			setState(31);
			match(Print);
			setState(32);
			match(ParBeg);
			setState(33);
			((PrintContext)_localctx).argument = exp();
			setState(34);
			match(ParEnd);
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
		public ExpLogicContext expLogic() {
			return getRuleContext(ExpLogicContext.class,0);
		}
		public ExpAritContext expArit() {
			return getRuleContext(ExpAritContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		try {
			setState(38);
			switch (_input.LA(1)) {
			case BOOL:
			case ParBeg:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				expLogic();
				}
				break;
			case Num:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				expArit(0);
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

	public static class ExpAritContext extends ParserRuleContext {
		public ExpAritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expArit; }
	 
		public ExpAritContext() { }
		public void copyFrom(ExpAritContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Num_ruleContext extends ExpAritContext {
		public TerminalNode Num() { return getToken(LHCParser.Num, 0); }
		public Num_ruleContext(ExpAritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNum_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Times_ruleContext extends ExpAritContext {
		public ExpAritContext left;
		public ExpAritContext right;
		public TerminalNode Times() { return getToken(LHCParser.Times, 0); }
		public List<ExpAritContext> expArit() {
			return getRuleContexts(ExpAritContext.class);
		}
		public ExpAritContext expArit(int i) {
			return getRuleContext(ExpAritContext.class,i);
		}
		public Times_ruleContext(ExpAritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitTimes_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Plus_ruleContext extends ExpAritContext {
		public ExpAritContext left;
		public ExpAritContext right;
		public TerminalNode Plus() { return getToken(LHCParser.Plus, 0); }
		public List<ExpAritContext> expArit() {
			return getRuleContexts(ExpAritContext.class);
		}
		public ExpAritContext expArit(int i) {
			return getRuleContext(ExpAritContext.class,i);
		}
		public Plus_ruleContext(ExpAritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitPlus_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Minus_ruleContext extends ExpAritContext {
		public ExpAritContext left;
		public ExpAritContext right;
		public TerminalNode Minus() { return getToken(LHCParser.Minus, 0); }
		public List<ExpAritContext> expArit() {
			return getRuleContexts(ExpAritContext.class);
		}
		public ExpAritContext expArit(int i) {
			return getRuleContext(ExpAritContext.class,i);
		}
		public Minus_ruleContext(ExpAritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitMinus_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Divide_ruleContext extends ExpAritContext {
		public ExpAritContext left;
		public ExpAritContext right;
		public TerminalNode Divide() { return getToken(LHCParser.Divide, 0); }
		public List<ExpAritContext> expArit() {
			return getRuleContexts(ExpAritContext.class);
		}
		public ExpAritContext expArit(int i) {
			return getRuleContext(ExpAritContext.class,i);
		}
		public Divide_ruleContext(ExpAritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitDivide_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAritContext expArit() throws RecognitionException {
		return expArit(0);
	}

	private ExpAritContext expArit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpAritContext _localctx = new ExpAritContext(_ctx, _parentState);
		ExpAritContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expArit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Num_ruleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(41);
			match(Num);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Times_ruleContext(new ExpAritContext(_parentctx, _parentState));
						((Times_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expArit);
						setState(43);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(44);
						match(Times);
						setState(45);
						((Times_ruleContext)_localctx).right = expArit(6);
						}
						break;
					case 2:
						{
						_localctx = new Divide_ruleContext(new ExpAritContext(_parentctx, _parentState));
						((Divide_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expArit);
						setState(46);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(47);
						match(Divide);
						setState(48);
						((Divide_ruleContext)_localctx).right = expArit(5);
						}
						break;
					case 3:
						{
						_localctx = new Plus_ruleContext(new ExpAritContext(_parentctx, _parentState));
						((Plus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expArit);
						setState(49);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(50);
						match(Plus);
						setState(51);
						((Plus_ruleContext)_localctx).right = expArit(4);
						}
						break;
					case 4:
						{
						_localctx = new Minus_ruleContext(new ExpAritContext(_parentctx, _parentState));
						((Minus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expArit);
						setState(52);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(53);
						match(Minus);
						setState(54);
						((Minus_ruleContext)_localctx).right = expArit(3);
						}
						break;
					}
					} 
				}
				setState(59);
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

	public static class ExpLogicContext extends ParserRuleContext {
		public ExpAndContext expAnd() {
			return getRuleContext(ExpAndContext.class,0);
		}
		public ExpLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expLogic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitExpLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpLogicContext expLogic() throws RecognitionException {
		ExpLogicContext _localctx = new ExpLogicContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expLogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			expAnd(0);
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

	public static class ExpAndContext extends ParserRuleContext {
		public ExpAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAnd; }
	 
		public ExpAndContext() { }
		public void copyFrom(ExpAndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextAndContext extends ExpAndContext {
		public ExpOrContext exit;
		public ExpOrContext expOr() {
			return getRuleContext(ExpOrContext.class,0);
		}
		public NextAndContext(ExpAndContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNextAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Or_ruleContext extends ExpAndContext {
		public ExpAndContext left;
		public ExpOrContext right;
		public TerminalNode Or() { return getToken(LHCParser.Or, 0); }
		public ExpAndContext expAnd() {
			return getRuleContext(ExpAndContext.class,0);
		}
		public ExpOrContext expOr() {
			return getRuleContext(ExpOrContext.class,0);
		}
		public Or_ruleContext(ExpAndContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitOr_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAndContext expAnd() throws RecognitionException {
		return expAnd(0);
	}

	private ExpAndContext expAnd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpAndContext _localctx = new ExpAndContext(_ctx, _parentState);
		ExpAndContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(63);
			((NextAndContext)_localctx).exit = expOr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_ruleContext(new ExpAndContext(_parentctx, _parentState));
					((Or_ruleContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expAnd);
					setState(65);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(66);
					match(Or);
					setState(67);
					((Or_ruleContext)_localctx).right = expOr(0);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ExpOrContext extends ParserRuleContext {
		public ExpOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOr; }
	 
		public ExpOrContext() { }
		public void copyFrom(ExpOrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolContext extends ExpOrContext {
		public Token bool;
		public TerminalNode BOOL() { return getToken(LHCParser.BOOL, 0); }
		public BoolContext(ExpOrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NextOrContext extends ExpOrContext {
		public ExpAndContext cont;
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public ExpAndContext expAnd() {
			return getRuleContext(ExpAndContext.class,0);
		}
		public NextOrContext(ExpOrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNextOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class And_ruleContext extends ExpOrContext {
		public ExpOrContext left;
		public Token right;
		public TerminalNode And() { return getToken(LHCParser.And, 0); }
		public ExpOrContext expOr() {
			return getRuleContext(ExpOrContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(LHCParser.BOOL, 0); }
		public And_ruleContext(ExpOrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitAnd_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpOrContext expOr() throws RecognitionException {
		return expOr(0);
	}

	private ExpOrContext expOr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpOrContext _localctx = new ExpOrContext(_ctx, _parentState);
		ExpOrContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expOr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			switch (_input.LA(1)) {
			case BOOL:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(74);
				((BoolContext)_localctx).bool = match(BOOL);
				}
				break;
			case ParBeg:
				{
				_localctx = new NextOrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(ParBeg);
				setState(76);
				((NextOrContext)_localctx).cont = expAnd(0);
				setState(77);
				match(ParEnd);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_ruleContext(new ExpOrContext(_parentctx, _parentState));
					((And_ruleContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expOr);
					setState(81);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(82);
					match(And);
					setState(83);
					((And_ruleContext)_localctx).right = match(BOOL);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		case 4:
			return expArit_sempred((ExpAritContext)_localctx, predIndex);
		case 6:
			return expAnd_sempred((ExpAndContext)_localctx, predIndex);
		case 7:
			return expOr_sempred((ExpOrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expArit_sempred(ExpAritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expAnd_sempred(ExpAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expOr_sempred(ExpOrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\6\3\34\n\3\r\3\16\3\35\5\3 \n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\5\5)\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bG"+
		"\n\b\f\b\16\bJ\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tR\n\t\3\t\3\t\3\t\7\tW"+
		"\n\t\f\t\16\tZ\13\t\3\t\2\5\n\16\20\n\2\4\6\b\n\f\16\20\2\2]\2\22\3\2"+
		"\2\2\4\37\3\2\2\2\6!\3\2\2\2\b(\3\2\2\2\n*\3\2\2\2\f>\3\2\2\2\16@\3\2"+
		"\2\2\20Q\3\2\2\2\22\23\7\6\2\2\23\24\7\7\2\2\24\25\5\4\3\2\25\26\7\b\2"+
		"\2\26\3\3\2\2\2\27 \5\b\5\2\30\31\5\6\4\2\31\32\7\13\2\2\32\34\3\2\2\2"+
		"\33\30\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37"+
		"\27\3\2\2\2\37\33\3\2\2\2 \5\3\2\2\2!\"\7\5\2\2\"#\7\t\2\2#$\5\b\5\2$"+
		"%\7\n\2\2%\7\3\2\2\2&)\5\f\7\2\')\5\n\6\2(&\3\2\2\2(\'\3\2\2\2)\t\3\2"+
		"\2\2*+\b\6\1\2+,\7\22\2\2,;\3\2\2\2-.\f\7\2\2./\7\16\2\2/:\5\n\6\b\60"+
		"\61\f\6\2\2\61\62\7\17\2\2\62:\5\n\6\7\63\64\f\5\2\2\64\65\7\f\2\2\65"+
		":\5\n\6\6\66\67\f\4\2\2\678\7\r\2\28:\5\n\6\59-\3\2\2\29\60\3\2\2\29\63"+
		"\3\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\13\3\2\2\2=;\3\2\2"+
		"\2>?\5\16\b\2?\r\3\2\2\2@A\b\b\1\2AB\5\20\t\2BH\3\2\2\2CD\f\4\2\2DE\7"+
		"\20\2\2EG\5\20\t\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\17\3\2\2\2"+
		"JH\3\2\2\2KL\b\t\1\2LR\7\3\2\2MN\7\t\2\2NO\5\16\b\2OP\7\n\2\2PR\3\2\2"+
		"\2QK\3\2\2\2QM\3\2\2\2RX\3\2\2\2ST\f\5\2\2TU\7\21\2\2UW\7\3\2\2VS\3\2"+
		"\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\21\3\2\2\2ZX\3\2\2\2\n\35\37(9;HQ"+
		"X";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}