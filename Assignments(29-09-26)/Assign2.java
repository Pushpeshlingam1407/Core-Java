import java.util.*;

public class Assign2 {

  public static void main(String[] args) {
    Uppercase up = new Uppercase();
    up.display();

    Lowercase low = new Lowercase();
    low.display();

    Numbers num = new Numbers();
    num.display();

    Special sp = new Special();
    sp.display();
  }
}

class Uppercase {

  void display() {
    for (char ch = 'A'; ch <= 'Z'; ch++) {
      int ascii1 = (int) ch;
      System.out.println("Character: " + ch + " ASCII value: " + ascii1);
    }
  }
}

class Lowercase {

  void display() {
    for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
      int ascii2 = (int) ch1;
      System.out.println("Character: " + ch1 + " ASCII value: " + ascii2);
    }
  }
}

class Numbers {

  void display() {
    for (char ch2 = '0'; ch2 <= '9'; ch2++) {
      int ascii3 = (int) ch2;
      System.out.println("Character: " + ch2 + " ASCII value: " + ascii3);
    }
  }
}

class Special {

  void display() {
    char sp = ' ';
    char at = '@';
    char hash = '#';
    char star = '*';
    char ex = '!';

    System.out.println("Character: SPACE ASCII value: " + (int) sp);
    System.out.println("Character: @ ASCII value: " + (int) at);
    System.out.println("Character: # ASCII value: " + (int) hash);
    System.out.println("Character: * ASCII value: " + (int) star);
    System.out.println("Character: ! ASCII value: " + (int) ex);
  }
}
