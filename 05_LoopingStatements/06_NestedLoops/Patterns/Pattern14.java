//TODO: WAP in Java to print a butterfly / hourglass-wings pattern of stars (*)
/*

 *        * 
 * *    * * 
 * * *  * * 
 * *    * * 
 *        *
 
 */
public class Pattern15 {

  public static void main(String[] args) {
    int rows = 5,
      cols = 5;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (
          (i + j >= 6 && i - j >= 0) || (i + j <= 6 && i - j <= 0)
        ) System.out.print("  ");
        else System.out.print("* ");
      }
      System.out.println();
    }
  }
}
