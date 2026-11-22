//TODO: WAP in Java to check whether a given number is a Happy Number or not
// Example: num = 19 -> 1^2 + 9^2 = 82 -> 8^2 + 2^2 = 68 -> 6^2 + 8^2 = 100 -> 1^2 + 0^2 + 0^2 = 1 (Happy Number)

public class HappyNumber {

  public static boolean isHappy(int num) {
    while (num != 1 && num != 4) {
      int sum = 0;
      while (num != 0) {
        int dig = num % 10;
        sum = sum + dig * dig;
        num /= 10;
      }
      num = sum;
    }
    return num == 1;
  }

  public static void main(String[] args) {
    boolean p = isHappy(19);
    if (!p) System.out.println("Not a Happy number");
    else System.out.println("Happy Number");
  }
}
