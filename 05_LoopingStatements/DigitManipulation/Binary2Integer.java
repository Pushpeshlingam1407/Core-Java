public class Binary2Integer {

  public static int bin(int n, int r, int q) {
    if (n == 0) return q;
    int m = n % 10;
    if (m == 0) return bin(n / 10, r * 2, q);
    if (m == 1) return bin(n / 10, r * 2, q + r);
    return q;
  }

  public static void main(String[] args) {
    int n = 1010,
      r = 1,
      q = 0;
    System.out.println("Given binary number is: " + bin(n, r, q));
  }
}
