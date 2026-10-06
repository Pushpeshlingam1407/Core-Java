//TODO: If Else Ladder Statement
//* The if-else ladder is a series of if-else statements that are used to make a decision based on multiple conditions. */
//* The conditions are checked in order, and the first condition that is true will execute its corresponding block of code. */
//* If none of the conditions are true, the else block will be executed. */
//* The if-else ladder is useful when you have more than two possible outcomes based on different conditions. */

//TODO: Syntax of if-else ladder: */

// if (condition1) {
//   block of code to be executed if condition1 is true;
// } else if (condition2) {
//   block of code to be executed if condition2 is true;
// } else if (condition3) {
//   block of code to be executed if condition3 is true;
// } else {
//   block of code to be executed if none of the conditions are true;
// }

//* TODO: Pseudocode: */
// statement1;
// if (condition1) {
//   statement2;
//   statement3;
// } else if (condition2) {
//   statement4;
//   statement5;
// } else if (condition3) {
//   statement6;
//   statement7;
// }
// else {
//   statement8;
//   statement9;
// }
// statement10;

//TODO: Workflow */
/* 1. Execute statement1
  2. Check condition1
  3. If condition1 is true, execute statement2 and statement3
  4. If condition1 is false, check condition2
  5. If condition2 is true, execute statement4 and statement5
  6. If condition2 is false, check condition3
  7. If condition3 is true, execute statement6 and statement7
  8. If all conditions are false, execute statement8 and statement9
  9. Execute statement10
 */

public class IfElseLadder {

  public static void main(String[] args) {
    int marks = 85;
    if (marks >= 90) {
      System.out.println("Grade: A");
    } else if (marks >= 80) {
      System.out.println("Grade: B");
    } else if (marks >= 70) {
      System.out.println("Grade: C");
    } else if (marks >= 60) {
      System.out.println("Grade: D");
    } else {
      System.out.println("Grade: F");
    }
  }
}
