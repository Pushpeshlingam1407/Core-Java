// TODO: CONTINUE STATEMENT
//* It is a keyword used to skip the current iteration of a loop.
//* When the continue keyword is executed, the remaining statements
//* in the current iteration are skipped, and the loop proceeds
//* to the next iteration.
//* The continue statement does not have to be the last statement
//* in a block. However, any statements written after it in the
//* same block will not be executed if the continue statement runs.
public class ContinueStatement {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);
    }

    System.out.println("Only odd numbers were printed");
  }
}
