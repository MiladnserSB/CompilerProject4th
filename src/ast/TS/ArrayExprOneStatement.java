package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ArrayExprOneStatement extends ClassBodyStatement {
    private Signature signature;
    private List<ASTNode> elements;

    public ArrayExprOneStatement(Signature signature, List<ASTNode> elements) {
        super(signature);  // or pass a wrapper ASTNode if needed
        this.signature = signature;
        this.elements = elements;
    }

    public Signature getSignature() {
        return signature;
    }

    public List<ASTNode> getElements() {
        return elements;
    }

    @Override
    public void prettyPrint(String indent) {
        super.prettyPrint(indent);
        System.out.println(indent + "  Elements:");
        for (ASTNode el : elements) {
            el.prettyPrint(indent + "    ");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " = [" + elements + "]";
    }
}
