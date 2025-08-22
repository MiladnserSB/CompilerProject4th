package ast.TS;

import ast.ASTNode;

public class VoidMethodDeclarationStatement extends ClassBodyStatement {
    private Signature signature;
    private Parameters parameters; // nullable
    private MethodVoidBody methodBody;

    public VoidMethodDeclarationStatement(Signature signature, Parameters parameters, MethodVoidBody methodBody) {
        super(null);
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

    public MethodVoidBody getMethodBody() {
        return methodBody;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Void Method Declaration:");
        if (signature != null) {
            signature.prettyPrint(indent + "  ");
        }
        if (parameters != null) {
            parameters.prettyPrint(indent + "  ");
        } else {
            System.out.println(indent + "  <No parameters>");
        }
        if (methodBody != null) {
            methodBody.prettyPrint(indent + "  ");
        } else {
            System.out.println(indent + "  <Empty method body>");
        }
    }

    @Override
    public String toString() {
        return "VoidMethodDeclarationStatement{" +
                "signature=" + signature +
                ", parameters=" + parameters +
                ", methodBody=" + methodBody +
                '}';
    }
}