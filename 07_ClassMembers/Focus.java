public class Focus {

  static int a = 10;
  int b = 20;

  static {
    System.out.println("SIB");
  }

  {
    System.out.println("IIB");
  }

  public static void Demo1() {
    System.out.println("Static Method");
  }

  public void Demo2() {
    System.out.println("Non-Static Method");
  }
}
