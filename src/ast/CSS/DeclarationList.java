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
        for (int i = 0; i < declarations.size(); i++) {
            sb.append(declarations.get(i).generate());
            if (i < declarations.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
