import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;
            System.out.println("Area of the circle: " + area);
            System.out.println("Perimeter (Circumference) of the circle: " + perimeter);
        }
    }
}
