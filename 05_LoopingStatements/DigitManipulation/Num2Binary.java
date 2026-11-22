//TODO: WAP in Java to convert a decimal number to its binary representation
// Example: num = 48 -> Binary: 110000

public class Num2Binary {

  public static int bin(int num) {
    int res = 0;
    while (num != 0) {
      int bi = num % 2;
      res = res * 10 + bi;
      num /= 2;
    }
    res = rev(res);
    return res;
  }

  public static int rev(int n) {
    int res = 0;
    while (n != 0) {
      int rem = n % 10;
      res = res * 10 + rem;
      n /= 10;
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(bin(48));
  }
}
