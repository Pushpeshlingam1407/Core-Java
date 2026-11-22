//TODO: Demonstrate access rules between static and non-static methods (direct, via class name, and via object reference)

public class StaticAndNonStaticMethodAccess {

  static int a = 10;
  int b = 20;

  // STATIC METHOD
  public static void demo1() {
    System.out.println("demo1() executed");

    demo3();
    // VALID: Both demo1() and demo3() are static methods.
    // Static methods can directly call other static methods.

    StaticAndNonStaticMethodAccess.demo3();
    // VALID: A static method can be called using the class name.

    StaticAndNonStaticMethodAccess ob = new StaticAndNonStaticMethodAccess();
    ob.demo3();
    // VALID: A static method can also be accessed using an object.
    // However, using the class name is recommended.
  }

  // NON-STATIC METHOD
  public void demo2() {
    System.out.println("demo2() executed");

    demo3();
    // VALID: A non-static method can directly call a static method.

    StaticAndNonStaticMethodAccess.demo3();
    // VALID: Static method accessed using the class name.

    StaticAndNonStaticMethodAccess ob = new StaticAndNonStaticMethodAccess();
    ob.demo3();
    // VALID: Static method accessed using an object.
  }

  // STATIC METHOD
  public static void demo3() {
    System.out.println("demo3() executed");

    //! demo4();
    // COMPILATION ERROR:
    // A static method cannot directly access a non-static method.
    // Because demo4() belongs to an object, but static methods
    // do not have a current object (this reference).

    //! StaticAndNonStaticMethodAccess.demo4();
    // COMPILATION ERROR:
    // demo4() is a non-static method.
    // Non-static methods cannot be called using the class name.

    StaticAndNonStaticMethodAccess ob = new StaticAndNonStaticMethodAccess();
    ob.demo4();
    // VALID: A non-static method can be accessed through an object.
  }

  // NON-STATIC METHOD
  public void demo4() {
    System.out.println("demo4() executed");
  }

  // NON-STATIC METHOD
  public void demo5() {
    System.out.println("demo5() executed");

    demo4();
    // VALID: A non-static method can directly call another
    // non-static method because both belong to instance context.

    // ! StaticAndNonStaticMethodAccess.demo4();
    // COMPILATION ERROR:
    // demo4() is non-static.
    // We cannot call a non-static method using the class name.
    // We need an object to call it.

    StaticAndNonStaticMethodAccess ob = new StaticAndNonStaticMethodAccess();
    ob.demo4();
    // VALID: Calling a non-static method using an object.
  }

  public static void main(String[] args) {
    System.out.println("Calling demo1()");
    demo1();

    System.out.println("\nCalling demo2()");
    StaticAndNonStaticMethodAccess ob = new StaticAndNonStaticMethodAccess();
    ob.demo2();

    System.out.println("\nCalling demo5()");
    ob.demo5();
  }
}
