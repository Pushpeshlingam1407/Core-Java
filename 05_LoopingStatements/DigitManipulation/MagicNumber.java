//TODO: WAP in Java to check whether a given number is a Magic Number or not
// Example: num = 775 -> 7 + 7 + 5 = 19 -> 1 + 9 = 10 -> 1 + 0 = 1 (Magic Number)

public class MagicNumber {

  public static boolean isMagic(int num) {
    while (num > 9) {
      int sum = 0;
      while (num != 0) {
        int dig = num % 10;
        sum += dig;
        num /= 10;
      }
      num = sum;
    }
    return num == 1;
  }

  public static void main(String[] args) {
    boolean p = isMagic(775);
    if (!p) System.out.println("Not a Magic number");
    else System.out.println("Magic Number");
  }
}
