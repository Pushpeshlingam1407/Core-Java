//TODO: Decrement Operators
//* These are Unary operators
//* To use decrement operators we have to create a variable
//* In java we have 2 types of Decrement operators
//? 1. Pre decrement operator Syntax: --variableName
//? 2. Post decrement operator Syntax: variableName-- */

import java.util.*;

public class DecrementOperators {

  public static void main(String[] args) {
    //* 1. Pre-decrement operator */
    //* It has 2 works
    //? 1. Decrease the value by 1 permanently in the variable */
    //? 2. Use the updated value

    System.out.println("\nPre-decrement Operator\n");
    int a = 35;
    System.out.println(--a);
    System.out.println(--a);
    System.out.println(a);

    //* 2. Post-Decrement operator */
    //* It has 2 works */
    //? 1. Use the Existing value
    //? 2. Decrement the value by 1 permanently in the variable

    System.out.println("\nPost-decrement Operator\n");
    int b = 12;
    System.out.println(b--);
    System.out.println(b--);
    System.out.println(b);
  }
}
