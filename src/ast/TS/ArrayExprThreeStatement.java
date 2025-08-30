package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ArrayExprThreeStatement extends ClassBodyStatement {

    private Signature signature;
    private String observableType;
    private List<ArrayBody1> elements;

    public ArrayExprThreeStatement(Signature signature, String observableType, List<ArrayBody1> elements) {
        super(null);
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

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(signature.generate()).append(" = JSON.parse(localStorage.getItem('products')) ||[\n");

        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i).generate());
            if (i < elements.size() - 1) {
                sb.append(", ");
            }
            sb.append("\n");
        }

        sb.append("];\n");
        return sb.toString();
    }
}