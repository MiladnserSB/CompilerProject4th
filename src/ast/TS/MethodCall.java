package ast.TS;

import ast.ASTNode;

public class MethodCall implements ASTNode {
    private String methodName;
    private String argument; // can be IDENTIFIER, "this.IDENTIFIER", or ["string"]

    public MethodCall(String methodName, String argument) {
        this.methodName = methodName;
        this.argument = argument;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getArgument() {
        return argument;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "MethodCall:");
        System.out.println(indent + "  Method: " + methodName);
        if (argument != null) {
            System.out.println(indent + "  Argument: " + argument);
        }
    }

    @Override
    public String toString() {
        return methodName + "(" + (argument != null ? argument : "") + ")";
    }

    @Override
    public String generate() {
        // Handle specific Angular method conversions
        if ("asObservable".equals(methodName)) {
            // Remove asObservable() call in JavaScript
            return "";
        } else if ("next".equals(methodName)) {
            // Convert BehaviorSubject.next() to direct assignment
            return argument != null ? " = " + argument : "";
        } else if ("navigate".equals(methodName)) {
            // Convert router.navigate() to window.location change
            return "window.location.hash = " + argument + ";";
        }

        // Regular method call
        return methodName + "(" + (argument != null ? argument : "") + ")";
    }
}