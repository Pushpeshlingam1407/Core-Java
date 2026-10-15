// TODO: BREAK AND CONTINUE
//* The break and continue statements are keywords used to control the flow of loops.
//* The break statement is used to terminate the loop completely.
//* The continue statement is used to skip the current iteration and proceed to the next iteration.
//* When the break statement is executed, the loop terminates immediately.
//* When the continue statement is executed, the remaining statements in the current iteration are skipped.
//* Neither the break nor the continue statement must be the last statement in a block.
//* However, any statements written after them in the same block will not be executed if they are triggered.

public class BreakAndContinue {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 3) {
        continue;
      }

      if (i == 8) {
        break;
      }

      System.out.println(i);
    }
  }
}
