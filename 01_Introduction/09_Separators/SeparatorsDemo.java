//TODO: Understand Separators (Punctuators / Delimiters) in Java.
//* Separators are tokens used to organize, structure, and delimit code in Java.
//* They help the compiler determine where statements begin, end, and how blocks are grouped.
//* The main separators in Java are:
//* 1. { } (Braces / Curly brackets)
//* 2. ( ) (Parentheses)
//* 3. [ ] (Square brackets)
//* 4. ;   (Semicolon)
//* 5. ,   (Comma)
//* 6. .   (Period / Dot)
//* 7. ... (Ellipsis - Varargs)
//* 8. ::  (Double Colon - Method Reference)

public class SeparatorsDemo {

  //? Varargs example using '...'
  static void printNumbers(int... numbers) {
    System.out.print("   Varargs (...) received: ");
    for (int n : numbers) {
      System.out.print(n + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println("=== SEPARATORS (PUNCTUATORS) IN JAVA ===\n");

    //? 1. { } - Curly Braces:
    //* Used to define a block of code (for classes, methods, loops, conditional blocks, and array initializers).
    System.out.println("1. { } - Curly Braces:");
    System.out.println(
      "   Define the scope and body of classes, methods, loops, and conditional blocks."
    );
    {
      int blockScopedVar = 100;
      System.out.println(
        "   Inside an isolated block: blockScopedVar = " + blockScopedVar
      );
    }
    System.out.println();

    //? 2. ( ) - Parentheses:
    //* Used for parameter lists in methods, precedence in expressions, conditions in if/loop, and type casting.
    System.out.println("2. ( ) - Parentheses:");
    int mathResult = (5 + 3) * 2; // Precedence grouping
    double casted = (double) 10; // Type casting
    System.out.println("   Expression precedence (5 + 3) * 2 = " + mathResult);
    System.out.println("   Type casting (double) 10           = " + casted);
    System.out.println();

    //? 3. [ ] - Square Brackets:
    //* Used to declare array types, allocate array memory, and index elements.
    System.out.println("3. [ ] - Square Brackets:");
    int[] numbers = { 10, 20, 30, 40 };
    System.out.println("   Array element at index [0] = " + numbers[0]);
    System.out.println("   Array element at index [2] = " + numbers[2]);
    System.out.println();

    //? 4. ; - Semicolon:
    //* Statement terminator indicating the completion of an individual Java statement.
    System.out.println("4. ; - Semicolon:");
    System.out.println(
      "   Terminates statements (e.g., int x = 10; System.out.println();)."
    );
    System.out.println();

    //? 5. , - Comma:
    //* Separates identifiers in variable declarations and arguments in method calls.
    System.out.println("5. , - Comma:");
    int a = 1,
      b = 2,
      c = 3; // Multiple variable declarations separated by comma
    System.out.println(
      "   Declared multiple variables: a = " + a + ", b = " + b + ", c = " + c
    );
    System.out.println();

    //? 6. . - Period (Dot Operator):
    //* Used to access members (methods, attributes) of classes or instances, and to separate package names.
    System.out.println("6. . - Period / Dot:");
    String message = "Hello";
    int length = message.length(); // Accessing length() method via dot operator
    System.out.println("   message.length() = " + length);
    System.out.println(
      "   System.out.println() uses dots to navigate packages and objects."
    );
    System.out.println();

    //? 7. ... - Ellipsis (Varargs):
    //* Used in method parameter declarations to accept variable number of arguments.
    System.out.println("7. ... - Ellipsis (Varargs):");
    printNumbers(1, 2, 3, 4, 5);
    System.out.println();

    //? 8. :: - Double Colon (Method Reference):
    //* Introduced in Java 8 to refer to a method without executing it.
    System.out.println("8. :: - Double Colon (Method Reference):");
    System.out.println(
      "   Used in Java 8+ functional programming (e.g., System.out::println)."
    );
  }
}
