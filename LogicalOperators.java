//TODO: Logical Operators
//* In Java we have 3 Types of logical operators they are 
//? 1. Logical AND (&&) -- Binary Operator and return Boolean data as Output
//? 2. Logical OR (||) -- Binary Operator and return Boolean data as Output
//? 3. Logical NOT (!) -- Binary Operator and return Boolean data as Output */

public class LogicalOperators {
    public static void main(String[] args) {

        // * Logical AND */
        System.out.println("\nLogical AND");
        System.out.println(10 > 2 && true);
        System.out.println('a' >= 97 && false);
        // System.out.println(10+20 && true); //! Compilation error due to

        // * Logical OR */
        System.out.println("\nLogical OR");
        System.out.println(false || 10 != 9);
        System.out.println(10 != 100 || 100 != 10);
        System.out.println(true || (10 + 20 == 30));
        System.out.println(10 == 15 || false);

    }
}
