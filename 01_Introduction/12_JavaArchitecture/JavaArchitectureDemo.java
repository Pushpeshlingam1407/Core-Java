//TODO: Understand the high-level architecture and platform independence of Java.
//* Java Architecture consists of three primary components:
//* 1. JDK (Java Development Kit)
//* 2. JRE (Java Runtime Environment)
//* 3. JVM (Java Virtual Machine)
//*
//* Relationship Hierarchy:
//* +-------------------------------------------------------------------+
//* | JDK (Development Kit: javac, jar, javadoc, debugger, etc.)        |
//* |  +-------------------------------------------------------------+  |
//* |  | JRE (Runtime Environment: runtime libraries + JVM)          |  |
//* |  |  +-------------------------------------------------------+  |  |
//* |  |  | JVM (Virtual Machine: executes bytecode on OS/CPU)   |  |  |
//* |  |  +-------------------------------------------------------+  |  |
//* |  +-------------------------------------------------------------+  |
//* +-------------------------------------------------------------------+

public class JavaArchitectureDemo {

  public static void main(String[] args) {
    System.out.println("=================================================");
    System.out.println("           HIGH-LEVEL JAVA ARCHITECTURE          ");
    System.out.println("=================================================\n");

    //? 1. JDK vs JRE vs JVM breakdown:
    System.out.println("1. CORE ARCHITECTURAL COMPONENTS:");
    System.out.println("   - JDK (Java Development Kit):");
    System.out.println("     * Complete software development environment.");
    System.out.println(
      "     * Contains JRE + Development Tools (compiler 'javac', packager 'jar', etc.)."
    );
    System.out.println(
      "     * Needed by developers to write and compile Java code.\n"
    );

    System.out.println("   - JRE (Java Runtime Environment):");
    System.out.println(
      "     * Software package that provides what is needed to RUN a Java program."
    );
    System.out.println(
      "     * Contains JVM + Core Class Libraries (java.lang, java.util, etc.)."
    );
    System.out.println(
      "     * Needed by end-users who only want to execute pre-compiled Java applications.\n"
    );

    System.out.println("   - JVM (Java Virtual Machine):");
    System.out.println("     * Abstract computing machine / execution engine.");
    System.out.println(
      "     * Converts Java bytecode (.class) into native machine instructions."
    );
    System.out.println(
      "     * Provides memory management, garbage collection, and security.\n"
    );

    //? 2. The WORA Principle (Write Once, Run Anywhere):
    System.out.println("2. WRITE ONCE, RUN ANYWHERE (WORA):");
    System.out.println(
      "   * Java Source Code (.java) -> Compiled by javac -> Bytecode (.class)"
    );
    System.out.println(
      "   * Bytecode is NOT machine code; it is an intermediate instruction set."
    );
    System.out.println(
      "   * Bytecode is PLATFORM-INDEPENDENT (same .class file runs on Windows, Mac, Linux)."
    );
    System.out.println(
      "   * JVM is PLATFORM-DEPENDENT (Windows has Windows JVM, Linux has Linux JVM).\n"
    );

    //? 3. Inspecting Current Runtime Environment:
    System.out.println("3. CURRENT SYSTEM ENVIRONMENT PROPERTIES:");
    System.out.println(
      "   * Java Version       : " + System.getProperty("java.version")
    );
    System.out.println(
      "   * Java Vendor        : " + System.getProperty("java.vendor")
    );
    System.out.println(
      "   * JVM Name           : " + System.getProperty("java.vm.name")
    );
    System.out.println(
      "   * Java Home (JRE/JDK): " + System.getProperty("java.home")
    );
    System.out.println(
      "   * Operating System   : " +
        System.getProperty("os.name") +
        " (" +
        System.getProperty("os.arch") +
        ")"
    );
    System.out.println(
      "   * User Architecture  : " +
        System.getProperty("sun.arch.data.model") +
        "-bit\n"
    );

    //? 4. Java Editions:
    System.out.println("4. EDITIONS OF JAVA TECHNOLOGY:");
    System.out.println(
      "   * Java SE (Standard Edition)    : Core language, desktop & general applications."
    );
    System.out.println(
      "   * Java EE / Jakarta EE          : Enterprise, web services, distributed systems."
    );
    System.out.println(
      "   * Java ME (Micro Edition)       : Embedded devices, legacy mobile devices."
    );
    System.out.println(
      "   * Java FX                       : Rich internet & modern desktop graphical applications."
    );
  }
}
