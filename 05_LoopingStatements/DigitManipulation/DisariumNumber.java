public class DisariumNumber {

  public static int count(int num) {
    if (num == 0) return 1;
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

  public static boolean isDisarium(int num) {
    int sum = 0,
      temp = num;
    int c = count(num);
    while (num != 0) {
      int dig = num % 10;
      sum += pow(dig, c);
      c--;
      num /= 10;
    }
    return sum == temp;
  }

  public static void main(String[] args) {
    boolean des = isDisarium(135);
    if (!des) System.out.println("Not a Disarium number!");
    else System.out.println("Disarium Number");
  }
}
