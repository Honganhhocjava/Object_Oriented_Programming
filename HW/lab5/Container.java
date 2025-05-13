package hus.oop.lab5;

public class Container {
    private int x1 , y1 , x2 , y2;
    public Container(int x , int y , int width , int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width - 1;
        this.y2 = y1 + height - 1;
    }

    public int getX() {
        return this.x1  ;
    }

    public int getY() {
        return this.y1;
    }

    public int getWidth() {
        return x2 - x1 + 1;
    }

    public int getY2() {
        return y2 - y1 + 1;
    }
    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() + ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() + ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 +"," + y1+ "),(" +  x2 + "," + y2 +")]";
    }
}
