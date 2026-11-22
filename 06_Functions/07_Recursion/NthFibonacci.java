//TODO: WAP in Java to find the Nth Fibonacci number using recursion
// Example: N = 10 -> 10th Fibonacci number is 34 (0-indexed: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34)

public class NthFibonacci {

  public static int nThFib(int n) {
    if (n == 1) return 0;
    if (n == 2) return 1;
    return nThFib(n - 1) + nThFib(n - 2);
  }

  public static void main(String[] args) {
    System.out.println("Nth Fibonacci series: " + nThFib(10));
  }
}
