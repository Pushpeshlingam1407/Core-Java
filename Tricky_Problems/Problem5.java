public class Problem5 {

  public static void main(String[] args) {
    int a = 10;
    if (a++ > 10) {
      if (++a > 12) System.out.println("A");
      else System.out.println("B");
    } else System.out.println("C");
  }
}
