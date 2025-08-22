package ast.CSS;

import ast.ASTNode;
import java.util.List;

public class Declaration implements ASTNode {
    private String property_name;
    private List<Value> values;

    public Declaration(String property, List<Value> values) {
        this.property_name = property;
        this.values = values;
    }

    public String getProperty_name() {
        return property_name;
    }

    public void setProperty_name(String property_name) {
        this.property_name = property_name;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public String getProperty() {
        return property_name;
    }

    public List<Value> getValues() {
        return values;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.print(indent + property_name + ": ");
        for (Value value : values) {
            value.prettyPrint("");
        }
        System.out.println();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(property_name).append(": ");
        for (int i = 0; i < values.size(); i++) {
            sb.append(values.get(i).generate());
            if (i < values.size() - 1) {
                sb.append(" ");
            }
        }
        sb.append(";");
        return sb.toString();
    }
}
