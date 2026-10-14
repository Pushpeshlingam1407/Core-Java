//TODO: WHILE LOOP

//* It is a keyword used as looping statement */

//TODO: SYNTAX
//* For multiple statements  */
// while(condition){
// -------
// ---------
// } /

//* For single statement */
// while(condition) statement;

//TODO: PSEUDOCODE
// statment1;
// while(condition){
//    statement2;
//    statement3;
//    }
// statement4;

//TODO: WORKFLOW OF ABOVE PSEUDOCODE
//start
// statement 1 is executed
// then condition is checked
// if condition is true then
//    statement 2 and statement 3 are executed
//    then go to check condition
// if condition is false then
//    statement 4 is executed
//    end

public class WhileLoop {

  public static void main(String[] args) {
    int num = 10;
    while (num > 0) {
      System.out.println(num);
      num--;
    }
  }
}
