//TODO: Demonstrate top-to-bottom execution order of static initializers (SIBs and single-line initializer) during class loading before main().

/*
 * //TODO: EXECUTION TRACE (CLASS LOADING -> MAIN):
 * //? Step 1 (Class Loading - Preparation): 'a' is allocated in Class Static Area with default value 0; demo() & main() are loaded.
 * //? Step 2 (Class Loading - Initialization, Top-to-Bottom):
 * //?    1. SIB-I runs            -> prints "SIB-I"
 * //?    2. 'a = demo()' runs     -> prints "Hello", assigns 10 to 'a'
 * //?    3. SIB-II runs           -> prints "SIB-II"
 * //? Step 3 (Execution): JVM calls main() -> empty body, program exits.
 *
 * //* Output:
 * //* SIB-I
 * //* Hello
 * //* SIB-II
 */
public class StaticExecutionOrder1 {

  //* Multi-line Static Initializer (SIB-I): Executes 1st during class loading
  static {
    System.out.println("SIB-I");
  }

  //* Entry point: Called by JVM only after all static initializers finish
  public static void main(String[] args) {}

  //* Single-line Static Initializer: Executes 2nd (in declaration order) and calls demo()
  static int a = demo();

  //* Static Method: Runs when invoked by the single-line static initializer above
  static int demo() {
    System.out.println("Hello");
    return 10;
  }

  //* Multi-line Static Initializer (SIB-II): Executes 3rd during class loading
  static {
    System.out.println("SIB-II");
  }
}
