class Operators {
    public static void main(String[] args) {

        //* Addition */
        int a1 = 10 + 20;
        String a2 = "10" + 10;
        int a3 = 'a' + 10; // A char is promoted to its Unicode value before addition.
        String a4 = "hi" + 'a';
        // String a5 = true + 'a'; //! Compilation error: boolean cannot be added to a char or number.
        String a6 = false + "hi";
        String a7 = '1' + "hi";
        String a8 = false + "true";
        // int a9 = '10' + true; //! Compilation error: '10' is not a valid char literal.
        String a10 = "ja" + 10;
        // String a11 = true + false; //! Compilation error: + does not add boolean values.

        System.out.println("Addition");
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a4 = " + a4);
        System.out.println("a6 = " + a6);
        System.out.println("a7 = " + a7);
        System.out.println("a8 = " + a8);
        System.out.println("a10 = " + a10);

        //*Subtraction */ 
        int s1 = 10 - 2;
        int s2 = 10 - 'a'; // 'a' is promoted to its Unicode value (97).
        // String s3 = "hi" - "h"; //! Compilation error: - cannot be used with String values.
        int s4 = 'h' - 'k'; // Characters are promoted to their Unicode values.
        int balance = 100;
        balance -= 35; // Compound subtraction: balance = balance - 35.
        int s5 = balance;
        int countdown = 5;
        int s6 = --countdown; // Decrement first, then assign the new value.
        byte points = 10;
        points -= 3; // Compound assignment includes the required narrowing conversion.
        int s7 = points;
        int s8 = 20 - (3 + 2); // Parentheses determine which expression is evaluated first.
        int s9 = Integer.MIN_VALUE - 1; // int arithmetic overflows instead of throwing an error.

        System.out.println("\nSubtraction");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);
        System.out.println("s9 = " + s9);

        //* Multiplication */ 
        int m1 = 10 * 2;
        int m2 = 'a' * 2; // A char is promoted to its Unicode value before multiplication.
        // String m3 = "hi" * 2; //! Compilation error: * cannot be used with String values.
        // String m4 = 'a' * "hi"; //! Compilation error: * requires numeric operands.

        System.out.println("\nMultiplication");
        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
    }
}