//TODO: Learn the internal architecture and memory management of the JVM (Java Virtual Machine).
//* JVM Architecture consists of four major subsystems:
//* 1. ClassLoader Subsystem
//* 2. JVM Memory (Runtime Data Areas)
//* 3. Execution Engine
//* 4. Native Method Interface (JNI) & Native Method Libraries
//*
//* Architecture Diagram:
//* +---------------------------------------------------------------------------------+
//* |                           CLASSLOADER SUBSYSTEM                                 |
//* |   Loading (Bootstrap, Platform, App) -> Linking (Verify, Prepare, Resolve) ->   |
//* |   Initialization (static initializers)                                          |
//* +---------------------------------------------------------------------------------+
//*                                       |
//* +---------------------------------------------------------------------------------+
//* |                      RUNTIME DATA AREAS (JVM MEMORY)                            |
//* |  +-----------------------+  +-------------------------------------------------+ |
//* |  | Method Area/Metaspace |  | Heap Area (Objects, Arrays)                     | |
//* |  | (Shared by threads)   |  | (Shared by threads - Young & Old Gen)           | |
//* |  +-----------------------+  +-------------------------------------------------+ |
//* |  +-----------------------+  +----------------------+  +----------------------+ |
//* |  | JVM Stack Area        |  | PC Registers         |  | Native Method Stack  | |
//* |  | (Per-thread frames)   |  | (Per-thread counter)  |  | (C/C++ native calls) | |
//* |  +-----------------------+  +----------------------+  +----------------------+ |
//* +---------------------------------------------------------------------------------+
//*                                       |
//* +---------------------------------------------------------------------------------+
//* |                             EXECUTION ENGINE                                    |
//* |   Interpreter  |  JIT Compiler (HotSpot)  |  Garbage Collector (GC)             |
//* +---------------------------------------------------------------------------------+
//*            |                                              |
//* +---------------------+                        +----------------------------------+
//* | Java Native Int (JNI)|                        | Native Method Libraries (C/C++)  |
//* +---------------------+                        +----------------------------------+

public class JVMArchitectureDemo {

  // Stored in Heap when instantiated
  int instanceVariable = 42;

  // Stored in Method Area / Metaspace
  static String staticVariable = "Shared Static Data";

  public static void main(String[] args) {
    System.out.println("=================================================");
    System.out.println("           INTERNAL JVM ARCHITECTURE             ");
    System.out.println("=================================================\n");

    //? -------------------------------------------------------------
    //? 1. CLASSLOADER SUBSYSTEM
    //? -------------------------------------------------------------
    System.out.println("1. CLASSLOADER SUBSYSTEM:");
    System.out.println(
      "   Handles loading, linking, and initializing .class bytecode files into memory."
    );
    System.out.println("   - Phase 1: Loading");
    System.out.println(
      "     * Bootstrap ClassLoader : Loads core Java classes (rt.jar / java.base)."
    );
    System.out.println(
      "     * Platform ClassLoader  : Loads platform/extension classes."
    );
    System.out.println(
      "     * Application/System CL : Loads application classes from classpath."
    );
    System.out.println("   - Phase 2: Linking");
    System.out.println(
      "     * Verification : Validates bytecode safety and format."
    );
    System.out.println(
      "     * Preparation  : Allocates memory for static variables and assigns default values."
    );
    System.out.println(
      "     * Resolution   : Replaces symbolic references with direct memory references."
    );
    System.out.println("   - Phase 3: Initialization");
    System.out.println(
      "     * Executes static initializers and assigns explicit static values.\n"
    );

    // Live demonstration of ClassLoaders
    ClassLoader appClassLoader = JVMArchitectureDemo.class.getClassLoader();
    ClassLoader platformClassLoader =
      appClassLoader != null ? appClassLoader.getParent() : null;
    ClassLoader bootstrapClassLoader = String.class.getClassLoader(); // represented as null

    System.out.println("   [Live ClassLoader Inspection]");
    System.out.println("   * Current App ClassLoader      : " + appClassLoader);
    System.out.println(
      "   * Parent (Platform ClassLoader): " + platformClassLoader
    );
    System.out.println(
      "   * Bootstrap ClassLoader (Core) : " +
        bootstrapClassLoader +
        " (null indicates Bootstrap CL)\n"
    );

    //? -------------------------------------------------------------
    //? 2. RUNTIME DATA AREAS (JVM MEMORY)
    //? -------------------------------------------------------------
    System.out.println("2. RUNTIME DATA AREAS (JVM MEMORY):");
    System.out.println("   a) Method Area (Metaspace):");
    System.out.println(
      "      - Stores class metadata, bytecode, runtime constant pool, and static variables."
    );
    System.out.println("      - Shared across all threads.");
    System.out.println("   b) Heap Area:");
    System.out.println("      - Stores all object instances and arrays.");
    System.out.println(
      "      - Shared across all threads; managed by Garbage Collector."
    );
    System.out.println("   c) JVM Stack Area:");
    System.out.println(
      "      - Created per thread. Holds Stack Frames for each method invocation."
    );
    System.out.println(
      "      - Stores local variables, operand stack, and return addresses."
    );
    System.out.println("   d) PC (Program Counter) Register:");
    System.out.println(
      "      - Created per thread. Tracks current instruction address being executed."
    );
    System.out.println("   e) Native Method Stack:");
    System.out.println(
      "      - Holds state for native (C/C++) methods invoked by Java.\n"
    );

    // Live demonstration of Heap vs Stack allocation
    int localPrimitive = 10; // Stored directly in Stack Frame
    JVMArchitectureDemo demoObject = new JVMArchitectureDemo(); // Reference on Stack -> Object on Heap
    System.out.println("   [Stack vs Heap Demonstration]");
    System.out.println(
      "   * localPrimitive (Stack)        = " + localPrimitive
    );
    System.out.println(
      "   * demoObject reference (Stack)  -> points to Heap object"
    );
    System.out.println(
      "   * demoObject.instanceVariable   = " +
        demoObject.instanceVariable +
        " (lives on Heap)"
    );
    System.out.println(
      "   * staticVariable (Method Area)  = " + staticVariable + "\n"
    );

    // Live demonstration of Runtime Memory Querying
    Runtime runtime = Runtime.getRuntime();
    long totalMemMB = runtime.totalMemory() / (1024 * 1024);
    long freeMemMB = runtime.freeMemory() / (1024 * 1024);
    long maxMemMB = runtime.maxMemory() / (1024 * 1024);
    long usedMemMB = totalMemMB - freeMemMB;

    System.out.println(
      "   [JVM Heap Memory Querying via Runtime.getRuntime()]"
    );
    System.out.println("   * Total Allocated Memory : " + totalMemMB + " MB");
    System.out.println("   * Used Memory            : " + usedMemMB + " MB");
    System.out.println("   * Free Memory            : " + freeMemMB + " MB");
    System.out.println("   * Max Available Memory   : " + maxMemMB + " MB\n");

    //? -------------------------------------------------------------
    //? 3. EXECUTION ENGINE
    //? -------------------------------------------------------------
    System.out.println("3. EXECUTION ENGINE:");
    System.out.println("   Executes instructions contained in the bytecode.");
    System.out.println(
      "   - Interpreter  : Reads and executes bytecode instructions line by line (faster startup)."
    );
    System.out.println(
      "   - JIT Compiler : Compiles frequently executed bytecode ('Hotspots') into native CPU instructions"
    );
    System.out.println(
      "                    for direct execution at hardware speeds (high peak performance)."
    );
    System.out.println(
      "   - Garbage Coll : Automatic background daemon thread that reclaims heap memory from unreachable objects.\n"
    );

    // Requesting GC demonstration
    System.out.println("   [Requesting Garbage Collection]");
    System.out.println(
      "   Calling System.gc() to request reclamation of unreferenced heap objects..."
    );
    System.gc();
    System.out.println(
      "   Garbage collection request sent to JVM Execution Engine.\n"
    );

    //? -------------------------------------------------------------
    //? 4. JNI & NATIVE METHOD LIBRARIES
    //? -------------------------------------------------------------
    System.out.println("4. JNI & NATIVE LIBRARIES:");
    System.out.println(
      "   - JNI (Java Native Interface): Bridge allowing Java code to interact with native libraries (C/C++)."
    );
    System.out.println(
      "   - Native Method Libraries    : Platform-specific dynamic libraries (.dll on Windows, .so on Linux)."
    );
  }
}
