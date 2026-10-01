/*
 * Primitive data types are built-in data types provided by Java.
 * Java has exactly 8 primitive data types used to store simple values.
 *
 * These types are important because they are the foundation of all variables
 * in Java. They are not created by the user and have fixed sizes.
 */

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

        /*
         * Primitive Data Types Summary
         * +-----------+--------+---------------+
         * | Data Type | Size   | Default Value |
         * +-----------+--------+---------------+
         * | byte      | 1 byte | 0             |
         * | short     | 2 bytes| 0             |
         * | int       | 4 bytes| 0             |
         * | long      | 8 bytes| 0L            |
         * | float     | 4 bytes| 0.0f          |
         * | double    | 8 bytes| 0.0d          |
         * | char      | 2 bytes| '\u0000'       |
         * | boolean   | 1 bit  | false         |
         * +-----------+--------+---------------+
         *
         * Notes:
         * - byte, short, int, and long are used for integer values.
         * - float and double are used for decimal/floating-point values.
         * - char stores a single character.
         * - boolean stores either true or false.
         */
    }
}
