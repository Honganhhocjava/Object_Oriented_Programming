package hus.oop.lab7;

public class TestMovable {
    public static void main(String[] args) {
        // Tạo một điểm có tọa độ (x, y) và vận tốc (xSpeed, ySpeed)
        MovablePoint point = new MovablePoint(3, 5, 2, 2);

        // In ra thông tin ban đầu của điểm
        System.out.println("Point before moving: " + point);

        // Di chuyển điểm
        point.moveUp(); // Di chuyển lên trên
        point.moveRight(); // Di chuyển sang phải

        // In ra thông tin sau khi di chuyển của điểm
        System.out.println("Point after moving: " + point);

        // Tạo một hình tròn có tâm là điểm point và bán kính 5
        MovableCircle circle = new MovableCircle(3, 5, 2, 2, 5);

        // In ra thông tin ban đầu của hình tròn
        System.out.println("Circle before moving: " + circle);

        // Di chuyển hình tròn
        circle.moveDown(); // Di chuyển xuống dưới
        circle.moveLeft(); // Di chuyển sang trái

        // In ra thông tin sau khi di chuyển của hình tròn
        System.out.println("Circle after moving: " + circle);
    }

}
