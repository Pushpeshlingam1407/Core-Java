//TODO: WAP in java to check whether sum of extreme digits and sum of mean digits are equal or not
// Example: num = 8462, extreme: 8 + 2 = 10, mean: 4 + 6 = 10

public class SumOfExtremeAndMeanDigits {

  public static void main(String[] args) {
    int num = 8642,
      extreme = 0,
      mean = 0;

    extreme += num % 10;
    num /= 10;
    while (num > 9) {
      mean += num % 10;
      num /= 10;
    }
    extreme += num % 10;
    if (extreme == mean) System.out.println("Equal");
    else System.out.println("Not Equal");
  }
}
