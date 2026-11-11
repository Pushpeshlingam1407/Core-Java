//TODO: Demonstrate non-static members and instance initialization blocks.
public class NonStaticMembers {

  int a = 10;

  {
    System.out.println("IIB");
  }

  public void sub() {
    System.out.println("Non static method");
  }

  public static void main(String[] args) {
    System.out.println("Hello world!!");
    NonStaticMembers e1 = new NonStaticMembers();
    NonStaticMembers e2 = new NonStaticMembers();
    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e1.a);
    e1.sub();
  }
}
