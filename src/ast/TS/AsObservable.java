package ast.TS;

import ast.ASTNode;

public class AsObservable implements ASTNode {
    private final String variableName;
    private final String sourceIdentifier;
    private final MethodCall methodCall;

    public AsObservable(String variableName, String sourceIdentifier, MethodCall methodCall) {
        this.variableName = variableName;
        this.sourceIdentifier = sourceIdentifier;
        this.methodCall = methodCall;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "AsObservable:");
        System.out.println(indent + "  Variable: " + variableName + "$");
        System.out.println(indent + "  Source: this." + sourceIdentifier);
        if (methodCall != null) {
            methodCall.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        return variableName + "$ = this." + sourceIdentifier + "." + methodCall;
    }
}
