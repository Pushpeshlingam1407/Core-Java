//TODO: Tricky problem: Predict variable state with multiple increment operations in boolean condition

public class If_Else8 {

  public static void main(String[] args) {
    int a = 1;

    if ((a++ == 1 && ++a == 3) || a++ == 3) System.out.println(
      "a value in if: " + a
    );
    else System.out.println("a value in else: " + ++a);
  }
}
