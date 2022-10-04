// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#hardware}.
	 * @param ctx the parse tree
	 */
	void enterHardware(implParser.HardwareContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#hardware}.
	 * @param ctx the parse tree
	 */
	void exitHardware(implParser.HardwareContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(implParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(implParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(implParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(implParser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#latchDec}.
	 * @param ctx the parse tree
	 */
	void enterLatchDec(implParser.LatchDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#latchDec}.
	 * @param ctx the parse tree
	 */
	void exitLatchDec(implParser.LatchDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(implParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(implParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#updateDec}.
	 * @param ctx the parse tree
	 */
	void enterUpdateDec(implParser.UpdateDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#updateDec}.
	 * @param ctx the parse tree
	 */
	void exitUpdateDec(implParser.UpdateDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(implParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(implParser.SimulateContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#simlnp}.
	 * @param ctx the parse tree
	 */
	void enterSimlnp(implParser.SimlnpContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#simlnp}.
	 * @param ctx the parse tree
	 */
	void exitSimlnp(implParser.SimlnpContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(implParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(implParser.ExprContext ctx);
}