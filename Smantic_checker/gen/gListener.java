// Generated from D:/curri/Seventh/Compilers/projects/Project2/src\g.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(gParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(gParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(gParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(gParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(gParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(gParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(gParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(gParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(gParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(gParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(gParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(gParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(gParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(gParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(gParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(gParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(gParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(gParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(gParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(gParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(gParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(gParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(gParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(gParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(gParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(gParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(gParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(gParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(gParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(gParser.LiteralContext ctx);
}