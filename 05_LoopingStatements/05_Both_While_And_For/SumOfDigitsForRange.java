//TODO: WAP in Java to compute sum of digits for numbers 1 to 20 using for and while loops together
//* For loop iterates over the range, while loop computes sum of digits of each number */

public class SumOfDigitsForRange {

  public static void main(String[] args) {
    int start = 1;
    int end = 20;

    System.out.println("Number -> Sum of digits:");
    for (int i = start; i <= end; i++) {
      int temp = i;
      int sum = 0;

      while (temp != 0) {
        sum += temp % 10;
        temp /= 10;
      }

      System.out.println(i + " -> " + sum);
    }
  }
}
