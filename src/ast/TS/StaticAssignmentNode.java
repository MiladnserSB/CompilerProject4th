// ast/TS/StaticAssignmentNode.java
package ast.TS;
import ast.ASTNode;

public class StaticAssignmentNode implements ASTNode {
    private final String identifier;
    private final ASTNode value;
    private final String type;

    public StaticAssignmentNode(String identifier, ASTNode value, String type) {
        this.identifier = identifier;
        this.value = value;
        this.type = type;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "StaticAssignment: " + identifier);
        value.prettyPrint(indent + "  value: ");
    }

    @Override
    public String toString() { return identifier + " = " + value.toString(); }

    @Override
    public String generate() {
        return type+ " " + identifier + " = " + value.generate() + ";";
    }
}
