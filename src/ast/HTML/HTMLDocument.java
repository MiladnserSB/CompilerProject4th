package ast.HTML;

import ast.ASTNode;
import java.util.List;

public class HTMLDocument implements ASTNode {
    private final List<ASTNode> scriptletOrSeaWs;
    private final String xml;
    private final String dtd;
    private final List<ASTNode> htmlElements;

    public HTMLDocument(List<ASTNode> scriptletOrSeaWs, String xml, String dtd, List<ASTNode> htmlElements) {
        this.scriptletOrSeaWs = scriptletOrSeaWs != null ? scriptletOrSeaWs : List.of();
        this.xml = xml;
        this.dtd = dtd;
        this.htmlElements = htmlElements != null ? htmlElements : List.of();
    }

    public List<ASTNode> getScriptletOrSeaWs() {
        return scriptletOrSeaWs;
    }

    public String getXml() {
        return xml;
    }

    public String getDtd() {
        return dtd;
    }

    public List<ASTNode> getHtmlElements() {
        return htmlElements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "HTML Document:");
        if (xml != null) {
            System.out.println(indent + "  XML Declaration: " + xml);
        }
        if (dtd != null) {
            System.out.println(indent + "  DTD: " + dtd);
        }
        if (!scriptletOrSeaWs.isEmpty()) {
            System.out.println(indent + "  Pre-content:");
            for (ASTNode node : scriptletOrSeaWs) {
                if (node != null) {
                    node.prettyPrint(indent + "    ");
                }
            }
        }
        if (!htmlElements.isEmpty()) {
            System.out.println(indent + "  Elements:");
            for (ASTNode node : htmlElements) {
                if (node != null) {
                    node.prettyPrint(indent + "    ");
                } else {
                    System.out.println(indent + "    [Null Element]");
                }
            }
        }
    }

    // Overloaded generate method to accept CSS and JS
    public String generate(String cssCode, String jsCode) {
        StringBuilder htmlOutput = new StringBuilder();

        if (dtd != null) {
            htmlOutput.append(dtd).append("\n");
        }

        htmlOutput.append("<!DOCTYPE html>\n");
        htmlOutput.append("<html lang=\"en\">\n");
        htmlOutput.append("<head>\n");
        htmlOutput.append("  <meta charset=\"UTF-8\">\n");
        htmlOutput.append("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        htmlOutput.append("  <title>Products App</title>\n"); // Title from your example
        htmlOutput.append("  <style>\n");
        htmlOutput.append(cssCode).append("\n"); // Embed generated CSS
        htmlOutput.append("  </style>\n");
        htmlOutput.append("</head>\n");
        htmlOutput.append("<body>\n");

        // The htmlElements list should ideally contain the entire body structure
        // If your grammar correctly parses <body> as an element, it would be here.
        // For simplicity, we'll assume a single div#app-root to render our components.
        // Your provided HTML structure in the prompt does not have a <body> tag within `htmlDocument` directly,
        // but assumes its content. Let's create a wrapper div where the components will be rendered.
        htmlOutput.append("<div id=\"app\">"); // This will be the main container for your JS app
        for (ASTNode element : htmlElements) {
            htmlOutput.append(element.generate()); // Generate each HTML element
        }
        htmlOutput.append("</div>\n");


        htmlOutput.append("  <script type=\"module\">\n"); // Use type="module" for ES Modules
        htmlOutput.append(jsCode).append("\n"); // Embed generated JavaScript
        htmlOutput.append("  </script>\n");
        htmlOutput.append("</body>\n");
        htmlOutput.append("</html>\n");

        return htmlOutput.toString();
    }

    // Default generate() method to conform to ASTNode interface, in case no CSS/JS are passed.
    // This could return an error or a minimal structure.
    @Override
    public String generate() {
        return generate("", ""); // Call the overloaded method with empty CSS and JS
    }
}