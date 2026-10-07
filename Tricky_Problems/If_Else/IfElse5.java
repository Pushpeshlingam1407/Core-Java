public class IfElse5 {

  public static void main(String[] args) {
    int x = 2;
    if ((x++ > 2 && ++x > 3) || x++ == 4) System.out.println(x);
    else System.out.println(++x);
  }
}
