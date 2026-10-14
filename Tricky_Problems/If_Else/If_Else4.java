//TODO: Tricky problem: Predict variable value after post-increment condition in if-else

public class If_Else4 {

  public static void main(String[] args) {
    int x = 3;
    if (x++ > 3) x++;
    else ++x;
    System.out.println("x value: " + x);
  }
}
