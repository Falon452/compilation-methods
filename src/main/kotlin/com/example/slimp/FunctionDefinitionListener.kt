package com.example.slimp

import com.example.slimp.Register.ProcedureAlredyExists
import org.antlr.v4.runtime.SlimpParser
import org.antlr.v4.runtime.SlimpParserBaseListener
import org.antlr.v4.runtime.impls.Register

class FunctionDefinitionListener(private val register: Register) : SlimpParserBaseListener() {

    var isRegistrantPassValid = true
        private set

    override fun enterFunctionCallExpression(ctx: SlimpParser.FunctionCallExpressionContext?) {
        super.enterFunctionCallExpression(ctx)
    }

    override fun enterFunction(ctx: SlimpParser.FunctionContext?) {
        val functionId: String = checkNotNull(ctx?.identifier()?.text)
        println("Found function def with id: $functionId")
        try {
            register.registerFunction(functionId, null) // TODO funObject
        } catch (e: ProcedureAlredyExists) {
            println("Function with id: $functionId already exists")
            isRegistrantPassValid = false
        }
    }
}
