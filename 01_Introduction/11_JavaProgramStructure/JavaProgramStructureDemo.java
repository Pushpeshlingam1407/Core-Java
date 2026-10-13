//TODO: Understand the structure and anatomy of a Java program.
//* A typical Java program consists of the following sections:
//* 1. Documentation Section: Comments explaining the purpose of the code.
//* 2. Package Statement (Optional): Defines the namespace of the class.
//* 3. Import Statements (Optional): Imports external or standard library classes.
//* 4. Class Definition (Mandatory): Every Java statement must reside inside a class.
//* 5. Main Method (Mandatory for standalone executable applications): The entry point.

import java.util.Date; // Example of an import statement

public class JavaProgramStructureDemo {

  //? Anatomy of the main method:
  //* public: The method is globally accessible so JVM can call it from anywhere.
  //* static: Allows JVM to call main() without creating an object of the class.
  //* void: Indicates that the main method returns no value to the operating system/JVM.
  //* main: The exact identifier/name the JVM looks for to start execution.
  //* String[] args: Stores command-line arguments passed to the application.
  public static void main(String[] args) {
    System.out.println("=== JAVA PROGRAM STRUCTURE & ANATOMY ===\n");

    //? 1. Current Date demonstration (via imported java.util.Date):
    Date currentDate = new Date();
    System.out.println("Current Date & Time: " + currentDate);
    System.out.println();

    //? 2. Output Methods in Java:
    //* System.out.println() - prints output followed by a new line.
    //* System.out.print()   - prints output on the same line without adding a new line.
    //* System.out.printf()  - prints formatted strings (C-style format specifiers).

    System.out.println("--- Console Output Methods ---");
    System.out.print("System.out.print: Part 1");
    System.out.print(" + Part 2 (same line)\n");

    System.out.println(
      "System.out.println: This line has an automatic newline at the end."
    );

    String language = "Java";
    int releaseYear = 1995;
    double version = 21.0;
    System.out.printf(
      "System.out.printf: %s was created in %d (Current LTS: %.1f)\n\n",
      language,
      releaseYear,
      version
    );

    //? 3. Compilation & Execution Lifecycle:
    System.out.println("--- Compilation & Execution Cycle ---");
    System.out.println("1. Source Code   : Program.java (human-readable)");
    System.out.println("2. Compiler      : javac Program.java");
    System.out.println(
      "3. Bytecode File : Program.class (platform-independent bytecode)"
    );
    System.out.println(
      "4. Execution     : java Program (JVM interprets/JIT compiles bytecode)"
    );
  }
}
