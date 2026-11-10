//TODO: WAP in Java to print a 7-row diamond pattern of palindromic lowercase alphabet characters
/*
      a 
    a b a 
  a b c b a 
a b c d c b a 
  a b c b a 
    a b a 
      a 
 */
public class Pattern19 {

  public static void main(String[] args) {
    int row = 7,
      space = 4,
      star = -1;
    for (int i = 1; i <= row; i++) {
      char ch = 'a';
      if (i <= (row + 1) / 2) {
        space--;
        star += 2;
      } else {
        space++;
        star -= 2;
      }
      for (int j = 1; j <= space; j++) System.out.print("  ");
      for (int k = 1; k <= star; k++) {
        System.out.print(ch + " ");
        if (k <= star / 2) ch++;
        else ch--;
      }
      System.out.println();
    }
  }
}
