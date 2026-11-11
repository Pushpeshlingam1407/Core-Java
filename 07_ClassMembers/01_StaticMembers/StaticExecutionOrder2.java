//TODO: Demonstrate static initializer execution order, accessing an initialized static variable in SIB, and calling a static method from main().

/*
 * //TODO: EXECUTION TRACE (CLASS LOADING -> MAIN):
 * //? Step 1 (Class Loading - Preparation): 'a' is allocated in Class Static Area with default value 0; demo() & main() are loaded.
 * //? Step 2 (Class Loading - Initialization, Top-to-Bottom):
 * //?    1. SIB-I runs            -> prints "SIB-I"
 * //?    2. 'a = demo()' runs     -> prints "Hello", assigns 10 to 'a'
 * //?    3. SIB-II runs           -> prints 'a' (10), then prints "SIB-II"
 * //? Step 3 (Execution): JVM calls main() -> explicitly calls demo() -> prints "Hello" again.
 *
 * //* Output:
 * //* SIB-I
 * //* Hello
 * //* 10
 * //* SIB-II
 * //* Hello
 */
public class StaticExecutionOrder2 {

  //* Multi-line Static Initializer (SIB-I): Executes 1st during class loading
  static {
    System.out.println("SIB-I");
  }

  //* Entry point: Executes after class loading finishes; explicitly calls demo()
  public static void main(String[] args) {
    demo(); // Prints "Hello" (returned value 10 is unused)
  }

  //* Single-line Static Initializer: Executes 2nd during class loading and sets 'a = 10'
  static int a = demo();

  //* Static Method: Executed once by 'a = demo()' during class loading, and once from main()
  static int demo() {
    System.out.println("Hello");
    return 10;
  }

  //* Multi-line Static Initializer (SIB-II): Executes 3rd; reads 'a' initialized above
  static {
    System.out.println(a); // Prints 10
    System.out.println("SIB-II");
  }
}
