//TODO: WAP in Java to swap adjacent digits of a number (in pairs of two)
// Example: num = 123456 -> Output: 214365

public class SwapAdjacentNum {

  public static void main(String[] args) {
    int num = 123456,
      res = 0;
    while (num != 0) {
      int dig = num % 100;
      num /= 100;
      res = res * 100 + dig;
    }
    int rev = 0;
    while (res != 0) {
      rev = rev * 10 + (res % 10);
      res /= 10;
    }
    System.out.println(rev);
  }
}
