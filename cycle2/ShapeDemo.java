// Interface Shape
interface Shape {
    // Abstract method to calculate area
    double calculateArea();
}

// Triangle class implementing Shape
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding calculateArea() for Triangle
   
    public double calculateArea() {
        return 0.5 * base * height; // Formula for the area of a triangle
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding calculateArea() for Rectangle

    public double calculateArea() {
        return length * width; // Formula for the area of a rectangle
    }
}

// Main class to demonstrate polymorphism
public class ShapeDemo {
    public static void main(String[] args) {
        // Create Shape references for Triangle and Rectangle
        Shape triangle = new Triangle(10, 5); // Base = 10, Height = 5
        Shape rectangle = new Rectangle(8, 4); // Length = 8, Width = 4

        // Demonstrate polymorphism by calling calculateArea()
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}