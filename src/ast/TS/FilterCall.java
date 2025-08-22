package ast.TS;

import ast.ASTNode;

public class FilterCall implements ASTNode {
    private LeftMapFilterAssign left;
    private RightMapFilterAssign right;

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
        return "filter(item => " + left.generate() + " !== " + right.generate() + ")";
    }

}
