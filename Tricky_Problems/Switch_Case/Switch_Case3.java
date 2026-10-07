public class Switch_Case3 {

  public static void main(String[] args) {
    int x = 2;

    switch (x++) {
      case 2:
        System.out.print("Value of Case 2: " + ++x + "\n");
      case 3:
        System.out.print("Value of Case 3: " + x++ + "\n");
      case 4:
        System.out.print("Value of Case 4: " + ++x + "\n");
        break;
      default:
        System.out.print("Value of Default: " + x + "\n");
    }

    System.out.println("Value of x Outside Switch: " + x + "\n");
  }
}
