// Generated from LHC.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LHCParser}.
 */
public interface LHCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LHCParser#LessE_rule}.
	 * @param ctx the parse tree
	 */
	void enterLessE_rule(@NotNull LHCParser.LessE_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#LessE_rule}.
	 * @param ctx the parse tree
	 */
	void exitLessE_rule(@NotNull LHCParser.LessE_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Less_rule}.
	 * @param ctx the parse tree
	 */
	void enterLess_rule(@NotNull LHCParser.Less_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Less_rule}.
	 * @param ctx the parse tree
	 */
	void exitLess_rule(@NotNull LHCParser.Less_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Equal_rule}.
	 * @param ctx the parse tree
	 */
	void enterEqual_rule(@NotNull LHCParser.Equal_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Equal_rule}.
	 * @param ctx the parse tree
	 */
	void exitEqual_rule(@NotNull LHCParser.Equal_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Plus_rule}.
	 * @param ctx the parse tree
	 */
	void enterPlus_rule(@NotNull LHCParser.Plus_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Plus_rule}.
	 * @param ctx the parse tree
	 */
	void exitPlus_rule(@NotNull LHCParser.Plus_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#And_rule}.
	 * @param ctx the parse tree
	 */
	void enterAnd_rule(@NotNull LHCParser.And_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#And_rule}.
	 * @param ctx the parse tree
	 */
	void exitAnd_rule(@NotNull LHCParser.And_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull LHCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull LHCParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#ParExp_rule}.
	 * @param ctx the parse tree
	 */
	void enterParExp_rule(@NotNull LHCParser.ParExp_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#ParExp_rule}.
	 * @param ctx the parse tree
	 */
	void exitParExp_rule(@NotNull LHCParser.ParExp_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Num_rule}.
	 * @param ctx the parse tree
	 */
	void enterNum_rule(@NotNull LHCParser.Num_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Num_rule}.
	 * @param ctx the parse tree
	 */
	void exitNum_rule(@NotNull LHCParser.Num_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull LHCParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull LHCParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull LHCParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull LHCParser.BoolContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#NEqual__rule}.
	 * @param ctx the parse tree
	 */
	void enterNEqual__rule(@NotNull LHCParser.NEqual__ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#NEqual__rule}.
	 * @param ctx the parse tree
	 */
	void exitNEqual__rule(@NotNull LHCParser.NEqual__ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Times_rule}.
	 * @param ctx the parse tree
	 */
	void enterTimes_rule(@NotNull LHCParser.Times_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Times_rule}.
	 * @param ctx the parse tree
	 */
	void exitTimes_rule(@NotNull LHCParser.Times_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Greater_rule}.
	 * @param ctx the parse tree
	 */
	void enterGreater_rule(@NotNull LHCParser.Greater_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Greater_rule}.
	 * @param ctx the parse tree
	 */
	void exitGreater_rule(@NotNull LHCParser.Greater_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Minus_rule}.
	 * @param ctx the parse tree
	 */
	void enterMinus_rule(@NotNull LHCParser.Minus_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Minus_rule}.
	 * @param ctx the parse tree
	 */
	void exitMinus_rule(@NotNull LHCParser.Minus_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Divide_rule}.
	 * @param ctx the parse tree
	 */
	void enterDivide_rule(@NotNull LHCParser.Divide_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Divide_rule}.
	 * @param ctx the parse tree
	 */
	void exitDivide_rule(@NotNull LHCParser.Divide_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Or_rule}.
	 * @param ctx the parse tree
	 */
	void enterOr_rule(@NotNull LHCParser.Or_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Or_rule}.
	 * @param ctx the parse tree
	 */
	void exitOr_rule(@NotNull LHCParser.Or_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull LHCParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull LHCParser.StmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#GreaterE_rule}.
	 * @param ctx the parse tree
	 */
	void enterGreaterE_rule(@NotNull LHCParser.GreaterE_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#GreaterE_rule}.
	 * @param ctx the parse tree
	 */
	void exitGreaterE_rule(@NotNull LHCParser.GreaterE_ruleContext ctx);
}