//TODO: If Else Statement
//* If and else are keywords in Java that are used to make decisions based on a condition. */
//* Else is used to execute a block of code when the condition in the if statement is false. */
//* But alone, the else statement is not sufficient to make a decision. It must be used in conjunction with an if statement. */

//* Syntax of if-else statement: */
//* Multiple line statement: */
//* if (condition) {
//*   block of code to be executed if the condition is true;
//* } else {
//*   block of code to be executed if the condition is false;
//* }

//* Single line statement: */
//* if (condition) statement1; else statement2;

//* When we have 2 sets of code to execute based on a condition, we use the if-else statement. */

//TODO Psuedo code:
//* statement1; */
//* if (condition) {
//* statement2;
//* statement3;
//* } else {
//* statement4;
//* statement5;
//* }
//* statment6;

//TODO workflow of above psuedo code:
//* statement1 is executed first.
//* Then the condition is checked.
//* If the condition is true, statement2 and statement3 are executed.
//* If the condition is false, statement4 and statement5 are executed.
//* Finally, statement6 is executed.

public class IfElse {

  public static void main(String[] args) {
    int num = 10;
    if (num % 2 == 0) {
      System.out.println(num + " is an even number.");
    } else {
      System.out.println(num + " is an odd number.");
    }
  }
}
