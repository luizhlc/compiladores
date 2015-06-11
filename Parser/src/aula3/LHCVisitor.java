// Generated from LHC.g4 by ANTLR 4.2
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
	 * Visit a parse tree produced by {@link LHCParser#VarMultDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarMultDecl(@NotNull LHCParser.VarMultDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull LHCParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Less_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_rule(@NotNull LHCParser.Less_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull LHCParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Clean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClean(@NotNull LHCParser.CleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull LHCParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#ParExp_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp_rule(@NotNull LHCParser.ParExp_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull LHCParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Real_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_(@NotNull LHCParser.Real_Context ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Integer_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_(@NotNull LHCParser.Integer_Context ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#VarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(@NotNull LHCParser.VarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull LHCParser.BoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#NEqual__rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEqual__rule(@NotNull LHCParser.NEqual__ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Minus_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_rule(@NotNull LHCParser.Minus_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Greater_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_rule(@NotNull LHCParser.Greater_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Divide_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide_rule(@NotNull LHCParser.Divide_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#GreaterE_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterE_rule(@NotNull LHCParser.GreaterE_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#LessE_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessE_rule(@NotNull LHCParser.LessE_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Value_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_(@NotNull LHCParser.Value_Context ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Equal_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_rule(@NotNull LHCParser.Equal_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Plus_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_rule(@NotNull LHCParser.Plus_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#And_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_rule(@NotNull LHCParser.And_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#rightSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightSide(@NotNull LHCParser.RightSideContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull LHCParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Times_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes_rule(@NotNull LHCParser.Times_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Or_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_rule(@NotNull LHCParser.Or_ruleContext ctx);
}