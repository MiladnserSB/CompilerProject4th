//package ast.TS;
//
//public class StaticAssignment extends MethodAssignment {
//    private String identifier;
//    private String spreadThisIdentifier;
//    private String dateIdentifier;
//    private MethodCall methodCall;
//    private boolean isStatic; // إضافة حقل لتحديد إذا كان static أم لا
//
//    public StaticAssignment(String identifier, String spreadThisIdentifier, String dateIdentifier, MethodCall methodCall) {
//        this(identifier, spreadThisIdentifier, dateIdentifier, methodCall, false); // قيمة افتراضية
//    }
//
//    // constructor جديد مع معلمة isStatic
//    public StaticAssignment(String identifier, String spreadThisIdentifier, String dateIdentifier, MethodCall methodCall, boolean isStatic) {
//        this.identifier = identifier;
//        this.spreadThisIdentifier = spreadThisIdentifier;
//        this.dateIdentifier = dateIdentifier;
//        this.methodCall = methodCall;
//        this.isStatic = isStatic;
//    }
//
//    @Override
//    public void prettyPrint(String indent) {
//        System.out.println(indent + "StaticAssignment:");
//        String staticKeyword = isStatic ? "static " : "";
//        System.out.println(indent + "  " + staticKeyword + identifier + " = { ... this." + spreadThisIdentifier +
//                ", " + dateIdentifier + ": Date." + methodCall + " }");
//    }
//
//    @Override
//    public String toString() {
//        String staticKeyword = isStatic ? "static " : "";
//        return staticKeyword + identifier + " = { ... this." + spreadThisIdentifier +
//                ", " + dateIdentifier + ": Date." + methodCall + " }";
//    }
//
//    @Override
//    public String generate() {
//        StringBuilder sb = new StringBuilder();
//
//        if (identifier != null) {
//            sb.append(identifier).append(" = { ");
//        }
//
//        if (spreadThisIdentifier != null) {
//            sb.append("...this.").append(spreadThisIdentifier);
//        }
//
//        if (dateIdentifier != null && methodCall != null) {
//            sb.append(", ")
//                    .append(dateIdentifier)
//                    .append(": Date.")
//                    .append(methodCall.generate());
//        }
//
//        sb.append(" };").append("\n");
//        return sb.toString();
//    }
//
//
//
//}