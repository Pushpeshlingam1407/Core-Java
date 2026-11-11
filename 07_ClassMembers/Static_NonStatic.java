public class Static_NonStatic {

  static int x = 10;
  int y = 20;

  static {
    x = x + 5;
    System.out.println("SIB 1: " + x);
  }

  {
    x = x + 2;
    y = y + 5;
    System.out.println("IIB 1: " + x + " " + y);
  }

  static {
    x = x * 2;
    System.out.println("SIB 2: " + x);
  }

  {
    x = x + 3;
    y = y * 2;
    System.out.println("IIB 2: " + x + " " + y);
  }

  public static void main(String[] args) {
    Static_NonStatic d1 = new Static_NonStatic();

    System.out.println("Final: " + x + " " + d1.y);
  }
}
