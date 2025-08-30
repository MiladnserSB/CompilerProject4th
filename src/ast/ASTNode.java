package ast;

public interface ASTNode {
    void prettyPrint(String indent);
    String generate(); // only for code generation (no file writing)
}
