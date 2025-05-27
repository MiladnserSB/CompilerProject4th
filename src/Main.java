import antlr.Parsergrammar;
import antlr.Lexergrammmar;
import ast.ASTNode;
import ast.VISITOR.programvisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class Main {
    public static void main(String[] args) {


        String input = "import { Component } from '@angular/core';\n" +
                "import { RouterOutlet } from '@angular/router';\n" +
                "import { HeaderComponent } from './components/header/header.component';\n" +
                "import { HomeComponent } from './home/home.component';\n" +
                "\n" +
                "\n" +
                "@Component({\n" +
                "  selector: 'app-root',\n" +
                "  imports: [RouterOutlet, HeaderComponent, HomeComponent],\n" +
                "  templateUrl: './app.component.html',\n" +
                "  styleUrl: './app.component.css'\n" +
                "})\n" +
                "export class AppComponent {\n" +
                "  title = 'first-app';\n" +
                "}\n" +
                "\n" +
                "<app-header />\n" +
                "<app-home />"

                ;
        Lexergrammmar lexer = new Lexergrammmar(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Parsergrammar parser = new Parsergrammar(tokens);
        ParseTree tree = parser.ast();
        programvisitor visitor = new programvisitor();
        ASTNode ast = visitor.visit(tree);
        visitor.st.print();
        if (ast != null) {
            ast.prettyPrint("");
        } else {
            System.out.println("AST is null. Check the grammar and visitor implementation.");
        }
    }
}