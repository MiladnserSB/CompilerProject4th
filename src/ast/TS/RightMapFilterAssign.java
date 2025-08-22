package ast.TS;

import ast.ASTNode;

public class RightMapFilterAssign implements ASTNode {
    private final String identifier; // for the IDENTIFIER case
    private final MapFilterIdentifier left;  // left side of ternary
    private final MapFilterIdentifier right; // right side of ternary
    private final boolean isConditional;

    // Constructor for IDENTIFIER form
    public RightMapFilterAssign(String identifier) {
        this.identifier = identifier;
        this.left = null;
        this.right = null;
        this.isConditional = false;
    }

    // Constructor for conditional form
    public RightMapFilterAssign(MapFilterIdentifier left, MapFilterIdentifier right) {
        this.identifier = null;
        this.left = left;
        this.right = right;
        this.isConditional = true;
    }

    public boolean isConditional() {
        return isConditional;
    }

    public String getIdentifier() {
        return identifier;
    }

    public MapFilterIdentifier getLeft() {
        return left;
    }

    public MapFilterIdentifier getRight() {
        return right;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "RightMapFilterAssign:");
        if (isConditional) {
            System.out.println(indent + "  Conditional Expression:");
            System.out.println(indent + "    Left:");
            left.prettyPrint(indent + "      ");
            System.out.println(indent + "    Right:");
            right.prettyPrint(indent + "      ");
        } else {
            System.out.println(indent + "  Identifier: " + identifier);
        }
    }

    @Override
    public String toString() {
        if (isConditional) {
            return left.toString() + " ? " + right.toString();
        }
        return identifier;
    }
    @Override
    public String generate() {
        if (isConditional) {
            // Convert Angular's filter conditional to JS
            return left.generate() + " === " + right.generate();
        }
        return identifier;
    }


}
