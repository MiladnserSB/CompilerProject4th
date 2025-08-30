package ast.HTML;

public class ScriptletOrSeaWs extends HtmlContentStatement {
    private final String content;
    private final boolean isScriptlet;

    public ScriptletOrSeaWs(String content, boolean isScriptlet) {
        super(null);
        this.content = content;
        this.isScriptlet = isScriptlet;
    }

    public String getContent() { return content; }
    public boolean isScriptlet() { return isScriptlet; }

    @Override
    public void prettyPrint(String indent) {
        String type = isScriptlet ? "Scriptlet" : "SeaWs";
        System.out.println(indent + type + ": " + content);
    }

    @Override
    public String generate() {
        if (isScriptlet) {
            // For innerHTML, script tags need special handling
            return "<!-- script content -->";
        }
        return content; // whitespace or line breaks
    }
}
