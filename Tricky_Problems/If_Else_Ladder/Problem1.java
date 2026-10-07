public class Problem1 {

  public static void main(String[] args) {
    int a = 2;

    if (a++ > 2) {
      System.out.println("A");
    } else if (++a > 3) {
      System.out.println("B");
    } else if (a++ > 4) {
      System.out.println("C");
    } else {
      System.out.println("D");
    }

    System.out.println(a);
  }
}
