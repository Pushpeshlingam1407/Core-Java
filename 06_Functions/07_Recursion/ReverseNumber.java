//TODO: WAP in Java to reverse a number using recursion
// Example: num = 10345 -> Reversed: 54301

public class ReverseNumber {

  public static int rev(int num, int res) {
    if (num == 0) return res;
    return rev(num / 10, res * 10 + (num % 10));
  }

  public static void main(String[] args) {
    System.out.println("Reversed Digit: " + rev(10345, 0));
  }
}
