// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#hardware}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardware(implParser.HardwareContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(implParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputs(implParser.OutputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#latchDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatchDec(implParser.LatchDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(implParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#updateDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateDec(implParser.UpdateDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(implParser.SimulateContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#simlnp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimlnp(implParser.SimlnpContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(implParser.ExprContext ctx);
}