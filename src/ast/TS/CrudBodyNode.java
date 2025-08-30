// ast/TS/CrudBodyNode.java
package ast.TS;
import ast.ASTNode;

public class CrudBodyNode implements ASTNode {
    private final ASTNode crudExpression; // could be MemberAccess or method call etc (this.identifier.next etc)
    public CrudBodyNode(ASTNode crudExpression) { this.crudExpression = crudExpression; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "CrudBody:");
        crudExpression.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() { return crudExpression.toString(); }

    @Override
    public String generate() { return crudExpression.generate(); } // caller will add trailing ; where needed
}
