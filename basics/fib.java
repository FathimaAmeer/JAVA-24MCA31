import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the limit for Fibonacci sequence: ");
        int limit = scanner.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: " + a + " " + b);
        
        while (true) {
            int next = a + b;
            if (next > limit) {
                break;
            }
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        
        scanner.close();
    }
}
