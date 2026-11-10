//TODO: METHODS / FUNCTIONS IN JAVA - CHAPTER ROADMAP
//* A Method (also referred to as a Function) is a collection of statements grouped together to perform a specific task.
//* In Java, methods must reside inside a class (functions independent of a class do not exist in pure Java).

//* Topics Covered in this Chapter:
//? 1. 01_MethodBasics:
//?    - Definition of Method
//?    - Need and advantages of methods (Code reusability, modularity, readability)
//?    - General Syntax of a Method and Anatomy of Method Declaration

//? 2. 02_MethodTerminologies:
//?    - Calling Method (Caller) vs Called Method (Callee)
//?    - Method Invocation / Method Call
//?    - Actual Arguments vs Formal Arguments (Parameters)
//?    - Call Stack execution flow and Pass-by-Value mechanism

//? 3. 03_WaysToCreateMethods:
//?    - 4 Classic ways to define methods based on parameters and return types:
//?      a) Without parameters & Without return type (No Input, No Output)
//?      b) With parameters & Without return type (Input, No Output)
//?      c) Without parameters & With return type (No Input, Output)
//?      d) With parameters & With return type (Input, Output)

//? 4. 04_MethodWithReturnType:
//?    - What is a Return Type?
//?    - void vs non-void return types
//?    - Primitive return types (byte, short, int, long, float, double, char, boolean)
//?    - Non-primitive return types (String, Arrays, Objects)
//?    - Ways to capture and utilize returned values

//? 5. 05_ReturnStatement:
//?    - What is the 'return' keyword? (return??)
//?    - Purpose of return statement (Transfer control & return data)
//?    - Rules of return in void vs non-void methods
//?    - Type compatibility and widening on return
//?    - Unreachable code compilation errors

//? 6. 06_MethodOverloading:
//?    - What is Method Overloading? (Compile-time Polymorphism)
//?    - 3 Rules of Overloading (Number, Data Types, Sequence of parameters)
//?    - Why return type alone cannot overload a method
//?    - Overloading the main() method
//?    - Automatic Type Promotion and Ambiguity errors

public class MethodsOverview {

  public static void main(String[] args) {
    System.out.println("==================================================");
    System.out.println("   CHAPTER 06: METHODS / FUNCTIONS IN JAVA        ");
    System.out.println("==================================================");
    System.out.println("1. Method Basics, Definition & Syntax");
    System.out.println("2. Method Terminologies (Caller, Callee, Arguments)");
    System.out.println("3. 4 Different Ways to Create Methods");
    System.out.println("4. Method with Return Types (void & non-void)");
    System.out.println("5. The 'return' Keyword & Statement Rules");
    System.out.println("6. Method Overloading & Type Promotion");
    System.out.println("==================================================");
  }
}

