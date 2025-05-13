package hus.oop.lab6;

public class Square extends Rectangle  {
    private double side;
    public Square() {
        super();
    }

    public Square(double side) {
        super(side , side); ;
    }

    public Square(double side , String color, boolean filled) {
        super(side , side , color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() +
                "side=" + side +
                ']';
    }
}
