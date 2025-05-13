package hus.oop.lab6;

public class TestShapes {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);

        // Test Circle class
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle( "blue", true, 3.5);
        System.out.println(circle2);
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Perimeter of circle2: " + circle2.getPerimeter());

        // Test Rectangle class
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(2.0,3.0,"yellow", true);
        System.out.println(rectangle2);
        System.out.println("Area of rectangle2: " + rectangle2.getArea());
        System.out.println("Perimeter of rectangle2: " + rectangle2.getPerimeter());

        // Test Square class
        Square square1 = new Square(4.0);
        System.out.println(square1);
        System.out.println("Area of square1: " + square1.getArea());
        System.out.println("Perimeter of square1: " + square1.getPerimeter());

        square1.setLength(5.0); // Changing length should also change width to maintain square geometry
        System.out.println(square1); // Check if side length is updated correctly

        square1.setWidth(6.0); // Changing width should also change length to maintain square geometry
        System.out.println(square1); // Check if side length is updated correctly
    }
}


