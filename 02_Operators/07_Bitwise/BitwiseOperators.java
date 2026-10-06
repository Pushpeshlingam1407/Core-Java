// TODO: Bitwise Operators
// * All bitwise operators work on binary representations internally.
// * All bitwise operators take integer values as input and produce an integer as output.
// * There are 7 bitwise operators in Java: &, |, ^, ~, <<, >>, >>>
// ? 1. Bitwise AND (&): Performs an AND operation on each corresponding pair of bits; the result is 1 only when both bits are 1.
// ? 2. Bitwise OR (|): Performs an OR operation on each corresponding pair of bits; the result is 1 when at least one bit is 1.
// ? 3. Bitwise XOR (^): Performs an XOR operation on each corresponding pair of bits; the result is 1 when the two bits are different.
// ? 4. Bitwise NOT (~): Inverts every bit; 0 becomes 1 and 1 becomes 0.
// ? 5. Left Shift (<<): Shifts the bits to the left by the specified number of positions, filling the right side with zeros; this generally increases the value.
// ? 6. Signed Right Shift (>>): Shifts the bits to the right by the specified number of positions; for negative numbers, the sign bit is preserved, generally decreasing the value.
// ? 7. Unsigned Right Shift (>>>): Shifts the bits to the right by the specified number of positions and fills the left side with zeros; the result is always non-negative.

import java.util.*;

public class BitwiseOperators {

  public static void main(String[] args) {
    // Bitwise AND (&)
    System.out.println("Bitwise AND (&)");
    System.out.println(10 & 9); // 8

    // Bitwise OR (|)
    System.out.println("\nBitwise OR (|)");
    System.out.println(10 | 9); // 11

    // Bitwise XOR (^)
    System.out.println("\nBitwise XOR (^)");
    System.out.println(10 ^ 9); // 3

    // Bitwise NOT (~)
    System.out.println("\nBitwise NOT (~)");
    System.out.println(~10); // -11 Shortcut: ~x = -(x+1)

    // Left Shift (<<)
    System.out.println("\nLeft Shift (<<)");
    System.out.println(10 << 9); // 5120

    // Right Shift (>>)
    System.out.println("\nRight Shift (>>)");
    System.out.println(10 >> 9); // 0

    // Unsigned Right Shift (>>>)
    System.out.println("\nUnsigned Right Shift (>>>)");
    System.out.println(10 >>> 9); // 0
  }
}
