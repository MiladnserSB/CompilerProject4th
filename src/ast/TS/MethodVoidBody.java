package ast.TS;

import ast.ASTNode;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class MethodVoidBody extends ClassBodyStatement {
    private final List<ASTNode> statements;
    public String methodName;
    public MethodVoidBody(List<ASTNode> statements) {
        super(null);
        // defensive copy to avoid external mutation
        this.statements = statements == null ? new ArrayList<>() : new ArrayList<>(statements);
    }

    public List<ASTNode> getStatements() {
        return new ArrayList<>(statements);
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "MethodVoidBody:");
        if (statements.isEmpty()) {
            System.out.println(indent + "  <empty>");
            return;
        }
        for (ASTNode stmt : statements) {
            if (stmt != null) stmt.prettyPrint(indent + "  ");
            else System.out.println(indent + "  <null-stmt>");
        }
    }

    @Override
    public String toString() {
        return "MethodVoidBody{" +
                "statements=" + statements +
                '}';
    }

    public String generate(String methodName) {
       this.methodName = methodName;
        return this.generate();
    }
    @Override
    public String generate() {

        StringBuilder sb = new StringBuilder();
        String s="";
        for(ASTNode i : statements)
        {if(i instanceof AssignmentStatement)
        s+=((AssignmentStatement) i).generate(true);
            s+="\n";
        }

        if(this.methodName.equals("onEditSave")){
            sb.append(" e.preventDefault();\n"
+s.toString()+"const updatedProduct = {\n" +
                            "          id: parseInt(document.getElementById(\"edit-id\").value),\n" +
                            "          name: document.getElementById(\"edit-name\").value,\n" +
                            "          image: document.getElementById(\"edit-image\").value,\n" +
                            "          price: parseFloat(document.getElementById(\"edit-price\").value),\n" +
                            "          colors: document.getElementById(\"edit-color\").value,\n" +
                            "        };"

                     +
                    "        window.productsService.editProduct(updatedProduct);\n" +

                    "        document.getElementById(\"edit-form\").style.display = \"none\";\n" +
                    "        document.getElementById(\"edit-product-form\").reset();\n" +
                    "        ngOnInit();"
            );
        }else if(this.methodName.equals("viewDetails")){
            sb.append("const product = window.productsService\n" +
                    "          .getProducts()\n" +
                    "          .find((p) => p.id === id);\n" +
                    "        if (product) {\n" +
                    "          window.productsService.setSelectedProduct(product);\n" +
                    "          window.location.href = \"details.html\";\n" +
                    "        }"
            );

        }
else if(this.methodName.equals("onDelete")){
            StringBuilder s1= new StringBuilder();
            for(ASTNode i : statements)
            {
                if(i instanceof IfStatement)
                {
                    s1.append(i.generate());
                }
                s1.append("\n");
            }
            sb.append("window.productsService.deleteProduct(id);\n" +

                    s1.toString() +

                    "        ngOnInit();"
            );
        } else if (this.methodName.equals("onEdit")) {
    String s4="";
            for(ASTNode i : statements)
            {if(i instanceof AssignmentStatement)
                s4+=((AssignmentStatement) i).generate(true);
                s4+="\n";
            }
            sb.append("const product = window.productsService\n" +
                    "          .getProducts()\n" +
                    "          .find((p) => p.id === id);\n" +
                    "        if (!product) return;\n" +
                    s4+

                    "        document.getElementById(\"edit-id\").value = product.id;\n" +
                    "        document.getElementById(\"edit-name\").value = product.name;\n" +
                    "        document.getElementById(\"edit-image\").value = product.image;\n" +
            "        document.getElementById(\"edit-price\").value = product.price;\n" +
            "        document.getElementById(\"edit-color\").value = product.colors;\n" +
            "        document.getElementById(\"edit-form\").style.display = \"flex\";");
        }
else if(this.methodName.equals("onEditCancel")){
            String s5="";
            for(ASTNode i : statements)
            {if(i instanceof AssignmentStatement)
                s5+=((AssignmentStatement) i).generate(true);
                s5+="\n";
            }
    sb.append(
     s5+
            "        document.getElementById(\"edit-form\").style.display = \"none\";\n" +
            "        document.getElementById(\"edit-product-form\").reset();");
        }





        else {
            if (statements.isEmpty()) {
                return ""; // nothing inside the method
            }
            for (ASTNode stmt : statements) {
                if (stmt == null) continue;
                String generated="";
                if(stmt instanceof AssignmentStatement)
                {  generated = ((AssignmentStatement) stmt).generate(true);}
                else
                  generated = stmt.generate();
                if (generated == null) continue;
                generated = generated.trim();

                // If the child is a block/closing brace, keep it as-is.
                // Otherwise ensure it ends with a semicolon (common for statements)
                if (!generated.endsWith(";") && !generated.endsWith("}") && !generated.endsWith("{")) {
                    generated = generated + ";";
                }

                // indent each statement line with 4 spaces for readability
                String[] lines = generated.split("\\r?\\n");
                for (String line : lines) {
                    if (line.trim().isEmpty()) continue;
                    sb.append("    ").append(line).append("\n");
                }
            }
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MethodVoidBody)) return false;
        MethodVoidBody that = (MethodVoidBody) o;
        return Objects.equals(statements, that.statements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statements);
    }
}
