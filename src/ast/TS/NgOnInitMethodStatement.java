package ast.TS;

import ast.ASTNode;

public class NgOnInitMethodStatement extends ClassBodyStatement {
    private String accessModifier; // public/private/protected
    private boolean hasVoidType;   // whether ": void" is present
    private MethodVoidBody body;

    public NgOnInitMethodStatement(String accessModifier, boolean hasVoidType, MethodVoidBody body) {
        super(body);
        this.accessModifier = accessModifier;
        this.hasVoidType = hasVoidType;
        this.body = body;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public boolean hasVoidType() {
        return hasVoidType;
    }

    public MethodVoidBody getBody() {
        return body;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "NgOnInit Method:");
        if (accessModifier != null) {
            System.out.println(indent + "  Access: " + accessModifier);
        }
        System.out.println(indent + "  Return Type: " + (hasVoidType ? "void" : "implicit void"));
        if (body != null) body.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return (accessModifier != null ? accessModifier + " " : "") +
                "ngOnInit() " + (hasVoidType ? ": void " : "") +
                "{ ... }";
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("ngOnInit() {\n");
        if (body != null) {
            sb.append(body.generate());
        }
        sb.append("}\n");
        return sb.toString();
    }

}
