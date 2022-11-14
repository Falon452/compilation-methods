package org.antlr.v4.runtime;// Generated from /Users/damiantworek/projects/slimp/SlimpParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SlimpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SlimpParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SlimpParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SlimpParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SlimpParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariable(SlimpParser.GlobalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SlimpParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#functionParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParams(SlimpParser.FunctionParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#functionParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParam(SlimpParser.FunctionParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#functionReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnType(SlimpParser.FunctionReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SlimpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SlimpParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(SlimpParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SlimpParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SlimpParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(SlimpParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SlimpParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(SlimpParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(SlimpParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SlimpParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpression(SlimpParser.MapExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(SlimpParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexingExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingExpression(SlimpParser.IndexingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCastExpression(SlimpParser.TypeCastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(SlimpParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(SlimpParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(SlimpParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RangeExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(SlimpParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(SlimpParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(SlimpParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link SlimpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(SlimpParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#expressionElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionElements(SlimpParser.ExpressionElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#mapExpressionElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpressionElements(SlimpParser.MapExpressionElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SlimpParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(SlimpParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SlimpParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SlimpParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#typedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedIdentifier(SlimpParser.TypedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(SlimpParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedType(SlimpParser.ParenthesizedTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleType(SlimpParser.TupleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(SlimpParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapType}
	 * labeled alternative in {@link SlimpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(SlimpParser.MapTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#tupleTypeElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleTypeElements(SlimpParser.TupleTypeElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternLiteral}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternLiteral(SlimpParser.PatternLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UntypedPatternIdentifier}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntypedPatternIdentifier(SlimpParser.UntypedPatternIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypedPatternIdentifier}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedPatternIdentifier(SlimpParser.TypedPatternIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WildCardPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildCardPattern(SlimpParser.WildCardPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedPattern(SlimpParser.ParenthesizedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TuplePattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplePattern(SlimpParser.TuplePatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayPattern(SlimpParser.ArrayPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapPattern}
	 * labeled alternative in {@link SlimpParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapPattern(SlimpParser.MapPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#patternElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternElements(SlimpParser.PatternElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimpParser#mapPatternElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapPatternElements(SlimpParser.MapPatternElementsContext ctx);
}