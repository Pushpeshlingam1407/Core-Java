public class Problem2 {

  public static void main(String[] args) {
    int x = 5;
    if (++x > 5) {
      if (x++ > 6) System.out.println("A\n");
      else System.out.println("B\n");
    } else System.out.println("C\n");
    System.out.println("x value: " + x);
  }
}
