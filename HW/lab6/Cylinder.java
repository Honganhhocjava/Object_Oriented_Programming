package hus.oop.lab6;

public class Cylinder extends Circle1 {
    private double height;
    public Cylinder() {
        super();
        this.height = 1.0 ;
    }

    public Cylinder( double height) {
        super();
        this.height = height;
    }
    public Cylinder(double radius , double height) {
        super(radius);
        this.height = height ;
    }

    public Cylinder(double radius , double height , String color ) {
        super(radius , color );
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height ;
    }

}
