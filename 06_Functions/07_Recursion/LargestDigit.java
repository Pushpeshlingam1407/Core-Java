//TODO: WAP in Java to find the largest digit of a number using recursion

public class LargestDigit {

  public static int lar(int num) {
    if (num == 0) return 0;
    if (num % 10 > lar(num / 10)) return num % 10;
    return lar(num / 10);
  }

  public static void main(String[] args) {
    System.out.println("Largest Digit: " + lar(568493));
  }
}
