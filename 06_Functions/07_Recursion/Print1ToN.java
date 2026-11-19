//TODO: WAP in Java to print numbers from 1 to N using recursion

public class Print1ToN {

  public static void print(int num) {
    if (num == 0) return;
    print(num - 1);
    System.out.println(num);
  }

  public static void main(String[] args) {
    print(18);
  }
}
