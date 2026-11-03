//TODO: WAP in Java to check whether a given number is a Spy number or not
// Example: num = 1124, sum = 1+1+2+4 = 8, product = 1*1*2*4 = 8 (Spy Number)

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
