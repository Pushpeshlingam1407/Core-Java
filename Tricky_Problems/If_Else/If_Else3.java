//TODO: Tricky problem: Predict output of post-increment vs pre-increment comparison in if-else

public class If_Else3 {

  public static void main(String[] args) {
    int a = 5,
      b = 5;
    if (a++ == ++b) System.out.println(
      "a value: " + a + "\n" + "b value: " + b
    );
    else System.out.println("a value: " + ++a + "\n" + "b value: " + b++);
  }
}
