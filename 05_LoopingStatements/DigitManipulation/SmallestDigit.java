//TODO: WAP in java to find the smallest digit of given number
// Example: num = 129654, Output: 1

public class SmallestDigit {

  public static void main(String[] args) {
    int num = 29654;
    int small = num % 10;
    while (num > 0) {
      int rem = num % 10;
      if (small > rem) small = rem;
      num /= 10;
    }
    System.out.println("Smallest digit: " + small);
  }
}
