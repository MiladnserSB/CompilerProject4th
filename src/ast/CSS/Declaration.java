package ast.CSS;

import ast.ASTNode;
import java.util.List;

public class Declaration implements ASTNode {
    private String propertyName;
    private List<Value> values;

    public Declaration(String propertyName, List<Value> values) {
        this.propertyName = propertyName;
        this.values = values;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.print(indent + propertyName + ": ");
        for (Value value : values) {
            value.prettyPrint("");
        }
        System.out.println(";");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(propertyName).append(": ");
        for (int i = 0; i < values.size(); i++) {
            sb.append(values.get(i).generate());
            if (i < values.size() - 1) {
                sb.append(" "); // space-separated values
            }
        }
        sb.append(";");
        return sb.toString();
    }
}
