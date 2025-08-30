// ast/TS/LiteralNode.java
package ast.TS;
import ast.ASTNode;

public class LiteralNode implements ASTNode {
    private final String value; // raw text representation (e.g. "123", "'str'", "true")

    public LiteralNode(String value) { this.value = value; }

    public String getValue() { return value; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Literal: " + value);
    }

    @Override
    public String toString() { return value; }

    @Override
    public String generate() { return value; }
}
