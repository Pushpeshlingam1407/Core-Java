import java.util.*;

public class Assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int ascii1 = (int) ch;
            System.out.println("Character: " + ch + " ASCII value: " + ascii1);
        }
        for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
            int ascii2 = (int) ch1;
            System.out.println("Character: " + ch1 + " ASCII value: " + ascii2);
        }

    }
}
