public class IncrementDecrement1 {

  public static void main(String[] args) {
    int a = 9;
    int b = 20;
    int c = a++ + ++b + b++ + b++ + ++b + ++a;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
