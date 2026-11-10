//TODO: WAP in Java to print a 5-row diamond pattern of stars (*)
/*
    *
  * * *
* * * * *
  * * *
    *
 */
public class Pattern16 {

  public static void main(String[] args) {
    int row = 5,
      space = (row + 1) / 2,
      star = -1;
    for (int i = 1; i <= row; i++) {
      if (i <= (row + 1) / 2) {
        space--;
        star += 2;
      } else {
        space++;
        star -= 2;
      }
      for (int j = 1; j <= space; j++) System.out.print("  ");
      for (int k = 1; k <= star; k++) System.out.print("* ");
      System.out.println();
    }
  }
}
