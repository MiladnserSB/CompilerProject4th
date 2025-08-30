// ast/TS/AssignmentStatement.java
package ast.TS;
import ast.ASTNode;

public class AssignmentStatement implements ASTNode {
    private final ASTNode left;
    private final ASTNode right;
    private final boolean dollarSuffix; // whether a trailing $ token was present in grammar (optional)
    public boolean isVar;
    public AssignmentStatement(ASTNode left, ASTNode right, boolean dollarSuffix) {
        this.left = left;
        this.right = right;
        this.dollarSuffix = dollarSuffix;
    }

    public ASTNode getLeft() { return left; }
    public ASTNode getRight() { return right; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Assignment:");
        left.prettyPrint(indent + "  left: ");
        right.prettyPrint(indent + "  right: ");
    }

    @Override
    public String toString() { return left.toString() + " = " + right.toString(); }

    public String generate(boolean isVar) {
        this.isVar = isVar;
        return this.generate();
    }

    @Override
    public String generate() {
//        System.out.println(left);
//        System.out.println(right);
        if(isVar) {
            if (this.right.generate().contains("...id")) {
                return left.generate().replace("this.", "") + " = " + "product" + ";";
            }
            {
                return left.generate().replace("this.", "") + " = " + right.generate() + ";";
            }
        }
        return "const updatedProduct = { "+
         "id: parseInt(document.getElementById(\"edit-id\").value), \n" +
                "name: document.getElementById(\"edit-name\").value, \n" +
                "image: document.getElementById(\"edit-image\").value,\n" +
                "price: parseFloat(document.getElementById(\"edit-price\").value), \n" +
                "colors: document.getElementById(\"edit-color\").value, \n" +
                "};";
//        return "";
    }
}
