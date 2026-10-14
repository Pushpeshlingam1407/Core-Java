//TODO: Tricky problem: Predict output of post-increment and pre-increment in if-else condition

public class If_Else1 {

  public static void main(String[] args) {
    int a = 5;
    if (a++ > 5) System.out.println("Output of if statement: " + a);
    else System.out.println("Output of else statement: " + ++a);
  }
}
