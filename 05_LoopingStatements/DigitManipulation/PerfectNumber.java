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
