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
                "import { ProductsService } from '../../services/products.service';\n" +
                "import { NgFor, NgIf } from '@angular/common';\n" +
                "\n" +
            "@Component({\n" +
                "  selector: 'app-products',\n" +
                "  imports: [NgFor,NgIf],\n" +
                "  templateUrl: './products.component.html',\n" +
                "  styleUrl: './products.component.css'\n" +
                "})"+
                "export class ProductsComponent implements OnInit{\n" +
                "  items: any[] = [];\n" +
                "  selectedItem:any=null;\n" +
                "\n" +
                "getProducts() {\n" +
                "    return 5;\n" +
                "  }"+
                "  constructor(private productsService: ProductsService) { }\n" +
                "  ngOnInit(): void {\n" +
                "     this.items = this.productsService.getProducts();\n" +
                "  }\n" +
                "\n" +
                "  onselect(item: any): void {\n" +
                "    this.selectedItem = item;\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "\n" +
                "  <div class=\"product-list\">\n" +
                "    <div *ngFor=\"let item of products$ | async\" class=\"product-card\">\n" +
                "      <img [src]=\"item.image\" alt=\"{{ item.name }}\">\n" +
                "      <h3>{{ item.name }}</h3>\n" +
                "      <button (click)=\"onEdit(item); $event.stopPropagation()\">Edit</button>\n" +
                "      <button (click)=\"onDelete(item.id); $event.stopPropagation()\">Delete</button>\n" +
                "      <button (click)=\"viewDetails(item); $event.stopPropagation()\">View</button>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "  <div class=\"edit-form\" *ngIf=\"editMode\">\n" +
                "    <h2>Edit Product</h2>\n" +
                "\n" +
                "    <form (submit)=\"onEditSave(); $event.preventDefault()\">\n" +
                "      <label>Name:\n" +
                "        <input name=\"name\" [value]=\"selectedItem.name\" (input)=\"selectedItem.name = $any($event.target).value\" required />\n" +
                "      </label><br />\n" +
                "\n" +
                "      <label>Image:\n" +
                "        <input name=\"image\" [value]=\"selectedItem.image\" (input)=\"selectedItem.image = $any($event.target).value\" required />\n" +
                "      </label><br />\n" +
                "\n" +
                "      <label>Price:\n" +
                "        <input type=\"number\" name=\"price\" [value]=\"selectedItem.price\" (input)=\"selectedItem.price = +$any($event.target).value\" required />\n" +
                "      </label><br />\n" +
                "\n" +
                "      <label>Color:\n" +
                "        <input name=\"color\" [value]=\"selectedItem.color\" (input)=\"selectedItem.color = $any($event.target).value\" required />\n" +
                "      </label><br />\n" +
                "\n" +
                "      <div class=\"center-btn\">\n" +
                "        <button type=\"submit\">Save</button>\n" +
                "        <button type=\"button\" (click)=\"onEditCancel()\">Cancel</button>\n" +
                "      </div>\n" +
                "    </form>\n" +
                "  </div>\n" +
                "\n" +
                "</div>" +
                "\n" +
                "  .container {\n" +
                "      display: flex;\n" +
                "      justify-content: space-between;\n" +
                "      padding: 20px;\n" +
                "    }\n" +
                "\n" +
                "    .product-list {\n" +
                "      width: 90%;\n" +
                "      display: flex;\n" +
                "      flex-direction: column;\n" +
                "      align-items: flex-end;\n" +
                "      flex-wrap: wrap;\n" +
                "      gap: 20px;\n" +
                "    }\n" +
                "\n" +
                "    .product-card {\n" +
                "      width: 200px;\n" +
                "      text-align: center;\n" +
                "      cursor: pointer;\n" +
                "    }\n" +
                "\n" +
                "    .product-card img {\n" +
                "      width: 100%;\n" +
                "      height: 110px;\n" +
                "      object-fit: cover;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    .product-details {\n" +
                "      width: 50%;\n" +
                "      height: 400px;\n" +
                "      background-color: #f9f9f9;\n" +
                "      border: 1px solid #ddd;\n" +
                "      text-align: center;\n" +
                "      position: absolute;\n" +
                "      left: 200px;\n" +
                "      top: 180px;\n" +
                "    }\n" +
                "\n" +
                "    .product-details img {\n" +
                "      width: 200px;\n" +
                "      height: 200px;\n" +
                "      object-fit: cover;\n" +
                "    }\n"
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