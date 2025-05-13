package hus.oop.lab7;

public class TestGeometricObject {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println(circle);
        System.out.println("Area:" + circle.getArea());
        System.out.println("Perimeter:" + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(5.0,4.0);
        System.out.println(rectangle);
        System.out.println("Area:" + rectangle.getArea());
        System.out.println("Perimeter:" + rectangle.getPerimeter());
    }
}
