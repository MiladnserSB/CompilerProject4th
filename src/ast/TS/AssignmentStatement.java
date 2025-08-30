// ast/TS/AssignmentStatement.java
package ast.TS;
import ast.ASTNode;

public class AssignmentStatement implements ASTNode {
    private final ASTNode left;
    private final ASTNode right;
    private final boolean dollarSuffix; // whether a trailing $ token was present in grammar (optional)

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

    @Override
    public String generate() {
//        System.out.println(left);
//        System.out.println(right);
//        // If dollarSuffix true, e.g. "foo$ = expr" we simply keep same in name usage (left.generate includes $ if present)
//        return left.generate() + " = " + right.generate() + ";";
        return "";
    }
}
