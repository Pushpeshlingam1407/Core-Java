//TODO: Understand how Java source code becomes executable bytecode.
//* Java is platform-independent, but JVM-dependent for execution.
//* After changing source code, compile it again before execution.

public class JavaBasics {

  public static void main(String[] args) {
    System.out.println("Java is platform-independent.");
    System.out.println("JVM helps execute Java bytecode.");
    System.out.println("JDK contains the compiler and development tools.");
    System.out.println("JRE contains JVM and runtime libraries.");

    //* Separators used in Java programs:
    //? { } ( ) [ ] ; , .
    System.out.println("Separators example: { } ( ) [ ] ; , .");

    //* JDK = Java Development Kit: development tools and compiler.
    //* JRE = Java Runtime Environment: JVM and runtime libraries.
    //* JVM = Java Virtual Machine: executes Java bytecode.
    //? JIT compilation improves execution speed at runtime.
  }
}
