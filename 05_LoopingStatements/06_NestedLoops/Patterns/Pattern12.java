//TODO: WAP in Java to print an inverted pyramid pattern of stars (*)
/*
 * * * * * 
   * * * 
     * 
 */
public class Pattern12 {

  public static void main(String[] args) {
    int space = 0,
      rows = 3,
      stars = 5;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      space += 2;
      for (int k = 1; k <= stars; k++) {
        System.out.print("* ");
      }
      stars -= 2;
      System.out.println();
    }
  }
}
