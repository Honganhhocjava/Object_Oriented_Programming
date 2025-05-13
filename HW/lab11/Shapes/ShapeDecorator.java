package hus.oop.lab11.Shapes;

public abstract class ShapeDecorator implements Shape {
    private Shape shape;

    public ShapeDecorator() {
    }

    @Override
    public void draw() {
        this.shape.draw();
    }
}
