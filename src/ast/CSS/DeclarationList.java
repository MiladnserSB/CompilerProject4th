package ast.CSS;

import ast.ASTNode;
import java.util.List;

public class DeclarationList implements ASTNode {
    private List<Declaration> declarations;

    public DeclarationList(List<Declaration> declarations) {
        this.declarations = declarations;
    }

    public List<Declaration> getDeclarations() {
        return declarations;
    }

    public void setDeclarations(List<Declaration> declarations) {
        this.declarations = declarations;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "DeclarationList:");
        for (Declaration decl : declarations) {
            decl.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (Declaration decl : declarations) {
            sb.append("  ").append(decl.generate()).append("\n");
        }
        return sb.toString();
    }

}
