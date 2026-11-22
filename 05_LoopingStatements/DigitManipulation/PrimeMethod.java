//TODO: WAP in Java to check whether a given number is Prime or not using a method
// Example: num = 23 -> Prime Number

public class PrimeMethod {

  public static void main(String[] a) {
    System.out.println(isPrime(23) ? "Prime Number" : "Not a Prime Number");
  }

  public static boolean isPrime(int num) {
    if (num < 2) return false;
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) return false;
    }
    return true;
  }
}
