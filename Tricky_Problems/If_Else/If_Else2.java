import java.util.*;

public class If_Else2 {

  public static void main(String[] args) {
    int x = 10;
    if (++x == 11 && x++ == 11) System.out.println(
      "Output of if statement: " + x
    );
    else System.out.println("Output of else Statement: " + ++x);
  }
}
