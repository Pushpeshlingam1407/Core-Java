//TODO: WAP in java to find the largest digit in given number
// Example: num = 129654, Output: 9

public class LargestDigit {

  public static void main(String[] args) {
    int num = 129654;
    int largest = num % 10;
    while (num > 0) {
      int rem = num % 10;
      if (largest < rem) largest = rem;
      num /= 10;
    }
    System.out.println("Largest digit: " + largest);
  }
}
