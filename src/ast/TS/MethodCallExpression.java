// ast/TS/MethodCallExpression.java
package ast.TS;
import ast.ASTNode;
import java.util.List;
import java.util.stream.Collectors;

public class MethodCallExpression implements ASTNode {
    private final ASTNode caller;  // can be IdentifierNode, ThisPropertyNode, MemberAccessExpression, or null for direct call
    private final String methodName; // name of method being invoked (if caller is non-null and method invoked via dot, this is the identifier)
    private final List<ASTNode> arguments;

    public MethodCallExpression(ASTNode caller, String methodName, List<ASTNode> arguments) {
        this.caller = caller;
        this.methodName = methodName;
        this.arguments = arguments;
    }

    public ASTNode getCaller() { return caller; }
    public String getMethodName() { return methodName; }
    public List<ASTNode> getArguments() { return arguments; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "MethodCall: " + (caller != null ? caller.toString() + "." : "") + methodName);
        if (arguments != null && !arguments.isEmpty()) {
            System.out.println(indent + "  Args:");
            for (ASTNode a : arguments) a.prettyPrint(indent + "    ");
        }
    }

    @Override
    public String toString() {
        return (caller != null ? caller.toString() + "." : "") + methodName + "(...)";
    }

    @Override
    public String generate() {
        String args = (arguments == null || arguments.isEmpty()) ? "" :
                arguments.stream().map(ASTNode::generate).collect(Collectors.joining(", "));
        if (caller == null) {
            return methodName + "(" + args + ")";
        } else {
            return caller.generate() + "." + methodName + "(" + args + ")";
        }
    }
}
