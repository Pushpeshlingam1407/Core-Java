//TODO: WAP in java that a library charges a fine for every book returned late.
//* For first 5 days the fine is 1 rupee, for 6-10days fine is 3 rupees and above 10 days fine is 5 rupees.
//* If you return the book after 30 days your membership will be cancelled.
//* WAP to accept the number of days the member is late to return then book and display the fine or the appropriate message
public class LibraryFine {

  public static void main(String[] args) {
    int days = 19;
    if (days <= 5 && days >= 1) System.out.println("1 Rupee fine");
    else if (days >= 6 && days <= 10) System.out.println("3 Rupees fine");
    else if (days > 10 && days <= 30) System.out.println("5 Rupees fine");
    else if (days > 30) System.out.println("Membership will be cancelled");
    else System.out.println("Invalid input");
  }
}
