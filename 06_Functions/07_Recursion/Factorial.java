//TODO: WAP in Java to find the factorial of a number using recursion

public class Factorial {

  public static int fact(int num) {
    if (num == 0 || num == 1) return 1;
    return num * fact(num - 1);
  }

  public static void main(String[] args) {
    System.out.println("Factorial of a given number: "+fact(5));
  }
}
