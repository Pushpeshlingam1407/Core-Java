//TODO: NO-ARGUMENT CONSTRUCTOR - MATTER / NOTES

//* -- The Process of creating a constructor without any formal arguments by the programmer is called as no- argument constructor
class ABC {

  {
    System.out.println("IIB-I");
  }

  ABC() {
    System.out.println("Constructor With no Arguments");
  }

  {
    System.out.println("IIB-II");
  }
}

public class NoArgumentConstructor {

  public static void main(String[] args) {
    ABC a1 = new ABC();
    System.out.println();
    ABC a2 = new ABC();
  }
}
