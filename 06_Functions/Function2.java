public class Function2 {

  static int chotu() {
    int n1 = 10,
      n2 = 20;
    return n1 + n2;
  }

  static int patlu(int n1, int n2) {
    return n1 + n2;
  }

  static String motu(int num) {
    return num % 2 == 0 ? "EVEN" : "ODD";
  }

  public static void main(String[] args) {
    System.out.println(chotu());
    System.out.println(patlu(40, 50));
    System.out.println(motu(20));
  }
}
