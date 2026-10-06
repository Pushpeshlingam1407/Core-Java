//TODO: Relational operators compare values and produce true or false.

import java.util.*;

class RelationalOperators {

  public static void main(String[] args) {
    //? The > operator checks whether the left value is greater than the right.
    System.out.println("\n> Operator\n");
    System.out.println(10 > 2);
    System.out.println(10 > 10);
    System.out.println(10 > 2);
    System.out.println('a' > 10);
    //? System.out.println("a" > 10); //! Compilation error: String cannot use >.

    //? The < operator checks whether the left value is less than the right.
    System.out.println("\n< Operator\n");
    System.out.println(10 < 10);
    System.out.println(10 < 2);
    System.out.println(10 < -10);
    System.out.println(10 < 5);
    System.out.println(10 < 1002);
    //? System.out.println(true < false); //! Compilation error: relational operators do not compare booleans.
    //? System.out.println(true > 10); //! Compilation error: boolean cannot use > with an integer.

    //? The == operator checks whether two primitive values are equal.
    System.out.println("\n== Operator\n");
    System.out.println('a' == 97);
    System.out.println('a' == 'a');
    System.out.println(true == false);
    System.out.println(false == false);

    //? The != operator checks whether two values are different.
    System.out.println("\n!= Operator");
    System.out.println(true != false);
    System.out.println(10 != 'a');
    System.out.println(100 != 'd');
    System.out.println(60 != 'A');
    //? System.out.println(100 != "d"); //! Compilation error: int and String cannot use != together.

    //? The <= operator checks whether the left value is less than or equal to the right.
    System.out.println("\n<= Operator");
    System.out.println(10 <= 10);

    //? The >= operator checks whether the left value is greater than or equal to the right.
    System.out.println("\n>= Operator");
    System.out.println(10 >= 10);
    System.out.println('a' >= 'b');
    //? System.out.println(true >= false); //! Compilation error: relational operators do not compare booleans.
    System.out.println('a' <= 'A');
  }
}
