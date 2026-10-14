//TODO: Tricky problem: Predict output of logical AND (&&) and OR (||) short-circuit evaluation with increments

public class If_Else5 {

  public static void main(String[] args) {
    int x = 2;
    if ((x++ > 2 && ++x > 3) || x++ == 4) System.out.println(x);
    else System.out.println(++x);
  }
}
