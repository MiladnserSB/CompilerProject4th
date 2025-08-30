package ast.HTML;

public class InterpolationElement implements HtmlElement {
    private final String content;

    public InterpolationElement(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Interpolation: " + content);
    }

    @Override
    public String generate() {
        return "";
    }
//        // Convert Angular interpolation syntax {{ expression }} to JavaScript template literal syntax ${expression}
//        // Also handle cases where the expression might need to be accessed from a global object
//
//        String expression = content.trim();
//
//        // Handle common Angular expressions
//        if (expression.startsWith("{{") && expression.endsWith("}}")) {
//            expression = expression.substring(2, expression.length() - 2).trim();
//        }
//
//        // Convert simple property access to JavaScript
//        if (expression.contains(".")) {
//            // Handle expressions like product.name, product.price, etc.
//            return "${" + expression + "}";
//        } else {
//            // Handle simple variables
//            return "${" + expression + "}";
//        }
//    }
}