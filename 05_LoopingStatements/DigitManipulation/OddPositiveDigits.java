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
