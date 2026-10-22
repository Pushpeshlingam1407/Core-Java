//TODO: LOCAL VARIABLES
/*
 * A variable declared inside a block (method, constructor,
 * initializer, if, for, while, etc.), other than the class block,
 * is called a local variable.
 */

//TODO: RULES OF LOCAL VARIABLES:

//?  1. We can use a local variable only within the block where it is declared.

// ?  2. We cannot declare multiple local variables with the same name within the same scope.

// ? 3. We can declare a local variable without initializing it, but we cannot use it without assigning a value first.

public class LocalVariable {

  public static void main(String[] args) {
    // TODO: Rule 3 - Declaration without initialization

    // int n, n2 = 100;
    // System.out.println(n);  // Compile-time error
    // System.out.println(n2); // Valid

    // int n;
    // n = 50;
    // System.out.println(n);  // Valid

    // TODO: Rule 2 - Duplicate local variable declaration

    // int a = 10;
    // int a = 20; // Compile-time error

    // TODO: Rule 1 - Scope of a local variable

    // for (int i = 0; i <= 10; i++) {
    //     System.out.println(i);
    // }
    // System.out.println(i); // Compile-time error

    // TODO: Rule 1 - Same name in different scopes

    if (10 == 10) {
      int num = 10;
      System.out.println(num);
    }

    int num = 20;
    System.out.println(num);
  }
}
