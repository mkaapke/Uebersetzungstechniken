package Aufgabe1;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestRig1 {
    public static void main(String[] args) throws IOException {

        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);

        Aufgabe1Lexer lexer = new Aufgabe1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Aufgabe1Parser parser = new Aufgabe1Parser(tokens);

        ParseTree tree = parser.expr();

        String testTree = tree.toStringTree(parser);
        System.out.println(testTree);
    }

    public static String test (String inputString) {
        ANTLRInputStream input = new ANTLRInputStream(inputString);

        Aufgabe1Lexer lexer = new Aufgabe1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Aufgabe1Parser parser = new Aufgabe1Parser(tokens);

        ParseTree tree = parser.expr();
        return tree.toStringTree(parser);
    }
}
