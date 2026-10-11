// TODO: Write a Java program to count the minimum number of notes and coins required for a given amount.
public class Prog6 {

  public static void main(String[] args) {
    int amount = 9999;
    int count = 0;
    if (amount >= 500) {
      int notes500 = amount / 500;
      System.out.println("500 Notes -----> " + notes500);
      count += notes500;
      amount %= 500;
    }
    if (amount >= 200) {
      int notes200 = amount / 200;
      System.out.println("200 Notes -----> " + notes200);
      count += notes200;
      amount %= 200;
    }
    if (amount >= 100) {
      int notes100 = amount / 100;
      System.out.println("100 Notes -----> " + notes100);
      count += notes100;
      amount %= 100;
    }
    if (amount >= 50) {
      int notes50 = amount / 50;
      System.out.println("50 Notes ------> " + notes50);
      count += notes50;
      amount %= 50;
    }
    if (amount >= 20) {
      int notes20 = amount / 20;
      System.out.println("20 Notes ------> " + notes20);
      count += notes20;
      amount %= 20;
    }
    if (amount >= 10) {
      int notes10 = amount / 10;
      System.out.println("10 Notes ------> " + notes10);
      count += notes10;
      amount %= 10;
    }
    if (amount >= 5) {
      int coin5 = amount / 5;
      System.out.println("5 Coins -------> " + coin5);
      count += coin5;
      amount %= 5;
    }
    if (amount >= 2) {
      int coin2 = amount / 2;
      System.out.println("2 Coins -------> " + coin2);
      count += coin2;
      amount %= 2;
    }
    if (amount >= 1) {
      int coin1 = amount / 1;
      System.out.println("1 Coins -------> " + coin1);
      count += coin1;
      amount %= 1;
    }
    System.out.println("Total number of notes and coins: " + count);
  }
}
