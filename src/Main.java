import antlr.Parsergrammar;
import antlr.Lexergrammmar;
import ast.ASTNode;
import ast.Ast;
import ast.VISITOR.programvisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


    public class Main {
        public static void main(String[] args) {
            String[] fileNames = {"test1.txt", "test2.txt", "test3.txt", "test4.txt"};

            for (int i = 0; i < fileNames.length; i++) {
                String fileName = fileNames[i];
                String outputFileName;

                // Special handling for the 4th file (products service)
                if (i == 3) { // 4th file (index 3)
                    outputFileName = "products-service.js";
                } else {
                    switch (i) {
                        case 0:
                            outputFileName = "add-product.html";
                            break;
                        case 1:
                            outputFileName = "details.html";
                            break;
                        case 2:
                            outputFileName = "products.html";
                            break;
                        default:
                            outputFileName = "output" + (i + 1) + ".html";
                            break;
                    }
                }

                try {
                    System.out.println("Processing file: " + fileName);
                    String input = readFile(fileName);

                    Lexergrammmar lexer = new Lexergrammmar(CharStreams.fromString(input));
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    Parsergrammar parser = new Parsergrammar(tokens);
                    ParseTree tree = parser.ast();
                    programvisitor visitor = new programvisitor();
                    ASTNode ast = visitor.visit(tree);

                    if (ast != null) {
                        ast.prettyPrint("");
                        // Set the output file name before generating
                        setOutputFileName(outputFileName);
                        ((Ast) ast).generate(outputFileName);
                    } else {
                        System.out.println("AST is null for file: " + fileName + ". Check the grammar and visitor implementation.");
                    }

                    System.out.println("\n" + "=".repeat(50) + "\n");

                } catch (IOException e) {
                    System.out.println("Error reading file: " + fileName + " - " + e.getMessage());
                }
            }
        }

        private static String readFile(String fileName) throws IOException {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        }

        private static void setOutputFileName(String fileName) {
            // This method would need to be implemented to set the output file name
            // You might need to modify the Ast class to accept a filename parameter
            // or use a static variable to control the output filename
            System.setProperty("outputFileName", fileName);
        }
    }
