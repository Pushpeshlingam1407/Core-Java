//TODO: WAP in Java to print a butterfly / hourglass-wings pattern of stars (*)
/*
 * *         * * 
 * * *     * * * 
 * * * * * * * * 
 * * *     * * * 
 * *         * * 
 */
public class Pattern15 {

  public static void main(String[] args) {
    int space = 4,
      rows = 5,
      stars = 2;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= stars; j++) {
        System.out.print("* ");
      }
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }
      for (int k = 1; k <= stars; k++) {
        System.out.print("* ");
      }
      System.out.println();
      if (i < 3) {
        stars++;
        space -= 2;
      } else {
        stars--;
        space += 2;
      }
    }
  }
}
