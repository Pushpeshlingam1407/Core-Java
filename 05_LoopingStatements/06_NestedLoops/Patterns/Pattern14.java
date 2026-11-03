//TODO: WAP in Java to print a butterfly / hourglass-wings pattern of stars (*)
/*

 *       * 
 * *   * * 
 * * * * * 
 * *   * * 
 *       *
 
 */
public class Pattern14 {

  public static void main(String[] args) {
    // int rows = 5,
    //   cols = 5;
    // for (int i = 1; i <= rows; i++) {
    //   for (int j = 1; j <= cols; j++) {
    //     if (
    //       (i + j >= 6 && i - j >= 0) || (i + j <= 6 && i - j <= 0)
    //     ) System.out.print("  ");
    //     else System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    //TODO: METHOD 2
    int row = 7,
      star = 0,
      space = row;
    for (int i = 1; i <= row; i++) {
      if (i <= (row + 1) / 2) {
        star++;
        space -= 2;
      } else {
        star--;
        space += 2;
      }
      for (int j = 1; j <= star; j++) System.out.print("* ");
      for (int k = 1; k <= space; k++) System.out.print("  ");
      for (int l = 1; l <= star; l++) {
        if (i == (row + 1) / 2 && l == 1) continue;
        else System.out.print("* ");
      }
      System.out.println();
    }
  }
}
