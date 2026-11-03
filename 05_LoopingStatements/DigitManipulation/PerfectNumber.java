//TODO: WAP in Java to check whether a given number is a Perfect number or not
// Example: num = 6, proper divisors: 1 + 2 + 3 = 6 (Perfect Number)

public class PerfectNumber {

  public static void main(String[] args) {
    int num = 12,
      sum = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) sum += i;
      else continue;
    }
    if (sum == num) System.out.println("Perfect number");
    else System.out.println("Not a perfect number");
  }
}
