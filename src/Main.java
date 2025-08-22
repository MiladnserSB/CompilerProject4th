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


        String input = "import { Component, OnInit } from '@angular/core';\n" +
                "import { ProductsService } from '../../services/products.service';\n" +
                "import { Observable } from 'rxjs';\n" +
                "import { Router } from '@angular/router';\n" +
                "import { NgFor, NgIf,AsyncPipe } from '@angular/common';\n" +
                "\n" +
                "\n" +
                "@Component({\n" +
                "  selector: 'app-products',\n" +
                "  imports:[NgFor,NgIf,AsyncPipe],\n" +
                "  templateUrl: './products.component.html',\n" +
                "  styleUrl: './products.component.css'\n" +
                "})\n" +
                "\n" +
                "export class ProductsComponent implements OnInit {\n" +
                "  products$!: Observable<any[]>;\n" +
                "  selectedItem: any=null;\n" +
                "  editMode:boolean = false;\n" +
                "\n" +
                "  constructor(private productsService: ProductsService, private router: Router) {}\n" +
                "\n" +
                "  ngOnInit() {\n" +
                "    this.products$ = this.productsService.products$;\n" +
                "  }\n" +
                "\n" +
                "  viewDetails(item: any) {\n" +
                "    this.productsService.setSelectedProduct(item);\n" +
                "    this.router.navigate(['/details']);\n" +
                "  }\n" +
                "\n" +
                "  onEdit(item: any) {\n" +
                "    this.selectedItem = { ...item };\n" +
                "    this.editMode = true;\n" +
                "  }\n" +
                "\n" +
                "  onDelete(id: number) {\n" +
                "    this.productsService.deleteProduct(id);\n" +
                "    if (this.selectedItem?.id === id) {\n" +
                "      this.editMode = false;\n" +
                "      this.selectedItem = null;\n" +
                "    }\n" +
                "  }\n" +
                "\n" +
                "  onEditSave() {\n" +
                "    this.productsService.editProduct(this.selectedItem);\n" +
                "    this.editMode = false;\n" +
                "    this.selectedItem = null;\n" +
                "  }\n" +
                "\n" +
                "  onEditCancel() {\n" +
                "    this.editMode = false;\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "\n" +
                "  \n" +
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
                "        <input name=\"color\" [value]=\"selectedItem.colors\" (input)=\"selectedItem.colors = $any($event.target).value\" required />\n" +
                "      </label><br />\n" +
                "\n" +
                "      <div class=\"center-btn\">\n" +
                "        <button type=\"submit\">Save</button>\n" +
                "        <button type=\"button\" (click)=\"onEditCancel()\">Cancel</button>\n" +
                "      </div>\n" +
                "\n" +
                "    </form>\n" +
                "  </div>\n" +
                "  \n" +
                "\n" +
                "</div>\n" +
                "\n" +
                ".container {\n" +
                "    display: flex;\n" +
                "    justify-content: space-between;\n" +
                "    justify-content: center;\n" +
                "    align-items: center;\n" +
                "    padding: 20px;\n" +
                "  }\n" +
                "  \n" +
                "  .product-list {\n" +
                "    width: 90%;\n" +
                "    display: flex;\n" +
                "    flex-direction: column;\n" +
                "     justify-content: center;\n" +
                "    align-items: center;\n" +
                "    flex-wrap: wrap;\n" +
                "    gap: 20px;\n" +
                "  }\n" +
                "  \n" +
                "  .product-card {\n" +
                "    width: 200px;\n" +
                "    text-align: center;\n" +
                "    cursor: pointer;\n" +
                "  }\n" +
                "  \n" +
                "  .product-card img {\n" +
                "    width: 100%;\n" +
                "    height: 110px;\n" +
                "    object-fit: cover;\n" +
                "  }\n" +
                " \n" +
                "\n" +
                "\n" +
                ".edit-form {\n" +
                "display: flex;\n" +
                "align-items: center;\n" +
                "justify-content: center;\n" +
                "flex-direction: column;\n" +
                " width: 300px; \n" +
                " height: 300px;\n" +
                "  padding: 50px;\n" +
                "  margin: 25px;\n" +
                "  background: #f9f9f9;\n" +
                "  \n" +
                "}\n" +
                ".edit-form input{\n" +
                "width: 200px;\n" +
                "height: 18px;\n" +
                "margin: 10px;\n" +
                "margin-top: 8px;\n" +
                "}\n" +
                ".center-btn {\n" +
                "  display: flex;\n" +
                "  justify-content: space-evenly;\n" +
                "padding-top: 10px;\n" +
                "}\n" +
                "\n" +
                ".center-btn button {\n" +
                "    width: 50px;\n" +
                "    height: 30px;\n" +
                "  background: #ff3c00;\n" +
                "  color: #fff;\n" +
                "  font-size: 12px;\n" +
                "  \n" +
                "}\n" +
                "\n" +
                "  .edit-form h2{\n" +
                "    color: #ff3c00;\n" +
                "  }"
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