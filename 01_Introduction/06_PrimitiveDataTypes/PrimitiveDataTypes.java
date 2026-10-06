//TODO: Learn the 8 primitive data types provided by Java.
//* Primitive types store simple values using fixed-size memory representations.
//* The eight types are byte, short, int, long, float, double, char, and boolean.

public class PrimitiveDataTypes {

  public static void main(String[] args) {
    byte b = 10;
    short s = 200;
    int i = 3000;
    long l = 5000L;

    float f = 2.5f;
    double d = 9.8;

    char c = 'K';
    boolean flag = true;

    System.out.println("byte: " + b);
    System.out.println("short: " + s);
    System.out.println("int: " + i);
    System.out.println("long: " + l);
    System.out.println("float: " + f);
    System.out.println("double: " + d);
    System.out.println("char: " + c);
    System.out.println("boolean: " + flag);

    //TODO: Primitive data type reference table.
    //* Data type | Size    | Default value
    //* byte      | 1 byte  | 0
    //* short     | 2 bytes | 0
    //* int       | 4 bytes | 0
    //* long      | 8 bytes | 0L
    //* float     | 4 bytes | 0.0f
    //* double    | 8 bytes | 0.0d
    //* char      | 2 bytes | '\u0000'
    //* boolean   | JVM-dependent | false
    //? Whole-number types: byte, short, int, and long.
    //? Decimal types: float and double; char stores one character.
    //? boolean stores only true or false.
  }
}
