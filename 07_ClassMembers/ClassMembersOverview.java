//TODO: CLASS MEMBERS IN JAVA - MASTER SCHEMA & HIERARCHY

/*
 *
 *                         FLOWCHART: CLASS MEMBERS
 *
 *
 *                               +------------------------+
 *                               |     CLASS MEMBERS      |
 *                               +-----------+------------+
 *                                           |
 *                  +------------------------+------------------------+
 *                  |                                                 |
 *     +------------v------------+                       +------------v------------+
 *     |     1. LOCAL MEMBERS    |                       |    2. GLOBAL MEMBERS    |
 *     +-------------------------+                       +------------+------------+
 *                                                                    |
 *                                           +------------------------+------------------------+
 *                                           |                                                 |
 *                              +------------v------------+                       +------------v------------+
 *                              |       2.1 STATIC        |                       |     2.2 NON-STATIC      |
 *                              +------------+------------+                       +------------+------------+
 *                                           |                                                 |
 *                      +--------------------+--------------------+       +--------------------+--------------------+
 *                      |                    |                    |       |              |            |             |
 *             +--------v-------+   +--------v-------+   +--------v-----+ +v-----------+ +v---------+ +v----------+ +v------------+
 *             |  2.1.1 Static  |   |  2.1.2 Static  |   | 2.1.3 Static | | 2.2.1 Non- | |2.2.2 Non-| | 2.2.3 Non-| | 2.2.4       |
 *             |   Variables    |   |    Methods     |   | Initializers | |   Static   | |  Static  | |  Static   | |Constructors |
 *             +----------------+   +----------------+   +--------------+ | Variables  | | Methods  | |Initializer| +-------------+
 *                                                                        +------------+ +----------+ +-----------+
 *
 *
 *                      //TODO: 1. CLASS MEMBERS: DEFINITION
 *
 * // ? The members that are declared inside a class are called Class Members.
 *
 *
 *                      //TODO: 2. GLOBAL MEMBERS: DEFINITION
 *
 * // ? Any member that is declared directly within the class block is called
 * // ? a Global Member.
 *
 * // ? The main advantage of Global Members is that we can access them from
 * // ? different parts of the program, subject to their access restrictions.
 *
 * // ? Basically, Global Members are of 2 types:
 * // ?   1. Static Members
 * // ?   2. Non-Static Members
 *
 *
 *                      //TODO: NOTE SECTION
 *
 * //! NOTE:
 *
 * //* The static and non-static concepts are applicable only to Global Members,
 * //* not to Local Members.
 *
 *
 *                      //TODO: 3. STATIC GLOBAL MEMBERS (2.1)
 *
 * //* Any Global Member that is declared or prefixed with the static keyword
 * //* is called a Static Global Member.
 *
 * // ? There are 3 Types of Static Global Members:
 * // ?   1. Static Variables
 * // ?   2. Static Methods
 * // ?   3. Static Initializers
 *
 * // ? Static Initializers are of 2 types:
 * // ?   a) Single-Line Static Initializer
 * // ?   b) Multi-Line Static Initializer (Static Initializer Block - SIB)
 *
 *
 *                      //TODO: 4. NON-STATIC MEMBERS (2.2)
 *
 * // ? There are 4 Types of Non-Static Members:
 * // ?   1. Non-Static Variables (Instance Variables)
 * // ?   2. Non-Static Methods (Instance Methods)
 * // ?   3. Non-Static Initializers (Instance Initializer Block - IIB)
 * // ?   4. Constructors
 *
 */
