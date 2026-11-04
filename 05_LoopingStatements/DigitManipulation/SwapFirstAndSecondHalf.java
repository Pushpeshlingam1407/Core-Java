//TODO: WAP in Java to swap the first and second half of a given number
// Example: num = 123456 -> first half: 123, second half: 456 -> Output: 456123

public class SwapFirstAndSecondHalf {

  public static void main(String[] a) {
    int num = 123456,
      res = 0;
    int c = count(num);
    int q = pow(10, c / 2);
    int part1 = num / q;
    int part2 = num % q;
    res = part2 * q + part1;
    System.out.println(res);
  }

  public static int pow(int base, int p) {
    int res = base;
    for (int i = 1; i < p; i++) {
      res *= base;
    }
    return res;
  }

  public static int count(int num) {
    int count = 0;
    while (num != 0) {
      count++;
      num /= 10;
    }
    return count;
  }
}
