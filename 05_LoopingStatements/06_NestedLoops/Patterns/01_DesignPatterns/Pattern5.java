//TODO: WAP in Java to print a 5x5 grid of stars (*) with '@' at the center (row 3, col 3)
/*
 * * * * *
 * * * * *
 * * @ * *
 * * * * *
 * * * * *
 */

public class Pattern5 {

  public static void main(String[] args) {
    int rows = 5,
      cols = 5;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (i == 3 && j == 3) System.out.print("@ ");
        else System.out.print("* ");
      }
      System.out.println();
    }
  }
}
