//TODO: NESTED LOOPS
//* A loop inside another loop is known as a nested loop.
//* Commonly used for working with 2D structures, grids, matrices, and pattern printing.

//TODO: SYNTAX
// for (initialization; condition; increment/decrement) {      // Outer Loop (Rows)
//     for (initialization; condition; increment/decrement) {  // Inner Loop (Columns)
//         // Statements to repeat
//     }
//     // Move to next line / statement after inner loop
// }

public class NestedLoopIntro {

  public static void main(String[] args) {
    int rows = 4;
    int cols = 4;

    // Example: Square / Grid Pattern
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
