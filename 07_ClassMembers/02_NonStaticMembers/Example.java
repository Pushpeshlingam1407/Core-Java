public class Example {

  int a = 10;

  {
    System.out.println("IIB");
  }

  public void sub() {
    System.out.println("Non static method");
  }

  public static void main(String[] args) {
    System.out.println("Hello world!!");
    Example e1 = new Example();
    Example e2 = new Example();
    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e1.a);
    e1.sub();
  }
}
