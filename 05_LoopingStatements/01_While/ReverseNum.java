//TODO: WAP in java to reverse the given number

public class ReverseNum {

  public static void main(String[] args) {
    int num = 26689,
      rev = 0;
    while (num != 0) {
      rev = rev * 10 + (num % 10);
      num /= 10;
    }
    System.out.println("Reverse of a number: " + rev);
  }
}
