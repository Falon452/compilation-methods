package main;

import Logo.LogoLexer;
import Logo.LogoParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class LogoMain {

    static String logoExample = "repeat 8 [rt 45 repeat 6 [repeat 90 [fd 1 rt 2] rt 90]] ht";

    public static void main(String[] args) {
        LogoLexer lexer = new LogoLexer(CharStreams.fromString(logoExample));
        LogoParser parser = new LogoParser(new CommonTokenStream(lexer));


        parser.prog();
        System.out.println("My parser has executed Order 66");
    }
}

