import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.stmt.Statement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class ImprovedJavaParser {

    private static Map<String, Integer> tokenCounts = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {

        // Prompt user for the Java file path
        System.out.println("Enter the path to your Java program (e.g., C:/path/to/YourProgram.java): ");
        String filePath = new java.util.Scanner(System.in).nextLine();

        // Parse the code using JavaParser
        File javaFile = new File(filePath);
        parseCode(javaFile);

        // Print token counts
        System.out.println("\nToken Counts:");
        for (Map.Entry<String, Integer> entry : tokenCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void parseCode(File javaFile) throws FileNotFoundException {
        CompilationUnit cu = JavaParser.parse(javaFile);

        if (cu != null) {
            // Get the main class declaration
            ClassOrInterfaceDeclaration classDecl = cu.findAll(ClassOrInterfaceDeclaration.class).findFirst().orElseThrow();

            // Print the class name
            System.out.println("Class Name: " + classDecl.getNameAsString());

            // Analyze statements and count tokens
            countTokensInStatements(classDecl);

            // Optionally, print the entire parse tree (uncomment if desired)
            // System.out.println(cu.toString());
        }
    }

    private static void countTokensInStatements(ClassOrInterfaceDeclaration classDecl) {
        for (Statement statement : classDecl.getMembers()) {
            statement.accept(new TokenCountingVisitor(), null);
        }
    }
}

// Visitor class to identify and count tokens within statements
class TokenCountingVisitor extends GenericVisitor {

    @Override
    public void visit(SimpleName n, Object arg) {
        incrementCount("Identifier");
        super.visit(n, arg);
    }

    // Implement similar visit methods for other relevant AST node types (keywords, operators, etc.)
    @Override
    public void visit(Keyword n, Object arg) {
        incrementCount("Keyword");
        super.visit(n, arg);
    }

    // Add more visit methods as needed for specific token types

    private void incrementCount(String tokenType) {
        if (!tokenCounts.containsKey(tokenType)) {
            tokenCounts.put(tokenType, 0);
        }
        tokenCounts.put(tokenType, tokenCounts.get(tokenType) + 1);
    }
}
