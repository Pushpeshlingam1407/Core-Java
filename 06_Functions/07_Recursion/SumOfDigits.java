//TODO: WAP in Java to find the sum of digits of a number using recursion

public class SumOfDigits {

  public static int sod(int num) {
    if (num == 0) return 0;
    return (num % 10) + sod(num / 10);
  }

  public static void main(String[] args) {
    System.out.println("Sum of Digits of a given number: "+sod(1556));
  }
}
