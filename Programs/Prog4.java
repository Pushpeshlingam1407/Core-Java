//TODO: WAP in java to input any alphabet  and check whether it is vowel or consonant

public class Prog4 {

  public static void main(String[] args) {
    char alpha = '@';
    if ((alpha >= 'A' && alpha <= 'Z') || (alpha >= 'a' && alpha <= 'z')) {
      if (
        alpha == 'A' ||
        alpha == 'E' ||
        alpha == 'I' ||
        alpha == 'O' ||
        alpha == 'U' ||
        alpha == 'a' ||
        alpha == 'e' ||
        alpha == 'i' ||
        alpha == 'o' ||
        alpha == 'u'
      ) System.out.println("Vowel");
      else System.out.println("Consonant");
    } else System.out.println("Invalid Input!!");
  }
}
