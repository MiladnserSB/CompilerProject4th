// ast/TS/ObjectLiteralNode.java
package ast.TS;

import ast.ASTNode;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectLiteralNode implements ASTNode {
    private final List<ASTNode> properties;

    public ObjectLiteralNode(List<ASTNode> properties) {
        this.properties = properties;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ObjectLiteral {");
        String childIndent = indent + "  ";
        for (ASTNode p : properties) {
            p.prettyPrint(childIndent);
        }
        System.out.println(indent + "}");
    }

    @Override
    public String toString() {
        return generate();
    }

    @Override
    public String generate() {
        if (properties.isEmpty()) return "{}";
        return "{ " +
                properties.stream()
                        .map(ASTNode::generate)
                        .collect(Collectors.joining(", ")) +
                " }";
    }
}
