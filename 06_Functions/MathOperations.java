public class MathOperations {

  public static void main(String[] args) {
    greet();
    sumDigits(123456);
    motu();
    System.out.println(add(6, 7, 8));
    System.out.println(sub(10, 8));
    System.out.println(mul(2, 10));
    System.out.println(div(10, 2));
    System.out.println(rem(25, 10));
    System.out.println(isChar('8'));
    System.out.println(isValid(6));
    System.out.println(sqr(5));
  }

  static void greet() {
    System.out.println("Hello java!");
  }

  static void sumDigits(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    System.out.println("Sum of digits: " + sum);
  }

  static void motu() {
    int n1 = 1,
      n2 = 9;
    System.out.println(n1 + n2);
  }

  public static int add(int a, int b, int c) {
    System.out.println("Addition: ");
    return a + b + c;
  }

  public static double sub(int a, int b) {
    System.out.println("Subtraction: ");
    return a - b;
  }

  public static int mul(int a, int b) {
    System.out.println("Multiplication: ");
    return a * b;
  }

  public static int div(int a, int b) {
    System.out.println("Division: ");
    return a / b;
  }

  public static double rem(int a, int b) {
    System.out.println("Remainder: ");
    return a % b;
  }

  public static boolean isValid(int a) {
    System.out.println("Boolean value: ");
    return true;
  }

  public static char isChar(int a) {
    System.out.println("Character: ");
    return 'C';
  }

  public static double sqr(int s) {
    System.out.println("square value: ");
    return s * s;
  }
}
