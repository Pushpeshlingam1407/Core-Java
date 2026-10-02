//TODO: Increment Operators
//* These are Unary operators
//* To use increment operators we have to create a variable
//* In java we have 2 types of Increment operators
//? 1. Pre increment operator Syntax: ++variableName
//? 2. Post increment operator Syntax: variableName++ */

import java.util.*;

public class IncrementOperators {

  public static void main(String[] args) {
    //* 1. Pre-increment operator */
    //* It has 2 works
    //? 1. Increase the value by 1 permanently in the variable */
    //? 2. Use the updated value

    System.out.println("\nPre-increment Operator\n");
    int a = 10;
    System.out.println(++a);
    System.out.println(++a);

    //* 2. Post-Increment operator */
    //* It has 2 works */
    //? 1. Use the Existing value
    //? 2. Increment the value by 1 permanently in the variable

    System.out.println("\nPost-increment Operator\n");
    int b = 5;
    System.out.println(b++);
    System.out.println(b++);
    System.out.println(b);
  }
}
