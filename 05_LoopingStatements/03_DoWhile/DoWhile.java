//TODO: DO WHILE

//* do is a keyword used as looping statement */
//* Alone creation of do is not possible we have to create do block along with while keyword */

//TODO: SYNTAX
// do {
// ----
// ----
// }while(condition);

//TODO: PSEUDOCODE
// statment1;
//do{
// statement2;
// statement3;
// } while(condition);
// statement4;

//TODO: WORKFLOW OF ABOVE PSEUDOCODE
// start
// statement1 is executed
// then do block is executed
//   statement2 and statement3 are executed
// then condition is checked
// if while condition is true then
//    go to do block
// if while condition is false then
//    statement4 is executed
//    end

//TODO: IMPORTANT POINTS
//* In do while loop condition is checked at the end so that
//* do-while loop is used when we want to execute the do block at least once. Because 1st time do block is getting execute without checking condition*/

public class DoWhile {

  public static void main(String[] args) {
    int num = 0;

    do {
      System.out.println(num);
      num++;
    } while (num < 10);
  }
}
