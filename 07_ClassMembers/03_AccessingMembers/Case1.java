//TODO: Case 1 - Making reference variable as static of a class inside same class

public class Case1 {

  static {
    System.out.println("Hii this is SIB-I");
  }

  {
    System.out.println("This is IIB-I");
  }

  static Case1 ob = new Case1();

  public static void main(String[] args) {
    System.out.println("Main starts");
    System.out.println("Hello world");
    Case1 obj = new Case1();
    System.out.println("Main Ends");
  }
}
