//TODO: Trace execution order of SIBs and IIBs when creating multiple objects inside main()

public class Static_NonStatic3 {

  static {
    System.out.println("SIB-I");
  }

  {
    System.out.println("IIB-I");
  }

  public static void main(String[] ta) {
    System.out.println("Main Method starts");
    Static_NonStatic3 sn1 = new Static_NonStatic3();
    Static_NonStatic3 sn2 = new Static_NonStatic3();
    System.out.println("Main Method Ends");
  }

  static {
    System.out.println("SIB-II");
  }

  {
    System.out.println("IIB-II");
  }
}
