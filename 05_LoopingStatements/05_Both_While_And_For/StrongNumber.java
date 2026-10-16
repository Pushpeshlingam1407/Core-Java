//TODO: WAP in java to find a number is strong or not

public class StrongNumber {

  public static void main(String[] args) {
    int num = 145,
      fact,
      sum = 0;
    int temp = num;
    while (num != 0) {
      fact = 1;
      int rem = num % 10;
      for (int i = rem; i >= 1; i--) {
        fact *= i;
      }
      sum += fact;
      num /= 10;
    }
    System.out.println(sum);
    if (sum == temp) System.out.println("Strong number");
    else System.out.println("not a strong number");
  }
}
