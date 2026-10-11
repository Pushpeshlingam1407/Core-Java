//TODO: WAP in java to check whether a triangle is valid or not, when the three angles of the triangle are enteredd through the keyboard. A triangle is valid if the sum of all the three angles is equal to 180 degrees

public class TriangleValidity {

  public static void main(String[] args) {
    int adjacent = 60,
      hypotenuse = 60,
      opposite = 60;
    int sum = adjacent + hypotenuse + opposite;
    if (
      adjacent > 0 && hypotenuse > 0 && opposite > 0 && sum == 180
    ) System.out.println("Triangle is valid");
    else System.out.println("Triangle is invalid");
  }
}
