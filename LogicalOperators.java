// TODO: Logical Operators
//*  In Java, there are 3 main logical operators:
//? 1. Logical AND (&&) - Binary operator that combines boolean expressions and returns a boolean result.
//? 2. Logical OR (||) - Binary operator that combines boolean expressions and returns a boolean result.
//? 3. Logical NOT (!) - Unary operator that inverts a boolean value and returns a boolean result.

//* Operator precedence in Java (from highest to lowest):
//* Parentheses () > Unary operators (!, ++, --, cast) > Multiplicative (*, /, %) > Additive (+, -) > Relational (>, >=, <, <=) > Equality (==, !=) > Logical AND (&&) > Logical OR (||) > Ternary (? :) > Assignment (=, +=, -=, etc.) */
public class LogicalOperators {
    public static void main(String[] args) {

        // Logical AND
        System.out.println("\nLogical AND");
        System.out.println(10 > 2 && true);
        System.out.println('a' >= 97 && false);
        System.out.println(false && 'a' == (96 + 1));
        // System.out.println(10 + 20 && true); //! Compilation error: && requires both operands to be boolean expressions 10 + 20 evaluates to an int, not a boolean value.

        // Logical OR
        System.out.println("\nLogical OR");
        System.out.println(false || 10 != 9);
        System.out.println(10 != 100 || 100 != 10);
        System.out.println(true || (10 + 20 == 30));
        System.out.println(10 == 15 || false);

        // Logical NOT
        System.out.println(!(10 == 10));
        System.out.println(!(10 > 9));
        System.out.println(!(10 != 10));
        // System.out.println(!10 > 5); //! Compilation error: ! can only be applied to a boolean value.
        // In this expression, !10 is invalid because 10 is an int, not a boolean.
        System.out.println(!true == false);

    }
}
