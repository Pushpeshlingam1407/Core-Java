/*
 * Folder: 01_Introduction / 01_Identifiers
 * Topic: Java Identifier Naming Conventions
 *
 * Naming conventions are not mandatory in Java, but they are strongly recommended
 * because they improve readability and keep code consistent across projects.
 *
 * Class and interface names follow Upper Camel Case.
 * Variable and method names follow lower camel case.
 * Package names are written in lowercase.
 */

class StudentDetails {
    // Example of Upper Camel Case for class name
    // Example of lower camel case for variables and methods
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

        // Package name example:
        // com.example.demo

        // Method name example:
        // calculateSalary()

        // Variable name example:
        // studentName, employeeDetails
    }
}
