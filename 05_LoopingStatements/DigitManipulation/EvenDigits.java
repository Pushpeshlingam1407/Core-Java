//TODO: WAP in java to print only even digits of given number

public class EvenDigits {

  public static void main(String[] args) {
    int num = 7291548;
    while (num != 0) {
      int rem = num % 10;
      if (rem % 2 == 0) {
        System.out.println(rem);
      }
      num /= 10;
    }
  }
}
