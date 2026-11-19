//TODO: WAP in Java to find the sum of first N natural numbers using recursion

public class SumOfNaturalNumbers {

  public static int sum(int num) {
    if (num == 0) return 0;
    if (num == 1) return 1;
    return num + sum(num - 1);
  }

  public static void main(String[] args) {
    System.out.println("Sum of First N natural numbers: " + sum(7));
  }
}
