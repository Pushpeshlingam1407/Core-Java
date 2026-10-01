//TODO: Relational Operators */

import java.util.*;

class RelationalOperators {
    public static void main(String[] args) {
        // * > operator */
        System.out.println("\n> Operator\n");
        System.out.println(10 > 2);
        System.out.println(10 > 10);
        System.out.println(10 > 2);
        System.out.println('a' > 10);
        // System.out.println("a">10); //! Compilation error

        // * < operator */
        System.out.println("\n< Operator\n");
        System.out.println(10 < 10);
        System.out.println(10 < 2);
        System.out.println(10 < -10);
        System.out.println(10 < 5);
        System.out.println(10 < 1002);
        // System.out.println(true<false); //! Compilation error due to
        // System.out.println(true>10); //! Compilation error due to

        // * == Operator */
        System.out.println("\n== Operator\n");
        System.out.println('a' == 97);
        System.out.println('a' == 'a');
        System.out.println(true == false);
        System.out.println(false == false);

        // * != Operator */
        System.out.println("\n!= Operator");
        System.out.println(true != false);
        System.out.println(10 != 'a');
        System.out.println(100 != 'd');
        System.out.println(60 != 'A');
        // System.out.println(100!="d"); //! Compilation error due to

        // * <= Operator*/
        System.out.println("\n<= Operator");
        System.out.println(10 <= 10);

        // * >= Operator */
        System.out.println("\n>= Operator");
        System.out.println(10 <= 10);
        System.out.println('a' >= 'b');
        // System.out.println(true>=false); //! Compilation error due to
        System.out.println('a' <= 'A');

    }
}