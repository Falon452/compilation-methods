// Generated from /Users/damiantworek/projects/ANTLR-playground/src/main/java/Logo.g4 by ANTLR 4.10.1
package Logo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LogoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(LogoParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LogoParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInvocation(LogoParser.ProcedureInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(LogoParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarations(LogoParser.ParameterDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#func_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_(LogoParser.Func_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#repeat_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_(LogoParser.Repeat_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LogoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#ife}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfe(LogoParser.IfeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(LogoParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(LogoParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#make}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMake(LogoParser.MakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#print_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_(LogoParser.Print_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#quotedstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedstring(LogoParser.QuotedstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(LogoParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LogoParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#signExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpression(LogoParser.SignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(LogoParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LogoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeref(LogoParser.DerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#fd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFd(LogoParser.FdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#bk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBk(LogoParser.BkContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#rt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRt(LogoParser.RtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(LogoParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#cs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCs(LogoParser.CsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#pu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPu(LogoParser.PuContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#pd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPd(LogoParser.PdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#ht}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHt(LogoParser.HtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSt(LogoParser.StContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(LogoParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#stop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop(LogoParser.StopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(LogoParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#setxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetxy(LogoParser.SetxyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom(LogoParser.RandomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#fore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFore(LogoParser.ForeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LogoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(LogoParser.CommentContext ctx);
}