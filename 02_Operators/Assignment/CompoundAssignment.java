//TODO: Learn the shortcut form of arithmetic assignment.
//* Compound assignment combines an arithmetic operation with assignment.
//? Example: c += 3 is the shorter form of c = c + 3.
//* Common forms are +=, -=, *=, /=, and %=.

class CompoundAssignment {
    public static void main(String[] args) {
        int c = 5;

        c += 3; // c = c + 3 => 8
        c *= 2; // c = c * 2 => 16
        c /= 4; // c = c / 4 => 4

        System.out.println("c = " + c);

        //TODO: Tricky question: What is the value of x?
        //? int x = 10;
        //? x *= 2 + 3;
        //? Answer: 50, because x *= 2 + 3 means x = x * (2 + 3).
        //* The right-hand expression is evaluated before assignment.
    }
}
