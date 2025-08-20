package ast.TS;

public class IdentifierAssignment extends MethodAssignment {
    private String left;
    private String right;
    private MethodCall methodCall; // optional

    public IdentifierAssignment(String left, String right, MethodCall methodCall) {
        this.left = left;
        this.right = right;
        this.methodCall = methodCall;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "IdentifierAssignment:");
        System.out.println(indent + "  Left: " + left);
        System.out.println(indent + "  Right: " + right + (methodCall != null ? "." + methodCall : ""));
    }

    @Override
    public String toString() {
        return left + " = " + right + (methodCall != null ? "." + methodCall : "");
    }
}
