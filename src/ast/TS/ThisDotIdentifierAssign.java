package ast.TS;

public class ThisDotIdentifierAssign extends MethodAssignment {
    private String leftIdentifier;
    private String rightIdentifier1;
    private String rightIdentifier2;

    public ThisDotIdentifierAssign(String leftIdentifier, String rightIdentifier1, String rightIdentifier2) {
        this.leftIdentifier = leftIdentifier;
        this.rightIdentifier1 = rightIdentifier1;
        this.rightIdentifier2 = rightIdentifier2;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ThisDotIdentifierAssign:");
        System.out.println(indent + "  " + "this." + leftIdentifier + "$ = this." + rightIdentifier1 + "." + rightIdentifier2 + "$");
    }

    @Override
    public String toString() {
        return "this." + leftIdentifier + "$ = this." + rightIdentifier1 + "." + rightIdentifier2 + "$";
    }
    @Override
    public String generate() {
        return "this." + leftIdentifier + " = this." + rightIdentifier1 + "." + rightIdentifier2 + ";\n";
    }

}
