//TODO: Learn about Escape Sequences in Java.
//* An escape sequence is a sequence of characters that begins with a backslash (\).
//* It is used to represent characters that are difficult or impossible to type directly,
//* such as newlines, tabs, quotes, or the backslash character itself.
//* Common Escape Sequences:
//* \n  - Newline (moves cursor to next line)
//* \t  - Tab (inserts horizontal tab space)
//* \b  - Backspace (deletes previous character)
//* \r  - Carriage Return (moves cursor to start of current line)
//* \'  - Single quote (used inside char literals)
//* \"  - Double quote (used inside string literals)
//* \\  - Backslash (prints a single literal backslash)

public class EscapeSequencesDemo {

  public static void main(String[] args) {
    System.out.println("=== ESCAPE SEQUENCES IN JAVA ===\n");

    //? 1. \n - Newline
    System.out.println("1. Newline (\\n):");
    System.out.println("Line 1\nLine 2\nLine 3");
    System.out.println();

    //? 2. \t - Horizontal Tab
    System.out.println("2. Tab (\\t):");
    System.out.println("Name\tAge\tCourse");
    System.out.println("Pushp\t21\tJava");
    System.out.println("Aman\t22\tPython");
    System.out.println();

    //? 3. \" and \' - Double & Single Quotes
    System.out.println("3. Quotes (\\\" and \\'):");
    System.out.println("He said, \"Java is awesome!\"");
    char singleQuoteChar = '\'';
    System.out.println("Single quote character: " + singleQuoteChar);
    System.out.println();

    //? 4. \\ - Backslash
    System.out.println("4. Backslash (\\\\):");
    System.out.println(
      "File path in Windows: C:\\Users\\pushp\\Desktop\\Core Java"
    );
    System.out.println();

    //? 5. \b - Backspace (erases previous character in console)
    System.out.println("5. Backspace (\\b):");
    System.out.println("Hello \bWorld!"); // Erases space before World!
    System.out.println();

    //? 6. \r - Carriage Return
    System.out.println("6. Carriage Return (\\r):");
    System.out.println("Beginning\rOverwritten");
  }
}
