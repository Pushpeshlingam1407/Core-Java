//TODO: CLASS LOADING, CLASS STATIC AREA, STACK AREA & STATIC METHODS - SCHEMA
/*
 *
 *                    //TODO: CLASS LOADING & MEMORY AREAS
 *
 *
 * ----------------------------------------------------------------------------
 * 1. CLASS LOADING PROCESS:
 * ----------------------------------------------------------------------------
 *
 * // ? The process of loading a class into the JRE is called the Class Loading
 * // ? Process.
 *
 * // ? It mainly consists of the following 3 steps:
 *
 * // ? 1. It creates a block of memory inside the Class Static Area and assigns
 * // ?    the same name as the class name.
 *
 * // ? 2. It loads all the static members with their default values and
 * // ?    references into the Class Static Area.
 *
 * // ? 3. It executes all static initializers from top to bottom.
 *
 * // ? After completing the above 3 steps, the JVM executes the main() method.
 *
 *
 * ----------------------------------------------------------------------------
 * 2. JVM MEMORY ARCHITECTURE SCHEMA:
 * ----------------------------------------------------------------------------
 *
 *              +-----------------------------------------------+
 *              |                    JRE                        |
 *              |                                               |
 *              |  +---------------------+  +-----------------+ |
 *              |  |     METHOD AREA     |  | CLASS STATIC    | |
 *              |  |    -Complete code   |  | AREA            | |
 *              |  +---------------------+  +-----------------+ |
 *              |                                               |
 *              |  +---------------------+  +-----------------+ |
 *              |  |     STACK AREA      |  |   HEAP AREA     | |
 *              |  |                     |  |                 | |
 *              |  +---------------------+  +-----------------+ |
 *              |                                               |
 *              +-----------------------------------------------+
 *
 * ----------------------------------------------------------------------------
 * 3. METHOD AREA:
 * ----------------------------------------------------------------------------
 *
 * // ? It stores the complete information about the Java code.
 *
 * // ? It stores the bytecode of the methods.
 *
 *
 * ----------------------------------------------------------------------------
 * 4. CLASS STATIC AREA:
 * ----------------------------------------------------------------------------
 *
 * // ? It is helpful in performing the Class Loading Process.
 *
 * // ? It consists only of static members (variables, methods, and initializers),
 * // ? including the main() method.
 *
 *
 * ----------------------------------------------------------------------------
 * 5. STACK AREA:
 * ----------------------------------------------------------------------------
 *
 * // ? In Java, the execution of any method happens inside the Stack Area.
 * // ?     Hence, we also call it the Execution Area.
 *
 * // ? For every method execution and initializer execution, an individual
 * // ?     Stack Frame will be created.
 *
 * // ? It follows the LIFO (Last In, First Out) behaviour for Stack Frames.
 *
 * // ? Local variables get memory inside the Stack Frame created in the Stack Area.
 *
 * // ? Once the Stack Frame's job is completed, its memory will be released.
 *

 *
 * ----------------------------------------------------------------------------
 *                         EXAMPLE SECTION
 * ----------------------------------------------------------------------------
 *
 * //? EXAMPLE:
 */
class ClassLoadingArchitecture {

  // Single line static initializer
  static int a = 10;

  public static void main(String[] args) {
    int b = 100;
    System.out.println(b);
    System.out.println("Hello world");
  }

  // Multi Static initializer/static Initializer Block
  static {
    System.out.println("This is SIB Block...");
  }
}
