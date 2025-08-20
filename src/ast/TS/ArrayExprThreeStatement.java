package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ArrayExprThreeStatement implements ASTNode {

    private Signature signature;
    private String observableType;
    private List<ArrayBody1> elements;

    public ArrayExprThreeStatement(Signature signature, String observableType, List<ArrayBody1> elements) {
        this.signature = signature;
        this.observableType = observableType;
        this.elements = elements;
    }

    public Signature getSignature() {
        return signature;
    }

    public String getObservableType() {
        return observableType;
    }

    public List<ArrayBody1> getElements() {
        return elements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ArrayExprThreeStatement:");
        signature.prettyPrint(indent + "  ");
        System.out.println(indent + "  Observable Type: " + observableType);
        System.out.println(indent + "  Elements:");
        for (ArrayBody1 elem : elements) {
            elem.prettyPrint(indent + "    ");
        }
    }

    @Override
    public String toString() {
        return signature.toString() + " = new BehaviorSubject" + observableType + "(...)";
    }
}