//TODO: WAP in Java to print a 4x4 grid of stars (*) where the 2nd row is '@'
/*
 * * * *
 @ @ @ @
 * * * *
 * * * *
 */
public class Pattern2 {

  public static void main(String[] args) {
    int rows = 4,
      cols = 4;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (i == 2) System.out.print("@ ");
        else System.out.print("* ");
      }
      System.out.println();
    }
  }
}
