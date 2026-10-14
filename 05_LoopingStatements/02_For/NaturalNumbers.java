public class NaturalNumbers {

  public static void main(String[] args) {
    // int n = 100,
    //   i = 1;
    // System.out.println((n * (n + 1)) / 2);
    int n = 10,
      sum = 0;
    for (int p = 0; p <= n; p++) {
      sum += p;
    }
    System.out.println("Sum of " + n + " Natural numbers: " + sum);
  }
}
