//TODO: WAP in java to check whether a character is uppercase or not
public class Prog5 {

  public static void main(String[] args) {
    char ch = 'A';
    if (ch >= 'A' && ch <= 'Z') System.out.println("Uppercase");
    else if (ch >= 'a' && ch <= 'z') System.out.println("Lowercase");
    else System.out.println("Not an Alphabet");
  }
}
