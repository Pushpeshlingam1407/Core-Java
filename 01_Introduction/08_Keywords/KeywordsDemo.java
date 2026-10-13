//TODO: Learn about Keywords (Reserved Words) in Java.
//* Keywords are predefined, reserved words that have a special meaning to the Java compiler.
//* Java currently has 50+ keywords (all in LOWERCASE).
//* Rules for keywords:
//* 1. You cannot use keywords as identifiers (variable names, method names, class names).
//* 2. Java is case-sensitive: 'int' is a keyword, but 'Int' or 'INT' is not (though using them is bad practice).
//* 3. 'const' and 'goto' are reserved keywords in Java, but are currently not used.
//* 4. 'true', 'false', and 'null' are reserved literals, not technically keywords, but cannot be used as identifiers.

public class KeywordsDemo {

  public static void main(String[] args) {
    System.out.println("=== KEYWORDS IN JAVA ===");
    System.out.println(
      "Keywords are reserved words that carry special predefined meaning to the JVM.\n"
    );

    //? 1. Primitive Data Type Keywords:
    //? byte, short, int, long, float, double, char, boolean, void
    byte b = 1;
    short s = 2;
    int age = 25;
    long l = 1000L;
    float f = 3.14f;
    double d = 99.99;
    char c = 'J';
    boolean active = true;

    System.out.println("1. Data Type Keywords:");
    System.out.println(
      "   byte, short, int, long, float, double, char, boolean, void"
    );
    System.out.println(
      "   Values: age=" + age + ", active=" + active + ", char=" + c + "\n"
    );

    //? 2. Flow Control Keywords:
    //? if, else, switch, case, default, while, do, for, break, continue, return
    System.out.println("2. Flow Control Keywords:");
    System.out.println(
      "   if, else, switch, case, default, while, do, for, break, continue, return"
    );
    if (age >= 18) {
      System.out.println("   Example (if-else): Eligible to vote.");
    } else {
      System.out.println("   Example (if-else): Not eligible to vote.");
    }
    System.out.println();

    //? 3. Access Modifiers & Specifiers:
    //? public, protected, private, static, final, abstract, synchronized, transient, volatile, native, strictfp
    System.out.println("3. Access Modifiers & Other Modifiers:");
    System.out.println("   public, protected, private (Access control)");
    System.out.println(
      "   static, final, abstract, synchronized, transient, volatile, native, strictfp\n"
    );

    //? 4. Class, Interface & Package Keywords:
    //? class, interface, extends, implements, package, import, enum, record, sealed, permits
    System.out.println("4. OOP & Package Keywords:");
    System.out.println(
      "   class, interface, extends, implements, package, import, enum, record\n"
    );

    //? 5. Object Reference & Handling:
    //? new, this, super, instanceof
    System.out.println("5. Object Reference Keywords:");
    System.out.println(
      "   new (creates object), this (current instance), super (parent class), instanceof (type check)\n"
    );

    //? 6. Exception Handling Keywords:
    //? try, catch, finally, throw, throws, assert
    System.out.println("6. Exception Handling Keywords:");
    System.out.println("   try, catch, finally, throw, throws, assert\n");

    //? 7. Reserved Words / Literals & Unused Keywords:
    //* 'const' and 'goto' -> Reserved by Java for future use, but cannot be used as variable names.
    //* 'true', 'false', 'null' -> Reserved literals; also cannot be used as identifiers.
    System.out.println("7. Reserved Literals & Unused Keywords:");
    System.out.println("   - Reserved Literals: true, false, null");
    System.out.println("   - Unused Keywords  : const, goto");
    System.out.println(
      "   (Attempting 'int const = 5;' or 'int goto = 10;' causes a compiler error!)"
    );
  }
}
