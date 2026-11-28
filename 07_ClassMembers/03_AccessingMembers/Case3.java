//TODO: Case 3 - Making an object reference variable of a class as static in another class

class Helper3 {

  static {
    System.out.println("SIB of Helper Class");
  }

  {
    System.out.println("IIB of Helper Class");
  }
}

public class Case3 {

  static {
    System.out.println("SIB of Case Class");
  }

  {
    System.out.println("IIB of Case Class");
  }

  static Helper3 ob = new Helper3();

  public static void main(String[] args) {
    System.out.println("Main Starts");
    Case3 obj = new Case3();
    System.out.println("Main Ends");
  }
}
