package ast.TS;

public class StaticAssignment extends MethodAssignment {
    private String identifier;
    private String spreadThisIdentifier;
    private String dateIdentifier;
    private MethodCall methodCall;

    public StaticAssignment(String identifier, String spreadThisIdentifier, String dateIdentifier, MethodCall methodCall) {
        this.identifier = identifier;
        this.spreadThisIdentifier = spreadThisIdentifier;
        this.dateIdentifier = dateIdentifier;
        this.methodCall = methodCall;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "StaticAssignment:");
        System.out.println(indent + "  static " + identifier + " = { ... this." + spreadThisIdentifier +
                ", " + dateIdentifier + ": Date." + methodCall + " }");
    }

    @Override
    public String toString() {
        return "static " + identifier + " = { ... this." + spreadThisIdentifier +
                ", " + dateIdentifier + ": Date." + methodCall + " }";
    }
    @Override
    public String generate() {
        return "static " + identifier + " = { ...this." + spreadThisIdentifier +
                ", " + dateIdentifier + ": Date." + methodCall.generate() + " };\n";
    }

}
