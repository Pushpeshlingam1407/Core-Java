//TODO: Write a Java program to count the number of digits in a given number using a `while` loop.
public class CountDigits {

  public static void main(String[] args) {
    int num = 245688786;
    int count = 0;
    while (num != 0) {
      num = num / 10;
      count++;
    }
    System.out.println("Number of digits: " + count);
  }
}
