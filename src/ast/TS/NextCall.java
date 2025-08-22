package ast.TS;

import ast.ASTNode;

public class NextCall implements ASTNode {
    private ASTNode call;

    public NextCall(ASTNode call) {
        this.call = call;
    }

    public ASTNode getCall() {
        return call;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "NextCall:");
        if (call != null) call.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return "NextCall(" + call + ")";
    }
    @Override
    public String generate() {
        return "next(" + (call != null ? call.generate() : "") + ")";
    }

}
