import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter job role (Manager/Developer/Intern): ");
            String role = scanner.nextLine().trim();

            System.out.print("Enter years of experience: ");
            int experience = scanner.nextInt();

            double salary;
            double bonus = 0;

            switch (role.toLowerCase()) {
                case "manager" -> salary = 50000;
                case "developer" -> salary = 30000;
                case "intern" -> salary = 15000;
                default -> {
                    System.out.println("Invalid role entered.");
                    return;
                }
            }

            if (experience >= 3 && experience <= 5) {
                bonus = salary * 0.10;
            } else if (experience > 5) {
                bonus = salary * 0.20;
            }

            double totalSalary = salary + bonus;
            System.out.println("The total salary for a " + role + " with " + experience + " years of experience is: " + totalSalary);
        }
    }
}
