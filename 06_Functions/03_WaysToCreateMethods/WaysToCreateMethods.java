//TODO: 4 Different Ways to Create Methods in Java based on parameters and return types.

/*
 * ============================================================================
 *                 //TODO: DIFFERENT WAYS TO CREATE METHODS
 * ============================================================================
 * 
 * In Java, depending on whether a method:
 *   1. Accepts input data (Parameters)
 *   2. Sends data back to the caller (Return Value)
 * 
 * Methods are classified into FOUR fundamental categories:
 * 
 * +----------+----------------------------+-------------------------+
 * | Category | Parameters (Inputs)        | Return Value (Output)   |
 * +----------+----------------------------+-------------------------+
 * | Way 1    | NO (Without Parameters)    | NO (void Return Type)   |
 * | Way 2    | YES (With Parameters)      | NO (void Return Type)   |
 * | Way 3    | NO (Without Parameters)    | YES (Non-void Return)   |
 * | Way 4    | YES (With Parameters)      | YES (Non-void Return)   |
 * +----------+----------------------------+-------------------------+
 * 
 * ----------------------------------------------------------------------------
 * 1. WAY 1: WITHOUT PARAMETERS & WITHOUT RETURN TYPE (No Input, No Output)
 * ----------------------------------------------------------------------------
 * - Syntax:
 *     public static void methodName() {
 *         // statements
 *     }
 * - Characteristics:
 *     - Neither expects any data from caller nor produces any data for caller.
 *     - Self-contained, static behavior.
 * - Ideal Use Cases:
 *     - Displaying static menus, application banners, headers, greetings, instructions.
 * 
 * ----------------------------------------------------------------------------
 * 2. WAY 2: WITH PARAMETERS & WITHOUT RETURN TYPE (Input, No Output)
 * ----------------------------------------------------------------------------
 * - Syntax:
 *     public static void methodName(dataType param1, dataType param2) {
 *         // statements using param1, param2
 *     }
 * - Characteristics:
 *     - Accepts external data from caller to customize its execution.
 *     - Performs action (like printing or updating) but sends nothing back.
 * - Ideal Use Cases:
 *     - Printing personalized user profiles, saving records to a database,
 *       drawing custom patterns of given row size.
 * 
 * ----------------------------------------------------------------------------
 * 3. WAY 3: WITHOUT PARAMETERS & WITH RETURN TYPE (No Input, Output)
 * ----------------------------------------------------------------------------
 * - Syntax:
 *     public static returnType methodName() {
 *         // statements
 *         return value;
 *     }
 * - Characteristics:
 *     - Does not need caller input, but produces a meaningful value and returns it.
 *     - Uses 'return <value>;' statement.
 * - Ideal Use Cases:
 *     - Returning current system time, generating OTP/random numbers,
 *       reading user input from keyboard, fetching fixed configuration values.
 * 
 * ----------------------------------------------------------------------------
 * 4. WAY 4: WITH PARAMETERS & WITH RETURN TYPE (Input, Output)
 * ----------------------------------------------------------------------------
 * - Syntax:
 *     public static returnType methodName(dataType param1, dataType param2) {
 *         // statements
 *         return value;
 *     }
 * - Characteristics:
 *     - The most powerful, modular, and reusable design in programming!
 *     - Caller supplies input; method computes and hands back the result.
 *     - Clean separation of logic (processing) from presentation (printing).
 * - Ideal Use Cases:
 *     - Mathematical calculations (square, power, sum, factorial),
 *       string transformations, search/sort algorithms, business validations.
 */

public class WaysToCreateMethods {

  //* -------------------------------------------------------------------------
  //* WAY 1: No Parameters, No Return Type (void)
  //* -------------------------------------------------------------------------
  public static void printBanner() {
    System.out.println("----------------------------------------------");
    System.out.println("     WELCOME TO STUDENT MANAGEMENT PORTAL     ");
    System.out.println("----------------------------------------------");
  }

  //* -------------------------------------------------------------------------
  //* WAY 2: With Parameters, No Return Type (void)
  //* -------------------------------------------------------------------------
  public static void displayStudentInfo(String name, int rollNo, double marks) {
    System.out.println("Student Details -> Name: " + name + " | Roll No: " + rollNo + " | Marks: " + marks);
  }

  //* -------------------------------------------------------------------------
  //* WAY 3: No Parameters, With Return Type
  //* -------------------------------------------------------------------------
  public static int generatePasscode() {
    // Generates a 4-digit passcode between 1000 and 9999
    int passcode = (int) (Math.random() * 9000) + 1000;
    return passcode;
  }

  //* -------------------------------------------------------------------------
  //* WAY 4: With Parameters, With Return Type
  //* -------------------------------------------------------------------------
  public static double calculatePercentage(double obtainedMarks, double totalMarks) {
    double percentage = (obtainedMarks / totalMarks) * 100.0;
    return percentage;
  }

  public static void main(String[] args) {
    System.out.println("=== DEMO: 4 WAYS TO CREATE METHODS IN JAVA ===\n");

    //? 1. Calling Way 1 (No Input, No Output):
    printBanner();

    //? 2. Calling Way 2 (Input given, No Output):
    displayStudentInfo("Aarav Sharma", 101, 465.5);
    displayStudentInfo("Priya Patel", 102, 482.0);

    //? 3. Calling Way 3 (No Input, Output received):
    int otp = generatePasscode();
    System.out.println("\n[Way 3] Generated Security Passcode: " + otp);

    //? 4. Calling Way 4 (Input given, Output received):
    double percent1 = calculatePercentage(465.5, 500.0);
    double percent2 = calculatePercentage(482.0, 500.0);
    System.out.println("\n[Way 4] Aarav's Percentage: " + percent1 + "%");
    System.out.println("[Way 4] Priya's Percentage: " + percent2 + "%");
  }
}

