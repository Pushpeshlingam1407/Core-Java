//TODO: Follow naming conventions when creating Java identifiers.
//* Identifiers are names given to classes, variables, methods, and packages.
//* Class and interface names use Upper Camel Case: StudentDetails, BankAccount.
//* Variable and method names use lower camel case: studentName, calculateSalary().
//* Package names use lowercase: com.example.demo.

class StudentDetails {

  //* Upper Camel Case is used for this class name.
  //* lower camel case is used for these variable and method names.
  private String studentName;
  private int studentAge;

  public StudentDetails(String studentName, int studentAge) {
    this.studentName = studentName;
    this.studentAge = studentAge;
  }

  public void displayStudentDetails() {
    System.out.println("Student Name: " + studentName);
    System.out.println("Student Age: " + studentAge);
  }

  public static void main(String[] args) {
    StudentDetails student = new StudentDetails("Aisha", 21);
    student.displayStudentDetails();

    //? Package name example:
    //? com.example.demo

    //? Method name example:
    //? calculateSalary()

    //? Variable name example:
    //? studentName, employeeDetails
  }
}
