import java.util.*;

public class Assign1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();

    System.out.println("Enter roll no: ");
    String rollno = sc.nextLine();

    System.out.println("Enter your Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter your mail: ");
    String mail = sc.nextLine();

    System.out.println("Enter your gender: ");
    String gender = sc.nextLine();

    System.out.println("Enter Mobile Number: ");
    long mobno = sc.nextLong();
    sc.nextLine();
    System.out.println("\n");

    System.out.println("Name: " + name);
    System.out.println("Rollno: " + rollno);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
    System.out.println("Mobile Number: " + mobno);
  }
}
