//TODO: WAP in Java to create a blueprint of Gun with 2 properties (brand, bullets) and 2 behaviours (load, fire).
//TODO: Create a user logic class to instantiate the blueprint of Gun with at least 3 gun details, print all details, and perform operations.

// Blueprint Class (Business Logic Class)
public class Gun {

  String brand;
  int bullets;

  void load() {
    System.out.println("Gun is loading...!!");
  }

  void fire() {
    System.out.println("Gun is firing...!!");
  }
}

// User Logic Class (Driver Class)
class GunDriver {

  public static void main(String[] args) {
    Gun g1 = new Gun();
    g1.brand = "AKM";
    g1.bullets = 30;
    System.out.println(g1.brand);
    System.out.println(g1.bullets);
    g1.load();
    g1.fire();
    System.out.println();

    Gun g2 = new Gun();
    g2.brand = "M249";
    g2.bullets = 75;
    System.out.println(g2.brand);
    System.out.println(g2.bullets);
    g2.load();
    g2.fire();
    System.out.println();

    Gun g3 = new Gun();
    g3.brand = "AWM";
    g3.bullets = 5;
    System.out.println(g3.brand);
    System.out.println(g3.bullets);
    g3.load();
    g3.fire();
    System.out.println();

    Gun g4 = new Gun();
    g4.brand = "Vector";
    g4.bullets = 19;
    System.out.println(g4.brand);
    System.out.println(g4.bullets);
    g4.load();
    g4.fire();
  }
}
