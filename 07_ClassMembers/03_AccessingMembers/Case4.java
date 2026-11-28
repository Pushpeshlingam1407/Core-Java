//TODO: Case 4 - Making an object reference variable of a class as non-static in another class

class Helper4 {

  static {
    System.out.println("SIB of Helper Class");
  }

  {
    System.out.println("IIB of Helper class");
  }
}

public class Case4 {

  static {
    System.out.println("SIB of Case class");
  }

  {
    System.out.println("IIB of Case class");
  }

  Helper4 ob = new Helper4();

  public static void main(String[] args) {
    System.out.println("Main Starts");
    Case4 obj = new Case4();
    System.out.println("Main ends");
  }
}
