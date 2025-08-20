import antlr.Parsergrammar;
import antlr.Lexergrammmar;
import ast.ASTNode;
import ast.VISITOR.programvisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class Main {
    public static void main(String[] args) {


        String input = "import { Component, OnInit } from '@angular/core';\n" +
                "\n" +
                "@Component({\n" +
                "  selector: 'app-products',\n" +

                "})\n" +
                "export class ProductsComponent implements OnInit{\n" +
                "ngOnInit() {\n" +
                "    this.product = this.productsService.getSelectedProduct();\n" +
                "  }" +
                "}"
                ;
        Lexergrammmar lexer = new Lexergrammmar(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Parsergrammar parser = new Parsergrammar(tokens);
        ParseTree tree = parser.ast();
        programvisitor visitor = new programvisitor();
        ASTNode ast = visitor.visit(tree);
        if (ast != null) {
            ast.prettyPrint("");
        } else {
            System.out.println("AST is null. Check the grammar and visitor implementation.");
        }
    }
}