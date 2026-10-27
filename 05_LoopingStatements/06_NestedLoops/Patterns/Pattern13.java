//TODO: WAP in Java to print a 5-row half-diamond pattern of stars (*) (right-aligned / pointing left)
/*
 *
 * *
 * * *
 * *
 *
 */
public class Pattern13 {

  public static void main(String[] args) {
    int rows = 5,
      cols = 3;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (i + j <= 6 && i - j >= 0) System.out.print("* ");
        else System.out.print("  ");
      }
      System.out.println();
    }
  }
}
