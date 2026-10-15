//TODO: WAP in java to check sum of even digits and sum of odd digits are equal or not, if yes print "Yes" else "No"

public class SumOfEvenAndOddDigits {

  public static void main(String[] args) {
    int num = 9281,
      sumEven = 0,
      sumOdd = 0;
    while (num != 0) {
      int rem = num % 10;
      if (rem % 2 == 0) sumEven += rem;
      else sumOdd += rem;
      num /= 10;
    }
    if (sumEven == sumOdd) System.out.println("Both sum of digits are equal");
    else System.out.println("Not equal");
  }
}
