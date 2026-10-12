//TODO: WAP in java to find maximum between three numbers

public class MaxOfThreeNumbers {

  public static void main(String[] args) {
    int n1 = 90,
      n2 = 100,
      n3 = 87;
    if (n1 > n2) {
      if (n1 > n3) System.out.println(
        "n1 is the maximum number: " + n1
      );
      else System.out.println("n3 is the maximum number: " + n3);
    } else {
      if (n2 > n3) System.out.println(
        "n2 is the maximum number: " + n2
      );
      else System.out.println("n3 is the maximum number: +n3");
    }
  }
}
