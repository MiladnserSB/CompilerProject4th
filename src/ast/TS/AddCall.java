package ast.TS;

import ast.ASTNode;

public class AddCall implements ASTNode {
    private CrudBody crudBody;
    private String identifier;

    public AddCall(CrudBody crudBody, String identifier) {
        this.crudBody = crudBody;
        this.identifier = identifier;
    }

    public CrudBody getCrudBody() {
        return crudBody;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "AddCall:");
        crudBody.prettyPrint(indent + "  ");
        System.out.println(indent + "  Identifier: " + identifier);
    }

    @Override
    public String toString() {
        return "[... " + crudBody + ", " + identifier + "]";
    }
    @Override
    public String generate() {
        return "[..." + crudBody.generate() + ", " + identifier + "]";
    }

}
