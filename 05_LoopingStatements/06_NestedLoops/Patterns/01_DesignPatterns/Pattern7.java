//TODO: WAP in Java to print a 3-row right-angled triangle pattern of stars (*) (right-aligned)
/*
 *
 * *
 * * *
 */
public class Pattern7 {

  public static void main(String[] args) {
    int rows = 3,
      cols = 3;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (i - j >= 0) System.out.print("* ");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
