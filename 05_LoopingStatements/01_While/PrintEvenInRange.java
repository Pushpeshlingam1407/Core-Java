//TODO: WAP in java to print only even numbers present between 100 to 200 using while loop

public class PrintEvenInRange {

  public static void main(String[] args) {
    int st = 100,
      end = 200;
    while (st <= end) {
      if (st % 2 == 0) System.out.println(st);
      st++;
    }
  }
}
