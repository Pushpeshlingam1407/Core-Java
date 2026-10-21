//TODO: WAP in java to find the 1st digit of given number
// Example: num = 720, Output: 7

public class FirstDigit {

  public static void main(String[] args) {
    int num = 987654321;
    while (num >= 10) {
      num /= 10;
    }
    System.out.println("First digit: " + num);
  }
}
