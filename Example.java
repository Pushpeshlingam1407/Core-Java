public class Example {

  public static void main(String[] args) {
    // motu();
    // chotu(10, 20);
    sumDigits(156);
  }

  static void sumDigits(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    System.out.println("Sum of digits: " + sum);
  }

  static void chotu(int n1, int n2) {
    System.out.println(n1 + n2);
  }

  static void motu() {
    int n1 = 1,
      n2 = 9;
    System.out.println(n1 + n2);
  }
}
