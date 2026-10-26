public class Pattern9 {

  public static void main(String[] args) {
    int row = 4,
      star = 4;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= star; j++) {
        System.out.print("* ");
      }
      star--;
      System.out.println();
    }
  }
}
