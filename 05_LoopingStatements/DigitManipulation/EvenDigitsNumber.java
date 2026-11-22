public class EvenDigitsNumber {

  public static void main(String[] args) {
    int num = 9632,
      rev = 0;
    while (num != 0) {
      int dig = num % 10;
      if (dig % 2 == 0) rev = rev * 10 + dig;
      num /= 10;
    }
    System.out.println("Reversed number: " + rev);
  }
}
