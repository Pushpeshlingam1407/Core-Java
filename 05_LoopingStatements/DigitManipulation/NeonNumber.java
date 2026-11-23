public class NeonNumber {

  public static void main(String[] args) {
    int num = 87,
      sq = num * num,
      sum = 0;
    while (sq != 0) {
      int dig = sq % 10;
      sum += dig;
      sq /= 10;
    }
    if (sum == num) System.out.println("Neon Number");
    else System.out.println("Not a neon number");
  }
}
