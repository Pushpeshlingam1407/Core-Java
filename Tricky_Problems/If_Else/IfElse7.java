public class IfElse7 {

  public static void main(String[] args) {
    int x = 0;
    if ((x++ != 0 && ++x != 2) || x++ == 2) System.out.println("A " + x);
    else System.out.println("B " + x);
  }
}
