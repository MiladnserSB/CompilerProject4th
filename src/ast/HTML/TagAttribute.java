package ast.HTML;

import ast.ASTNode;

public class TagAttribute implements ASTNode {
    private final String value;
    private final boolean isMethodCall;

    public TagAttribute(String value, boolean isMethodCall) {
        this.value = value;
        this.isMethodCall = isMethodCall;
    }

    public String getValue() { return value; }

    public boolean isMethodCall() { return isMethodCall; }

    @Override
    public void prettyPrint(String indent) {
        if (isMethodCall) {
            System.out.println(indent + "Method call value: " + value);
        } else {
            System.out.println(indent + "Tag Attribute: " + value);
        }
    }

    @Override
    public String generate() {
        if (isMethodCall) {
            return value.replaceAll("[()]", ""); // inline JS-friendly
        }
        return value;
    }
}
