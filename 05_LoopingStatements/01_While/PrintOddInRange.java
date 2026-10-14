//TODO: WAP in java to print odd numbers between 50 to 90

public class PrintOddInRange {

  public static void main(String[] args) {
    int st = 50,
      end = 90;
    while (st <= end) {
      if (st % 2 != 0) System.out.println(st);
      st++;
    }
  }
}
