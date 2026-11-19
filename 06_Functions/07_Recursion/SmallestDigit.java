//TODO: WAP in Java to find the smallest digit of a number using recursion

public class SmallestDigit {

  public static int small(int num) {
    if (num / 10 == 0) return num;
    if (num == 0) return 0;
    if (num % 10 < small(num / 10)) return num % 10;
    return small(num / 10);
  }

  public static void main(String[] args) {
    System.out.println("Smallest Digit: " + small(4679));
  }
}
