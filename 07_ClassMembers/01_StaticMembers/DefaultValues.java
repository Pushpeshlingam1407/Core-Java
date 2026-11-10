//TODO: DEFAULT VALUES OF PRIMITIVE DATA TYPES FOR STATIC VARIABLES
/*
 *
 *         //TODO:  DEFAULT VALUES OF PRIMITIVE DATA TYPES (STATIC)
 *
 * // ? For all non-primitive datatypes the default values will be NULL
 *
 * +------------------------+-------------------+-------------------------------+
 * | Category               | Data Type         | Default Value                 |
 * +------------------------+-------------------+-------------------------------+
 * | 1. Integer Types       | byte              | 0                             |
 * |                        | short             | 0                             |
 * |                        | int               | 0                             |
 * |                        | long              | 0L                            |
 * +------------------------+-------------------+-------------------------------+
 * | 2. Floating-Point Types| float             | 0.0f                          |
 * |                        | double            | 0.0d                          |
 * +------------------------+-------------------+-------------------------------+
 * | 3. Character Type      | char              | '\u0000' (Null char / blank)  |
 * +------------------------+-------------------+-------------------------------+
 * | 4. Boolean Type        | boolean           | false                         |
 * +------------------------+-------------------+-------------------------------+
 * | 5. Reference Type      | String / Object   | null                          |
 * +------------------------+-------------------+-------------------------------+
 *
 * //TODO NOTE: 
 * // - Static members we can access in two different ways they are
 * // ? 1. Directly by the name
 * // ? 2. By taking class name as reference
 * 
 * // - We can't creaate multiple local variables with same name but we can create one local and global varibale with same name
 * // - Local variables don't have default values where as global variables have default values 
 * 
 *
 */

public class DefaultValues {

  //* Integer data types:
  static byte defaultByte;
  static short defaultShort;
  static int defaultInt;
  static long defaultLong;

  //* Floating-point data types:
  static float defaultFloat;
  static double defaultDouble;

  //* Character data type:
  static char defaultChar;

  //* Boolean data type:
  static boolean defaultBoolean;

  //* Reference / Non-primitive data type:
  static String defaultString;

  public static void main(String[] args) {
    System.out.println(" DEFAULT VALUES OF STATIC VARIABLES \n");

    System.out.println("byte    default value : " + defaultByte);
    System.out.println("short   default value : " + defaultShort);
    System.out.println("int     default value : " + defaultInt);
    System.out.println("long    default value : " + defaultLong);
    System.out.println("float   default value : " + defaultFloat);
    System.out.println("double  default value : " + defaultDouble);
    System.out.println(
      "char    default value : [" + defaultChar + "] (Unicode: \\u0000)"
    );
    System.out.println("boolean default value : " + defaultBoolean);
    System.out.println("String  default value : " + defaultString);
  }
}
