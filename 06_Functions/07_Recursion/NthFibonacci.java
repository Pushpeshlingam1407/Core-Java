class NthFibonacci {

  public static int nThFib(int n) {
    if (n == 1) return 0;
    if (n == 2) return 1;
    return nThFib(n - 1) + nThFib(n - 2);
  }

  public static void main(String[] args) {
    System.out.println("Nth Fibonacci series: " + nThFib(10));
  }
}
