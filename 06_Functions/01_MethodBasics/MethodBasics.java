//TODO: Java Methods - Definition, Advantages, Syntax & Anatomy

//? ======================== WHAT IS A METHOD? ========================

//* DEFINITION:
//* A method is a reusable block of code designed to perform a specific task.
//* For each and every operation the user perform developer must create different methods
//*  so that the code will be getting execute accordingly to the method, it will make code easier/
//* Instead of writing the same logic repeatedly, we can define it once and execute it whenever required by calling the method.

//? ======================== WHY DO WE NEED METHODS? ========================

//! 1. Code Reusability:
//?    Write the logic once and reuse it whenever required.

//! 2. Modularity:
//?    Divides a large program into smaller, manageable parts.

//! 3. Readability:
//?    Makes the code clean, structured, and easy to understand.

//! 4. Maintainability:
//?    Makes modifying and updating code easier.

//! 5. Debugging:
//?    Helps identify and fix errors within individual methods.

//! 6. Code Duplication:
//?    Avoids repeating the same logic (DRY - Don't Repeat Yourself).

//? ======================== GENERAL METHOD SYNTAX ========================

//* [access_modifier] [non_access_modifier] return_type methodName(parameters) {
//*     // Method body
//*     return value;
//* }

//? ======================== ANATOMY OF A METHOD ========================

//* 1. Access Modifier:
//*    Defines the accessibility of a method.
//*    public, protected, default, private

//* 2. Non-Access Modifier:
//*    Defines the special behavior of a method.
//*    static, final, abstract, synchronized

//* 3. Return Type:
//*    Specifies the type of value returned by the method.
//*    void means the method does not return any value.

//* 4. Method Name:
//*    Identifies the method and follows lowerCamelCase naming convention.

//* 5. Parameter List:
//*    Specifies the inputs accepted by the method.

//* 6. Method Signature:
//*    Consists of the method name and parameter types in their order.
//*    Return type and access modifiers are NOT included.

//* 7. Method Body:
//*    Contains the actual statements and logic executed by the method.

//! ======================== METHOD IMPLEMENTATION ========================

//* METHOD 1: No Parameters + No Return Value
//* public  : Accessible from anywhere.
//* static  : Can be called without creating an object.
//* void    : Does not return any value.
//* ()      : No parameters.

//! ======================== MAIN METHOD ========================

//? Program execution starts from the main() method.
public class MethodBasics {

  //* 1. Simple static method with no parameters and void return type
  public static void welcomeUser() {
    System.out.println("Hello! Welcome to Java Methods / Functions tutorial.");
  }

  //* 2. Static method with parameters and a non-void return type (int)
  // Method Signature: add(int, int)
  public static int add(int num1, int num2) {
    int sum = num1 + num2;
    return sum; // returns calculated value back to caller
  }

  //* 3. Static method demonstrating code reusability
  public static boolean isEven(int number) {
    return number % 2 == 0;
  }

  public static void main(String[] args) {
    System.out.println("=== DEMO: METHOD BASICS IN JAVA ===");

    //? Calling method 1 (no arguments, void):
    welcomeUser();

    //? Calling method 2 (with arguments, returns int):
    int result = add(25, 15);
    System.out.println("Sum of 25 and 15 is: " + result);

    //? Reusing method 3 multiple times with different numbers:
    System.out.println("Is 14 even? " + isEven(14));
    System.out.println("Is 27 even? " + isEven(27));
  }
}
