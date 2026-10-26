//TODO: WAP in Java to print a 4-row inverted right-angled triangle pattern of stars (*) (right-aligned)
/*
 * * * * 
   * * * 
     * * 
       * 
 */
public class Pattern8 {

  public static void main(String[] args) {
    int space = 0,
      row = 4,
      star = 4;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }
      space++;
      for (int k = 1; k <= star; k++) {
        System.out.print("* ");
      }
      star--;
      System.out.println();
    }
  }
}
