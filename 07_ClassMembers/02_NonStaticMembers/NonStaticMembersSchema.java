//TODO: NON-STATIC MEMBERS IN JAVA - SCHEMA & DEFINITIONS

//! NON-STATIC MEMBERS SCHEMA

//? Non-static members are bound to individual OBJECTS (instances) of a class.
//? They are created in Heap Memory when an object is instantiated using 'new'.

//! 4 TYPES OF NON-STATIC MEMBERS:

//TODO: 1. NON-STATIC VARIABLES (Instance Variables / Attributes / Fields)

//? A variable that is created inside the class block without the static keyword as a prefix is called a non-static variable.
//? Non-static variables are stored inside objects, and each object has a separate copy of them.


//TODO: 2. NON-STATIC METHODS (Instance Methods / Behaviors)

//? A method that is declared inside the class block without the static keyword is called a non-static method.
//? The body/block that belongs to a non-static method is called a non-static context.
//? Non-static methods are stored inside the object.


//TODO: 3. NON-STATIC INITIALIZERS (Instance Initializer Block - IIB)

//! There are 2 types of non-static initializers:

//? 1. Single-line non-static initializer
//? 2. Multi-line non-static initializer / Instance Initializer Block (IIB)


//TODO: 1. Single-line non-static initializer

//? Initializing a non-static variable with some data in its declaration itself is called a single-line non-static initializer.


//TODO: 2. Multi-line non-static initializer / Instance Initializer Block (IIB)

//? It is an anonymous block that is not prefixed with the static keyword and is created inside the class block.
//? We can create any number of IIBs in a class.
//? If a class consists of multiple non-static initializers (single-line and multi-line), they will execute automatically during the object initialization process, from top to bottom.
//? The execution of non-static initializers completely depends on the number of objects created for that class.
