// TODO: THE 'this' KEYWORD IN JAVA

/*
 * 1. It is a default keyword that is present in a non-static context and
 *    points to the current object, as it holds the reference to the current object.
 *
 * 2. We can use this keyword to access non-static and static members
 *    without creating an object.
 *
 * 3. We can use this keyword only inside a non-static context.
 *    If we try to use it inside any static context, we will get a compile-time error.
 *
 * 4. Whenever the local variable and global variable have the same name,
 *    we use this keyword to access the global variable from a non-static context
 *    to avoid object creation.
 */

public class ThisKeyword {

  int a = 10;
  static int b = 20;

  public void demo() {
    int a = 30;
    System.out.println(a);
    System.out.println(this.a);
    System.out.println(this);
  }

  public static void main(String[] args) {
    ThisKeyword ob = new ThisKeyword();
    ob.demo();
    System.out.println(ob);
  }
}
