package If_Else;

public class If_Else10 {

  public static void main(String[] args) {
    int x = 0;

    if (++x > 0 && ++x > 1 && ++x > 2) System.out.println("Output of if: " + x);
    else System.out.println("Output of else: " + ++x);
  }
}
