//TODO: WAP in java to find product of first 10 natural numbers using for loop

public class ProductOfNaturalNumbers {

  public static void main(String[] args) {
    int n = 10,
      pro = 1;
    for (int p = 1; p <= n; p++) {
      pro *= p;
    }
    System.out.println(pro);
  }
}
