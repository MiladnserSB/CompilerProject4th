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
        // Example: this.editMode = true;
        StringBuilder sb = new StringBuilder();
        sb.append("this.").append(leftIdentifier).append(" = ");

        // Handle dynamic values (numbers, strings, booleans)
        if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value) || "null".equalsIgnoreCase(value)) {
            sb.append(value);
        } else {
            try {
                Double.parseDouble(value); // number
                sb.append(value);
            } catch (NumberFormatException e) {
                // string literal
                sb.append("'").append(value.replaceAll("^['\"]|['\"]$", "")).append("'");
            }
        }

        sb.append(";\n");
        return sb.toString();
    }

}