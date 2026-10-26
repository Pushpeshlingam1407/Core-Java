//TODO:
public class Pattern6 {

  public static void main(String[] args) {
    int star = 1,
      row = 3;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= star; j++) {
        System.out.print("* ");
      }
      star++;
      System.out.println();
    }
  }
}
