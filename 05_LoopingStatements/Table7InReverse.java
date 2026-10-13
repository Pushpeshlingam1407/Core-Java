//TODO: WAP in java to print 7th table in reverse order from 10 to 1

public class Table7InReverse {

  public static void main(String[] args) {
    int i = 10,
      num = 7;
    while (i >= 1) {
      System.out.println(num + " X " + i + " = " + num * i);
      i--;
    }
  }
}
