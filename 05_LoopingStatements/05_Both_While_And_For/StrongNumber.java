//TODO: WAP in java to find a number is strong or not

public class StrongNumber {

  public static void main(String[] args) {
    //TODO: Method 1 without functions
    // int num = 145,
    //   fact,
    //   sum = 0;
    // int temp = num;
    // while (num != 0) {
    //   fact = 1;
    //   int rem = num % 10;
    //   for (int i = rem; i >= 1; i--) {
    //     fact *= i;
    //   }
    //   sum += fact;
    //   num /= 10;
    // }
    // System.out.println(sum);
    // if (sum == temp) System.out.println("Strong number");
    // else System.out.println("not a strong number");
    //TODO: Method 2 with functions
    System.out.println(isStrong(145));
  }

  static String isStrong(int num) {
    int temp = num,
      sum = 0;
    while (num > 0) {
      int dig = num % 10;
      sum += fact(dig);
      num /= 10;
    }
    return temp == sum ? "Strong" : "Not Strong";
  }

  static int fact(int dig) {
    int fact = 1;
    for (int i = 2; i <= dig; i++) fact *= i;
    return fact;
  }
}
