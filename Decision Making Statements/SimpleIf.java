//TODO: Simple if Statement
//? If is a keyword in Java that is used to make decisions based on a condition. It allows the program to execute a block of code only if a specified condition is true.
//? The simple if statement is used to execute a block of code only if a specified condition is true.

//* Syntax of simple if statement: */
//* Multiple line statement: */
//  if (condition) {
//  block of code to be executed if the condition is true
// }

//* Single line statement: */
// if (condition) { block of code to be executed if the condition is true; }

import java.util.*;

public class SimpleIf {

  public static void main(String[] args) {
    System.out.println("Helloo! Welcome to the world of Java Programming");
    if (10 < 3) {
      System.out.println("Hii");
      System.out.println("This is inside the if block");
    }
    System.out.println("This is outside the if block");
  }
}
