class Operators {
    public static void main(String[] args) {

        //TODO: Addition combines numbers or joins text with another value.
        int a1 = 10 + 20;
        String a2 = "10" + 10;
        int a3 = 'a' + 10; // A char is promoted to its Unicode value before addition.
        String a4 = "hi" + 'a';
        //? String a5 = true + 'a'; //! Compilation error: boolean cannot be added to a char or number.
        String a6 = false + "hi";
        String a7 = '1' + "hi";
        String a8 = false + "true";
        //? int a9 = '10' + true; //! Compilation error: '10' is not a valid char literal.
        String a10 = "ja" + 10;
        //? String a11 = true + false; //! Compilation error: + does not add boolean values.

        System.out.println("Addition");
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a4 = " + a4);
        System.out.println("a6 = " + a6);
        System.out.println("a7 = " + a7);
        System.out.println("a8 = " + a8);
        System.out.println("a10 = " + a10);

        //TODO: Subtraction finds the difference between numeric values.
        int s1 = 10 - 2;
        int s2 = 10 - 'a'; // 'a' is promoted to its Unicode value (97).
        //? String s3 = "hi" - "h"; //! Compilation error: - cannot be used with String values.
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

        //TODO: Multiplication scales or repeats a numeric value.
        int m1 = 10 * 2;
        int m2 = 'a' * 2; // A char is promoted to its Unicode value before multiplication.
        //? String m3 = "hi" * 2; //! Compilation error: * cannot be used with String values.
        //? String m4 = 'a' * "hi"; //! Compilation error: * requires numeric operands.

        System.out.println("\nMultiplication");
        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);

        //TODO: Division calculates a quotient; integer division removes the fraction.
        int d1 = 10 / 3; // Integer division discards the decimal part, so the result is 3.
        //? String d2 = "hi" / "i"; //! Compilation error: / cannot be used with String values.
        int d2 = 'h' / 'i'; // Characters are promoted to 104 and 105, so the result is 0.
        double d3 = 10 / 3; // Both operands are int, so division happens before conversion to double.
        double d4 = 10 / 3.0; // A double operand preserves the fractional result.
        int d5 = 100 / 10 / 2; // Division is evaluated from left to right: (100 / 10) / 2.
        int d6 = 100 / (10 / 2); // Parentheses change the order: 100 / (10 / 2).
        int d7 = -17 / 5; // Integer division truncates toward zero, giving -3 rather than -4.
        //? int d8 = 10 / 0; // Runtime error: integer division by zero throws ArithmeticException.
        double d9 = 10.0 / 0; // Floating-point division by zero produces Infinity, not an exception.

        System.out.println("\nDivision");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
        System.out.println("d5 = " + d5);
        System.out.println("d6 = " + d6);
        System.out.println("d7 = " + d7);
        System.out.println("d9 = " + d9);

        //TODO: Modulus returns the remainder left after division.
        int mo1 = 10 % 3; // Modulus returns the remainder: 10 = (3 * 3) + 1.
        int mo2 = 'a' % 3; // 'a' is 97, so 97 % 3 is 1.
        int mo3 = 17 % 5; // The remainder is 2 because 17 = (5 * 3) + 2.
        int mo4 = -17 % 5; // The remainder keeps the dividend's sign, so the result is -2.
        int mo5 = 17 % -5; // The divisor's sign does not control the remainder, so the result is 2.
        int mo6 = 10 % 3 * 2; // Same-precedence operators run left to right: (10 % 3) * 2.
        int mo7 = 10 % (3 * 2); // Parentheses change the divisor, so the result is 4.
        int mo8Remainder = 25 % 5;
        boolean mo8 = mo8Remainder == 0; // Is 25 evenly divisible by 5? Yes, its remainder is zero.
        //? int mo9 = 10 % 0; //! Runtime error: modulus by zero throws ArithmeticException.

        System.out.println("\nModulus");
        System.out.println("mo1 = " + mo1);
        System.out.println("mo2 = " + mo2);
        System.out.println("mo3 = " + mo3);
        System.out.println("mo4 = " + mo4);
        System.out.println("mo5 = " + mo5);
        System.out.println("mo6 = " + mo6);
        System.out.println("mo7 = " + mo7);
        System.out.println("mo8 = " + mo8);
    }
}