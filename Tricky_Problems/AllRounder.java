public class AllRounder {

  public static void main(String[] args) {
    int a = 1,
      b = 2,
      c = 3;

    if ((a++ == 1 && ++b == 3) || c++ == 4) {
      if ((++a == 3 && b++ == 3) || ++c == 5) {
        if (a++ == 3 || (++b == 5 && c++ == 5)) System.out.println("P");
        else System.out.println("Q");
      } else {
        System.out.println("R");
      }
    } else {
      if (++a > 3 || ++b > 4) System.out.println("S");
      else System.out.println("T");
    }

    System.out.println(a + " " + b + " " + c);
  }
}
