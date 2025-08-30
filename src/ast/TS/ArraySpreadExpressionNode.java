// ast/TS/ArraySpreadExpressionNode.java
package ast.TS;
import ast.ASTNode;

public class ArraySpreadExpressionNode implements ASTNode {
    private final ASTNode expression;
    public ArraySpreadExpressionNode(ASTNode expression) { this.expression = expression; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ArraySpreadExpression: [...expr]");
        expression.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() { return "[..." + expression.toString() + "]"; }

    @Override
    public String generate() { return "[..." + expression.generate() + "]"; }
}
