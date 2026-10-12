//TODO: WAP in java to input electricity unit charges and calculate total electricity bill accoridngly to the given condition
//* For first 50 units Rs. 0.50/unit */
//* For 51 to 150 units Rs. 0.75/unit */
//* For 151 to 250 units Rs. 1.20/unit */
//* For unit above 250 Rs. 1.50/unit and an additional surcharge of 20% is added to the bill */

public class ElectricityBill {

  public static void main(String[] args) {
    int units = 78;
    double bill;
    if (units < 0) {
      System.out.println("Invalid units!!");
      return;
    } else if (units <= 50) {
      bill = units * 0.5;
    } else if (units <= 150) {
      bill = 25 + (units - 50) * 0.75;
    } else if (units <= 250) {
      bill = 100 + (units - 150) * 1.20;
    } else {
      bill = 220 + (units - 250) * 1.5;
      bill += bill * 0.2;
    }
    System.out.println("Total bill: Rs. " + bill);
  }
}
