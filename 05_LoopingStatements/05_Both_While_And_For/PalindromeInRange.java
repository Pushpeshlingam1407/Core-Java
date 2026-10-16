//TODO: WAP in Java to print all Palindrome numbers in a range using for loop and while loop together
//* Outer for loop iterates through the range, while loop reverses each number */

public class PalindromeInRange {

  public static void main(String[] args) {
    int start = 10;
    int end = 200;

    System.out.println("Palindrome numbers between " + start + " and " + end + ":");

    for (int i = start; i <= end; i++) {
      int temp = i;
      int rev = 0;

      while (temp != 0) {
        int rem = temp % 10;
        rev = rev * 10 + rem;
        temp /= 10;
      }

      if (i == rev) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
