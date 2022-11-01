// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlimpParser}.
 */
public interface SlimpParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlimpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SlimpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SlimpParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SlimpParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SlimpParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariable(SlimpParser.GlobalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariable(SlimpParser.GlobalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SlimpParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SlimpParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#functionParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParams(SlimpParser.FunctionParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#functionParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParams(SlimpParser.FunctionParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturnType(SlimpParser.FunctionReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturnType(SlimpParser.FunctionReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpression(SlimpParser.BlockExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpression(SlimpParser.BlockExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SlimpParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SlimpParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(SlimpParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(SlimpParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SlimpParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SlimpParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SlimpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SlimpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#expressionWithBlock}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWithBlock(SlimpParser.ExpressionWithBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#expressionWithBlock}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWithBlock(SlimpParser.ExpressionWithBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(SlimpParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(SlimpParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SlimpParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SlimpParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SlimpParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SlimpParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(SlimpParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(SlimpParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(SlimpParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(SlimpParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(SlimpParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(SlimpParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SlimpParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SlimpParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(SlimpParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(SlimpParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(SlimpParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(SlimpParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#patternLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPatternLiteral(SlimpParser.PatternLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#patternLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPatternLiteral(SlimpParser.PatternLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#patternIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterPatternIdentifier(SlimpParser.PatternIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#patternIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitPatternIdentifier(SlimpParser.PatternIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#parenthesizedPattern}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedPattern(SlimpParser.ParenthesizedPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#parenthesizedPattern}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedPattern(SlimpParser.ParenthesizedPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#tuplePattern}.
	 * @param ctx the parse tree
	 */
	void enterTuplePattern(SlimpParser.TuplePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#tuplePattern}.
	 * @param ctx the parse tree
	 */
	void exitTuplePattern(SlimpParser.TuplePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#arrayPattern}.
	 * @param ctx the parse tree
	 */
	void enterArrayPattern(SlimpParser.ArrayPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#arrayPattern}.
	 * @param ctx the parse tree
	 */
	void exitArrayPattern(SlimpParser.ArrayPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#mapPattern}.
	 * @param ctx the parse tree
	 */
	void enterMapPattern(SlimpParser.MapPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#mapPattern}.
	 * @param ctx the parse tree
	 */
	void exitMapPattern(SlimpParser.MapPatternContext ctx);
}