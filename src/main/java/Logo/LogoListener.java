// Generated from /Users/damiantworek/projects/ANTLR-playground/src/main/java/Logo.g4 by ANTLR 4.10.1
package Logo;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LogoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LogoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LogoParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LogoParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LogoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LogoParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 */
	void enterProcedureInvocation(LogoParser.ProcedureInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 */
	void exitProcedureInvocation(LogoParser.ProcedureInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(LogoParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(LogoParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarations(LogoParser.ParameterDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarations(LogoParser.ParameterDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#func_}.
	 * @param ctx the parse tree
	 */
	void enterFunc_(LogoParser.Func_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#func_}.
	 * @param ctx the parse tree
	 */
	void exitFunc_(LogoParser.Func_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#repeat_}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_(LogoParser.Repeat_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#repeat_}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_(LogoParser.Repeat_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LogoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LogoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#ife}.
	 * @param ctx the parse tree
	 */
	void enterIfe(LogoParser.IfeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ife}.
	 * @param ctx the parse tree
	 */
	void exitIfe(LogoParser.IfeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(LogoParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(LogoParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(LogoParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(LogoParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#make}.
	 * @param ctx the parse tree
	 */
	void enterMake(LogoParser.MakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#make}.
	 * @param ctx the parse tree
	 */
	void exitMake(LogoParser.MakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#print_}.
	 * @param ctx the parse tree
	 */
	void enterPrint_(LogoParser.Print_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#print_}.
	 * @param ctx the parse tree
	 */
	void exitPrint_(LogoParser.Print_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#quotedstring}.
	 * @param ctx the parse tree
	 */
	void enterQuotedstring(LogoParser.QuotedstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#quotedstring}.
	 * @param ctx the parse tree
	 */
	void exitQuotedstring(LogoParser.QuotedstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(LogoParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(LogoParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LogoParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LogoParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void enterSignExpression(LogoParser.SignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void exitSignExpression(LogoParser.SignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(LogoParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(LogoParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LogoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LogoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(LogoParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(LogoParser.DerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#fd}.
	 * @param ctx the parse tree
	 */
	void enterFd(LogoParser.FdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#fd}.
	 * @param ctx the parse tree
	 */
	void exitFd(LogoParser.FdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#bk}.
	 * @param ctx the parse tree
	 */
	void enterBk(LogoParser.BkContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#bk}.
	 * @param ctx the parse tree
	 */
	void exitBk(LogoParser.BkContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterRt(LogoParser.RtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitRt(LogoParser.RtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#lt}.
	 * @param ctx the parse tree
	 */
	void enterLt(LogoParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#lt}.
	 * @param ctx the parse tree
	 */
	void exitLt(LogoParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#cs}.
	 * @param ctx the parse tree
	 */
	void enterCs(LogoParser.CsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#cs}.
	 * @param ctx the parse tree
	 */
	void exitCs(LogoParser.CsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#pu}.
	 * @param ctx the parse tree
	 */
	void enterPu(LogoParser.PuContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#pu}.
	 * @param ctx the parse tree
	 */
	void exitPu(LogoParser.PuContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#pd}.
	 * @param ctx the parse tree
	 */
	void enterPd(LogoParser.PdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#pd}.
	 * @param ctx the parse tree
	 */
	void exitPd(LogoParser.PdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#ht}.
	 * @param ctx the parse tree
	 */
	void enterHt(LogoParser.HtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ht}.
	 * @param ctx the parse tree
	 */
	void exitHt(LogoParser.HtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#st}.
	 * @param ctx the parse tree
	 */
	void enterSt(LogoParser.StContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#st}.
	 * @param ctx the parse tree
	 */
	void exitSt(LogoParser.StContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(LogoParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(LogoParser.HomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#stop}.
	 * @param ctx the parse tree
	 */
	void enterStop(LogoParser.StopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#stop}.
	 * @param ctx the parse tree
	 */
	void exitStop(LogoParser.StopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(LogoParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(LogoParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#setxy}.
	 * @param ctx the parse tree
	 */
	void enterSetxy(LogoParser.SetxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#setxy}.
	 * @param ctx the parse tree
	 */
	void exitSetxy(LogoParser.SetxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandom(LogoParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandom(LogoParser.RandomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#fore}.
	 * @param ctx the parse tree
	 */
	void enterFore(LogoParser.ForeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#fore}.
	 * @param ctx the parse tree
	 */
	void exitFore(LogoParser.ForeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LogoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LogoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(LogoParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(LogoParser.CommentContext ctx);
}