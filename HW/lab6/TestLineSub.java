package hus.oop.lab6;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub line1 = new LineSub(1, 2, 4, 5);
        System.out.println("Information of line1: " + line1);
        System.out.println("Coordinates of the start point: (" + line1.getX() + ", " + line1.getY() + ")");
        System.out.println("Coordinates of the end point: (" + line1.getEndX() + ", " + line1.getEndY() + ")");
        System.out.println("Length of the line: " + line1.getLength());
        System.out.println("Gradient of the line: " + line1.getGradient());
        line1.setEndXY(6, 8);
        System.out.println("Information of the line after changing the end point: " + line1);
    }
}
