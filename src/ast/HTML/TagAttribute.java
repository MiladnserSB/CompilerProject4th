package ast.HTML;

import ast.ASTNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagAttribute implements ASTNode {
    private final String value;
    private final boolean isMethodCall;

    public TagAttribute(String value, boolean isMethodCall) {
        this.value = value;
        this.isMethodCall = isMethodCall;
    }

    public String getValue() { return value; }

    public boolean isMethodCall() { return isMethodCall; }

    @Override
    public void prettyPrint(String indent) {
        if (isMethodCall) {
            System.out.println(indent + "Method call value: " + value);
        } else {
            System.out.println(indent + "Tag Attribute: " + value);
        }
    }

    @Override
    public String generate() {
        return generate("");
    }

    // Generate method to convert Angular attributes to standard HTML
    public String generate(String angularAttribute) {
        // For pure HTML generation, we need to handle different cases

        if (angularAttribute.startsWith("[") && angularAttribute.endsWith("]")) {
            // Property binding like [value]="product.name" - convert to standard HTML
            String attributeName = angularAttribute.substring(1, angularAttribute.indexOf("]"));

            // For form inputs, we want to generate id attributes instead of value bindings
            if ("value".equals(attributeName)) {
                return "id=\"" + extractIdFromExpression(angularAttribute) + "\"";
            }

            // For other property bindings, just use the attribute name
            return attributeName;

        } else if (angularAttribute.startsWith("(") && angularAttribute.endsWith(")")) {
            // Event binding like (click)="onEdit(item)" - remove for pure HTML
            // Events will be handled by external JavaScript
            return "";

        } else if (angularAttribute.contains("{{") && angularAttribute.contains("}}")) {
            // Interpolation like {{product.name}} - extract the value
            return extractInterpolationValue(angularAttribute);

        } else if (angularAttribute.contains("routerLink")) {
            // Router links - convert to standard href
            return convertRouterLink(angularAttribute);

        } else {
            // Regular HTML attribute - clean up any Angular syntax
            return cleanAngularSyntax(angularAttribute);
        }
    }

    private String extractIdFromExpression(String expression) {
        // Extract id from expressions like [value]="product.name"
        if (expression.contains(".")) {
            return expression.substring(expression.lastIndexOf(".") + 1, expression.indexOf("\""));
        }
        return "inputField";
    }

    private String extractInterpolationValue(String interpolation) {
        // Extract value from {{product.name}} -> just use the field name
        Pattern pattern = Pattern.compile("\\{\\{(.*?)\\}\\}");
        Matcher matcher = pattern.matcher(interpolation);
        if (matcher.find()) {
            String content = matcher.group(1);
            if (content.contains(".")) {
                return content.substring(content.lastIndexOf(".") + 1);
            }
            return content;
        }
        return interpolation;
    }

    private String convertRouterLink(String routerLink) {
        // Convert routerLink="/products" to href="products.html"
        if (routerLink.contains("routerLink")) {
            if (routerLink.contains("=")) {
                String path = routerLink.substring(routerLink.indexOf("=") + 1).replace("\"", "").trim();
                if (path.startsWith("'/") && path.endsWith("'")) {
                    path = path.substring(2, path.length() - 1);
                } else if (path.startsWith("/")) {
                    path = path.substring(1);
                }
                return "href=\"" + path + ".html\"";
            }
        }
        return routerLink;
    }

    private String cleanAngularSyntax(String attribute) {
        // Remove Angular-specific syntax
        return attribute.replace("{{", "")
                .replace("}}", "")
                .replace("$any", "")
                .replace("$event", "event")
                .replace("| async", "")
                .trim();
    }

    private String convertAngularHandlerToJS(String angularHandler) {
        // Convert Angular event handlers to plain JavaScript
        // This is not used in pure HTML generation since we remove event bindings
        return angularHandler.replace("$event.stopPropagation()", "event.stopPropagation()")
                .replace("$event.preventDefault()", "event.preventDefault()")
                .replace("router.navigate(['/", "window.location.href = '")
                .replace("'])", ".html'")
                .replace("productsService.", "window.productsService.");
    }
}