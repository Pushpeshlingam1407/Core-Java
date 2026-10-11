//TODO: WAP in java to find all the roots of an Quadratic equation

public class QuadraticEquationRoots {

  public static void main(String[] args) {
    int x2 = 12,
      x = -3,
      cnst = 7;
    double delta = x * x - 4 * x2 * cnst;
    if (x2 == 0) System.out.println("Not a quadratic equation");
    else if (delta > 0) {
      double roots1 = (-x + Math.sqrt(delta)) / (2 * x2);
      double roots2 = (-x - Math.sqrt(delta)) / (2 * x2);
      System.out.println("Root1: " + roots1 + "\n" + "Root2: " + roots2);
    } else if (delta == 0) {
      double roots = -x / (2.0 * x2);
      System.out.println("Both Roots are equal: " + roots);
    } else {
      double realPart = -x / (2.0 * x2);
      double imaginaryPart = Math.sqrt(-delta) / (2.0 * x2);
      System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
      System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
    }
  }
}
