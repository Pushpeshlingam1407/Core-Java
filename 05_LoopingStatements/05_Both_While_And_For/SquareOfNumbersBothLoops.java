//TODO: WAP in Java to print square of numbers from 1 to 10 demonstrating both for loop and while loop side-by-side

public class SquareOfNumbersBothLoops {

  public static void main(String[] args) {
    int n = 10;

    System.out.println("--- Using FOR Loop ---");
    for (int i = 1; i <= n; i++) {
      System.out.println("Square of " + i + ": " + (i * i));
    }

    System.out.println("\n--- Using WHILE Loop ---");
    int j = 1;
    while (j <= n) {
      System.out.println("Square of " + j + ": " + (j * j));
      j++;
    }
  }
}
