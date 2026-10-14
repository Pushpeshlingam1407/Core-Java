//TODO: WAP in java to reverse digits of an octal number

public class ReverseDigitLast1 {

  public static void main(String[] args) {
    int num = 01010;
    while (num != 0) {
      int rem = num % 10;
      System.out.println(rem);
      num /= 10;
    }
  }
}
