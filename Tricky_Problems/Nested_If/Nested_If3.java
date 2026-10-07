package Nested_If;

public class Nested_If3 {

  public static void main(String[] args) {
    int x = 5;
    if (x++ > 5) {
      if (++x > 7) System.out.println("A");
      else System.out.println("B");
    } else System.out.println("C");
    System.out.println(x);
  }
}
