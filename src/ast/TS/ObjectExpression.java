package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ObjectExpression extends ClassBodyStatement {
    private String assignIdentifier; // nullable
    private List<String> keys;
    private List<ASTNode> values;

    public ObjectExpression(String assignIdentifier, List<String> keys, List<ASTNode> values) {
        super(null);
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
            if (values != null && i < values.size() && values.get(i) != null) {
                values.get(i).prettyPrint("");
            } else {
                System.out.println("<null>");
            }
        }
    }

    @Override
    public String toString() {
        return "ObjectExpression" + (assignIdentifier != null ? " assign " + assignIdentifier : "") +
                " with " + keys.size() + " properties";
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        // Use dynamic variable name
        sb.append(" { ");

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value;

            if (values != null && i < values.size() && values.get(i) != null) {
                value = values.get(i).generate();
            } else {
                // Provide default values if not explicitly parsed
                switch (key) {
                    case "price":
                        value = "0"; // keep numbers as-is
                        break;
                    default:
                        value = "''"; // wrap everything else in single quotes
                }
            }

            // Wrap value in quotes if it's not a number
            if (!value.matches("\\d+(\\.\\d+)?") && !value.startsWith("'") && !value.equals("null")) {
                value = "'" + value + "'";
            }

            sb.append(key).append(": ").append(value);

            if (i < keys.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append(" }");
        return sb.toString();
    }

}