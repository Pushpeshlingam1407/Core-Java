//TODO: WAP in Java to find all prime factors of numbers in a range using for and while loops together
//* For loop iterates over numbers, while loop continuously divides the factor */

public class PrimeFactors {

  public static void main(String[] args) {
    int[] numbers = { 12, 30, 45, 100 };

    for (int num : numbers) {
      System.out.print("Prime factors of " + num + ": ");
      int temp = num;

      for (int factor = 2; factor <= temp; factor++) {
        // While factor divides temp, print and divide
        while (temp % factor == 0) {
          System.out.print(factor + " ");
          temp /= factor;
        }
      }
      System.out.println();
    }
  }
}
