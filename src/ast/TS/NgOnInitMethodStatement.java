package ast.TS;

import ast.ASTNode;

public class NgOnInitMethodStatement extends ClassBodyStatement {
    private String accessModifier;
    private MethodVoidBody body;

    public NgOnInitMethodStatement(String accessModifier, MethodVoidBody body) {
        super(body);
        this.accessModifier = accessModifier;
        this.body = body;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public MethodVoidBody getBody() {
        return body;
    }

    @Override
    public void prettyPrint(String indent) {
        super.prettyPrint(indent);
        if (accessModifier != null) {
            System.out.println(indent + "  Access: " + accessModifier);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ngOnInit() { ... }";
    }
}
