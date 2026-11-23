//TODO: WAP in Java to extract digits at even positions (from right to left) from a given number
// Example: num = 123456 -> digits at positions 2, 4, 6 from right (5, 3, 1) -> Output: 531

public class OddPositiveDigits {

  public static void main(String[] args) {
    int num = 123456,
      rev = 0,
      pos = 1;
    while (num != 0) {
      int dig = num % 10;
      if (pos % 2 == 0) rev = rev * 10 + dig;
      pos++;
      num /= 10;
    }
    System.out.println("Odd Positive digits of a given number: " + rev);
  }
}
