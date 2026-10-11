//TODO: Given the length and breadth of a rectangle, WAP in java to find whether the area of the rectangle is greater than its perimeter or not. For example, the area of the rectangle with length 5 and breadth 4 is greater than it's perimeter

public class Prog11 {

  public static void main(String[] args) {
    int length = 5,
      breadth = 4;
    int perimeter = 2 * (length + breadth);
    int area = length * breadth;
    if (area > perimeter) System.out.println("Area is greater than perimeter");
    else if (area < perimeter) System.out.println(
      "Perimeter is greater than area"
    );
    else System.out.println("Area is equal to perimeter");
  }
}
