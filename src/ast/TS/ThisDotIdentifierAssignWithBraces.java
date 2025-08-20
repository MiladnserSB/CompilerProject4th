package ast.TS;

public class ThisDotIdentifierAssignWithBraces extends MethodAssignment {
    private String leftIdentifier;
    private String spreadIdentifier;

    public ThisDotIdentifierAssignWithBraces(String leftIdentifier, String spreadIdentifier) {
        this.leftIdentifier = leftIdentifier;
        this.spreadIdentifier = spreadIdentifier;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ThisDotIdentifierAssignWithBraces:");
        System.out.println(indent + "  this." + leftIdentifier + " = { ... " + spreadIdentifier + " }");
    }

    @Override
    public String toString() {
        return "this." + leftIdentifier + " = { ... " + spreadIdentifier + " }";
    }
}
