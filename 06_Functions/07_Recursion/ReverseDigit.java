//TODO: WAP in Java to reverse the digits of a number using recursion

public class ReverseDigit {

  public static int rd(int num) {
    if (num == 0) return 0;
    if (num == 1) return 1;
    int rem = num % 10;
    int fun = rd(num % 10);
    int x = rem + fun;
    return x;
  }

  public static void main(String[] args) {
    System.out.println(rd(12345));
  }
}
