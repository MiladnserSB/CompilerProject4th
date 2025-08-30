// ast/TS/IdentifierNode.java
package ast.TS;
import ast.ASTNode;

public class IdentifierNode implements ASTNode {
    private final String name;
    private final String type; // Optional type, can be null

    public IdentifierNode(String name) {
        this(name, null);
    }

    public IdentifierNode(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public boolean hasType() { return type != null; }

    @Override
    public void prettyPrint(String indent) {
        if (type != null) {
            System.out.println(indent + "Identifier: " + name + " : " + type);
        } else {
            System.out.println(indent + "Identifier: " + name);
        }
    }

    @Override
    public String toString() {
        return type != null ? name + " : " + type : name;
    }

    @Override
    public String generate() {
        if(this.type!=null)
        return type+" "+ name;
        else return name;
            // Type information is typically not included in generated code
    }
}