//TODO: Demonstrate execution order of multiple SIBs and IIBs without creating an object

public class Static_NonStatic1 {

  static int a = 10;
  int b = 20;

  static {
    System.out.println("SIB-I");
  }

  {
    System.out.println("IIB-I");
  }

  static {
    System.out.println("SIB-II");
  }

  {
    System.out.println("IIB-II");
  }

  {
    System.out.println("IIB-III");
  }

  public static void main(String[] mo) {
    System.out.println("Main Method");
  }
}
