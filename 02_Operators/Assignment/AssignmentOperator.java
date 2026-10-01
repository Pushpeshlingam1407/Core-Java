//TODO: Understand how assignment stores a value in a variable.
//* The '=' operator assigns the value on its right to the variable on its left.
//? Example: int x = 10; stores 10 in x.
//* Compound assignment operators include +=, -=, *=, /=, and %=.

class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10 + 10 + 2 * 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
