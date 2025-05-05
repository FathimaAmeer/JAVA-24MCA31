public class RectangleLab1 {
    private double length;
    private double width;
    
    public RectangleLab1() {
        this.length = 1;
        this.width = 1;
    }
    
    public RectangleLab1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    public void displayRectangleInfo() {
        System.out.println("\nRectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
    
    public static void main(String[] args) {
        RectangleLab1 defaultRectangle = new RectangleLab1();
        RectangleLab1 customRectangle = new RectangleLab1(5.0, 3.0);
        
        defaultRectangle.displayRectangleInfo();
        customRectangle.displayRectangleInfo();
    }
}
