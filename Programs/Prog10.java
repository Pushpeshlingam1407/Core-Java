//TODO: WAP in java to check whether a triangle is valid or not, when the three angles of the triangle are enteredd through the keyboard. A triangle is valid if the sum of all the three angles is equal to 180 degrees
public class prog10 {

  public static void main(String[] agrs) {
    int adjacent = 60,
      hypothesis = 60,
      opposite = 60;
    if (adjacent + hypothesis + opposite == 180) System.out.println(
      "Triangle is valid"
    );
    else System.out.println("Triangle is invalid");
  }
}
