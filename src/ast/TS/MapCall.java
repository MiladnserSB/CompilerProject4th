package ast.TS;

import ast.ASTNode;

public class MapCall implements ASTNode {
    private LeftMapFilterAssign left;
    private RightMapFilterAssign right;

    public MapCall(LeftMapFilterAssign left, RightMapFilterAssign right) {
        this.left = left;
        this.right = right;
    }

    public LeftMapFilterAssign getLeft() {
        return left;
    }

    public RightMapFilterAssign getRight() {
        return right;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Map:");
        left.prettyPrint(indent + "  ");
        right.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return "map(" + left + " === " + right + ")";
    }
}
