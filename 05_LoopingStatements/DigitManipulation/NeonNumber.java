//TODO: WAP in Java to check whether a given number is a Neon Number or not
// Example: num = 9 -> 9^2 = 81 -> sum of digits = 8 + 1 = 9 (Neon Number)

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
