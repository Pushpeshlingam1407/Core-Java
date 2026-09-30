import java.util.*;

class Operators {
    public static void main(String[] args) {

        // * Addition */
        int a1 = 10 + 20;
        String a2 = "10" + 10;
        int a3 = 'a' + 10;
        String a4 = "hi" + 'a';
        // String a5 = true + 'a'; //! Compilation error: boolean cannot be added to a char or number.
        String a6 = false + "hi";
        String a7 = '1' + "hi";
        String a8 = false + "true";
        // int a9 = '10' + true; //! Compilation error: boolean cannot be added to a char or number.
        String a10 = "ja" + 10;
        // String a11 = true + false; //! Compilation error: + does not add boolean values.
        System.out.println(a1 + "\n" + a2 + "\n" + a3 + "\n" + a4 + "\n" + a6 + "\n" + a7 + "\n" + a8 + "\n"
                + "\n" + a10);

        // * Subtraction */
        System.out.println("----------------------Subtraction Starts Here---------------------------");
        int s1 = 10 - 2;
        int s2 = 10 - 'a';
        // String s3 = "hi" - "h"; //! Compilation error: the - operator cannot be used with String values.
        int s4 = 'h' - 'k';
        int s5 = 2 - 10;
        double s6 = 10.5 - 2.5;
        System.out.println(s1 + "\n" + s2 + "\n" + s4 + "\n" + s5 + "\n" + s6 );
    }
}