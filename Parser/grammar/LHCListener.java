// Generated from LHC.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LHCParser}.
 */
public interface LHCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LHCParser#NextAnd}.
	 * @param ctx the parse tree
	 */
	void enterNextAnd(@NotNull LHCParser.NextAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#NextAnd}.
	 * @param ctx the parse tree
	 */
	void exitNextAnd(@NotNull LHCParser.NextAndContext ctx);

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
	 * Enter a parse tree produced by {@link LHCParser#NextOr}.
	 * @param ctx the parse tree
	 */
	void enterNextOr(@NotNull LHCParser.NextOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#NextOr}.
	 * @param ctx the parse tree
	 */
	void exitNextOr(@NotNull LHCParser.NextOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link LHCParser#ASUH}.
	 * @param ctx the parse tree
	 */
	void enterASUH(@NotNull LHCParser.ASUHContext ctx);
	/**
	 * Exit a parse tree produced by {@link LHCParser#ASUH}.
	 * @param ctx the parse tree
	 */
	void exitASUH(@NotNull LHCParser.ASUHContext ctx);

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
}