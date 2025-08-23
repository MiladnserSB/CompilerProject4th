import antlr.Parsergrammar;
import antlr.Lexergrammmar;
import ast.ASTNode;
import ast.Ast;
import ast.VISITOR.programvisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class Main {
    public static void main(String[] args) {


        String input = "import { Component } from '@angular/core';\n" +
                "import { ProductsService } from '../../services/products.service';\n" +
                "import { Router } from '@angular/router';\n" +
                "\n" +
                "@Component({\n" +
                "  selector: 'app-add-product',\n" +
                "  templateUrl: './add-product.component.html',\n" +
                "  styleUrl: './add-product.component.css'\n" +
                "})\n" +
                "\n" +
                "\n" +
                "export class AddProductComponent {\n" +
                "  product = { name: 'zxxcsdf', image: '', price: 0, colors: '' };\n" +
                "\n" +
                "  constructor(private productsService: ProductsService, private router: Router) {}\n" +
                "\n" +
                "  onSubmit() {\n" +
                "    const newProduct = { ...this.product, id: Date.now() };\n" +
                "    this.productsService.addProduct(newProduct);\n" +
                "    this.router.navigate(['/products']);\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "  <div class=\"container\"> \n" +
                "    <div class=\"add-product-form\">\n" +
                "  <h2>Add Product</h2>\n" +
                "  <form (submit)=\"onSubmit(); $event.preventDefault()\">\n" +
                "    <label>Name:\n" +
                "      <input name=\"name\" [value]=\"product.name\" (input)=\"product.name =  $any($event.target).value\" required />\n" +
                "    </label><br />\n" +
                "    <label>Image:\n" +
                "      <input name=\"image\" [value]=\"product.image\" (input)=\"product.image =  $any($event.target).value\" required />\n" +
                "    </label><br />\n" +
                "    <label>Price:\n" +
                "      <input type=\"number\" name=\"price\" [value]=\"product.price\" (input)=\"product.price = + $any($event.target).value\" required />\n" +
                "    </label><br />\n" +
                "    <label>Color:\n" +
                "      <input name=\"color\" [value]=\"product.colors\" (input)=\"product.colors =  $any($event.target).value\" required />\n" +
                "    </label><br />\n" +
                "    <div class=\"center-btn\">\n" +
                "    <button type=\"submit\">Add</button>\n" +
                "    </div>\n" +
                "  </form>\n" +
                "</div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                ".container{\n" +
                "    display: flex;\n" +
                "    align-items: center;\n" +
                "    justify-content: center;\n" +
                "    flex-direction: column;\n" +
                "}\n" +
                "h2{\n" +
                "    color: #ff3c00;\n" +
                "    padding: 10px;}\n" +
                "\n" +
                ".add-product-form {\n" +
                "display: flex;\n" +
                "align-items: center;\n" +
                "justify-content: center;\n" +
                "flex-direction: column;\n" +
                " width: 250px; \n" +
                " height: 300px;\n" +
                "  padding: 100px;\n" +
                "  margin: 50px;\n" +
                "  background: #f9f9f9;\n" +
                "  \n" +
                "}\n" +
                ".add-product-form input{\n" +
                "width: 250px;\n" +
                "height: 18px;\n" +
                "margin: 10px;\n" +
                "margin-top: 8px;\n" +
                "}\n" +
                ".center-btn {\n" +
                "  display: flex;\n" +
                "  justify-content: center;\n" +
                "padding-top: 50px;\n" +
                "}\n" +
                "\n" +
                ".center-btn button {\n" +
                "    width: 60px;\n" +
                "    height: 40px;\n" +
                "  background: #ff3c00;\n" +
                "  color: #fff;\n" +
                "  \n" +
                "}\n"
                ;
        Lexergrammmar lexer = new Lexergrammmar(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Parsergrammar parser = new Parsergrammar(tokens);
        ParseTree tree = parser.ast();
        programvisitor visitor = new programvisitor();
        ASTNode ast = visitor.visit(tree);

        if (ast != null) {
            ast.prettyPrint("");
            ast.generate();

        } else {
            System.out.println("AST is null. Check the grammar and visitor implementation.");
        }
    }
}