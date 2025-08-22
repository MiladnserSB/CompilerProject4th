package ast.TS;

import ast.ASTNode;

public class Selector implements ASTNode {
    private String value;

    public Selector(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Selector: " + value);
    }

    @Override
    public String toString() {
        return "Selector='" + value + "'";
    }
    @Override
    public String generate() {
        // في TS بتستخدم @Component({ selector: '...' })
        // في JS نخليها مجرد تعليق
        return "// selector: '" + value + "'\n";
    }

}

