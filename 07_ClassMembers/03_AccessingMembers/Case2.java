//TODO: Case 2 - Making a reference variable as non-static of a class inside same class

public class Case2 {

  static {
    System.out.println("This is SIB-I");
  }

  {
    System.out.println("IIB");
  }

  Case2 ob = new Case2();

  public static void main(String[] args) {
    System.out.println("Main Starts");
    System.out.println("Hello World");
    Case2 obj = new Case2();
    System.out.println("Main ends");
  }
}

//TODO: NOTE:

/*
 * Whenever we declare a non-static reference variable of the same class
 * inside that class and initialize it using the new keyword, a new object
 * gets created every time an object is created.
 *
 * During object creation, the Instance Initializer Block (IIB) gets
 * executed, which again creates another object. This process continues
 * recursively without stopping.
 *
 * As a result, multiple objects keep getting created, and multiple stack
 * frames are pushed onto the stack memory to execute the instance
 * initializers.
 *
 * Since this recursive object creation has no termination condition,
 * the stack memory eventually gets exhausted, resulting in a
 * StackOverflowError.
 */
