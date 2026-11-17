public class Prime {

  public static void main(String[] a) {
    isPrime(23);
  }

  public static boolean isPrime(int num) {
    if (num < 2) return false;
    for (int i = 2; i <= num / 2; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
