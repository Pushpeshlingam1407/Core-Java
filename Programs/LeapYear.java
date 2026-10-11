//TODO: WAP in java to find a given year is leap year or not
public class Prog3 {

  public static void main(String[] args) {
    int year = 1900;
    if (
      (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
    ) System.out.println("Leap year");
    else System.out.println("Not a leap year");
  }
}
