// Generated from LHC.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LHCParser}.
 */
public interface LHCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LHCParser#VarMultDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarMultDecl(@NotNull LHCParser.VarMultDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#VarMultDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarMultDecl(@NotNull LHCParser.VarMultDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull LHCParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull LHCParser.VariableContext ctx);

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
	 * Enter a parse tree produced by {@link LHCParser#Bool_rule}.
	 * @param ctx the parse tree
	 */
	void enterBool_rule(@NotNull LHCParser.Bool_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Bool_rule}.
	 * @param ctx the parse tree
	 */
	void exitBool_rule(@NotNull LHCParser.Bool_ruleContext ctx);

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
	 * Enter a parse tree produced by {@link LHCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull LHCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull LHCParser.TypeContext ctx);

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
	 * Enter a parse tree produced by {@link LHCParser#Assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull LHCParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull LHCParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Method_rule}.
	 * @param ctx the parse tree
	 */
	void enterMethod_rule(@NotNull LHCParser.Method_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Method_rule}.
	 * @param ctx the parse tree
	 */
	void exitMethod_rule(@NotNull LHCParser.Method_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#VarDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull LHCParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#VarDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull LHCParser.VarDeclContext ctx);

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
	 * Enter a parse tree produced by {@link LHCParser#GreaterE_rule}.
	 * @param ctx the parse tree
	 */
	void enterGreaterE_rule(@NotNull LHCParser.GreaterE_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#GreaterE_rule}.
	 * @param ctx the parse tree
	 */
	void exitGreaterE_rule(@NotNull LHCParser.GreaterE_ruleContext ctx);

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
	 * Enter a parse tree produced by {@link LHCParser#Int_rule}.
	 * @param ctx the parse tree
	 */
	void enterInt_rule(@NotNull LHCParser.Int_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Int_rule}.
	 * @param ctx the parse tree
	 */
	void exitInt_rule(@NotNull LHCParser.Int_ruleContext ctx);

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
	 * Enter a parse tree produced by {@link LHCParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(@NotNull LHCParser.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(@NotNull LHCParser.MethodDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#rightSide}.
	 * @param ctx the parse tree
	 */
	void enterRightSide(@NotNull LHCParser.RightSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#rightSide}.
	 * @param ctx the parse tree
	 */
	void exitRightSide(@NotNull LHCParser.RightSideContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull LHCParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull LHCParser.ArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#Value_rule}.
	 * @param ctx the parse tree
	 */
	void enterValue_rule(@NotNull LHCParser.Value_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Value_rule}.
	 * @param ctx the parse tree
	 */
	void exitValue_rule(@NotNull LHCParser.Value_ruleContext ctx);

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
	 * Enter a parse tree produced by {@link LHCParser#Double_rule}.
	 * @param ctx the parse tree
	 */
	void enterDouble_rule(@NotNull LHCParser.Double_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#Double_rule}.
	 * @param ctx the parse tree
	 */
	void exitDouble_rule(@NotNull LHCParser.Double_ruleContext ctx);

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
	 * Enter a parse tree produced by {@link LHCParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(@NotNull LHCParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(@NotNull LHCParser.ParamListContext ctx);

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
	 * Enter a parse tree produced by {@link LHCParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull LHCParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull LHCParser.MethodCallContext ctx);
}