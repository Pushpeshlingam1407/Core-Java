//TODO: WAP in java to reverse digits of a given number

public class ReverseDigitLast3 {

  public static void main(String[] args) {
    int num = 231;
    while (num != 0) {
      int rem = num % 10;
      System.out.println(rem);
      num /= 10;
    }
  }

}
