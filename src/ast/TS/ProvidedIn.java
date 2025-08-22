package ast.TS;
import ast.ASTNode;
public class ProvidedIn implements ASTNode {
    private String providedIn;

    public ProvidedIn(String providedIn) {
        this.providedIn = providedIn;
    }

    public void setProvidedIn(String providedIn) {
        this.providedIn = providedIn;
    }

    public String getProvidedIn() {
        return providedIn;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Injectable Properties:");
        System.out.println(indent + "  providedIn: " + providedIn);
    }
    @Override
    public String generate() {
        // decorator بيتشال في JS، ممكن نسيبه كـ تعليق
        return "// providedIn: \"" + providedIn + "\"\n";
    }

}