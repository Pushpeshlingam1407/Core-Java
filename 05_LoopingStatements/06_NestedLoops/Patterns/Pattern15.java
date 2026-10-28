//TODO: WAP in Java to print a diamond pattern of stars (*)
/*
  A
  * * 
  B B B
  * * * * 
 */
public class Pattern15 {

  public static void main(String[] args) {
    int rows = 4;

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        if (i == 1) System.out.print("A ");
        else if (i == 2 || i == 4) System.out.print("* ");
        else if (i == 3) System.out.print("B ");
      }
      System.out.println();
    }
  }
}
