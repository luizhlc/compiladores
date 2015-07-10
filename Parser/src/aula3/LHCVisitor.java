// Generated from LHC.g4 by ANTLR 4.5
package aula3;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LHCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LHCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LHCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LHCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(LHCParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LHCParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessE_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessE_rule(LHCParser.LessE_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LHCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Less_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_rule(LHCParser.Less_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_rule(LHCParser.Equal_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_rule(LHCParser.Plus_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_rule(LHCParser.And_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParExp_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp_rule(LHCParser.ParExp_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_rule(LHCParser.Value_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Method_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_rule(LHCParser.Method_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEqual__rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEqual__rule(LHCParser.NEqual__ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Times_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes_rule(LHCParser.Times_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_rule(LHCParser.Minus_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Greater_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_rule(LHCParser.Greater_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divide_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide_rule(LHCParser.Divide_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_rule(LHCParser.Or_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterE_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterE_rule(LHCParser.GreaterE_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#methodDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDef(LHCParser.MethodDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(LHCParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(LHCParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#paramDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDecl(LHCParser.ParamDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(LHCParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link LHCParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(LHCParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarMultDecl}
	 * labeled alternative in {@link LHCParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarMultDecl(LHCParser.VarMultDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link LHCParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LHCParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#rightSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightSide(LHCParser.RightSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#switch1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch1(LHCParser.Switch1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Case_rule}
	 * labeled alternative in {@link LHCParser#case1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_rule(LHCParser.Case_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code default_rule}
	 * labeled alternative in {@link LHCParser#default1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_rule(LHCParser.Default_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LHCParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(LHCParser.ControlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int_rule}
	 * labeled alternative in {@link LHCParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_rule(LHCParser.Int_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool_rule}
	 * labeled alternative in {@link LHCParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_rule(LHCParser.Bool_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double_rule}
	 * labeled alternative in {@link LHCParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_rule(LHCParser.Double_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LHCParser.TypeContext ctx);
}