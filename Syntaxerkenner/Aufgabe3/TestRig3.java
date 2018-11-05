package Aufgabe3;

import Aufgabe1.Aufgabe1Lexer;
import Aufgabe1.Aufgabe1Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestRig3 {
    public static void main(String[] args) throws IOException {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        Aufgabe3Lexer lexer = new Aufgabe3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Aufgabe3Parser parser = new Aufgabe3Parser(tokens);
        ParseTree tree = parser.expr();
        System.out.println(tree.toStringTree(parser));
    }

    public static String test (String inputString) {
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        Aufgabe3Lexer lexer = new Aufgabe3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Aufgabe3Parser parser = new Aufgabe3Parser(tokens);
        ParseTree tree = parser.expr();
        return tree.toStringTree(parser);
    }
}
