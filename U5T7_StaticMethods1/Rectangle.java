package U5T7_StaticMethods1;

public class Rectangle {
    // instance variables
    private double length;
    private double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // static "utility" method that converts feet to inches
    public static double feetToInches(double feet) {
        return feet * 12;
    }

    // static "utility" method that converts inches to feet
    public static double inchesToFeet(double inches) {
        return inches / 12;
    }

    public boolean isSquare() {
        return length == width;
    }

    // instance method that returns area of Rectangle object
    public double area() {
        return length * width;
    }

    // instance method that returns perimeter of Rectangle object
    public double perimeter(){
        return (2 * length) + (2 * width);
    }
}



