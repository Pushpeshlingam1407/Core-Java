//TODO: NON-STATIC MEMBERS IN JAVA - SCHEMA & DEFINITIONS
/*
 * ============================================================================
 *                         NON-STATIC MEMBERS SCHEMA
 * ============================================================================
 * 
 * Non-static members are bound to individual OBJECTS (instances) of a class.
 * They are created in Heap Memory when an object is instantiated using 'new'.
 * 
 * ----------------------------------------------------------------------------
 * 4 TYPES OF NON-STATIC MEMBERS:
 * ----------------------------------------------------------------------------
 * 1. NON-STATIC VARIABLES (Instance Variables / Attributes / Fields):
 *    //TODO: Write Definition Here
 * 
 * 
 * 2. NON-STATIC METHODS (Instance Methods / Behaviors):
 *    //TODO: Write Definition Here
 * 
 * 
 * 3. NON-STATIC INITIALIZERS (Instance Initializer Block - IIB):
 *    //TODO: Write Definition Here
 * 
 * 
 * 4. CONSTRUCTORS:
 *    //TODO: Write Definition Here
 * 
 * 
 * ============================================================================
 *                              NOTE SECTION
 * ============================================================================
 * //? NOTE:
 * //* [Write Note Here]
 * 
 */

public class NonStaticMembersSchema {

  //* 2.2.1 Non-Static Variable (Instance Variable):
  int instanceVariable;

  //* 2.2.3 Non-Static Initializer (IIB - Instance Initializer Block):
  {
    // Write IIB logic here (executes before constructor on each object creation)
  }

  //* 2.2.4 Constructor:
  public NonStaticMembersSchema() {
    // Write Constructor logic here
  }

  //* 2.2.2 Non-Static Method (Instance Method):
  public void instanceMethod() {
    // Write non-static method logic here
  }

  public static void main(String[] args) {
    System.out.println("=== NON-STATIC MEMBERS SCHEMA ===");
    // Non-static members require object creation:
    NonStaticMembersSchema obj = new NonStaticMembersSchema();
    obj.instanceMethod();
  }
}

