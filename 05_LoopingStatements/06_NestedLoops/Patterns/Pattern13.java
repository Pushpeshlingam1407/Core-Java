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
    int stars = 1,
      rows = 5,
      space = 2;

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      for (int k = 1; k <= stars; k++) {
        System.out.print("* ");
      }

      System.out.println();

      if (i < 3) {
        stars++;
        space--;
      } else {
        stars--;
        space++;
      }
    }
  }
}