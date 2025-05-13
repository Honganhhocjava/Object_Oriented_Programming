package hus.oop.lab6;

public class Cylinder2 {
    private Circle1 base;
    private double height;
    public Cylinder2() {
        this.base = new Circle1();
        this.height = 1.0;
    }

    public Cylinder2(Circle1 base , double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle1 getBase() {
        return base;
    }

    public void setBase(Circle1 base) {
        this.base = base;
    }

    public double getVolume() {
        return base.getArea() * height ;
    }
}
