// TODO: Compound Assignment Operators
//* Compound assignment operators combine an arithmetic operation with assignment.
//* They are short forms of:
//? variable = variable operator value
//? Examples: +=, -=, *=, /=, %=

class CompoundAssignment {
    public static void main(String[] args) {
        int c = 5;

        c += 3; // c = c + 3 => 8
        c *= 2; // c = c * 2 => 16
        c /= 4; // c = c / 4 => 4

        System.out.println("c = " + c);

        // TODO Tricky question:
        // int x = 10;
        // x *= 2 + 3;
        // What will x be?
        // Answer: x = 10 * (2 + 3) = 50
        // Because the expression on the right side is evaluated first, then assigned.
    }
}
