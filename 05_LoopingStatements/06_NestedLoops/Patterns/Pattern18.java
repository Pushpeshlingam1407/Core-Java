public class Pattern18 {

  public static void main(String[] args) {
    int row = 4,
      space = 4,
      star = -1;
    for (int i = 1; i <= row; i++) {
      char ch = 'a';
      space--;
      star += 2;
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
