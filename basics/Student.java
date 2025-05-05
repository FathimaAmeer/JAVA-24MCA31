import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter marks for Math: ");
        int math = scanner.nextInt();
        
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        
        int total = math + physics + chemistry;
        int mathPhysicsTotal = math + physics;
        
        if ((math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) || mathPhysicsTotal >= 150) {
            System.out.println("The student is eligible.");
        } else {
            System.out.println("The student is not eligible.");
        }
        
        scanner.close();
    }  
}
