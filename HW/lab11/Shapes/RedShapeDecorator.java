package hus.oop.lab11.Shapes;

public class RedShapeDecorator extends ShapeDecorator {
    protected Shape shape;

    public RedShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("Border color: Red");
    }
}
