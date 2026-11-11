//TODO: Demonstrate static and non-static initialization order, multiple SIBs, multiple IIBs, static methods and object creation.

public class Static_NonStatic2 {

  static int a = 10;
  int b = 20;

  // SIB-I
  static {
    System.out.println("SIB-I");
    a = a + 5;
    System.out.println(a);
  }

  // IIB-I
  {
    System.out.println("IIB-I");
    a = a + 2;
    b = b + 5;
    System.out.println(a + " " + b);
  }

  // Static variable initialization
  static int c = demo();

  // SIB-II
  static {
    System.out.println("SIB-II");
    a = a + c;
    System.out.println(a);
  }

  // IIB-II
  {
    System.out.println("IIB-II");
    b = b * 2;
    a = a + 3;
    System.out.println(a + " " + b);
  }

  public Static_NonStatic() {
    System.out.println("Constructor");
    a = a + 10;
    b = b + 10;
    System.out.println(a + " " + b);
  }

  static int demo() {
    System.out.println("Demo method");
    return 5;
  }

  public static void main(String[] args) {
    System.out.println("Main starts");

    Static_NonStatic e1 = new Static_NonStatic();

    System.out.println("Object 1: " + a + " " + e1.b);

    Static_NonStatic e2 = new Static_NonStatic();

    System.out.println("Object 2: " + a + " " + e2.b);

    System.out.println("Main ends");
  }
}
