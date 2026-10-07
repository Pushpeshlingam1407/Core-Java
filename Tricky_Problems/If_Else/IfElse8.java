public class IfElse8 {

  public static void main(String[] args) {
    int a = 1;

    if ((a++ == 1 && ++a == 3) || a++ == 3) System.out.println(
      "a value in if: " + a
    );
    else System.out.println("a value in else: " + ++a);
  }
}
