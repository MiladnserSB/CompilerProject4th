// ast/TS/MethodCallStatementNode.java
package ast.TS;
import ast.ASTNode;

public class MethodCallStatementNode implements ASTNode {
    private final MethodCallExpression callExpr;

    public MethodCallStatementNode(MethodCallExpression callExpr) { this.callExpr = callExpr; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "MethodCallStatement:");
        callExpr.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() { return callExpr.toString(); }

    @Override
    public String generate() {
//        return callExpr.generate() + ";";
    return "";
    }
}
