//TODO: WAP in java to reverse digits of a number using do-while loop

public class ReverseNumber {

  public static void main(String[] args) {
    int num = 4567;

    do {
      int rem = num % 10;
      System.out.println(rem);
      num /= 10;
    } while (num != 0);
  }
}
