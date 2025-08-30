// ast/TS/CrudNextCallNode.java
package ast.TS;
import ast.ASTNode;
import java.util.List;

public class CrudNextCallNode implements ASTNode {
    private final List<ASTNode> innerCalls; // e.g. addCall or edit/delete call
    public CrudNextCallNode(List<ASTNode> innerCalls) { this.innerCalls = innerCalls; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "CrudNextCall:");
        for (ASTNode n : innerCalls) n.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return "nextCall(...)";
    }

    @Override
    public String generate() {
        // Usually nextCall is parentheses containing an expression; keep generic
        return "(" + String.join(", ", innerCalls.stream().map(ASTNode::generate).toArray(String[]::new)) + ")";
    }
}
