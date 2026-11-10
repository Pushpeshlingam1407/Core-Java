//TODO: STATIC GLOBAL MEMBERS - SCHEMA & DEFINITIONS

/*
 *
 *                        //TODO: STATIC GLOBAL MEMBERS SCHEMA
 *
 * // ? In Java, Global Members declared with the 'static' keyword are called
 * // ? Static Global Members (or Class-Level Members).
 *
 * ----------------------------------------------------------------------------
 *                      //TODO: TYPES OF STATIC GLOBAL MEMBERS:
 * ----------------------------------------------------------------------------
 *
 * 1. STATIC VARIABLES (Class Variables):
 *    - Any Global Variable declared with the static keyword is called a
 *      Static Variable.
 *
 *    - For all Global Variables (primitive or non-primitive, static or
 *      non-static), default values will be assigned automatically.
 *
 * 2. STATIC METHODS (Class Methods):
 *    - A method that is declared using the static keyword as a non-access
 *      modifier is called a Static Method.
 *
 *    - The block of code that belongs to a static method is called
 *      a Static Context.
 *
 *    - Static methods belong to the class and can be accessed using
 *      the class name.
 *
 * 3. STATIC INITIALIZERS (SIB - Static Initializer Block):
 *    - There are 2 types of Static Initializers. They are:
 *
 * // ? 1. Single-Line Static Initializer:
 *
 *    - Initializing a static variable with some data at the time of
 *      declaration is called Single-Line Static Initialization.
 *
 * // ? 2. Multi-Line Static Initializer:
 *
 *    - It is an anonymous block that is created inside the class block
 *      and prefixed with the static keyword.
 *
 *    - A single class can have multiple static initializers
 *      (Single-Line and Multi-Line).
 *
 *    - All Static Initializer Blocks (SIBs) are executed automatically
 *      during the class initialization process.
 *
 *    - If a class consists of multiple SIBs, they will be executed
 *      in top-to-bottom order.
 *
 *    - The class initialization process happens only once per class
 *      for a particular class loader.
 *
 */

public class StaticMembersSchema {

  //* 1. Single line static initializer/Static Variable Schema:
  // [access_modifier] static dataType variableName = value;
  static int a = 10;
  static int c;

  //* 2. Multi static initializer/Static Initializer Schema (SIB):
  // static { // statements }
  static {
    System.out.println("This is a static initializer block");
  }

  public static void main(String[] args) {
    int a = 1000;

    System.out.println("Normal a: " + a);
    System.out.println("Static a: " + StaticMembersSchema.a);

    int b;

    // System.out.println(b); //! Causes Compile Time Error

    System.out.println("Default value of static variable: " + c);
  }
}
