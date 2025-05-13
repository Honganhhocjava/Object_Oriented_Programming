package hus.oop.lab6;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(3, 5);
        System.out.println(point);
        int x = point.getX();
        int y = point.getY();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        point.setX(7);
        point.setY(2);
        System.out.println("Updated point: " + point);
        point.setXY(1, 9);
        System.out.println("Final point: " + point);
    }
}
