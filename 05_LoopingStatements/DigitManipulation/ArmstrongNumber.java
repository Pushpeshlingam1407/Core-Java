public class ArmstrongNumber {

  static String isArmstrong(int num) {
    int temp = num,
      sum = 0;
    while (num > 0) {
      int dig = num % 10;
      sum += cube(dig);
      num /= 10;
    }
    return temp == sum ? "Armstrong number" : "Not an armstrong number";
  }

  static int cube(int dig) {
    return dig * dig * dig;
  }

  public static void main(String[] args) {
    System.out.println(isArmstrong(156));
  }
}
