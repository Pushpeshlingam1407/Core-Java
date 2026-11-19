//TODO: WAP in Java to print numbers from N to 1 using recursion

public class PrintNTo1 {

  public static void print(int num) {
    if (num == 0) return;
    System.out.println(num);
    print(num - 1);
  }

  public static void main(String[] args) {
    print(14);
  }
}
