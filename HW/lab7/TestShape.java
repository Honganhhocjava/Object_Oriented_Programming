package hus.oop.lab7;

public class TestShape {
    public static void main(String[] args) {

        Shape shape1 = new Circle1("red", false, 5.5);
        System.out.println(shape1);
        if (shape1 instanceof Circle1) {
            System.out.println("Area: " + ((Circle1) shape1).getArea());
            System.out.println("Perimeter: " + ((Circle1) shape1).getPerimeter());
            System.out.println("Color: " + ((Circle1) shape1).getColor());
            System.out.println("Is filled? " + ((Circle1) shape1).isFilled());
            System.out.println("Radius:" + ((Circle1) shape1).getRadius());
        }

        Circle1 circle1 = (Circle1) shape1;
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Is filled? " + circle1.isFilled());
        System.out.println("Radius: " + circle1.getRadius());

        //Shape shape2 = new Shape(); không thể tạo đối tượng được khi dùng abtracts

        Shape shape3 = new Rectangle1(1.0, 2.0, "red", false);
        System.out.println(shape3);
        if( shape3 instanceof Rectangle1){
            Rectangle1 rectangle3 = (Rectangle1) shape3;
            System.out.println("Area: " + rectangle3.getArea());
            System.out.println("Perimeter: " + rectangle3.getPerimeter());
            System.out.println("Color: " + rectangle3.getColor());
            System.out.println("Lenght:" + rectangle3.getLength());
        }

        Rectangle1 rectangle1 = (Rectangle1) shape3;
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Color: " + rectangle1.getColor());
        System.out.println("Length: " + rectangle1.getLength());

        Shape shape4 = new Square(6.6, "green", true);
        System.out.println(shape4);
        if(shape4 instanceof Square) {
            Square square4 = (Square) shape4;
            System.out.println("Area: " + square4.getArea());
            System.out.println("Color: " + square4.getColor());
            System.out.println("Side:" + square4.getSide());
        }

        Rectangle1 rectangle2 = (Rectangle1) shape4;
        System.out.println(rectangle2);
        if(rectangle2 instanceof Square) {
            Square square2 = (Square) rectangle2;
            System.out.println("Area: " + square2.getArea());
            System.out.println("Color: " + square2.getColor());
            System.out.println("Side:" + square2.getSide());
            System.out.println("Length: " + square2.getLength());
        }

        Square square1 = (Square) rectangle2;
        System.out.println(square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Color: " + square1.getColor());
        System.out.println("Side: " + square1.getSide());
        System.out.println("Length:" + square1.getLength());
    }
}

