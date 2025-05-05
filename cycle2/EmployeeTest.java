// Abstract class Employee
abstract class Employee {
    protected String name;
    protected int id;

    // Constructor to initialize name and id
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor to initialize attributes
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Implementation of calculateSalary()
    
    public double calculateSalary() {
        return monthlySalary;
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialize attributes
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculateSalary()
   
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to test the system
public class EmployeeTest {
    public static void main(String[] args) {
        // Create a FullTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Fathima", 101, 50000.0);
        fullTimeEmployee.displayDetails();
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary());

        System.out.println();

        // Create a PartTimeEmployee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Rahul", 102, 500.0, 20);
        partTimeEmployee.displayDetails();
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());
    }
}