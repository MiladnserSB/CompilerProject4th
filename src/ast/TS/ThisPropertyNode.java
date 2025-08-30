// ast/TS/ThisPropertyNode.java
package ast.TS;
import ast.ASTNode;

public class ThisPropertyNode implements ASTNode {
    private final String property; // identifier after this.

    public ThisPropertyNode(String property) { this.property = property; }
    public String getProperty() { return property; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ThisProperty: this." + property);
    }

    @Override
    public String toString() { return "this." + property; }

    @Override
    public String generate() { return "this." + property; }
}
