public class SwapAdjacentNum {

  public static void main(String[] args) {
    int num = 123456;
    int result = 0;
    int place = 1;

    while (num > 0) {
      int first = num % 10;
      num = num / 10;

      if (num > 0) {
        int second = num % 10;
        num = num / 10;

        result = result + second * place;
        place = place * 10;

        result = result + first * place;
        place = place * 10;
      } else {
        result = result + first * place;
      }
    }

    System.out.println(result);
  }
}
