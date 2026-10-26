//TODO: WAP in Java to print a pyramid pattern of stars (*)
/*
     * 
   * * * 
 * * * * * 
 */
public class Pattern10 {

  public static void main(String[] args) {
    int space = 4,
      stars = 1,
      rows = 5;
    for (int i = 1; i <= rows; i++) {
      if (i % 2 != 0) {
        for (int j = 1; j <= space; j++) {
          System.out.print(" ");
        }
        space -= 2;
        for (int k = 1; k <= stars; k++) {
          System.out.print("* ");
        }
        stars += 2;
        System.out.println();
      }
    }
  }
}
