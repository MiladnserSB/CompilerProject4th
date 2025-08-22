package ast.TS;

public class ThisDotIdentifierAssignValues extends MethodAssignment {
    private String leftIdentifier;
    private String value;

    public ThisDotIdentifierAssignValues(String leftIdentifier, String value) {
        this.leftIdentifier = leftIdentifier;
        this.value = value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ThisDotIdentifierAssignValues:");
        System.out.println(indent + "  this." + leftIdentifier + " = " + value);
    }

    @Override
    public String toString() {
        return "this." + leftIdentifier + " = " + value;
    }
    @Override
    public String generate() {
        return "this." + leftIdentifier + " = " + value + ";\n";
    }

}
