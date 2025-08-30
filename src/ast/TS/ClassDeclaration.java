package ast.TS;

import ast.ASTNode;
import java.util.List;
import java.util.Objects;

public class ClassDeclaration implements ASTNode {
    private String className;
    private ImplementsClause implementsClause; // nullable
    private List<ASTNode> classBody;

    public ClassDeclaration(String className, ImplementsClause implementsClause, List<ASTNode> classBody) {
        this.className = className;
        this.implementsClause = implementsClause;
        this.classBody = classBody;
    }

    public String getClassName() {
        return className;
    }

    public ImplementsClause getImplementsClause() {
        return implementsClause;
    }

    public List<ASTNode> getClassBody() {
        return classBody;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Class: " + className);
        if (implementsClause != null) {
            implementsClause.prettyPrint(indent + "  ");
        }
        if (classBody != null && !classBody.isEmpty()) {
            System.out.println(indent + "  Class Body:");
            for (ASTNode node : classBody) {
                node.prettyPrint(indent + "    ");
            }
        } else {
            System.out.println(indent + "  <Empty class body>");
        }
    }


    @Override
    public String toString() {
        return "Class " + className + (implementsClause != null ? " " + implementsClause.toString() : "");
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if(this.className.equals("DetailsComponent")){
            sb.append("document.addEventListener('DOMContentLoaded', function() {\n" +
                    "            const product = window.productsService.getSelectedProduct();\n" +
                    "            const container = document.getElementById('product-details-container');\n" +
                    "            \n" +
                    "            if (product) {\n" +
                    "                container.innerHTML = `\n" +
                    "                    <h2>${product.name}</h2>\n" +
                    "                    <img src=\"${product.image}\" alt=\"${product.name}\">\n" +
                    "                    <p>Price: ${product.price} sp</p>\n" +
                    "                    <p>Color: ${product.colors}</p>\n" +
                    "                `;\n" +
                    "            } else {\n" +
                    "                container.innerHTML = '<p>Product not found</p>';\n" +
                    "            }\n" +
                    "        });");
            return sb.toString();

        }else if(this.className.equals("AddProductComponent")){
            sb.append("document.getElementById('add-product-form').addEventListener('submit', function(e) {\n" +
                    "            e.preventDefault();\n" +
                    "            \n" +
                    "            const newProduct = {\n" +
                    "                name: document.getElementById('name').value,\n" +
                    "                image: document.getElementById('image').value,\n" +
                    "                price: parseFloat(document.getElementById('price').value),\n" +
                    "                colors: document.getElementById('colors').value\n" +
                    "            };\n" +
                    "            \n" +
                    "            window.productsService.addProduct(newProduct);\n" +
                    "            document.getElementById('add-product-form').reset();\n" +
                    "            window.location.href = 'products.html';\n" +
                    "        });");
            return sb.toString();
        }
        if(this.className.equals("ProductsService"))
        {sb.append("class ").append(className).append(" {\n");}
if(this.className.equals("ProductsService")) {
    String st1="";
    String st2="";
    String st3="";
    for(ASTNode i: classBody){
        if(i instanceof ArrayExprThreeStatement){
st1=i.generate();
        }else if(i instanceof VariableDeclarationStatement){
            st2=((VariableDeclarationStatement) i).generate(false);
        }
       else if(i instanceof TypedMethodDeclarationStatement){
            sb.append(i.generate());
        }else if(i instanceof VoidMethodDeclarationStatement){
            st3 = i.generate();
        }
    }
    sb.append("\n" +
        st1+
            "\n" +
st2+

            "setSelectedProduct(product) {\n" +
                    "        this.selectedProduct = product;\n" +
                    "        localStorage.setItem('selectedProduct', JSON.stringify(product));\n" +
                    "    }\n" +
                    "\n" +

            "\n" +
            "    addProduct(product) {\n" +
            "        product.id = Date.now();\n" +
            "        this.products.push(product);\n" +
            "        this.saveProducts();\n" +
            "    }\n" +
            "\n" +
            "    editProduct(updatedProduct) {\n" +
            "        const index = this.products.findIndex(p => p.id === updatedProduct.id);\n" +
            "        if (index !== -1) {\n" +
            "            this.products[index] = updatedProduct;\n" +
            "            this.saveProducts();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            st3+

            "    saveProducts() {\n" +
            "        localStorage.setItem('products', JSON.stringify(this.products));\n" +
            "    }\n" +
            "}\n" +
            "\n"

            );
}

else{
        if (classBody != null) {
            for (ASTNode node : classBody) {
                String code = node.generate();
                if (code != null && !code.isEmpty()) {
                    // keep correct indentation
                    for (String line : code.split("\n")) {
                        sb.append("  ").append(line).append("\n");
                    }
                }
            }
        }
sb.append("document.addEventListener(\"DOMContentLoaded\", function () {\n" +
        "        ngOnInit();\n" +
        "        document\n" +
        "          .getElementById(\"edit-product-form\")\n" +
        "          .addEventListener(\"submit\", onEditSave);\n" +
        "        document\n" +
        "          .getElementById(\"cancel-edit\")\n" +
        "          .addEventListener(\"click\", onEditCancel);\n" +
        "      });");
}
        if(this.className.equals("ProductsService"))
        {sb.append("\n"+"window.productsService = new ProductsService();");}
        return sb.toString();
    }




}