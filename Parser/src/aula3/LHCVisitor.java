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
	 * Visit a parse tree produced by {@link LHCParser#NextAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextAnd(@NotNull LHCParser.NextAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull LHCParser.BoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#NextOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextOr(@NotNull LHCParser.NextOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#And_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_rule(@NotNull LHCParser.And_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LHCParser#Or_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_rule(@NotNull LHCParser.Or_ruleContext ctx);
}