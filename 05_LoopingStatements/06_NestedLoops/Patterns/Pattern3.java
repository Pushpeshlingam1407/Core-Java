//TODO: WAP in Java to print a 4x4 pattern with stars (*) only on the first (1st) and last (4th) rows
/*
 * * * *
    
    
 * * * *
 */
public class Pattern3 {

  public static void main(String[] args) {
    int rows = 4,
      cols = 4;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (i == 1 || i == 4) System.out.print("* ");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
