package ast.TS;

import ast.ASTNode;

public class VoidMethodDeclarationStatement extends ClassBodyStatement {
    private Signature signature;
    private Parameters parameters;
    private MethodVoidBody methodBody;  // <-- more general, not only MethodVoidBody

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

    public ASTNode getMethodBody() {
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
            methodBody.prettyPrint(indent + "  ");  // <-- works for ObjectLiteralNode or MethodVoidBody
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

    @Override
    public String generate() {

        StringBuilder sb = new StringBuilder();
        String methodName = signature.getName();
        sb.append("function ");
        sb.append(methodName).append("(");
        if(methodName.equals("onEditSave"))
        {
            sb.append("e");
        }
        else{
        if(parameters != null){
            sb.append(parameters.generate());
        }
        }
        sb.append(") {\n");


            if (methodBody != null) {
                sb.append(methodBody.generate(methodName));
            }


        sb.append("}\n");
        return sb.toString();
    }

}