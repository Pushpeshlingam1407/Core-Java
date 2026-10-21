//TODO: WAP in java to print product of digits of given number

public class ProductOfDigits {

  public static void main(String[] args) {
    int num = 2359,
      pro = 1;
    while (num != 0) {
      int rem = num % 10;
      pro *= rem;
      num /= 10;
    }
    System.out.println(pro);
  }
}
