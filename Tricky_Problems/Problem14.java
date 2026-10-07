public class Problem14 {

  public static void main(String[] args) {
    int x = 5;

    if (++x > 5) {
      if (x++ > 6) {
        if (++x > 8) System.out.println("A");
        else System.out.println("B");
      } else {
        System.out.println("C");
      }
    } else {
      System.out.println("D");
    }

    System.out.println("Value of x: " + x);
  }
}
