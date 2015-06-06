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
	 * Visit a parse tree produced by {@link LHCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LHCParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num_rule}
	 * labeled alternative in {@link LHCParser#expArit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_rule(LHCParser.Num_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Times_rule}
	 * labeled alternative in {@link LHCParser#expArit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes_rule(LHCParser.Times_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus_rule}
	 * labeled alternative in {@link LHCParser#expArit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_rule(LHCParser.Plus_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus_rule}
	 * labeled alternative in {@link LHCParser#expArit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_rule(LHCParser.Minus_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divide_rule}
	 * labeled alternative in {@link LHCParser#expArit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide_rule(LHCParser.Divide_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LHCParser#expLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLogic(LHCParser.ExpLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NextAnd}
	 * labeled alternative in {@link LHCParser#expAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextAnd(LHCParser.NextAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or_rule}
	 * labeled alternative in {@link LHCParser#expAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_rule(LHCParser.Or_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link LHCParser#expOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(LHCParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NextOr}
	 * labeled alternative in {@link LHCParser#expOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextOr(LHCParser.NextOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And_rule}
	 * labeled alternative in {@link LHCParser#expOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_rule(LHCParser.And_ruleContext ctx);
}