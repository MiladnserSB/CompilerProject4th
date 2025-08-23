package ast.TS;

import ast.ASTNode;

public class EditDeleteCall implements ASTNode {
    private CrudBody crudBody; // e.g., 'this.productsSubject.value'
    private ASTNode operation; // MapCall or FilterCall

    public EditDeleteCall(CrudBody crudBody, ASTNode operation) {
        this.crudBody = crudBody;
        this.operation = operation;
    }

    public CrudBody getCrudBody() {
        return crudBody;
    }

    public ASTNode getOperation() {
        return operation;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "EditDeleteCall:");
        crudBody.prettyPrint(indent + "  ");
        if (operation != null) operation.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return crudBody + "." + operation;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(crudBody.generate());
        if (operation != null) {
            sb.append(".").append(operation.generate());
        }
        return sb.toString();
    }

}