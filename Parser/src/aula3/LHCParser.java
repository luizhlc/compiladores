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
		StringType=1, IntegerType=2, DoubleType=3, BooleanType=4, WS=5, Print=6, 
		Init=7, BOOL=8, Void=9, Return=10, Begin=11, End=12, ParBeg=13, ParEnd=14, 
		Semicolon=15, Plus=16, Minus=17, Times=18, Divide=19, Num=20, Or=21, And=22, 
		Equal=23, NEqual=24, Less=25, LessE=26, Greater=27, GreaterE=28, Not=29, 
		Gets=30, Quote=31, SQuote=32, Comma=33, Dot=34, Char=35, String=36, Double=37, 
		Integer=38, ID=39, IDChar=40;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_print = 2, RULE_methodCall = 3, 
		RULE_exp = 4, RULE_methodDef = 5, RULE_paramList = 6, RULE_args = 7, RULE_decl = 8, 
		RULE_attr = 9, RULE_rightSide = 10, RULE_value = 11, RULE_type = 12;
	public static final String[] ruleNames = {
		"program", "stmt", "print", "methodCall", "exp", "methodDef", "paramList", 
		"args", "decl", "attr", "rightSide", "value", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'string'", "'int'", "'double'", "'bool'", null, "'print'", "'LHC+-'", 
		null, "'void'", "'return'", "'{'", "'}'", "'('", "')'", "';'", "'+'", 
		"'-'", "'*'", "'/'", null, "'|'", "'&'", null, null, "'<'", null, "'>'", 
		null, "'!'", "'='", "'\"'", "'''", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StringType", "IntegerType", "DoubleType", "BooleanType", "WS", 
		"Print", "Init", "BOOL", "Void", "Return", "Begin", "End", "ParBeg", "ParEnd", 
		"Semicolon", "Plus", "Minus", "Times", "Divide", "Num", "Or", "And", "Equal", 
		"NEqual", "Less", "LessE", "Greater", "GreaterE", "Not", "Gets", "Quote", 
		"SQuote", "Comma", "Dot", "Char", "String", "Double", "Integer", "ID", 
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
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public MethodDefContext methodDef(int i) {
			return getRuleContext(MethodDefContext.class,i);
		}
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
			setState(26);
			match(Init);
			setState(27);
			match(Begin);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Void))) != 0)) {
				{
				{
				setState(28);
				methodDef();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
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
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				attr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				exp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				methodCall();
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
		public TerminalNode Print() { return getToken(LHCParser.Print, 0); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
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
			setState(43);
			match(Print);
			setState(44);
			match(ParBeg);
			setState(45);
			((PrintContext)_localctx).argument = exp(0);
			setState(46);
			match(ParEnd);
			setState(47);
			match(Semicolon);
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
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public List<TerminalNode> ID() { return getTokens(LHCParser.ID); }
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
			setState(49);
			((MethodCallContext)_localctx).funcName1 = match(ID);
			setState(52);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(50);
				match(Dot);
				setState(51);
				((MethodCallContext)_localctx).funcName2 = match(ID);
				}
			}

			setState(54);
			match(ParBeg);
			setState(56);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(55);
				((MethodCallContext)_localctx).argList = args();
				}
			}

			setState(58);
			match(ParEnd);
			setState(59);
			match(Semicolon);
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
		public TerminalNode LessE() { return getToken(LHCParser.LessE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		public TerminalNode Less() { return getToken(LHCParser.Less, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		public TerminalNode Equal() { return getToken(LHCParser.Equal, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		public TerminalNode Plus() { return getToken(LHCParser.Plus, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		public TerminalNode And() { return getToken(LHCParser.And, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public ParExp_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitParExp_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Num_ruleContext extends ExpContext {
		public TerminalNode Num() { return getToken(LHCParser.Num, 0); }
		public Num_ruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitNum_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(LHCParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NEqual__ruleContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public TerminalNode NEqual() { return getToken(LHCParser.NEqual, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		public TerminalNode Minus() { return getToken(LHCParser.Minus, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		public TerminalNode Greater() { return getToken(LHCParser.Greater, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		public TerminalNode Divide() { return getToken(LHCParser.Divide, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		public TerminalNode Or() { return getToken(LHCParser.Or, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		public TerminalNode GreaterE() { return getToken(LHCParser.GreaterE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
			switch (_input.LA(1)) {
			case ParBeg:
				{
				_localctx = new ParExp_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				match(ParBeg);
				setState(63);
				exp(0);
				setState(64);
				match(ParEnd);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				((VariableContext)_localctx).varName = match(ID);
				}
				break;
			case BOOL:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(BOOL);
				}
				break;
			case Num:
				{
				_localctx = new Num_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(Num);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
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
						setState(72);
						match(Or);
						setState(73);
						((Or_ruleContext)_localctx).right = exp(16);
						}
						break;
					case 2:
						{
						_localctx = new And_ruleContext(new ExpContext(_parentctx, _parentState));
						((And_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(74);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(75);
						match(And);
						setState(76);
						((And_ruleContext)_localctx).right = exp(15);
						}
						break;
					case 3:
						{
						_localctx = new Times_ruleContext(new ExpContext(_parentctx, _parentState));
						((Times_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(77);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(78);
						match(Times);
						setState(79);
						((Times_ruleContext)_localctx).right = exp(14);
						}
						break;
					case 4:
						{
						_localctx = new Divide_ruleContext(new ExpContext(_parentctx, _parentState));
						((Divide_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(80);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(81);
						match(Divide);
						setState(82);
						((Divide_ruleContext)_localctx).right = exp(13);
						}
						break;
					case 5:
						{
						_localctx = new Plus_ruleContext(new ExpContext(_parentctx, _parentState));
						((Plus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(83);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(84);
						match(Plus);
						setState(85);
						((Plus_ruleContext)_localctx).right = exp(12);
						}
						break;
					case 6:
						{
						_localctx = new Minus_ruleContext(new ExpContext(_parentctx, _parentState));
						((Minus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(86);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(87);
						match(Minus);
						setState(88);
						((Minus_ruleContext)_localctx).right = exp(11);
						}
						break;
					case 7:
						{
						_localctx = new Equal_ruleContext(new ExpContext(_parentctx, _parentState));
						((Equal_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(89);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(90);
						match(Equal);
						setState(91);
						((Equal_ruleContext)_localctx).right = exp(10);
						}
						break;
					case 8:
						{
						_localctx = new NEqual__ruleContext(new ExpContext(_parentctx, _parentState));
						((NEqual__ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(92);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(93);
						match(NEqual);
						setState(94);
						((NEqual__ruleContext)_localctx).right = exp(9);
						}
						break;
					case 9:
						{
						_localctx = new Less_ruleContext(new ExpContext(_parentctx, _parentState));
						((Less_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(95);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(96);
						match(Less);
						setState(97);
						((Less_ruleContext)_localctx).right = exp(8);
						}
						break;
					case 10:
						{
						_localctx = new Greater_ruleContext(new ExpContext(_parentctx, _parentState));
						((Greater_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(98);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(99);
						match(Greater);
						setState(100);
						((Greater_ruleContext)_localctx).right = exp(7);
						}
						break;
					case 11:
						{
						_localctx = new LessE_ruleContext(new ExpContext(_parentctx, _parentState));
						((LessE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(101);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(102);
						match(LessE);
						setState(103);
						((LessE_ruleContext)_localctx).right = exp(6);
						}
						break;
					case 12:
						{
						_localctx = new GreaterE_ruleContext(new ExpContext(_parentctx, _parentState));
						((GreaterE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(104);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(105);
						match(GreaterE);
						setState(106);
						((GreaterE_ruleContext)_localctx).right = exp(5);
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
		public Token returnID;
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public List<TerminalNode> ID() { return getTokens(LHCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LHCParser.ID, i);
		}
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public TerminalNode Void() { return getToken(LHCParser.Void, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode Return() { return getToken(LHCParser.Return, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
				setState(112);
				((MethodDefContext)_localctx).typeVoid = match(Void);
				}
				break;
			case StringType:
			case IntegerType:
			case DoubleType:
			case BooleanType:
				{
				setState(113);
				((MethodDefContext)_localctx).type_ = type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116);
			((MethodDefContext)_localctx).funcName = match(ID);
			setState(117);
			match(ParBeg);
			setState(119);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
				{
				setState(118);
				((MethodDefContext)_localctx).params = paramList();
				}
			}

			setState(121);
			match(ParEnd);
			setState(139);
			switch (_input.LA(1)) {
			case Begin:
				{
				setState(122);
				match(Begin);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << BOOL) | (1L << ParBeg) | (1L << Num) | (1L << ID))) != 0)) {
					{
					{
					setState(123);
					((MethodDefContext)_localctx).stmtList = stmt();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				_la = _input.LA(1);
				if (_la==Return) {
					{
					setState(129);
					match(Return);
					setState(132);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(130);
						((MethodDefContext)_localctx).returnExp = exp(0);
						}
						break;
					case 2:
						{
						setState(131);
						((MethodDefContext)_localctx).returnID = match(ID);
						}
						break;
					}
					setState(134);
					match(Semicolon);
					}
				}

				setState(137);
				match(End);
				}
				break;
			case Semicolon:
				{
				setState(138);
				match(Semicolon);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
		public TerminalNode Comma() { return getToken(LHCParser.Comma, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
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
			setState(141);
			((ParamListContext)_localctx).type_ = type();
			setState(142);
			((ParamListContext)_localctx).varName = match(ID);
			setState(145);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(143);
				match(Comma);
				setState(144);
				((ParamListContext)_localctx).params = paramList();
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
		public TerminalNode ID(int i) {
			return getToken(LHCParser.ID, i);
		}
		public List<TerminalNode> Comma() { return getTokens(LHCParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LHCParser.Comma, i);
		}
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
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					match(ID);
					setState(148);
					match(Comma);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(154);
			match(ID);
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
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(LHCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LHCParser.ID, i);
		}
		public List<TerminalNode> Comma() { return getTokens(LHCParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LHCParser.Comma, i);
		}
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
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
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
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				((VarDeclContext)_localctx).type_ = type();
				setState(157);
				((VarDeclContext)_localctx).varName = match(ID);
				setState(158);
				match(Semicolon);
				}
				break;
			case 2:
				_localctx = new VarMultDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((VarMultDeclContext)_localctx).type_ = type();
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						((VarMultDeclContext)_localctx).varName = match(ID);
						setState(162);
						match(Comma);
						}
						} 
					}
					setState(167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(168);
				((VarMultDeclContext)_localctx).varName = match(ID);
				setState(169);
				match(Semicolon);
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
			setState(174);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
				{
				setState(173);
				((AssignmentContext)_localctx).type_ = type();
				}
			}

			setState(176);
			((AssignmentContext)_localctx).varName = match(ID);
			setState(177);
			match(Gets);
			setState(178);
			((AssignmentContext)_localctx).rightSide_ = rightSide();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public List<TerminalNode> Quote() { return getTokens(LHCParser.Quote); }
		public TerminalNode Quote(int i) {
			return getToken(LHCParser.Quote, i);
		}
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
		enterRule(_localctx, 20, RULE_rightSide);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				exp(0);
				setState(181);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(Quote);
				setState(186);
				match(String);
				setState(187);
				match(Quote);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(LHCParser.Integer, 0); }
		public TerminalNode Double() { return getToken(LHCParser.Double, 0); }
		public TerminalNode String() { return getToken(LHCParser.String, 0); }
		public TerminalNode Char() { return getToken(LHCParser.Char, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << String) | (1L << Double) | (1L << Integer))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode StringType() { return getToken(LHCParser.StringType, 0); }
		public TerminalNode IntegerType() { return getToken(LHCParser.IntegerType, 0); }
		public TerminalNode DoubleType() { return getToken(LHCParser.DoubleType, 0); }
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
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\5\5\67\n\5\3\5\3\5\5\5;\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\7\3\7\5\7u\n\7\3\7\3\7\3\7"+
		"\5\7z\n\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3\7\3\7\3\7\5\7"+
		"\u0087\n\7\3\7\5\7\u008a\n\7\3\7\3\7\5\7\u008e\n\7\3\b\3\b\3\b\3\b\5\b"+
		"\u0094\n\b\3\t\3\t\7\t\u0098\n\t\f\t\16\t\u009b\13\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\n\3\n\3\n\5\n\u00ae"+
		"\n\n\3\13\5\13\u00b1\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00bf\n\f\3\r\3\r\3\16\3\16\3\16\2\3\n\17\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\2\4\3\2%(\3\2\3\6\u00db\2\34\3\2\2\2\4+\3\2\2\2\6-"+
		"\3\2\2\2\b\63\3\2\2\2\nG\3\2\2\2\ft\3\2\2\2\16\u008f\3\2\2\2\20\u0099"+
		"\3\2\2\2\22\u00ad\3\2\2\2\24\u00b0\3\2\2\2\26\u00be\3\2\2\2\30\u00c0\3"+
		"\2\2\2\32\u00c2\3\2\2\2\34\35\7\t\2\2\35!\7\r\2\2\36 \5\f\7\2\37\36\3"+
		"\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\16\2"+
		"\2%\3\3\2\2\2&,\5\24\13\2\',\5\6\4\2(,\5\n\6\2),\5\22\n\2*,\5\b\5\2+&"+
		"\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\7\b\2\2"+
		"./\7\17\2\2/\60\5\n\6\2\60\61\7\20\2\2\61\62\7\21\2\2\62\7\3\2\2\2\63"+
		"\66\7)\2\2\64\65\7$\2\2\65\67\7)\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3"+
		"\2\2\28:\7\17\2\29;\5\20\t\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\20\2\2"+
		"=>\7\21\2\2>\t\3\2\2\2?@\b\6\1\2@A\7\17\2\2AB\5\n\6\2BC\7\20\2\2CH\3\2"+
		"\2\2DH\7)\2\2EH\7\n\2\2FH\7\26\2\2G?\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2"+
		"\2\2Ho\3\2\2\2IJ\f\21\2\2JK\7\27\2\2Kn\5\n\6\22LM\f\20\2\2MN\7\30\2\2"+
		"Nn\5\n\6\21OP\f\17\2\2PQ\7\24\2\2Qn\5\n\6\20RS\f\16\2\2ST\7\25\2\2Tn\5"+
		"\n\6\17UV\f\r\2\2VW\7\22\2\2Wn\5\n\6\16XY\f\f\2\2YZ\7\23\2\2Zn\5\n\6\r"+
		"[\\\f\13\2\2\\]\7\31\2\2]n\5\n\6\f^_\f\n\2\2_`\7\32\2\2`n\5\n\6\13ab\f"+
		"\t\2\2bc\7\33\2\2cn\5\n\6\nde\f\b\2\2ef\7\35\2\2fn\5\n\6\tgh\f\7\2\2h"+
		"i\7\34\2\2in\5\n\6\bjk\f\6\2\2kl\7\36\2\2ln\5\n\6\7mI\3\2\2\2mL\3\2\2"+
		"\2mO\3\2\2\2mR\3\2\2\2mU\3\2\2\2mX\3\2\2\2m[\3\2\2\2m^\3\2\2\2ma\3\2\2"+
		"\2md\3\2\2\2mg\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\13\3\2"+
		"\2\2qo\3\2\2\2ru\7\13\2\2su\5\32\16\2tr\3\2\2\2ts\3\2\2\2uv\3\2\2\2vw"+
		"\7)\2\2wy\7\17\2\2xz\5\16\b\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\u008d\7\20"+
		"\2\2|\u0080\7\r\2\2}\177\5\4\3\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0089\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0086\7\f\2\2\u0084\u0087\5\n\6\2\u0085\u0087\7)\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\21\2\2\u0089"+
		"\u0083\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\7\16"+
		"\2\2\u008c\u008e\7\21\2\2\u008d|\3\2\2\2\u008d\u008c\3\2\2\2\u008e\r\3"+
		"\2\2\2\u008f\u0090\5\32\16\2\u0090\u0093\7)\2\2\u0091\u0092\7#\2\2\u0092"+
		"\u0094\5\16\b\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\17\3\2\2"+
		"\2\u0095\u0096\7)\2\2\u0096\u0098\7#\2\2\u0097\u0095\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009d\7)\2\2\u009d\21\3\2\2\2\u009e\u009f\5\32\16"+
		"\2\u009f\u00a0\7)\2\2\u00a0\u00a1\7\21\2\2\u00a1\u00ae\3\2\2\2\u00a2\u00a7"+
		"\5\32\16\2\u00a3\u00a4\7)\2\2\u00a4\u00a6\7#\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7)\2\2\u00ab\u00ac\7\21\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u009e\3\2\2\2\u00ad\u00a2\3\2\2\2\u00ae\23\3\2\2"+
		"\2\u00af\u00b1\5\32\16\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\7)\2\2\u00b3\u00b4\7 \2\2\u00b4\u00b5\5\26"+
		"\f\2\u00b5\25\3\2\2\2\u00b6\u00b7\5\n\6\2\u00b7\u00b8\7\21\2\2\u00b8\u00bf"+
		"\3\2\2\2\u00b9\u00bf\5\30\r\2\u00ba\u00bf\5\b\5\2\u00bb\u00bc\7!\2\2\u00bc"+
		"\u00bd\7&\2\2\u00bd\u00bf\7!\2\2\u00be\u00b6\3\2\2\2\u00be\u00b9\3\2\2"+
		"\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u00c1"+
		"\t\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c3\t\3\2\2\u00c3\33\3\2\2\2\25!+\66"+
		":Gmoty\u0080\u0086\u0089\u008d\u0093\u0099\u00a7\u00ad\u00b0\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}