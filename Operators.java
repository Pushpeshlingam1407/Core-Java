import java.util.*;

class Operators {
    public static void main(String[] args) {

        //* Addition */
        int a1 = 10 + 20;
        String a2 = "10" + 10;
        int a3 = 'a' + 10;
        String a4 = "hi" + 'a';
        // String a5 = true + 'a'; // Compilation error: boolean cannot be added to a char or number.
        String a6 = false + "hi";
        String a7 = '1' + "hi";
        String a8 = false + "true";
        // int a9 = '10' + true; // Compilation error: boolean cannot be added to a char or number.
        String a10 = "ja" + 10;
        // String a11 = true + false; // Compilation error: + does not add boolean values.
        System.out.println(a1 + "\n" + a2 + "\n" + a3 + "\n" + a4 + "\n" + a6 + "\n" + a7 + "\n" + a8 + "\n"
                + "\n" + a10);
        
        //* Subtraction  */

    }
}