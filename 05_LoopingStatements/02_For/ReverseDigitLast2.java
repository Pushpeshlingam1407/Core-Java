//TODO: WAP in java to reverse digits of a binary number

public class ReverseDigitLast2 {

  public static void main(String[] args) {
    int num = 0b1010;
    while (num != 0) {
      int rem = num % 10;
      System.out.println(rem);
      num /= 10;
    }
  }
}
