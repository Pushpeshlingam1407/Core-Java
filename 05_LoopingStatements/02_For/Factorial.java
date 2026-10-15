//TODO: WAP in java to print the factorial of a given number

public class Factorial {

  public static void main(String[] args) {
    int num = 5,
      fact = 1;
    for (int i = num; i >= 1; i--) {
      fact *= i;
    }
    System.out.println("Factorial of a given number: "+fact);
  }
}
