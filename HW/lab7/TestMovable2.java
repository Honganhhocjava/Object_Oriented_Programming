package hus.oop.lab7;

public class TestMovable2 {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2,3,1,1);
        System.out.println(movablePoint);
        movablePoint.moveUp();
        System.out.println("Move up: " + movablePoint);
        movablePoint.moveDown();
        System.out.println("Move down: " + movablePoint);
        movablePoint.moveLeft();
        System.out.println("Move left: " + movablePoint);
        movablePoint.moveRight();
        System.out.println("Move right: " + movablePoint);
    }
}