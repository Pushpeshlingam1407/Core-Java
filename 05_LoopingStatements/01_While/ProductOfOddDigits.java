//TODO: WAP in java to print product of odd digits of given number

public class ProductOfOddDigits {

  public static void main(String[] args) {
    int num = 5271,
      pro = 1;
    while (num != 0) {
      int rem = num % 10;
      if (rem % 2 != 0) {
        pro *= rem;
      }
      num /= 10;
    }
    System.out.println("Product of odd digits: " + pro);
  }
}
