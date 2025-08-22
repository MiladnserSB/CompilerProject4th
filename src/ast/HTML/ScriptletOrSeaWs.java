package ast.HTML;

public class ScriptletOrSeaWs extends HtmlContentStatement {
    private final String content;
    private final boolean isScriptlet;

    public ScriptletOrSeaWs(String content, boolean isScriptlet) {
        super(null);
        this.content = content;
        this.isScriptlet = isScriptlet;
    }

    public String getContent() {
        return content;
    }

    public boolean isScriptlet() {
        return isScriptlet;
    }

    @Override
    public void prettyPrint(String indent) {
        String type = isScriptlet ? "Scriptlet" : "SeaWs";
        System.out.println(indent + type + ": " + content);
    }

    @Override
    public String generate() {
        if (isScriptlet) {
            // Drop JSP/Angular scriptlet in pure HTML
            return "";
        }
        return content != null ? content : "";
    }
}
