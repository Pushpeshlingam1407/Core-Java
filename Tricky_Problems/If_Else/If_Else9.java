//TODO: Tricky problem: Predict short-circuit evaluation of logical OR (||) when left operand is true

public class If_Else9 {

  public static void main(String[] args) {
    int x = 1;

    if (++x == 2 || (x++ == 2 && ++x == 4)) System.out.println("YES " + x);
    else System.out.println("NO " + x);
  }
}
