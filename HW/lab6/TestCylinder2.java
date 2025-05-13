package hus.oop.lab6;

public class TestCylinder2 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(5.0, "blue");
        System.out.println("Circle 1: " + circle1);

        Circle1 circle2 = new Circle1(3.0);
        System.out.println("Circle 2: " + circle2);

        circle2.setColor("green");
        System.out.println("Updated Circle 2: " + circle2);

        Cylinder2 cylinder1 = new Cylinder2();
        System.out.println("Cylinder 1: "
                + "base radius=" + cylinder1.getBase().getRadius()
                + ", height=" + cylinder1.getHeight()
                + ", volume=" + cylinder1.getVolume());

        Cylinder2 cylinder2 = new Cylinder2(circle1, 8.0);
        System.out.println("Cylinder 2: "
                + "base radius=" + cylinder2.getBase().getRadius()
                + ", height=" + cylinder2.getHeight()
                + ", volume=" + cylinder2.getVolume());

        cylinder2.setHeight(10.0);
        System.out.println("Updated Cylinder 2: "
                + "base radius=" + cylinder2.getBase().getRadius()
                + ", height=" + cylinder2.getHeight()
                + ", volume=" + cylinder2.getVolume());
    }
}