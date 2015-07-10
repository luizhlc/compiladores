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
		Init=7, Bool=8, Void=9, Return=10, Switch=11, Case=12, Default=13, Begin=14, 
		End=15, ParBeg=16, ParEnd=17, Semicolon=18, Plus=19, Minus=20, Times=21, 
		Divide=22, Integer=23, Or=24, And=25, Equal=26, NEqual=27, Less=28, LessE=29, 
		Greater=30, GreaterE=31, Not=32, Gets=33, Quote=34, SQuote=35, Comma=36, 
		Dot=37, Break=38, Continue=39, For=40, Increment=41, Decrement=42, Double=43, 
		ID=44, IDChar=45;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_print = 2, RULE_exp = 3, RULE_methodDef = 4, 
		RULE_methodCall = 5, RULE_paramList = 6, RULE_paramDecl = 7, RULE_expressionList = 8, 
		RULE_decl = 9, RULE_attr = 10, RULE_rightSide = 11, RULE_switch1 = 12, 
		RULE_case1 = 13, RULE_default1 = 14, RULE_loop = 15, RULE_control = 16, 
		RULE_value = 17, RULE_type = 18;
	public static final String[] ruleNames = {
		"program", "stmt", "print", "exp", "methodDef", "methodCall", "paramList", 
		"paramDecl", "expressionList", "decl", "attr", "rightSide", "switch1", 
		"case1", "default1", "loop", "control", "value", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'string'", "'int'", "'double'", "'bool'", null, "'print'", "'LHC+-'", 
		null, "'void'", "'return'", "'switch'", "'case'", "'default'", "'{'", 
		"'}'", "'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'", null, "'|'", "'&'", 
		null, null, "'<'", null, "'>'", null, "'!'", "'='", "'\"'", "'''", "','", 
		"'.'", "'break'", "'continue'", "'for'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StringType", "IntegerType", "DoubleType", "BooleanType", "WS", 
		"Print", "Init", "Bool", "Void", "Return", "Switch", "Case", "Default", 
		"Begin", "End", "ParBeg", "ParEnd", "Semicolon", "Plus", "Minus", "Times", 
		"Divide", "Integer", "Or", "And", "Equal", "NEqual", "Less", "LessE", 
		"Greater", "GreaterE", "Not", "Gets", "Quote", "SQuote", "Comma", "Dot", 
		"Break", "Continue", "For", "Increment", "Decrement", "Double", "ID", 
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
			setState(38);
			match(Init);
			setState(39);
			match(Begin);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Void))) != 0)) {
				{
				{
				setState(40);
				methodDef();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Switch1Context switch1() {
			return getRuleContext(Switch1Context.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
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
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				attr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				exp(0);
				setState(51);
				match(Semicolon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				switch1();
				setState(55);
				match(Semicolon);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				loop();
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
			setState(60);
			match(Print);
			setState(61);
			match(ParBeg);
			setState(62);
			((PrintContext)_localctx).argument = exp(0);
			setState(63);
			match(ParEnd);
			setState(64);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ParExp_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(67);
				match(ParBeg);
				setState(68);
				exp(0);
				setState(69);
				match(ParEnd);
				}
				break;
			case 2:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				((VariableContext)_localctx).varName = match(ID);
				}
				break;
			case 3:
				{
				_localctx = new Value_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				((Value_ruleContext)_localctx).value_ = value();
				}
				break;
			case 4:
				{
				_localctx = new Method_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				((Method_ruleContext)_localctx).method = methodCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Or_ruleContext(new ExpContext(_parentctx, _parentState));
						((Or_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(76);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(77);
						match(Or);
						setState(78);
						((Or_ruleContext)_localctx).right = exp(16);
						}
						break;
					case 2:
						{
						_localctx = new And_ruleContext(new ExpContext(_parentctx, _parentState));
						((And_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(79);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(80);
						match(And);
						setState(81);
						((And_ruleContext)_localctx).right = exp(15);
						}
						break;
					case 3:
						{
						_localctx = new Times_ruleContext(new ExpContext(_parentctx, _parentState));
						((Times_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(82);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(83);
						match(Times);
						setState(84);
						((Times_ruleContext)_localctx).right = exp(14);
						}
						break;
					case 4:
						{
						_localctx = new Divide_ruleContext(new ExpContext(_parentctx, _parentState));
						((Divide_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(85);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(86);
						match(Divide);
						setState(87);
						((Divide_ruleContext)_localctx).right = exp(13);
						}
						break;
					case 5:
						{
						_localctx = new Plus_ruleContext(new ExpContext(_parentctx, _parentState));
						((Plus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(88);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(89);
						match(Plus);
						setState(90);
						((Plus_ruleContext)_localctx).right = exp(12);
						}
						break;
					case 6:
						{
						_localctx = new Minus_ruleContext(new ExpContext(_parentctx, _parentState));
						((Minus_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(91);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(92);
						match(Minus);
						setState(93);
						((Minus_ruleContext)_localctx).right = exp(11);
						}
						break;
					case 7:
						{
						_localctx = new Equal_ruleContext(new ExpContext(_parentctx, _parentState));
						((Equal_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(94);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(95);
						match(Equal);
						setState(96);
						((Equal_ruleContext)_localctx).right = exp(10);
						}
						break;
					case 8:
						{
						_localctx = new NEqual__ruleContext(new ExpContext(_parentctx, _parentState));
						((NEqual__ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(97);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(98);
						match(NEqual);
						setState(99);
						((NEqual__ruleContext)_localctx).right = exp(9);
						}
						break;
					case 9:
						{
						_localctx = new Less_ruleContext(new ExpContext(_parentctx, _parentState));
						((Less_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(100);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(101);
						match(Less);
						setState(102);
						((Less_ruleContext)_localctx).right = exp(8);
						}
						break;
					case 10:
						{
						_localctx = new Greater_ruleContext(new ExpContext(_parentctx, _parentState));
						((Greater_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(103);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(104);
						match(Greater);
						setState(105);
						((Greater_ruleContext)_localctx).right = exp(7);
						}
						break;
					case 11:
						{
						_localctx = new LessE_ruleContext(new ExpContext(_parentctx, _parentState));
						((LessE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(107);
						match(LessE);
						setState(108);
						((LessE_ruleContext)_localctx).right = exp(6);
						}
						break;
					case 12:
						{
						_localctx = new GreaterE_ruleContext(new ExpContext(_parentctx, _parentState));
						((GreaterE_ruleContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(109);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(110);
						match(GreaterE);
						setState(111);
						((GreaterE_ruleContext)_localctx).right = exp(5);
						}
						break;
					}
					} 
				}
				setState(116);
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
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
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
		enterRule(_localctx, 8, RULE_methodDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			switch (_input.LA(1)) {
			case Void:
				{
				setState(117);
				((MethodDefContext)_localctx).typeVoid = match(Void);
				}
				break;
			case StringType:
			case IntegerType:
			case DoubleType:
			case BooleanType:
				{
				setState(118);
				((MethodDefContext)_localctx).type_ = type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121);
			((MethodDefContext)_localctx).funcName = match(ID);
			setState(122);
			match(ParBeg);
			setState(124);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
				{
				setState(123);
				((MethodDefContext)_localctx).params = paramList();
				}
			}

			setState(126);
			match(ParEnd);
			setState(142);
			switch (_input.LA(1)) {
			case Begin:
				{
				setState(127);
				match(Begin);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << Bool) | (1L << Switch) | (1L << ParBeg) | (1L << Integer) | (1L << For) | (1L << Double) | (1L << ID))) != 0)) {
					{
					{
					setState(128);
					((MethodDefContext)_localctx).stmtList = stmt();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				_la = _input.LA(1);
				if (_la==Return) {
					{
					setState(134);
					match(Return);
					setState(135);
					((MethodDefContext)_localctx).returnExp = exp(0);
					setState(136);
					match(Semicolon);
					}
				}

				setState(140);
				match(End);
				}
				break;
			case Semicolon:
				{
				setState(141);
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

	public static class MethodCallContext extends ParserRuleContext {
		public Token funcName1;
		public Token funcName2;
		public ExpressionListContext argList;
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public List<TerminalNode> ID() { return getTokens(LHCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LHCParser.ID, i);
		}
		public TerminalNode Dot() { return getToken(LHCParser.Dot, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		enterRule(_localctx, 10, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((MethodCallContext)_localctx).funcName1 = match(ID);
			setState(147);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(145);
				match(Dot);
				setState(146);
				((MethodCallContext)_localctx).funcName2 = match(ID);
				}
			}

			setState(149);
			match(ParBeg);
			setState(151);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << ParBeg) | (1L << Integer) | (1L << Double) | (1L << ID))) != 0)) {
				{
				setState(150);
				((MethodCallContext)_localctx).argList = expressionList();
				}
			}

			setState(153);
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

	public static class ParamListContext extends ParserRuleContext {
		public ParamDeclContext declarations;
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
		}
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LHCParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LHCParser.Comma, i);
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
			setState(155);
			((ParamListContext)_localctx).declarations = paramDecl();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(156);
				match(Comma);
				setState(157);
				((ParamListContext)_localctx).declarations = paramDecl();
				}
				}
				setState(162);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LHCParser.ID, 0); }
		public ParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitParamDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDeclContext paramDecl() throws RecognitionException {
		ParamDeclContext _localctx = new ParamDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((ParamDeclContext)_localctx).type_ = type();
			setState(164);
			((ParamDeclContext)_localctx).varName = match(ID);
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
		public ExpContext exp;
		public List<ExpContext> par = new ArrayList<ExpContext>();
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LHCParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LHCParser.Comma, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((ExpressionListContext)_localctx).exp = exp(0);
			((ExpressionListContext)_localctx).par.add(((ExpressionListContext)_localctx).exp);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(167);
				match(Comma);
				setState(168);
				((ExpressionListContext)_localctx).exp = exp(0);
				((ExpressionListContext)_localctx).par.add(((ExpressionListContext)_localctx).exp);
				}
				}
				setState(173);
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
		enterRule(_localctx, 18, RULE_decl);
		try {
			int _alt;
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				((VarDeclContext)_localctx).type_ = type();
				setState(175);
				((VarDeclContext)_localctx).varName = match(ID);
				setState(176);
				match(Semicolon);
				}
				break;
			case 2:
				_localctx = new VarMultDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((VarMultDeclContext)_localctx).type_ = type();
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(179);
						((VarMultDeclContext)_localctx).varName = match(ID);
						setState(180);
						match(Comma);
						}
						} 
					}
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(186);
				((VarMultDeclContext)_localctx).varName = match(ID);
				setState(187);
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
		enterRule(_localctx, 20, RULE_attr);
		int _la;
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
				{
				setState(191);
				((AssignmentContext)_localctx).type_ = type();
				}
			}

			setState(194);
			((AssignmentContext)_localctx).varName = match(ID);
			setState(195);
			match(Gets);
			setState(196);
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
		enterRule(_localctx, 22, RULE_rightSide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			exp(0);
			setState(199);
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

	public static class Switch1Context extends ParserRuleContext {
		public Case1Context case_;
		public Default1Context else_;
		public TerminalNode Switch() { return getToken(LHCParser.Switch, 0); }
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public Default1Context default1() {
			return getRuleContext(Default1Context.class,0);
		}
		public List<Case1Context> case1() {
			return getRuleContexts(Case1Context.class);
		}
		public Case1Context case1(int i) {
			return getRuleContext(Case1Context.class,i);
		}
		public Switch1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitSwitch1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch1Context switch1() throws RecognitionException {
		Switch1Context _localctx = new Switch1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_switch1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(Switch);
			setState(202);
			match(Begin);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203);
				((Switch1Context)_localctx).case_ = case1();
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			{
			setState(208);
			((Switch1Context)_localctx).else_ = default1();
			}
			setState(209);
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
		public TerminalNode Case() { return getToken(LHCParser.Case, 0); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Case_ruleContext(Case1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitCase_rule(this);
			else return visitor.visitChildren(this);
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
			setState(211);
			match(Case);
			setState(212);
			match(ParBeg);
			setState(213);
			((Case_ruleContext)_localctx).condition_ = exp(0);
			setState(214);
			match(ParEnd);
			setState(215);
			match(Begin);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << Bool) | (1L << Switch) | (1L << ParBeg) | (1L << Integer) | (1L << For) | (1L << Double) | (1L << ID))) != 0)) {
				{
				{
				setState(216);
				((Case_ruleContext)_localctx).stmtList = stmt();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
		public TerminalNode Default() { return getToken(LHCParser.Default, 0); }
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Default_ruleContext(Default1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitDefault_rule(this);
			else return visitor.visitChildren(this);
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
			setState(224);
			match(Default);
			setState(225);
			match(Begin);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << Bool) | (1L << Switch) | (1L << ParBeg) | (1L << Integer) | (1L << For) | (1L << Double) | (1L << ID))) != 0)) {
				{
				{
				setState(226);
				((Default_ruleContext)_localctx).stmtList = stmt();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
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

	public static class LoopContext extends ParserRuleContext {
		public Token id_;
		public Token int_const;
		public ExpContext condition;
		public Token id_increment;
		public Token incre_const;
		public StmtContext stmts;
		public ControlContext control_;
		public TerminalNode For() { return getToken(LHCParser.For, 0); }
		public TerminalNode ParBeg() { return getToken(LHCParser.ParBeg, 0); }
		public TerminalNode IntegerType() { return getToken(LHCParser.IntegerType, 0); }
		public TerminalNode Gets() { return getToken(LHCParser.Gets, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(LHCParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(LHCParser.Semicolon, i);
		}
		public TerminalNode Plus() { return getToken(LHCParser.Plus, 0); }
		public TerminalNode ParEnd() { return getToken(LHCParser.ParEnd, 0); }
		public TerminalNode Begin() { return getToken(LHCParser.Begin, 0); }
		public TerminalNode End() { return getToken(LHCParser.End, 0); }
		public List<TerminalNode> ID() { return getTokens(LHCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LHCParser.ID, i);
		}
		public List<TerminalNode> Integer() { return getTokens(LHCParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(LHCParser.Integer, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(For);
			setState(235);
			match(ParBeg);
			setState(273);
			switch (_input.LA(1)) {
			case IntegerType:
				{
				{
				setState(236);
				match(IntegerType);
				setState(237);
				((LoopContext)_localctx).id_ = match(ID);
				setState(238);
				match(Gets);
				setState(239);
				((LoopContext)_localctx).int_const = match(Integer);
				setState(240);
				match(Semicolon);
				setState(241);
				((LoopContext)_localctx).condition = exp(0);
				setState(242);
				match(Semicolon);
				setState(243);
				((LoopContext)_localctx).id_increment = match(ID);
				setState(244);
				match(Plus);
				setState(245);
				((LoopContext)_localctx).incre_const = match(Integer);
				setState(246);
				match(ParEnd);
				setState(247);
				match(Begin);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << Bool) | (1L << Switch) | (1L << ParBeg) | (1L << Integer) | (1L << For) | (1L << Double) | (1L << ID))) != 0)) {
					{
					{
					setState(248);
					((LoopContext)_localctx).stmts = stmt();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Return) | (1L << Break) | (1L << Continue))) != 0)) {
					{
					setState(254);
					((LoopContext)_localctx).control_ = control();
					}
				}

				setState(257);
				match(End);
				}
				}
				break;
			case Bool:
			case ParBeg:
			case Integer:
			case Double:
			case ID:
				{
				{
				setState(259);
				((LoopContext)_localctx).condition = exp(0);
				setState(260);
				match(ParEnd);
				setState(261);
				match(Begin);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType) | (1L << Print) | (1L << Bool) | (1L << Switch) | (1L << ParBeg) | (1L << Integer) | (1L << For) | (1L << Double) | (1L << ID))) != 0)) {
					{
					{
					setState(262);
					((LoopContext)_localctx).stmts = stmt();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Return) | (1L << Break) | (1L << Continue))) != 0)) {
					{
					setState(268);
					((LoopContext)_localctx).control_ = control();
					}
				}

				setState(271);
				match(End);
				}
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

	public static class ControlContext extends ParserRuleContext {
		public TypeContext type_;
		public TerminalNode Semicolon() { return getToken(LHCParser.Semicolon, 0); }
		public TerminalNode Break() { return getToken(LHCParser.Break, 0); }
		public TerminalNode Continue() { return getToken(LHCParser.Continue, 0); }
		public TerminalNode Return() { return getToken(LHCParser.Return, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LHCVisitor ) return ((LHCVisitor<? extends T>)visitor).visitControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_control);
		int _la;
		try {
			setState(282);
			switch (_input.LA(1)) {
			case Break:
			case Continue:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(276);
				match(Semicolon);
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(Return);
				setState(279);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringType) | (1L << IntegerType) | (1L << DoubleType) | (1L << BooleanType))) != 0)) {
					{
					setState(278);
					((ControlContext)_localctx).type_ = type();
					}
				}

				setState(281);
				match(Semicolon);
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
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(287);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new Int_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((Int_ruleContext)_localctx).value_ = match(Integer);
				}
				break;
			case Bool:
				_localctx = new Bool_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				((Bool_ruleContext)_localctx).value_ = match(Bool);
				}
				break;
			case Double:
				_localctx = new Double_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				((Double_ruleContext)_localctx).value_ = match(Double);
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
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		case 3:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5s\n\5\f\5\16\5v\13\5\3"+
		"\6\3\6\5\6z\n\6\3\6\3\6\3\6\5\6\177\n\6\3\6\3\6\3\6\7\6\u0084\n\6\f\6"+
		"\16\6\u0087\13\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\6\3\6\5\6\u0091\n\6\3"+
		"\7\3\7\3\7\5\7\u0096\n\7\3\7\3\7\5\7\u009a\n\7\3\7\3\7\3\b\3\b\3\b\7\b"+
		"\u00a1\n\b\f\b\16\b\u00a4\13\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00ac\n\n\f"+
		"\n\16\n\u00af\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b8\n\13"+
		"\f\13\16\13\u00bb\13\13\3\13\3\13\3\13\5\13\u00c0\n\13\3\f\5\f\u00c3\n"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\6\16\u00cf\n\16\r\16\16"+
		"\16\u00d0\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00dc\n\17"+
		"\f\17\16\17\u00df\13\17\3\17\3\17\3\20\3\20\3\20\7\20\u00e6\n\20\f\20"+
		"\16\20\u00e9\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00fc\n\21\f\21\16\21\u00ff\13"+
		"\21\3\21\5\21\u0102\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u010a\n\21"+
		"\f\21\16\21\u010d\13\21\3\21\5\21\u0110\n\21\3\21\3\21\5\21\u0114\n\21"+
		"\3\22\3\22\3\22\3\22\5\22\u011a\n\22\3\22\5\22\u011d\n\22\3\23\3\23\3"+
		"\23\5\23\u0122\n\23\3\24\3\24\3\24\2\3\b\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\4\3\2()\3\2\3\6\u013f\2(\3\2\2\2\4<\3\2\2\2\6>\3\2"+
		"\2\2\bL\3\2\2\2\ny\3\2\2\2\f\u0092\3\2\2\2\16\u009d\3\2\2\2\20\u00a5\3"+
		"\2\2\2\22\u00a8\3\2\2\2\24\u00bf\3\2\2\2\26\u00c2\3\2\2\2\30\u00c8\3\2"+
		"\2\2\32\u00cb\3\2\2\2\34\u00d5\3\2\2\2\36\u00e2\3\2\2\2 \u00ec\3\2\2\2"+
		"\"\u011c\3\2\2\2$\u0121\3\2\2\2&\u0123\3\2\2\2()\7\t\2\2)-\7\20\2\2*,"+
		"\5\n\6\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2"+
		"\60\61\7\21\2\2\61\3\3\2\2\2\62=\5\26\f\2\63=\5\6\4\2\64\65\5\b\5\2\65"+
		"\66\7\24\2\2\66=\3\2\2\2\67=\5\24\13\289\5\32\16\29:\7\24\2\2:=\3\2\2"+
		"\2;=\5 \21\2<\62\3\2\2\2<\63\3\2\2\2<\64\3\2\2\2<\67\3\2\2\2<8\3\2\2\2"+
		"<;\3\2\2\2=\5\3\2\2\2>?\7\b\2\2?@\7\22\2\2@A\5\b\5\2AB\7\23\2\2BC\7\24"+
		"\2\2C\7\3\2\2\2DE\b\5\1\2EF\7\22\2\2FG\5\b\5\2GH\7\23\2\2HM\3\2\2\2IM"+
		"\7.\2\2JM\5$\23\2KM\5\f\7\2LD\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2Mt"+
		"\3\2\2\2NO\f\21\2\2OP\7\32\2\2Ps\5\b\5\22QR\f\20\2\2RS\7\33\2\2Ss\5\b"+
		"\5\21TU\f\17\2\2UV\7\27\2\2Vs\5\b\5\20WX\f\16\2\2XY\7\30\2\2Ys\5\b\5\17"+
		"Z[\f\r\2\2[\\\7\25\2\2\\s\5\b\5\16]^\f\f\2\2^_\7\26\2\2_s\5\b\5\r`a\f"+
		"\13\2\2ab\7\34\2\2bs\5\b\5\fcd\f\n\2\2de\7\35\2\2es\5\b\5\13fg\f\t\2\2"+
		"gh\7\36\2\2hs\5\b\5\nij\f\b\2\2jk\7 \2\2ks\5\b\5\tlm\f\7\2\2mn\7\37\2"+
		"\2ns\5\b\5\bop\f\6\2\2pq\7!\2\2qs\5\b\5\7rN\3\2\2\2rQ\3\2\2\2rT\3\2\2"+
		"\2rW\3\2\2\2rZ\3\2\2\2r]\3\2\2\2r`\3\2\2\2rc\3\2\2\2rf\3\2\2\2ri\3\2\2"+
		"\2rl\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\t\3\2\2\2vt\3\2"+
		"\2\2wz\7\13\2\2xz\5&\24\2yw\3\2\2\2yx\3\2\2\2z{\3\2\2\2{|\7.\2\2|~\7\22"+
		"\2\2}\177\5\16\b\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0090"+
		"\7\23\2\2\u0081\u0085\7\20\2\2\u0082\u0084\5\4\3\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008c"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\f\2\2\u0089\u008a\5\b\5\2\u008a"+
		"\u008b\7\24\2\2\u008b\u008d\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\7\21\2\2\u008f\u0091\7\24\2\2\u0090"+
		"\u0081\3\2\2\2\u0090\u008f\3\2\2\2\u0091\13\3\2\2\2\u0092\u0095\7.\2\2"+
		"\u0093\u0094\7\'\2\2\u0094\u0096\7.\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7\22\2\2\u0098\u009a\5\22\n\2"+
		"\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\7\23\2\2\u009c\r\3\2\2\2\u009d\u00a2\5\20\t\2\u009e\u009f\7&\2\2\u009f"+
		"\u00a1\5\20\t\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\5&\24\2\u00a6\u00a7\7.\2\2\u00a7\21\3\2\2\2\u00a8\u00ad\5\b\5\2"+
		"\u00a9\u00aa\7&\2\2\u00aa\u00ac\5\b\5\2\u00ab\u00a9\3\2\2\2\u00ac\u00af"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\23\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\5&\24\2\u00b1\u00b2\7.\2\2\u00b2\u00b3\7\24"+
		"\2\2\u00b3\u00c0\3\2\2\2\u00b4\u00b9\5&\24\2\u00b5\u00b6\7.\2\2\u00b6"+
		"\u00b8\7&\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7.\2\2\u00bd\u00be\7\24\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b0\3\2"+
		"\2\2\u00bf\u00b4\3\2\2\2\u00c0\25\3\2\2\2\u00c1\u00c3\5&\24\2\u00c2\u00c1"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7.\2\2\u00c5"+
		"\u00c6\7#\2\2\u00c6\u00c7\5\30\r\2\u00c7\27\3\2\2\2\u00c8\u00c9\5\b\5"+
		"\2\u00c9\u00ca\7\24\2\2\u00ca\31\3\2\2\2\u00cb\u00cc\7\r\2\2\u00cc\u00ce"+
		"\7\20\2\2\u00cd\u00cf\5\34\17\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2"+
		"\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3"+
		"\5\36\20\2\u00d3\u00d4\7\21\2\2\u00d4\33\3\2\2\2\u00d5\u00d6\7\16\2\2"+
		"\u00d6\u00d7\7\22\2\2\u00d7\u00d8\5\b\5\2\u00d8\u00d9\7\23\2\2\u00d9\u00dd"+
		"\7\20\2\2\u00da\u00dc\5\4\3\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00e0\u00e1\7\21\2\2\u00e1\35\3\2\2\2\u00e2\u00e3\7\17\2\2\u00e3"+
		"\u00e7\7\20\2\2\u00e4\u00e6\5\4\3\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\7\21\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\7*\2"+
		"\2\u00ed\u0113\7\22\2\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\7.\2\2\u00f0\u00f1"+
		"\7#\2\2\u00f1\u00f2\7\31\2\2\u00f2\u00f3\7\24\2\2\u00f3\u00f4\5\b\5\2"+
		"\u00f4\u00f5\7\24\2\2\u00f5\u00f6\7.\2\2\u00f6\u00f7\7\25\2\2\u00f7\u00f8"+
		"\7\31\2\2\u00f8\u00f9\7\23\2\2\u00f9\u00fd\7\20\2\2\u00fa\u00fc\5\4\3"+
		"\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\5\"\22\2"+
		"\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\7\21\2\2\u0104\u0114\3\2\2\2\u0105\u0106\5\b\5\2\u0106\u0107\7\23\2\2"+
		"\u0107\u010b\7\20\2\2\u0108\u010a\5\4\3\2\u0109\u0108\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0110\5\"\22\2\u010f\u010e\3\2\2\2\u010f\u0110\3"+
		"\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\21\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u00ee\3\2\2\2\u0113\u0105\3\2\2\2\u0114!\3\2\2\2\u0115\u0116\t\2\2\2"+
		"\u0116\u011d\7\24\2\2\u0117\u0119\7\f\2\2\u0118\u011a\5&\24\2\u0119\u0118"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\7\24\2\2"+
		"\u011c\u0115\3\2\2\2\u011c\u0117\3\2\2\2\u011d#\3\2\2\2\u011e\u0122\7"+
		"\31\2\2\u011f\u0122\7\n\2\2\u0120\u0122\7-\2\2\u0121\u011e\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122%\3\2\2\2\u0123\u0124\t\3\2\2"+
		"\u0124\'\3\2\2\2\36-<Lrty~\u0085\u008c\u0090\u0095\u0099\u00a2\u00ad\u00b9"+
		"\u00bf\u00c2\u00d0\u00dd\u00e7\u00fd\u0101\u010b\u010f\u0113\u0119\u011c"+
		"\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}