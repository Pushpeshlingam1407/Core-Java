//TODO: Demonstrate accessing static vs non-static variables through multiple object references

public class Driver {

  public static void main(String[] r) {
    Focus sn1 = new Focus();
    Focus sn2 = new Focus();
    sn1.a = 99; // Modifies static variable 'a' (shared across all instances)
    System.out.println(sn2.a); // Prints 99
    sn1.b = 78; // Modifies instance variable 'b' for sn1 only
    System.out.println(sn2.b); // Prints 20 (sn2 has its own copy)
  }
}
