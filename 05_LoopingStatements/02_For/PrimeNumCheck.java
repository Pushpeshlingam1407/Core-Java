//TODO: WAP in java to check whether the given number is prime or not

public class PrimeNumCheck {

  public static void main(String[] args) {
    int n = 0;
    boolean res = true;
    if (n < 2) {
      res = false;
      System.out.println(res);
    } else {
      for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
          res = false;
          break;
        }
      }
      System.out.println(res);
    }
    if (res == true) System.out.println("Prime nuber");
    else System.out.println("Not a prime number");
  }
}
