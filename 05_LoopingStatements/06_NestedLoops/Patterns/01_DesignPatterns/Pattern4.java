//TODO: WAP in Java to print a 4x4 pattern with stars (*) only on the first (1st) and last (4th) columns
/*

 *     *
 *     *
 *     *
 *     *
 
 */
public class Pattern4 {

  public static void main(String[] args) {
    int rows = 4,
      cols = 4;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (j == 1 || j == 4) System.out.print("* ");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
