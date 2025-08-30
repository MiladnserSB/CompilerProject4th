package ast.TS;

import ast.ASTNode;

public class MethodBody implements ASTNode {
    private boolean isThisAccessed;
    private String identifier;
    private ASTNode valueNode;
    private boolean hasDotValue;

    public MethodBody(boolean isThisAccessed, String identifier, ASTNode valueNode, boolean hasDotValue) {
        this.isThisAccessed = isThisAccessed;
        this.identifier = identifier;
        this.valueNode = valueNode;
        this.hasDotValue = hasDotValue;
    }

    public boolean isThisAccessed() {
        return isThisAccessed;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ASTNode getValueNode() {
        return valueNode;
    }

    public boolean hasDotValue() {
        return hasDotValue;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Return Statement:");
        if (isThisAccessed) {
            System.out.println(indent + "  Accessing this.");
        }
        if (identifier != null) {
            System.out.println(indent + "  Identifier: " + identifier);
        } else if (valueNode != null) {
            System.out.println(indent + "  Value Node:");
            valueNode.prettyPrint(indent + "    ");
        }
        if (hasDotValue) {
            System.out.println(indent + "  Has dot value");
        }
    }

    @Override
    public String toString() {
        return "Return " + (isThisAccessed ? "this." : "") +
                (identifier != null ? identifier : valueNode) +
                (hasDotValue ? ".VALUE" : "");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        if (identifier != null && "raw".equals(identifier) && valueNode != null) {
            // Special case: directly dump JS/HTML from valueNode
            sb.append(valueNode.generate());
            return sb.toString();
        }

        sb.append("return ");
        if (isThisAccessed) sb.append("this.");
        if (identifier != null) {
            sb.append(identifier);
        } else if (valueNode != null) {
            sb.append(valueNode.generate());
        }
        sb.append(";");
        return sb.toString();
    }


}