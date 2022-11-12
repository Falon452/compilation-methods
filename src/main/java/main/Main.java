package main;


import Interpreter.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        InterpreterLexer lexer = new InterpreterLexer(CharStreams.fromFileName("./src/main/java/main/test1.txt"));
        InterpreterParser parser = new InterpreterParser(new CommonTokenStream(lexer));
//
        parser.addParseListener(new InterpreterBaseListener());
        InterpreterVisitor<String> visitor = new InterpreterVisitorImpl();
//
        String str = visitor.visit(parser.start());
        System.out.println(str);
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new InterpreterBaseListener(), parser.getBu2ildParseTree());
//        System.out.println("My parser has executed Order 66");
    }
}

