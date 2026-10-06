//TODO: Conditional Operator by using 5 variables */

import java.util.*;

public class ConditionalOperator4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int max = a > b ? a : b;
    max = max > c ? max : c;
    max = max > d ? max : d;
    max = max > e ? max : e;
    System.out.println("Maximum number of 5 members is: " + max);
  }
}
