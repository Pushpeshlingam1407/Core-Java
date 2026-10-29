public class AutomorphicNumber {

  static String isAutomorphic(int num) {
    int sqAns = num * num;
    int temp = num,
      count = 0;
    do {
      int dig = num % 10;
      count++;
      num /= 10;
    } while (num > 0);
    int res = 1,
      i = 0;
    while (i < count) {
      res *= 10;
      i++;
    }
    return sqAns % res == temp
      ? "AutoMorphic Number"
      : "Not an AutoMorphic Number";
  }

  public static void main(String[] args) {
    System.out.println(isAutomorphic(25));
  }
}
