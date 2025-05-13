package hus.oop.lab7;

public class Rectangle1 extends Shape {
    private double width, length;
    public Rectangle1() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }


    public Rectangle1(double width , double length) {
        super();
        this.width = width ;
        this.length = length;
    }

    public Rectangle1(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length ;
    }

    public double getPerimeter() {
        return 2 * ( width + length );
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
