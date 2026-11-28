//TODO: WAP in java to create blueprint of laptop object with 2 properties(brand, RAM) and 2 behaviours(watchMovie, doCoding)
//TODO: create a user logic class with main method to create or instanciate 2 laptops objects with some details and print all the details and perform actions of both the objects

// Blueprint Class (Business Logic Class)
public class Laptop {

  String brand;
  int ram;

  void watchMovie() {
    System.out.println("Watching Movie...!!");
  }

  void doCoding() {
    System.out.println("Doing coding...!!");
  }
}

// User Logic Class (Driver Class)
class LaptopDriver {

  public static void main(String[] args) {
    Laptop l1 = new Laptop();
    l1.brand = "Dell";
    l1.ram = 16;
    System.out.println(l1.brand);
    System.out.println(l1.ram);
    l1.watchMovie();
    l1.doCoding();
    System.out.println();

    Laptop l2 = new Laptop();
    l2.brand = "ASUS";
    l2.ram = 32;
    System.out.println(l2.brand);
    System.out.println(l2.ram);
    l2.watchMovie();
    l2.doCoding();
  }
}

//TODO: NOTE

//* 1. If any property of an object whose content keeps on changing with
//*    respect to each and every object, then that property must be
//*    represented as non-static.

//* 2. If any operation depends upon any of the non-static properties
//*    and objects, then that operation must be non-static.

//* 3. If any property of an object whose content is the same for all
//*    other objects, then that property must be declared as static.