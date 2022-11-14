package com.example.slimp

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.impls.Register
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker


fun main() {
    val lexer = SlimpLexer(CharStreams.fromFileName("test.smp"))
    val parser = SlimpParser(CommonTokenStream(lexer))
    parser.addParseListener(SlimpParserBaseListener())

    val tree: ParseTree = parser.program()
    val programRegister = Register()

    // first pass (register procedures)
    val registrantListener = FunctionDefinitionListener(programRegister)

    var walker = ParseTreeWalker()
    walker.walk(registrantListener, tree)
    if (registrantListener.isRegistrantPassValid) {
        println("Pass 1 OK")
    } else {
        println("Pass 1 ERROR")
        return
    }

    // second pass (call procedures)
    val callListener = FunctionCallListener(programRegister)

    walker = ParseTreeWalker()
    walker.walk(callListener, tree)
    if (callListener.isCallPassValid) {
        println("Pass 2 OK")
    } else {
        println("Pass 2 ERROR")
        return
    }
}