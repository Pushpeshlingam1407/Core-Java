//TODO: FOR LOOP
//* for is a keyword used as looping statement  */

//TODO: SYNTAX
//*  for([initialization]; [condition];[updation]){
// --------
// --------
// }

//* [..] -> indicates optional or not mandatory

//TODO: PSEUDOCODE

//statement1;
//for(initialization;condition;updation){
//   statement2;
//   statement3;
// }
//statement4;

//TODO: WORKFLOW OF ABOVE PSEUDOCODE
// start
//statement1 is executed
//then initialization is executed
// then condition is checked
//if condition is true then
//   statement 2 and statement 3 are executed
//   then updation is executed
//   then condition is checked
//if condition is false then
//   statement 4 is executed
//   end

//TODO
//* NOTE: initialization,condition and updation are optional but semicolons are mandatory
//* For every condition check updation is executed
//* If programmer failed to provide the condition by default true will be considered
//* If programmer failed to provide the initialization then compilation error will be thrown
//* If programmer failed to provide the updation then compilation error will be thrown

public class ForLoopIntro {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
  }
}
