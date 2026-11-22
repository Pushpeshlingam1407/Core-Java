//TODO: Demonstrate class members - static variable, non-static variable, SIB, IIB, static method, and non-static method

public class Focus {

  static int a = 10; // Static variable
  int b = 20; // Non-static (instance) variable

  static {
    System.out.println("SIB"); // Static Initializer Block (runs once on class load)
  }

  {
    System.out.println("IIB"); // Instance Initializer Block (runs on each object creation)
  }

  public static void Demo1() {
    System.out.println("Static Method");
  }

  public void Demo2() {
    System.out.println("Non-Static Method");
  }
}
