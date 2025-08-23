package ast.TS;

import ast.ASTNode;

public class TypedMethodDeclarationStatement extends ClassBodyStatement {
    private Signature signature;
    private Parameters parameters;
    private MethodBody methodBody;

    public TypedMethodDeclarationStatement(Signature signature, Parameters parameters, MethodBody methodBody) {
        super(signature);
        this.signature = signature;
        this.parameters = parameters;
        this.methodBody = methodBody;
    }

    public Signature getSignature() {
        return signature;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public MethodBody getMethodBody() {
        return methodBody;
    }

    @Override
    public void prettyPrint(String indent) {
        super.prettyPrint(indent);
        if (parameters != null) parameters.prettyPrint(indent + "  ");
        methodBody.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return super.toString() + signature + "(" +
                (parameters != null ? parameters.toString() : "") + ")";
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(signature.getName()).append("(");
        if (parameters != null) {
            sb.append(parameters.generate());
        }
        sb.append(") {\n");
        if (methodBody != null) {
            sb.append(methodBody.generate());
        }
        sb.append("}\n");
        return sb.toString();
    }
}