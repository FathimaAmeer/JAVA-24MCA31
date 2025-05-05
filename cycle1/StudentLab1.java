public class StudentLab1 {
    private int studentId;
    private String name;
    private double marks;

    public StudentLab1(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }
    
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + (isPassed() ? "Yes" : "No"));
    }

    
    public boolean isPassed() {
        return marks >= 40;
    }
    
    public static void main(String[] args) {
        StudentLab1 student1 = new StudentLab1(101, "Alice", 85.5);
        StudentLab1 student2 = new StudentLab1(102, "Bob", 39.0);
        StudentLab1 student3 = new StudentLab1(103, "Charlie", 50.0);
        
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
