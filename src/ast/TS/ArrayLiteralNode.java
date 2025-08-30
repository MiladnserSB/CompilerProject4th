// ast/TS/ArrayLiteralNode.java
package ast.TS;
import ast.ASTNode;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLiteralNode implements ASTNode {
    private final List<ASTNode> elements;

    public ArrayLiteralNode(List<ASTNode> elements) { this.elements = elements; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ArrayLiteral:");
        for (ASTNode el : elements) el.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return "[" + elements.stream().map(ASTNode::toString).collect(Collectors.joining(", ")) + "]";
    }

    @Override
    public String generate() {
        return "[" + elements.stream().map(ASTNode::generate).collect(Collectors.joining(", ")) + "]";
    }
}
