// TODO: Write a Java program to check whether a number is divisible by both 5 and 11.

public class Prog2 {

  public static void main(String[] args) {
    int a = 55;
    if (a % 5 == 0 && a % 11 == 0) System.out.println(
      "Number is divisible by 5 and 11"
    );
    else System.out.println("Number is not divisble");
  }
}
