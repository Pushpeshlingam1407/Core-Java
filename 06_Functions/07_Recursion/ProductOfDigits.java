//TODO: WAP in Java to find the product of digits of a number using recursion

public class ProductOfDigits {

  public static int pod(int num) {
    if (num / 10 == 0) return num;
    if (num == 0) return 0;
    return (num % 10) * pod(num / 10);
  }

  public static void main(String[] args) {
    System.out.println("Product of digits: " + pod(78));
  }
}
