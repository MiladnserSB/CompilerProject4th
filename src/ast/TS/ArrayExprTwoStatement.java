package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ArrayExprTwoStatement extends ClassBodyStatement {
    private Signature signature;
    private String type;
    private List<ASTNode> arrayElements;

    public ArrayExprTwoStatement(Signature signature, String type, List<ASTNode> arrayElements) {
        super(signature);
        this.signature = signature;
        this.type = type;
        this.arrayElements = arrayElements;
    }

    public Signature getSignature() {
        return signature;
    }

    public String getType() {
        return type;
    }

    public List<ASTNode> getArrayElements() {
        return arrayElements;
    }

    @Override
    public void prettyPrint(String indent) {
        super.prettyPrint(indent);
        System.out.println(indent + "  Type: " + type + "[]");
        System.out.println(indent + "  Elements:");
        for (ASTNode node : arrayElements) {
            node.prettyPrint(indent + "    ");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ": " + type + "[] = " + arrayElements;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(signature.generate()).append(" = [");

        for (int i = 0; i < arrayElements.size(); i++) {
            sb.append(arrayElements.get(i).generate());
            if (i < arrayElements.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("];\n");
        return sb.toString();
    }
}