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
	 * Enter a parse tree produced by {@link SlimpParser#functionParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParam(SlimpParser.FunctionParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#functionParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParam(SlimpParser.FunctionParamContext ctx);
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
	 * Enter a parse tree produced by {@link SlimpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SlimpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SlimpParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link SlimpParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(SlimpParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(SlimpParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SlimpParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SlimpParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SlimpParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SlimpParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(SlimpParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(SlimpParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(SlimpParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(SlimpParser.WhileLoopContext ctx);
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
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SlimpParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SlimpParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMapExpression(SlimpParser.MapExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMapExpression(SlimpParser.MapExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(SlimpParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(SlimpParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexingExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexingExpression(SlimpParser.IndexingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexingExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexingExpression(SlimpParser.IndexingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastExpression(SlimpParser.TypeCastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastExpression(SlimpParser.TypeCastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(SlimpParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(SlimpParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(SlimpParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(SlimpParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(SlimpParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(SlimpParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RangeExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(SlimpParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RangeExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(SlimpParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(SlimpParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(SlimpParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(SlimpParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(SlimpParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#expressionElements}.
	 * @param ctx the parse tree
	 */
	void enterExpressionElements(SlimpParser.ExpressionElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#expressionElements}.
	 * @param ctx the parse tree
	 */
	void exitExpressionElements(SlimpParser.ExpressionElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#mapExpressionElements}.
	 * @param ctx the parse tree
	 */
	void enterMapExpressionElements(SlimpParser.MapExpressionElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#mapExpressionElements}.
	 * @param ctx the parse tree
	 */
	void exitMapExpressionElements(SlimpParser.MapExpressionElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SlimpParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SlimpParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(SlimpParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(SlimpParser.ArithmeticOperatorContext ctx);
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
	 * Enter a parse tree produced by {@link SlimpParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SlimpParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SlimpParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#typedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypedIdentifier(SlimpParser.TypedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#typedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypedIdentifier(SlimpParser.TypedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(SlimpParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(SlimpParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(SlimpParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(SlimpParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(SlimpParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(SlimpParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SlimpParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SlimpParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterMapType(SlimpParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitMapType(SlimpParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#tupleTypeElements}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeElements(SlimpParser.TupleTypeElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#tupleTypeElements}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeElements(SlimpParser.TupleTypeElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternLiteral}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPatternLiteral(SlimpParser.PatternLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternLiteral}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPatternLiteral(SlimpParser.PatternLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UntypedPatternIdentifier}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterUntypedPatternIdentifier(SlimpParser.UntypedPatternIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UntypedPatternIdentifier}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitUntypedPatternIdentifier(SlimpParser.UntypedPatternIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedPatternIdentifier}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterTypedPatternIdentifier(SlimpParser.TypedPatternIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedPatternIdentifier}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitTypedPatternIdentifier(SlimpParser.TypedPatternIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WildCardPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterWildCardPattern(SlimpParser.WildCardPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WildCardPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitWildCardPattern(SlimpParser.WildCardPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedPattern(SlimpParser.ParenthesizedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedPattern(SlimpParser.ParenthesizedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TuplePattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterTuplePattern(SlimpParser.TuplePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TuplePattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitTuplePattern(SlimpParser.TuplePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterArrayPattern(SlimpParser.ArrayPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitArrayPattern(SlimpParser.ArrayPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterMapPattern(SlimpParser.MapPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitMapPattern(SlimpParser.MapPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#patternElements}.
	 * @param ctx the parse tree
	 */
	void enterPatternElements(SlimpParser.PatternElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#patternElements}.
	 * @param ctx the parse tree
	 */
	void exitPatternElements(SlimpParser.PatternElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimpParser#mapPatternElements}.
	 * @param ctx the parse tree
	 */
	void enterMapPatternElements(SlimpParser.MapPatternElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimpParser#mapPatternElements}.
	 * @param ctx the parse tree
	 */
	void exitMapPatternElements(SlimpParser.MapPatternElementsContext ctx);
}