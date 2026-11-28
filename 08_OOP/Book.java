//TODO: WAP in Java to create a blueprint of Book with 3 properties and 3 behaviours.
//TODO: Create a user logic class to instantiate the blueprint of Book with 3 objects, print all properties, and perform operations.

// Blueprint Class (Business Logic Class)
public class Book {

  String bookName;
  String author;
  double price;

  void buy() {
    System.out.println("Purchasing the book..");
  }

  void open() {
    System.out.println("Opening the book...");
  }

  void read() {
    System.out.println("Reading the book..");
  }
}

// User Logic Class (Driver Class)
class BookDriver {

  public static void main(String[] args) {
    Book b1 = new Book();
    b1.bookName = "Atomic Habits";
    b1.author = "James Clear";
    b1.price = 539.00;
    System.out.println(b1.bookName);
    System.out.println(b1.author);
    System.out.println(b1.price);
    b1.buy();
    b1.open();
    b1.read();
    System.out.println();

    Book b2 = new Book();
    b2.bookName = "Java Programming";
    b2.author = "James Gosling";
    b2.price = 1195.25;
    System.out.println(b2.bookName);
    System.out.println(b2.author);
    System.out.println(b2.price);
    b2.buy();
    b2.open();
    b2.read();
    System.out.println();

    Book b3 = new Book();
    b3.bookName = "A song of ice and fire";
    b3.author = "Geroge R R Martin";
    b3.price = 1132.05;
    System.out.println(b3.bookName);
    System.out.println(b3.author);
    System.out.println(b3.price);
    b3.buy();
    b3.open();
    b3.read();
  }
}
