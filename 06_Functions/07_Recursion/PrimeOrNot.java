//TODO: WAP in Java to check whether a given number is Prime or not using recursion
// Example: num = 17 -> Prime Number

public class PrimeOrNot {

  public static boolean isPrime(int n, int i) {
    if (n < 2) return false;
    if (i > n / 2) return true;
    if (n % i == 0) return false;
    return isPrime(n, i + 1);
  }

  public static void main(String[] args) {
    System.out.println(isPrime(17, 2));
  }
}
