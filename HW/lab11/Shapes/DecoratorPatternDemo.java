package hus.oop.lab11.Shapes;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);

        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(rectangle);

        redCircle.draw();
        redRectangle.draw();

    }
}
