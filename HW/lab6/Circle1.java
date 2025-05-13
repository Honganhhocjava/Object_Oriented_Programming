package hus.oop.lab6;

public class Circle1 {
    private String color;
    private double radius;
    public Circle1() {
        this(1.0 , "red");
    }
    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius , String color) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
     public double getArea() {
        return Math.PI * radius * radius ;
     }

    @Override
    public String toString() {
        return "Circle[" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ']';
    }
}
