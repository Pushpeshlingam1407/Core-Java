//TODO: Method with return type

// * We can design a method that can perform an operation and return the output
//   to the method calling statement by following the below steps.

// * We have to specify the datatype of what we have to return as the method
//   return type.

// * If the method return type is void, that means the method is not returning
//   any output.

// * If the method has a return type other than void, that means the method is
//   going to return that particular type of data. In this case, the program
//   must and should have a return statement inside the method; if not, we will
//   get a Compile Time Error.

// * We can write the return statement by using the "return" keyword.

class MethodWithReturnType {

  public static void main(String[] args) {
    System.out.println(add(13, 376));
  }

  public static int add(int a, int b) {
    return a + b;
  }
}
