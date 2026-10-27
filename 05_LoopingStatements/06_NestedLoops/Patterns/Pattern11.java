//TODO: WAP in Java to print a 5-row half-diamond pattern of stars (*) (left-aligned / pointing right)
/*
       *
    *  *
 *  *  *
    *  *
       * 
 */
public class Pattern11 {

  public static void main(String[] args) {
    int rows = 5,
      cols = 3;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (i + j >= 4 && i - j <= 2) System.out.print("* ");
        else System.out.print("  ");
      }
      System.out.println();
    }
  }
}
