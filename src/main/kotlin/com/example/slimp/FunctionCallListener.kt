package com.example.slimp

import org.antlr.v4.runtime.SlimpParser
import org.antlr.v4.runtime.SlimpParserBaseListener
import org.antlr.v4.runtime.impls.Register

class FunctionCallListener(private val register: Register) : SlimpParserBaseListener() {

    var isCallPassValid = true
        private set

    override fun enterFunctionCallExpression(ctx: SlimpParser.FunctionCallExpressionContext?) {
        val procedureID: String? = ctx?.text

        if (!register.containsFunction(procedureID)) {
            println("Cannot find procedure with id: $procedureID")
            isCallPassValid = false
        } else {
            println("Call proceudre with id: $procedureID")
        }
    }
}