package hus.oop.lab4;

public class Rectangle {
    private float length;
    private float width;
    public Rectangle(){
        this.length = 1.0f;
        this.width = 1.0f;
        // or this(1.0 ,1.0);
    }
    public Rectangle(float length , float width){
        this.length = length ;
        this.width = width ;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }
    @Override
    public String toString(){
        return "Rectangle[length =" + length + "; width = " + width + "]" ;
    }
}
