public class CountDigits {

  public static int count(int n) {
    if (n < 10) return 1;
    return 1 + count(n / 10);
  }

  public static void main(String[] args) {
    System.out.println("Number of Digits: " + count(123));
  }
}
