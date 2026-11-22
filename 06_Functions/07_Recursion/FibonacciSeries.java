//TODO: WAP in Java to print the Fibonacci series up to N terms using recursion
// Example: N = 10 -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class FibonacciSeries {

  public static void Fib(int a, int b, int n) {
    if (n == 0) return;
    System.out.println(a);
    Fib(b, a + b, n - 1);
  }

  public static void main(String[] args) {
    Fib(0, 1, 17);
  }
}
