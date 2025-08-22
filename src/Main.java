import antlr.Parsergrammar;
import antlr.Lexergrammmar;
import ast.ASTNode;
import ast.VISITOR.programvisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class Main {
    public static void main(String[] args) {


        String input = "import { Injectable } from '@angular/core';\n" +
                "import { BehaviorSubject } from 'rxjs';\n" +
                "\n" +
                "@Injectable({ providedIn: 'root' })\n" +
                "export class ProductsService {\n" +
                "  private productsSubject = new BehaviorSubject<any[]>([\n" +
                "    { id: 1, name: 'hoodie', image: 'https://m.media-amazon.com/images/I/51tEciwZARL.jpg', price: 1000, colors: 'red' },\n" +
                "    { id: 2, name: 'jeans', image: 'https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcS-gNnQj5hHFmlvbSZjACGvZ2R3GHfUC6zL3ViZGXTMC8Z5MR-If7jikESuzpUFeMRSgDiMb0FR9xPUSruyylJbc-javHeGNK50HAFKEv3PRXLP3HSIuN38', price: 2000, colors: 'blue' },\n" +
                "    { id: 3, name: 'shoes', image: 'https://assets.adidas.com/images/w_940,f_auto,q_auto/bdd9f8cd43664fffbd3da8bf01188fca_9366/B75807_07_standard.jpg', price: 3000, colors: 'black' },\n" +
                "  ]);\n" +
                "\n" +
                "  products$ = this.productsSubject.asObservable();\n" +
                "\n" +
                "  private selectedProduct: any = null;\n" +
                "\n" +
                "  setSelectedProduct(product: any)\n" +
                "   { this.selectedProduct = product; }\n" +
                "\n" +
                "  getSelectedProduct() \n" +
                "  { return this.selectedProduct; }\n" +
                "\n" +
                "  getProducts()\n" +
                "   { return this.productsSubject.value; }\n" +
                "\n" +
                "  addProduct(product: any) {\n" +
                "    this.productsSubject.next([ ...this.productsSubject.value, product]);\n" +
                "  }\n" +
                "\n" +
                "  editProduct(updated: any) {\n" +
                "    this.productsSubject.next(this.productsSubject.value.map(pr => pr.id === updated.id ? updated : pr));\n" +
                "  }\n" +
                "\n" +
                "  deleteProduct(id: number) {\n" +
                "    this.productsSubject.next(this.productsSubject.value.filter(pr => pr.id !== id));\n" +
                "  }\n" +
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
        } else {
            System.out.println("AST is null. Check the grammar and visitor implementation.");
        }
    }
}