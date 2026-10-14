//TODO: WAP in java to print the 5 table using do-while loop

public class Table5 {

  public static void main(String[] args) {
    int n = 1,
      num = 5;

    do {
      System.out.println(num + " X " + n + " = " + num * n);
      n++;
    } while (n <= 10);
  }
}
