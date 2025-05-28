import antlr.Parsergrammar;
import antlr.Lexergrammmar;
import ast.ASTNode;
import ast.VISITOR.programvisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class Main {
    public static void main(String[] args) {
        String input = "import { Component, signal } from '@angular/core';\n" +
                "\n" +
                "@Component({\n" +
                "  selector: 'app-header',\n" +
                "  imports: [],\n" +
                "  templateUrl: './header.component.html',\n" +
                "  styleUrl: './header.component.css'\n" +
                "})\n" +
                "export class HeaderComponent {\n" +
                "title=signal('WELCOME to my store');\n" +
                "}\n" +
                "\n" +
                "\n" +
                "<header>\n" +
                "    <nav>{{title()}}</nav>\n" +
                "</header>\n" +
                "\n" +
                "\n" +
                "header{\n" +
                "    display: flex;\n" +
                "    padding-inline: 16px;\n" +
                "    padding-block: 8px;\n" +
                "    background-color: black;\n" +
                "    align-items: center;\n" +
                "    justify-content: space-between;\n" +
                "    color: aliceblue;\n" +
                "    }"

                ;
        Lexergrammmar lexer = new Lexergrammmar(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Parsergrammar parser = new Parsergrammar(tokens);
        ParseTree tree = parser.ast();
        programvisitor visitor = new programvisitor();
        ASTNode ast = visitor.visit(tree);
        System.out.println();
        System.out.println("..................................................................................... WELCOME TO MY COMPILER PROJECT......................................................................................");
        System.out.println();

        if (ast != null) {
            ast.prettyPrint("");
        } else {
            System.out.println("AST is null. Check the grammar and visitor implementation.");
        }
    }
}