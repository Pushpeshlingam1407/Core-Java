/// TODO: BREAK STATEMENT
//* It is a keyword.
//* We can use the break keyword in loops and switch cases.
//* When we use the break keyword in a loop, it immediately terminates
//* the loop. The break statement must be the last statement in the
//* block in which it appears.

public class BreakStatement {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 6) {
        break;
      }
      System.out.println(i);
    }

    System.out.println("Loop ended after break");
  }
}
