/*
 * ============================================================================
 *                         //TODO: JAVA METHOD TERMINOLOGIES
 * ============================================================================
 *
 * //TODO: UNDERSTAND THE STRUCTURE OF A METHOD
 *
 * public static void main(String[] args)
 *
 * public  -> Access Specifier (defines accessibility)
 * static  -> Non-access Modifier (allows calling without an object)
 * void    -> Return Type (does not return any value)
 * main    -> Method Name
 * String[] args -> Parameter
 * main(String[] args) -> Method Signature

 * //!: Method Header / Declaration
 * public static void main(String[] args)
 *
 * //!: Method Body / Implementation
 * {
 *     // Statements
 * }
 *
 * //IMPORTANT: Method Header + Method Body = Method Definition
 *
 * ============================================================================
 */

//* A method will execute only when it is called.
//* When we execute any program, the main method gets executed automatically
   //* because the JVM calls the main method. If we want to execute any other
   //* methods, we have to call them inside the main method.
//* To call any method, we have to make use of the method name and arguments.
//* A statement that calls another method is called a method calling statement.
//* Whenever the JVM reaches a method calling statement, the control immediately
   //* goes to the method and executes it completely. Later, the control returns
   //* to the same calling method.

public class MethodTerminologies {

  //TODO: CALLED METHOD (CALLEE)

  //NOTE: num1 and num2 are FORMAL PARAMETERS.
  //* A method that is called by another method is known as a called method.
  //* These are the variables created in the method signature that can receive
  //* the input values from the method calling statement.
  public static int calculateSum(int num1, int num2) {
    return num1 + num2;
  }

  //TODO: CALLING METHOD (CALLER)
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    //! a and b are ACTUAL ARGUMENTS.
    //* A method that calls another method is known as a calling method.
    //* They are the values/variables passed during method invocation.
    int result = calculateSum(a, b);

    System.out.println("Sum = " + result);
  }
}

/*
 * ============================================================================
 *                       KEY METHOD TERMINOLOGIES
 * ============================================================================
 *
 * 1. CALLING METHOD (CALLER)
 *    -> The method that calls another method.
 *
 * 2. CALLED METHOD (CALLEE)
 *    -> The method that gets called by another method.
 *
 * 3. ACTUAL ARGUMENTS
 *    -> These are the values that are passed in the method calling statement.
 *
 * 4. FORMAL PARAMETERS
 *    -> Variables declared in the method header that receive actual arguments.
 *
 * 5. EXECUTION FLOW
 *    -> Control transfers from the calling method to the called method.
 *       After execution, control returns to the calling method.
 *
 * ============================================================================
 *                            EXECUTION FLOW
 * ============================================================================
 *
 * //STEP 1: The main() method starts execution.
 *
 * //STEP 2: calculateSum(a, b) is invoked.
 *
 * //STEP 3: Actual arguments (a, b) are passed to formal parameters
 *           (num1, num2).
 *
 * //STEP 4: calculateSum() executes and returns the result.
 *
 * //STEP 5: Control returns to main().
 *
 * //STEP 6: The remaining statements in main() continue execution.
 *
 * ============================================================================
 */
