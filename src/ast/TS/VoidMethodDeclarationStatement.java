package ast.TS;

import ast.ASTNode;

public class VoidMethodDeclarationStatement extends ClassBodyStatement {
    private Signature signature;
    private Parameters parameters;
    private MethodVoidBody body;

    public VoidMethodDeclarationStatement(Signature signature, Parameters parameters, MethodVoidBody body) {
        super(signature);
        this.signature = signature;
        this.parameters = parameters;
        this.body = body;
    }

    public Signature getSignature() {
        return signature;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public MethodVoidBody getBody() {
        return body;
    }

    @Override
    public void prettyPrint(String indent) {
        super.prettyPrint(indent);
        if (parameters != null)
            parameters.prettyPrint(indent + "  ");
        body.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return super.toString() + signature.toString() + "(" +
                (parameters != null ? parameters.toString() : "") + ") void { ... }";
    }
}
