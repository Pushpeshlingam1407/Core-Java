//TODO: WAP in java to execute the fibonacci series

public class Fib {

  public static void main(String[] args) {
    int numbers = 10;
    int a = 0,
      b = 1,
      c = a + b;
    for (int i = 1; i < numbers; i++) {
      System.out.println(a);
      a = b;
      b = c;
      c = a + b;
    }
  }
}
