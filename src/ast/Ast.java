package ast;

import ast.CSS.CssDocument;
import ast.HTML.HTMLDocument;
import ast.TS.TsDocument;

import java.io.IOException;

public class Ast implements ASTNode {
    private TsDocument tsDecument;
    private CssDocument cssDocument;
    private HTMLDocument htmlDocument;

    public Ast(TsDocument tsDecument, HTMLDocument htmlDocument, CssDocument cssDocument) {
        this.tsDecument = tsDecument;
        this.cssDocument = cssDocument;
        this.htmlDocument = htmlDocument;
    }

    public TsDocument getTsDecument() {
        return tsDecument;
    }

    public HTMLDocument getHtmlDocument() {
        return htmlDocument;
    }

    public CssDocument getCssDocument() {
        return cssDocument;
    }

    public void setTsDecument(TsDocument tsDecument) {
        this.tsDecument = tsDecument;
    }

    public void setHtmlDocument(HTMLDocument htmlDocument) {
        this.htmlDocument = htmlDocument;
    }

    public void setCssDocument(CssDocument cssDocument) {
        this.cssDocument = cssDocument;
    }

    public TsDocument getTSDocument() {
        return tsDecument;
    }

    public CssDocument getCSSDocument() {
        return cssDocument;
    }

    public HTMLDocument getHTMLDocument() {
        return htmlDocument;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println();
        System.out.println();
        System.out.println(indent + "AST:");
        if (tsDecument != null) {
            tsDecument.prettyPrint(indent + "    ");
        }
        System.out.println();
        System.out.println();
        if (htmlDocument != null && !htmlDocument.getHtmlElements().isEmpty()) {
            htmlDocument.prettyPrint(indent + "    ");
        } else {
            System.out.println("///////////////Empty HTML");
        }
        System.out.println();
        System.out.println();
        if (cssDocument != null && !cssDocument.getRuleSets().isEmpty()) {
            cssDocument.prettyPrint(indent + "    ");
        } else {
            System.out.println("///////////////Empty CSS");
        }
    }

    @Override
    public String generate() {
        return "";
    }



    public String generate(String outputFileName) {
        String cssCode = (cssDocument != null) ? cssDocument.generate() : "";
        String htmlCode = (htmlDocument != null) ? htmlDocument.generate("", "") : "";
        String jsCode   = (tsDecument != null) ? tsDecument.generate() : "";

        StringBuilder sb = new StringBuilder();

        // ================= DOCTYPE + <html> =================
        sb.append("<!DOCTYPE html>\n")
                .append("<html lang=\"en\">\n")
                .append("<head>\n")
                .append("    <meta charset=\"UTF-8\">\n")
                .append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n")
                .append("    <title>Generated App</title>\n");

        // ================= CSS inside <style> =================
        if (!cssCode.isEmpty()) {
            sb.append("    <style>\n")
                    .append(cssCode)
                    .append("\n    </style>\n");
        }

        sb.append("</head>\n<body>\n");

        // ================= HTML Elements =================
        if (!htmlCode.isEmpty()) {
            sb.append(htmlCode).append("\n");
        }

        // ================= JS inside <script> =================
        if (!jsCode.isEmpty()) {
            sb.append("<script src=\"products-service.js\"></script>\n");
            sb.append("    <script>\n")
                    .append(jsCode)
                    .append("\n    </script>\n");
        }

        sb.append("</body>\n</html>\n");

        // ================= Write to file =================
        try (java.io.FileWriter writer = new java.io.FileWriter(outputFileName)) {
            writer.write(sb.toString());
            System.out.println("✅ Generated: " + outputFileName);
        } catch (IOException e) {
            System.err.println("❌ Error writing file: " + outputFileName + " - " + e.getMessage());
        }

        return sb.toString();
    }

}