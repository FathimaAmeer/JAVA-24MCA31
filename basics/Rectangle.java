import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { 
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            
            double area = length * width;
            double perimeter = 2 * (length + width);
            
            System.out.println("Area of the rectangle: " + area);
            System.out.println("Perimeter of the rectangle: " + perimeter);
        } 
    }
}
