// TODO: WAP in Java to print the salary according to the following table.

/*
 * GENDER   YEAR OF SERVICE   QUALIFICATION   SALARY
 *
 * MALE     >= 10             PG              15000
 *          >= 10             GRADUATE        10000
 *          < 10              PG              10000
 *          < 10              GRADUATE        7000
 *
 * FEMALE   >= 10             PG              12000
 *          >= 10             GRADUATE        9000
 *          < 10              PG              8000
 *          < 10              GRADUATE        6000
 */

public class Prog9 {

  public static void main(String[] args) {
    String gender = "FEMALE";
    String qualification = "GRADUATE";
    int yos = 9,
      salary;
    if (gender == "MALE") {
      if (qualification == "GRADUATE") {
        if (yos >= 10) System.out.println(10000);
        else System.out.println(7000);
      } else if (qualification == "PG") {
        if (yos >= 10) System.out.println(15000);
        else System.out.println(10000);
      } else System.out.println("Invalid Input for male qualification");
    } else if (gender == "FEMALE") {
      if (qualification == "GRADUATE") {
        if (yos >= 10) System.out.println(9000);
        else System.out.println(6000);
      } else if (qualification == "PG") {
        if (yos >= 10) System.out.println(12000);
        else System.out.println(8000);
      } else System.out.println("Invalid input for female qualification");
    } else System.out.println("Invalid Gender Input!!");
  }
}
