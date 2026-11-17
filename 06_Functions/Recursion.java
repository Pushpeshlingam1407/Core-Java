//TODO: RECURSION IN JAVA
//* Recursion is a technique in which a method calls itself.
//* Every recursive method must have:
//* 1. A base case that stops the recursion.
//* 2. A recursive case that moves towards the base case.
//* The call stack stores each method call until the base case is reached.
//* Missing or incorrect base cases can cause infinite recursion and StackOverflowError.

public class Recursion {

  // Example: calculate the factorial of a number.
  static int factorial(int number) {
    if (number == 0 || number == 1) {
      return 1; // Base case
    }

    return number * factorial(number - 1); // Recursive case
  }

  public static void main(String[] args) {
    int number = 5;

    System.out.println("=== RECURSION EXAMPLE ===");
    System.out.println("Factorial of " + number + " = " + factorial(number));
  }
}
