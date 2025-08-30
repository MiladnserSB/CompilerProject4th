// ast/TS/MemberAccessExpression.java
package ast.TS;
import ast.ASTNode;

public class MemberAccessExpression implements ASTNode {
    private final ASTNode target; // expression before the dot
    private final String member;  // identifier after dot

    public MemberAccessExpression(ASTNode target, String member) {
        this.target = target;
        this.member = member;
    }

    public ASTNode getTarget() { return target; }
    public String getMember() { return member; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "MemberAccess:");
        target.prettyPrint(indent + "  ");
        System.out.println(indent + "  member: " + member);
    }

    @Override
    public String toString() { return target.toString() + "." + member; }

    @Override
    public String generate() { return target.generate() + "." + member; }
}
