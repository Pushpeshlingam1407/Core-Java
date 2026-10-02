//TODO: Learn how logical operators combine boolean expressions.
//* && is true only when both conditions are true.
//* || is true when at least one condition is true.
//* ! reverses a boolean value: !true is false and !false is true.
//? Precedence: parentheses, unary, arithmetic, relational, equality, &&, ||, ternary, assignment.
public class LogicalOperators {

  public static void main(String[] args) {
    //TODO: Logical AND returns true only when both expressions are true.
    System.out.println("\nLogical AND");
    System.out.println(10 > 2 && true);
    System.out.println('a' >= 97 && false);
    System.out.println(false && 'a' == 96 + 1);
    //? System.out.println(10 + 20 && true); //! Compilation error: both operands of && must be boolean values.

    //TODO: Logical OR returns true when at least one expression is true.
    System.out.println("\nLogical OR");
    System.out.println(false || 10 != 9);
    System.out.println(10 != 100 || 100 != 10);
    System.out.println(true || 10 + 20 == 30);
    System.out.println(10 == 15 || false);

    //TODO: Logical NOT reverses the boolean result.
    System.out.println("\nLogical NOT");
    System.out.println(!(10 == 10));
    System.out.println(!(10 > 9));
    System.out.println(!(10 != 10));
    //? System.out.println(!10 > 5); //! Compilation error: ! requires a boolean operand.
    //? Here, !10 is invalid because 10 is an int, not a boolean.
    System.out.println(!true == false);
  }
}
