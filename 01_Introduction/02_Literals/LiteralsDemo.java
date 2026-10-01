//TODO: Understand the fixed values written directly in Java source code.
//* Integer literals: 10, 20, 0, and -5.
//* Decimal literals: 0.5 and 9.3.
//* Character literals: 'a', '1', and 'K'.
//* String literals: "hi", "123", and "".
//* Boolean literals: true and false.

public class LiteralsDemo {
    public static void main(String[] args) {
        int age = 20;
        int zero = 0;
        int negative = -5;

        double price = 9.3;
        double half = 0.5;

        char letter = 'A';
        char digit = '1';

        String name = "hello";
        String numbers = "123";
        String emptyString = "";

        boolean isJavaFun = true;
        boolean isNight = false;

        System.out.println("Integer literal: " + age);
        System.out.println("Decimal literal: " + price);
        System.out.println("Character literal: " + letter);
        System.out.println("String literal: " + name);
        System.out.println("Boolean literal: " + isJavaFun);

        System.out.println("Negative number: " + negative);
        System.out.println("Zero: " + zero);
        System.out.println("Half: " + half);
        System.out.println("String with numbers: " + numbers);
        System.out.println("Empty string: '" + emptyString + "'");
        System.out.println("Boolean false: " + isNight);
    }
}
