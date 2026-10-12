//TODO: WAP in java to find maximum between three numbers

public class MaxOfThreeNumbers {

  public static void main(String[] args) {
    int n1 = 90,
      n2 = 100,
      n3 = 87;

    //TODO: Approach 1
    // if (n1 > n2) {
    //   if (n1 > n3) System.out.println(
    //     "n1 is the maximum number: " + n1
    //   );
    //   else System.out.println("n3 is the maximum number: " + n3);
    // } else {
    //   if (n2 > n3) System.out.println(
    //     "n2 is the maximum number: " + n2
    //   );
    //   else System.out.println("n3 is the maximum number: +n3");
    // }

    //TODO: Approach 2
    if (n1 > n2 && n1 > n3) System.out.println(
      "N1 is the maximum number: " + n1
    );
    else if (n2 > n3 && n2 > n1) System.out.println(
      "N2 is the maximum number: " + n2
    );
    else System.out.println("N3 is the maximum number: " + n3);
  }
}
