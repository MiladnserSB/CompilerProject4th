// ast/TS/ObjectPropertyNode.java
package ast.TS;
import ast.ASTNode;

public class ObjectPropertyNode implements ASTNode {
    private final String key;
    private final ASTNode value;

    public ObjectPropertyNode(String key, ASTNode value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ObjectProperty: " + key);
        value.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() { return key + ": " + value.toString(); }

    @Override
    public String generate() {
        return key + ": " + value.generate();
    }
}
