package ast.TS;

import ast.ASTNode;

public class FilterCall implements ASTNode {
    private LeftMapFilterAssign left; // Parameter for the filter callback
    private RightMapFilterAssign right; // The condition to check against

    public FilterCall(LeftMapFilterAssign left, RightMapFilterAssign right) {
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
        System.out.println(indent + "Filter:");
        left.prettyPrint(indent + "  ");
        right.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return "filter(" + left + " !== " + right + ")";
    }

    @Override
    public String generate() {
        return "filter(" + left.getParameter() + " => " +
                left.getExpression().generate() + " !== " + right.getIdentifier() + ")";
    }

}