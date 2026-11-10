//TODO: WAP in Java to print a 5-row diamond pattern of sequential lowercase alphabet characters
/*
    a 
  a b c 
a b c d e 
  a b c 
    a 
 */
public class Pattern17 {

  public static void main(String[] args) {
    int row = 5,
      space = 3,
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
        System.out.print(ch+" ");
        ch++;
      }
      System.out.println();
    }
  }
}
