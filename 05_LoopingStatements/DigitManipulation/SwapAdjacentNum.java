public class SwapAdjacentNum {

  public static void main(String[] args) {
    //   int num = 123456;
    //   int result = 0;
    //   int place = 1;
    //   while (num > 0) {
    //     int first = num % 10;
    //     num = num / 10;
    //     if (num > 0) {
    //       int second = num % 10;
    //       num = num / 10;
    //       result = result + second * place;
    //       place = place * 10;
    //       result = result + first * place;
    //       place = place * 10;
    //     } else {
    //       result = result + first * place;
    //     }
    //   }
    //   System.out.println(result);
    int num = 123456,
      res = 0;
    while (num != 0) {
      int dig = num % 100;
      num /= 100;
      res = res * 100 + dig;
    }
    int rev = 0;
    while (res != 0) {
      rev = rev * 10 + (res % 10);
      res /= 10;
    }
    System.out.println(rev);
  }
}
