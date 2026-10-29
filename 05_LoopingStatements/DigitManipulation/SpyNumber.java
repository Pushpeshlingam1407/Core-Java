public class SpyNumber {

  static String isSpy(int num) {
    int sum = 0,
      pro = 1;
    while (num > 0) {
      int dig = num % 10;
      sum += dig;
      pro *= dig;
      num /= 10;
    }
    return sum == pro ? "Spy Number" : "Not a Spy Number";
  }

  public static void main(String[] args) {
    System.out.println(isSpy(1124));
  }
}
