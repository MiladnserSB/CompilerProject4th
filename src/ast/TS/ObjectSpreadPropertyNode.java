// ast/TS/ObjectSpreadPropertyNode.java
package ast.TS;
import ast.ASTNode;

public class ObjectSpreadPropertyNode implements ASTNode {
    private final ASTNode expression;

    public ObjectSpreadPropertyNode(ASTNode expression) { this.expression = expression; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ObjectSpreadProperty:");
        expression.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() { return "..." + expression.toString(); }

    @Override
    public String generate() { return "..." + expression.generate(); }
}
