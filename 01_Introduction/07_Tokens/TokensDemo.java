//TODO: Learn about Tokens in Java - the smallest individual building blocks of a program.
//* A Token is the smallest individual unit in a Java program recognized by the compiler.
//* Java code is composed of tokens separated by white spaces, tabs, or newlines.
//* Java has 5 main types of tokens:
//* 1. Keywords (Reserved words)
//* 2. Identifiers (User-defined names)
//* 3. Literals (Constant values)
//* 4. Operators (Symbols for mathematical/logical operations)
//* 5. Separators / Punctuators (Delimiters that structure code)

public class TokensDemo {

  public static void main(String[] args) {
    System.out.println("=== TOKENS IN JAVA ===");
    System.out.println(
      "Tokens are the smallest lexical units recognized by the compiler.\n"
    );

    //? Example statement to dissect:
    //? int score = 95;
    //? Token 1: 'int'     -> Keyword
    //? Token 2: 'score'   -> Identifier
    //? Token 3: '='       -> Operator
    //? Token 4: '95'      -> Literal
    //? Token 5: ';'       -> Separator
    int score = 95;
    System.out.println("Dissected Statement: int score = 95;");
    System.out.println("1. 'int'     : Keyword");
    System.out.println("2. 'score'   : Identifier");
    System.out.println("3. '='       : Assignment Operator");
    System.out.println("4. '95'      : Integer Literal");
    System.out.println("5. ';'       : Separator\n");

    //? 1. Keywords:
    //? Predefined words reserved by the language (e.g., class, public, static, void, int, if)
    System.out.println(
      "1. Keywords   : class, public, static, void, int, double, if, return"
    );

    //? 2. Identifiers:
    //? Names given to classes, variables, methods, and packages (e.g., TokensDemo, main, score)
    String studentName = "Aarav";
    System.out.println(
      "2. Identifiers: TokensDemo (class), main (method), studentName (variable)"
    );

    //? 3. Literals:
    //? Fixed constant values assigned to variables
    double marks = 88.5; // 88.5 is a floating-point literal
    char grade = 'A'; // 'A' is a character literal
    boolean hasPassed = true; // true is a boolean literal
    System.out.println("3. Literals   : 95, \"Aarav\", 88.5, 'A', true");

    //? 4. Operators:
    //? Symbols that perform specific operations on operands (+, -, *, /, %, ==, &&, etc.)
    int total = score + 5; // '+' and '=' are operators
    System.out.println("4. Operators  : +, -, *, /, %, =, ==, !=, &&, ||");

    //? 5. Separators (Punctuators):
    //? Characters used to organize and structure code: ( ), { }, [ ], ;, ,, .
    System.out.println("5. Separators : ( ) { } [ ] ; , .");

    //TODO: Note on White Spaces:
    //* White spaces, tabs, and newlines separate tokens so the compiler can distinguish them.
    //* They are not tokens themselves and are ignored by the compiler during execution.
    System.out.println("\nCalculated Total using tokens: " + total);
    System.out.println(
      "Student: " +
        studentName +
        " | Grade: " +
        grade +
        " | Passed: " +
        hasPassed
    );
  }
}
