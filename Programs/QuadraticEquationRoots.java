//TODO: WAP in java to find all the roots of an Quadratic equation

public class QuadraticEquationRoots {

  public static void main(String[] args) {
    int a = 12,
      b = -3,
      c = 7;
    double delta = b * b - 4 * a * c;
    if (a == 0) System.out.println("Not a quadratic equation");
    else if (delta > 0) {
      double roots1 = (-b + Math.sqrt(delta)) / (2 * a);
      double roots2 = (-b - Math.sqrt(delta)) / (2 * a);
      System.out.println("Root1: " + roots1 + "\n" + "Root2: " + roots2);
    } else if (delta == 0) {
      double roots = -b / (2.0 * a);
      System.out.println("Both Roots are equal: " + roots);
    } else {
      double realPart = -b / (2.0 * a);
      double imaginaryPart = Math.sqrt(-delta) / (2.0 * a);
      System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
      System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
    }
  }
}
