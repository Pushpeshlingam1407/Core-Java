//TODO: WAP in java to print the sum of digits
public class SumOfDigits {

  public static void main(String[] args) {
    int num = 5367,
      sum = 0;
    while (num != 0) {
      int rem = num % 10;
      sum = sum + rem;
      num /= 10;
    }
    System.out.println(sum);
  }
}
