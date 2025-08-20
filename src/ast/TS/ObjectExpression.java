package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ObjectExpression implements ASTNode {
    private String assignIdentifier; // nullable
    private List<String> keys;
    private List<ASTNode> values;

    public ObjectExpression(String assignIdentifier, List<String> keys, List<ASTNode> values) {
        this.assignIdentifier = assignIdentifier;
        this.keys = keys;
        this.values = values;
    }

    public String getAssignIdentifier() {
        return assignIdentifier;
    }

    public List<String> getKeys() {
        return keys;
    }

    public List<ASTNode> getValues() {
        return values;
    }

    @Override
    public void prettyPrint(String indent) {
        if (assignIdentifier != null) {
            System.out.println(indent + "Assign Identifier: " + assignIdentifier);
        }
        System.out.println(indent + "Object Properties:");
        for (int i = 0; i < keys.size(); i++) {
            System.out.print(indent + "  " + keys.get(i) + ": ");
            values.get(i).prettyPrint("");
        }
    }

    @Override
    public String toString() {
        return "ObjectExpression" + (assignIdentifier != null ? " assign " + assignIdentifier : "") +
                " with " + keys.size() + " properties";
    }
}