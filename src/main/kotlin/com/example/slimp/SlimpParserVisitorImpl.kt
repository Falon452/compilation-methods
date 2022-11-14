//package com.example.slimp
//
//import org.antlr.v4.runtime.SlimpParser
//import org.antlr.v4.runtime.SlimpParserVisitor
//import org.antlr.v4.runtime.tree.*
//
//class SlimpParserVisitorImpl : AbstractParseTreeVisitor<String>(),  SlimpParserVisitor<String> {
//
//    override fun aggregateResult(aggregate: String?, nextResult: String?): String {
//        println(aggregate)
//        println(nextResult)
//        if (nextResult == null && aggregate == null) {
//            return ""
//        }
//        if (nextResult == null) {
//            return checkNotNull(aggregate)
//        }
//        if (aggregate == null) {
//            return nextResult
//        }
//
//        return aggregate + nextResult
//    }
//
//    override fun visitProgram(ctx: SlimpParser.ProgramContext?): String {
//        println("visited visitProgram")
//        return visitChildren(ctx)
//    }
//
//    override fun visitDeclaration(ctx: SlimpParser.DeclarationContext?): String {
//        println("visited visitDeclaration")
//        return visitChildren(ctx)
//    }
//
//    override fun visitGlobalVariable(ctx: SlimpParser.GlobalVariableContext?): String {
//        println("visited visitGlobalVariable ${ctx}")
//        return visitChildren(ctx)
//    }
//
//    override fun visitFunction(ctx: SlimpParser.FunctionContext?): String {
//        println("visited visitFunction")
//        return visitChildren(ctx)
//    }
//
//    override fun visitFunctionParams(ctx: SlimpParser.FunctionParamsContext?): String {
//        println("visited visitFunctionParams")
//        return visitChildren(ctx)
//    }
//
//    override fun visitFunctionParam(ctx: SlimpParser.FunctionParamContext?): String {
//        println("visited visitFunctionParam")
//        return visitChildren(ctx)
//    }
//
//    override fun visitFunctionReturnType(ctx: SlimpParser.FunctionReturnTypeContext?): String {
//        println("visited visitFunctionReturnType")
//        return visitChildren(ctx)
//    }
//
//    override fun visitBlock(ctx: SlimpParser.BlockContext?): String {
//        println("visited visitBlock")
//        return visitChildren(ctx)
//    }
//
//    override fun visitStatement(ctx: SlimpParser.StatementContext?): String {
//        println("visited visitStatement")
//        return visitChildren(ctx)
//    }
//
//    override fun visitDeclarationStatement(ctx: SlimpParser.DeclarationStatementContext?): String {
//        println("visited visitDeclarationStatement")
//        return visitChildren(ctx)
//    }
//
//    override fun visitAssignmentStatement(ctx: SlimpParser.AssignmentStatementContext?): String {
//        println("visited visitAssignmentStatement")
//        return visitChildren(ctx)
//    }
//
//    override fun visitExpressionStatement(ctx: SlimpParser.ExpressionStatementContext?): String {
//        println("visited visitExpressionStatement")
//        return visitChildren(ctx)
//    }
//
//    override fun visitBlockStatement(ctx: SlimpParser.BlockStatementContext?): String {
//        println("visited visitBlockStatement")
//        return visitChildren(ctx)
//    }
//
//    override fun visitIfStatement(ctx: SlimpParser.IfStatementContext?): String {
//        println("visited visitIfStatement")
//        return visitChildren(ctx)
//    }
//
//    override fun visitForLoop(ctx: SlimpParser.ForLoopContext?): String {
//        println("visited visitForLoop")
//        return visitChildren(ctx)
//    }
//
//    override fun visitWhileLoop(ctx: SlimpParser.WhileLoopContext?): String {
//        println("visited visitWhileLoop")
//        return visitChildren(ctx)
//    }
//
//    override fun visitParenthesizedExpression(ctx: SlimpParser.ParenthesizedExpressionContext?): String {
//        println("visited visitParenthesizedExpression")
//        return visitChildren(ctx)
//    }
//
//    override fun visitMapExpression(ctx: SlimpParser.MapExpressionContext?): String {
//        println("visited visitMapExpression")
//        return visitChildren(ctx)
//    }
//
//    override fun visitLogicalExpression(ctx: SlimpParser.LogicalExpressionContext?): String {
//        println("visited visitLogicalExpression")
//        return visitChildren(ctx)
//    }
//
//    override fun visitIndexingExpression(ctx: SlimpParser.IndexingExpressionContext?): String {
//        println("visited visitIndexingExpression")
//        return visitChildren(ctx)
//    }
//
//    override fun visitTypeCastExpression(ctx: SlimpParser.TypeCastExpressionContext?): String {
//        println("visited visitTypeCastExpression")
//        return visitChildren(ctx)
//    }
//
//    override fun visitLiteralExpression(ctx: SlimpParser.LiteralExpressionContext?): String {
//        println("visited visitLiteralExpression")
//        return checkNotNull(ctx?.text)
//    }
//
//    override fun visitTupleExpression(ctx: SlimpParser.TupleExpressionContext?): String {
//        println("visited visitTupleExpression")
//        return visitChildren(ctx)
//    }
//
//    override fun visitArrayExpression(ctx: SlimpParser.ArrayExpressionContext?): String {
//        println("visited visitArrayExpression")
//        return visitChildren(ctx)
//    }
//
//    override fun visitRangeExpression(ctx: SlimpParser.RangeExpressionContext?): String {
//        println("visited visitRangeExpression")
//        return visitChildren(ctx)
//    }
//
//    override fun visitArithmeticExpression(ctx: SlimpParser.ArithmeticExpressionContext?): String {
//        println("visited visitArithmeticExpression")
//        return visitChildren(ctx)
//    }
//
//    override fun visitFunctionCallExpression(ctx: SlimpParser.FunctionCallExpressionContext?): String {
//        println("visited visitFunctionCallExpression")
//        return visitChildren(ctx)
//    }
//
//    override fun visitExpressionElements(ctx: SlimpParser.ExpressionElementsContext?): String {
//        println("visited visitExpressionElements")
//        return visitChildren(ctx)
//    }
//
//    override fun visitMapExpressionElements(ctx: SlimpParser.MapExpressionElementsContext?): String {
//        println("visited visitMapExpressionElements")
//        return visitChildren(ctx)
//    }
//
//    override fun visitComparisonOperator(ctx: SlimpParser.ComparisonOperatorContext?): String {
//        println("visited visitComparisonOperator")
//        return visitChildren(ctx)
//    }
//
//    override fun visitArithmeticOperator(ctx: SlimpParser.ArithmeticOperatorContext?): String {
//        println("visited visitArithmeticOperator")
//        return visitChildren(ctx)
//    }
//
//    override fun visitLiteral(ctx: SlimpParser.LiteralContext?): String {
//        println("visited visitLiteral")
//        return visitChildren(ctx)
//    }
//
//    override fun visitIdentifier(ctx: SlimpParser.IdentifierContext?): String {
//        println("visited visitIdentifier")
//        return visitChildren(ctx)
//    }
//
//    override fun visitTypedIdentifier(ctx: SlimpParser.TypedIdentifierContext?): String {
//        println("visited visitTypedIdentifier")
//        return visitChildren(ctx)
//    }
//
//    override fun visitTypeIdentifier(ctx: SlimpParser.TypeIdentifierContext?): String {
//        println("visited visitTypeIdentifier")
//        return checkNotNull(ctx?.text)
//    }
//
//    override fun visitParenthesizedType(ctx: SlimpParser.ParenthesizedTypeContext?): String {
//        println("visited visitParenthesizedType")
//        return visitChildren(ctx)
//    }
//
//    override fun visitTupleType(ctx: SlimpParser.TupleTypeContext?): String {
//        println("visited visitTupleType")
//        return visitChildren(ctx)
//    }
//
//    override fun visitArrayType(ctx: SlimpParser.ArrayTypeContext?): String {
//        println("visited visitArrayType")
//        return visitChildren(ctx)
//    }
//
//    override fun visitMapType(ctx: SlimpParser.MapTypeContext?): String {
//        println("visited visitMapType")
//        return visitChildren(ctx)
//    }
//
//    override fun visitTupleTypeElements(ctx: SlimpParser.TupleTypeElementsContext?): String {
//        println("visited visitTupleTypeElements")
//        return visitChildren(ctx)
//    }
//
//    override fun visitPatternLiteral(ctx: SlimpParser.PatternLiteralContext?): String {
//        println("visited visitPatternLiteral")
//        return checkNotNull(ctx?.text)
//    }
//
//    override fun visitUntypedPatternIdentifier(ctx: SlimpParser.UntypedPatternIdentifierContext?): String {
//        println("visited visitUntypedPatternIdentifier")
//        return visitChildren(ctx)
//    }
//
//    override fun visitTypedPatternIdentifier(ctx: SlimpParser.TypedPatternIdentifierContext?): String {
//        println("visited visitTypedPatternIdentifier")
//        return checkNotNull(ctx?.text)
//    }
//
//    override fun visitWildCardPattern(ctx: SlimpParser.WildCardPatternContext?): String {
//        println("visited visitWildCardPattern")
//        return visitChildren(ctx)
//    }
//
//    override fun visitParenthesizedPattern(ctx: SlimpParser.ParenthesizedPatternContext?): String {
//        println("visited visitParenthesizedPattern")
//        return visitChildren(ctx)
//    }
//
//    override fun visitTuplePattern(ctx: SlimpParser.TuplePatternContext?): String {
//        println("visited visitTuplePattern")
//        return visitChildren(ctx)
//    }
//
//    override fun visitArrayPattern(ctx: SlimpParser.ArrayPatternContext?): String {
//        println("visited visitArrayPattern")
//        return visitChildren(ctx)
//    }
//
//    override fun visitMapPattern(ctx: SlimpParser.MapPatternContext?): String {
//        println("visited visitMapPattern")
//        return visitChildren(ctx)
//    }
//
//    override fun visitPatternElements(ctx: SlimpParser.PatternElementsContext?): String {
//        println("visited visitPatternElements")
//        return visitChildren(ctx)
//    }
//
//    override fun visitMapPatternElements(ctx: SlimpParser.MapPatternElementsContext?): String {
//        println("visited visitMapPatternElements")
//        return visitChildren(ctx)
//    }
//}