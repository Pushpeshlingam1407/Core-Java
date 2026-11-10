//TODO: Method Overloading in Java - Concept, Rules, Advantages, Return Type, Restrictions, and Type Promotion.

/*
 * ============================================================================
 *                    //TODO: WHAT IS METHOD OVERLOADING?
 * ============================================================================
 *
 * 1. DEFINITION:
 *    - The process of creating multiple methods with the same name but with
 *      different formal arguments is called Method Overloading.
 *
 * 2. WHY METHOD OVERLOADING? (BENEFITS):
 *    - Increases Code Readability & Cleanliness:
 *      A single meaningful name (e.g., 'add', 'print', 'search') can be reused
 *      for similar operations across different data types and parameter counts.
 *
 *    - Avoids Unnecessary Method Names:
 *      Instead of creating addTwoInts(), addThreeInts(), addDoubles(),
 *      we simply overload add().
 *
 *    - Method overloading does not depend on access specifiers,
 *      non-access specifiers, or return types.
 *
 *    - It depends only on the method signature.
 *
 * 3. PURPOSE OF METHOD OVERLOADING:
 *    - The purpose of method overloading is to perform the same operation
 *      in different ways. It provides flexibility to the user.
 *
 * ============================================================================
 *                   THE 3 RULES / WAYS TO OVERLOAD METHODS
 * ============================================================================
 *
 * To overload a method, the method signature (Method Name + Parameter List)
 * must be unique. You can achieve this by varying:
 *
 * 1. THE NUMBER OF PARAMETERS:
 *    - add(int a, int b)
 *    - add(int a, int b, int c)
 *    - add(int a, int b, int c, int d)
 *
 * 2. THE DATA TYPES OF PARAMETERS:
 *    - add(int a, int b)
 *    - add(double a, double b)
 *
 * 3. THE SEQUENCE / ORDER OF PARAMETER DATA TYPES:
 *    - add(int a, double b)
 *    - add(double a, int b)
 *
 * =/*
 * ============================================================================
 *                 CRITICAL RULES & COMMON INTERVIEW QUESTIONS
 * ============================================================================
 *
 * // ! Q1: Can we overload a method by changing ONLY its return type?
 *
 * // ? Ans: NO! A method CANNOT be overloaded based on return type alone!
 * // ? Reason:
 * // ?   Consider:
 * // ?     int add(int a, int b) { return a + b; }
 * // ?     double add(int a, int b) { return a + b; }
 * // ?
 * // ?   If the caller writes:
 * // ?     add(10, 20); // Without assigning to a variable
 * // ?
 * // ?   The compiler has NO WAY to determine which method to invoke!
 * // ?
 * // ?   Result: COMPILE-TIME ERROR:
 * // ?   'method add(int,int) is already defined in class'
 *
 * // ! Q2: Can we overload the main() method in Java?
 *
 * // ? Ans: YES! You can define multiple overloaded versions of main():
 * // ?   public static void main(String[] args)  <-- Entry point called by JVM
 * // ?   public static void main(int a)          <-- Custom overloaded main
 * // ?   public static void main(String a)       <-- Custom overloaded main
 * // ?
 * // ? JVM always executes the standard main(String[] args). Other versions
 * // ? can be called explicitly like any regular method.
 *
 * // ! Q3: What is Type Promotion in Method Overloading?
 *
 * // ? Ans: If no exact data type match is found, Java automatically promotes
 * // ? the argument to the next wider compatible type:
 * // ?
 * // ? byte -> short -> int -> long -> float -> double
 * // ? char -> int
 *
 * // ! Q4: What causes Method Overloading Ambiguity?
 *
 * // ? Ans: If two overloaded methods can both accept an argument through type
 * // ? promotion with equal specificity, the compiler cannot decide and throws:
 * // ?
 * // ? 'error: reference to method is ambiguous'
 * // ?
 * // ? Example:
 * // ?   void demo(int a, double b) {}
 * // ?   void demo(double a, int b) {}
 * // ?
 * // ?   demo(10, 20); // Ambiguous error! Both need 1 promotion.
 */
public class MethodOverloading {

  //* -------------------------------------------------------------------------
  //* 1. Overloading by Number of Parameters
  //* -------------------------------------------------------------------------
  static char add(int n1, int n2) {
    System.out.println("add(int, int) -> " + (n1 + n2));
    return 'a';
  }

  static double add(int n1, int n2, int n3) {
    System.out.println("add(int, int, int) -> " + (n1 + n2 + n3));
    return 10.25;
  }

  static boolean add(int n1, int n2, int n3, int n4) {
    System.out.println("add(int, int, int, int) -> " + (n1 + n2 + n3 + n4));
    return true;
  }

  //* -------------------------------------------------------------------------
  //* 2. Overloading by Sequence / Order of Data Types
  //* -------------------------------------------------------------------------
  static int add(double n1, int n2) {
    System.out.println("add(double, int) -> " + (n1 + n2));
    return 100;
  }

  static void add(int n1, double n2) {
    System.out.println("add(int, double) -> " + (n1 + n2));
  }

  //* -------------------------------------------------------------------------
  //* 3. Overloading by Data Types of Parameters
  //* -------------------------------------------------------------------------
  static void sub(double n1, double n2) {
    System.out.println("sub(double, double) -> " + (n1 - n2));
  }

  static void sub(int n1, int n2) {
    System.out.println("sub(int, int) -> " + (n1 - n2));
  }

  //* -------------------------------------------------------------------------
  //* 4. Overloaded main() Methods Demonstration
  //* -------------------------------------------------------------------------
  public static void main(int number) {
    System.out.println("Overloaded main(int) called with value: " + number);
  }

  public static void main(String message) {
    System.out.println(
      "Overloaded main(String) called with message: " + message
    );
  }

  //* Standard Entry Point executed by JVM
  public static void main(String[] args) {
    System.out.println("=== DEMO: METHOD OVERLOADING IN JAVA ===\n");

    //? 1. Matching by Sequence:
    add(10.3, 20); // Calls add(double, int)
    add(1, 31.2); // Calls add(int, double)

    //? 2. Matching by Number of Parameters:
    add(4, 5); // Calls add(int, int)
    add(7, 8, 9); // Calls add(int, int, int)
    add(5, 6, 7, 8); // Calls add(int, int, int, int)

    //? 3. Matching by Data Types:
    sub(19.8, 8.06); // Calls sub(double, double)
    sub(50, 20); // Calls sub(int, int)

    //? 4. Capturing Return Value:
    System.out.println("Returned value from add(10.78, 23): " + add(10.78, 23));

    //? 5. Explicitly Calling Overloaded main() Methods:
    System.out.println("\n--- Calling Overloaded main() Methods ---");
    main(100);
    main("Java is Powerful!");
  }
}
