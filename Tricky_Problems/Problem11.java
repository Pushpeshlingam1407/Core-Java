public class Problem11 {

  public static void main(String[] args) {
    int x = 1;

    if (++x == 2 || (x++ == 2 && ++x == 4)) System.out.println("YES " + x);
    else System.out.println("NO " + x);
  }
}
