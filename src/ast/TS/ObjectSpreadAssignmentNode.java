// ast/TS/ObjectSpreadAssignmentNode.java
package ast.TS;
import ast.ASTNode;

public class ObjectSpreadAssignmentNode implements ASTNode {
    private final ASTNode target;
    private final String spreadIdentifier; // the identifier after ...

    public ObjectSpreadAssignmentNode(ASTNode target, String spreadIdentifier) {
        this.target = target;
        this.spreadIdentifier = spreadIdentifier;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ObjectSpreadAssignment:");
        target.prettyPrint(indent + "  target: ");
        System.out.println(indent + "  spread: ... " + spreadIdentifier);
    }

    @Override
    public String toString() { return target.toString() + " = { ..." + spreadIdentifier + " }"; }

    @Override
    public String generate() {
        // generate an object merge pattern in JS
//        return target.generate() + " = { ..." + spreadIdentifier + " };";
    return "";
    }
}
