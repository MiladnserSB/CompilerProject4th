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

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        // Left-hand side (with optional "this.")
        sb.append("this.");
        sb.append(left);

        if (right != null && methodCall != null) {
            // Case: assignment (IDENTIFIER = this.IDENTIFIER.methodCall)
            sb.append(" = ").append("this.").append(right).append(".").append(methodCall.generate());
        } else if (methodCall != null) {
            // Case: method call (this.IDENTIFIER.methodCall)
            sb.append(".").append(methodCall.generate());
        }

        sb.append(";\n");
        return sb.toString();
    }

}