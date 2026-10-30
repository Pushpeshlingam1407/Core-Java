public class MethodOverloading {

  public static void main(String[] args) {
    add(10.3, 20);
    add(4, 5);
    add(7, 8, 9);
    add(5, 6, 7, 8);
    add(1, 31.2);
    sub(19.8, 8.06);
    System.out.println(add(10.78, 23));
    // test();
  }

  static int add(double n1, int n2) {
    System.out.println(n1 + n2);
    return 100;
  }

  static char add(int n1, int n2) {
    System.out.println(n1 + n2);
    return 'a';
  }

  static double add(int n1, int n2, int n3) {
    System.out.println(n1 + n2 + n3);
    return 10.25;
  }

  static boolean add(int n1, int n2, int n3, int n4) {
    System.out.println(n1 + n2 + n3 + n4);
    return true;
  }

  static void add(int n1, double n2) {
    System.out.println(n1 + n2);
  }

  static void sub(double n1, double n2) {
    System.out.println(n1 - n2);
  }

  static void test() {
    System.out.println("Hiii");
    test();
  }
}
