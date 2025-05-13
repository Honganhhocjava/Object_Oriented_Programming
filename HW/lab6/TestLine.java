package hus.oop.lab6;

public class TestLine {
    public static void main(String[] args) {
        Line line2 = new Line(1, 2, 4, 8);
        System.out.println("Line 2: " + line2);
        System.out.println("Length of Line 2: " + line2.getLength());
        System.out.println("Gradient of Line 2: " + line2.getGradient());
        Point point1 = new Point(3, 5);
        Point point2 = new Point(7, 2);
        Line line1 = new Line(point1, point2);
        System.out.println("Line 1: " + line1);
        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Gradient of Line 1: " + line1.getGradient());
        line2.setBeginX(3);
        line2.setBeginY(6);
        line2.setEndXY(9, 12);
        System.out.println("Updated Line 2: " + line2);
        System.out.println("Length of Updated Line 2: " + line2.getLength());
        System.out.println("Gradient of Updated Line 2: " + line2.getGradient());
    }
}