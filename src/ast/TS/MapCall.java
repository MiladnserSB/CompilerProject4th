package ast.TS;

import ast.ASTNode;

public class MapCall implements ASTNode {
    private LeftMapFilterAssign left;  // Parameter for the map callback
    private RightMapFilterAssign right; // The transformation or condition

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

    @Override
    public String generate() {
        return "map(" + left.getParameter() + " => " +
                left.getExpression().generate() + " === " + right.getIdentifier() +
                " ? " + right.getIdentifier() + " : " + left.getParameter() + ")";
    }

}