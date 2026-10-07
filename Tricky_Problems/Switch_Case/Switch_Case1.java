package Switch_Case;
public class Switch_Case1 {

  public static void main(String[] args) {
    int x = 2;

    switch (x++) {
      case 1:
        System.out.print("A\n");
        break;
      case 2:
        System.out.print("B\n");
      case 3:
        System.out.print("C\n");
        break;
      default:
        System.out.print("D\n");
    }

    System.out.println(x);
  }
}
