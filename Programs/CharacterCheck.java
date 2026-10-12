//TODO: WAP in java to input any character and check whether it is alphabet, digit or special character

public class CharacterCheck {

  public static void main(String[] args) {
    char alpha = 'p';
    if (
      (alpha >= 'A' && alpha <= 'Z') || (alpha >= 'a' && alpha <= 'z')
    ) System.out.println("It is an Alphabet");
    else if (alpha >= '0' && alpha <= '9') System.out.println("It is a Number");
    else System.out.println("It is a Special Character");
  }
}
