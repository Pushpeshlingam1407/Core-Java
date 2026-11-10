//TODO: The 'return' Keyword in Java - Purpose, Syntax, Execution Rules,
//      Unreachable Code, and void vs non-void Returns.
// * It is the keyword used as a Control Transfer Statement.
// * To use the return keyword, we have to follow some rules. Those are:
// ? 1. We have to use the return statement by passing only one value.
// ? 2. If the method return type is void, then the return statement is optional.
// ? 3. If the method return type is other than void, then the return statement
//     is mandatory, and the returned value must be compatible with the method return type.
// ? 4. We can use multiple return statements in the same method, but only one
//     return statement will be executed during a single method call.
// ? 5. The return statement terminates the method execution immediately and
//     transfers control back to the calling statement.
// ? 6. We can use conditional statements to return different values based on
//     different conditions.
// ? 7. Any statements written after an unconditional return statement in the
//     same block will result in a Compile Time Error due to unreachable code.
// ? 8. A return statement must be reachable and must be executed on every
//     possible execution path of a non-void method.
// ? 9. We can return primitive values, objects, arrays, and other reference
//     types from a method.
// ? 10. We can return the result of an expression directly instead of storing
//      it in a separate variable.
// ? 11. We cannot return multiple values directly using a single return
//      statement. However, we can return an array, object, or collection containing multiple values.

// ! Syntax: return value;
// ! Syntax for void method: return;
// ! Syntax for returning an expression: return expression;
