public class Switch_Case2 {

  public static void main(String[] args) {
    int x = 1;

    switch (++x) {
      case 1:
        System.out.print("A");
      case 2:
        System.out.print("B");
      case 3:
        System.out.print("C");
      default:
        System.out.print("D");
    }

    System.out.println(x);
  }
}
