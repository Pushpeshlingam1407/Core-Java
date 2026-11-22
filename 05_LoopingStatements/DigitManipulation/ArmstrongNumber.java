//TODO: WAP in Java to check whether a given number is an Armstrong number or not
// Example: 153 -> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 (Armstrong Number)

public class ArmstrongNumber {

  public static int count(int num) {
    int count = 0;
    while (num != 0) {
      int dig = num % 10;
      count++;
      num /= 10;
    }
    return count;
  }

  public static int pow(int b, int p) {
    int res = 1;
    for (int i = 1; i <= p; i++) {
      res *= b;
    }
    return res;
  }

  public static boolean isArmstrong(int num) {
    int sum = 0,
      temp = num;
    int c = count(num);
    while (num != 0) {
      int dig = num % 10;
      sum += pow(dig, c);
      num /= 10;
    }
    return sum == temp;
  }

  public static void main(String[] args) {
    boolean des = isArmstrong(156);
    if (!des) System.out.println("Not a Armstrong number!");
    else System.out.println("Armstrong Number");
  }
}
