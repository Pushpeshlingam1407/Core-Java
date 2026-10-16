//TODO: WAP in Java to find Strong numbers (sum of factorial of digits = number) in a range
//* For loop for range iteration, while loop for extracting digits, for loop for factorial */

public class StrongNumberInRange {

  public static void main(String[] args) {
    int start = 1;
    int end = 500;

    System.out.println("Strong numbers between " + start + " and " + end + ":");

    for (int num = start; num <= end; num++) {
      int temp = num;
      int sum = 0;

      while (temp != 0) {
        int rem = temp % 10;
        int fact = 1;

        // Calculate factorial of each digit using for loop
        for (int i = 1; i <= rem; i++) {
          fact *= i;
        }

        sum += fact;
        temp /= 10;
      }

      if (sum == num) {
        System.out.print(num + " ");
      }
    }
    System.out.println();
  }
}
