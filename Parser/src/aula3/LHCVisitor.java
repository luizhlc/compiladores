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
	 * Visit a parse tree produced by the {@code Num_rule}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_rule(LHCParser.Num_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(LHCParser.BoolContext ctx);
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
	 * Visit a parse tree produced by {@link LHCParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(LHCParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#methodDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDef(LHCParser.MethodDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(LHCParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LHCParser.ArgsContext ctx);
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
	 * Visit a parse tree produced by {@link LHCParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LHCParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LHCParser.TypeContext ctx);
}