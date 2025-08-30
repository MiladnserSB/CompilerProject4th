package ast.TS;

import ast.ASTNode;

public class CrudBodyRule implements ASTNode {
    private String crudExpression;
    private MethodCall nextCall;

    public CrudBodyRule(String crudExpression, MethodCall nextCall) {
        this.crudExpression = crudExpression;
        this.nextCall = nextCall;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "CrudBodyRule:");
        System.out.println(indent + "  Crud: " + crudExpression);
        System.out.println(indent + "  Next: " + nextCall);
    }

    @Override
    public String toString() {
        return crudExpression + "." + nextCall;
    }
    @Override
    public String generate() {
        return crudExpression.replace(".next", "") + " = " + nextCall.generate();
    }

}
