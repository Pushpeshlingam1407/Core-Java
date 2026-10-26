public class Pattern11 {

  public static void main(String[] args) {
    int stars = 1,
      rows = 5;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= stars; j++) {
        System.out.print("* ");
      }
      System.out.println();
      if (i < 3) stars++;
      else stars--;
    }
  }
}
