//TODO: WAP in java to find sum of first 10 natural numbers using do-while loop

public class SumOfNaturalNumbers {

  public static void main(String[] args) {
    int n = 10,
      i = 1,
      sum = 0;

    do {
      sum += i;
      i++;
    } while (i <= n);

    System.out.println("Sum of first " + n + " natural numbers: " + sum);
  }
}
