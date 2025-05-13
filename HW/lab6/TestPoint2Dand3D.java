package hus.oop.lab6;

public class TestPoint2Dand3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.5f, 3.8f);
        System.out.println("Point2D: " + point2D);
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);
        point3D.setX(4.5f);
        point3D.setY(5.5f);
        point3D.setZ(6.5f);
        System.out.println("Updated Point3D: " + point3D);
        point3D.setXYZ(7.0f, 8.0f, 9.0f);
        System.out.println("Updated Point3D with XYZ values: " + point3D);
        float[] xyz = point3D.getXYZ();
        System.out.println("XYZ values: x=" + xyz[0] + ", y=" + xyz[1] + ", z=" + xyz[2]);
    }
}