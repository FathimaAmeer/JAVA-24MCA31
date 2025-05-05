import java.util.Scanner;

// Person class
class Person {
    String name;
    String gender;
    String address;
    int age;

    // Constructor to initialize the data members
    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    // Method to display person details
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

// Employee class that extends Person
class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, String gender, String address, int age, int empId,
             String companyName, String qualification, double salary) {
        super(name, gender, address, age); // Call Person constructor
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployeeDetails() {
        displayPersonDetails(); // Display person details
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
    }
}

// Teacher class that extends Employee
class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    // Constructor to initialize teacher details
    Teacher(String name, String gender, String address, int age, int empId,
            String companyName, String qualification, double salary,
            String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary); // Call Employee constructor
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    // Method to display teacher details
    void displayTeacherDetails() {
        displayEmployeeDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of Teachers:");
        int n = scn.nextInt();
        scn.nextLine(); // consume the leftover newline

        // Create an array to store Teacher objects
        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));

            System.out.print("Enter name: ");
            String name = scn.nextLine();

            System.out.print("Enter gender: ");
            String gender = scn.nextLine();

            System.out.print("Enter address: ");
            String address = scn.nextLine();

            System.out.print("Enter age: ");
            int age = scn.nextInt();
            scn.nextLine();

            System.out.print("Enter employee ID: ");
            int empId = scn.nextInt();
            scn.nextLine();

            System.out.print("Enter company name: ");
            String companyName = scn.nextLine();

            System.out.print("Enter qualification: ");
            String qualification = scn.nextLine();

            System.out.print("Enter salary: ");
            double salary = scn.nextDouble();
            scn.nextLine();

            System.out.print("Enter subject: ");
            String subject = scn.nextLine();

            System.out.print("Enter department: ");
            String department = scn.nextLine();

            System.out.print("Enter teacher ID: ");
            int teacherId = scn.nextInt();
            scn.nextLine();

            // Create a new Teacher object and add it to the array
            teachers[i] = new Teacher(name, gender, address, age, empId, companyName,
                    qualification, salary, subject, department, teacherId);
        }

        // Display the details of all the teachers
        for (int i = 0; i < teachers.length; i++) {
            System.out.println("\nTeacher " + (i + 1) + " Details:");
            teachers[i].displayTeacherDetails();
            System.out.println("------------------------------");
        }

        scn.close();
    }
}
