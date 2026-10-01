//TODO: Learn how variables store values in memory.
//* A variable is a named memory location used to store a value.
//* A data type tells Java what kind of value the variable can hold.
//? Syntax: datatype variable;

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

        //* Java data types are mainly divided into two groups:
        //? 1. Primitive data types
        //? 2. Non-primitive data types
    }
}
