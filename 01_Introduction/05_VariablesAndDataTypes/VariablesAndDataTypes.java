// A variable is a named location in memory used to store a value.
// To create a variable, we must specify its type.
// Syntax: datatype variable;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
        int age;         // variable declaration
        age = 22;        // variable initialization

        double salary = 45000.50;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Pushp";

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Student? " + isStudent);
        System.out.println("Name: " + name);

        // Java data types are mainly of two types:
        // 1. Primitive data types
        // 2. Non-primitive data types
    }
}
