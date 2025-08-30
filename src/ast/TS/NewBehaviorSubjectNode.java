// ast/TS/NewBehaviorSubjectNode.java
package ast.TS;
import ast.ASTNode;

public class NewBehaviorSubjectNode implements ASTNode {
    private final ASTNode argument;
    public NewBehaviorSubjectNode(ASTNode argument) { this.argument = argument; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "NewBehaviorSubject:");
        argument.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() { return "new BehaviorSubject(" + argument.toString() + ")"; }

    @Override
    public String generate() {
        // For JS output, convert RxJS BehaviorSubject to simple array-wrapped emulation or keep as placeholder
        return "new BehaviorSubject(" + argument.generate() + ")";
    }
}
