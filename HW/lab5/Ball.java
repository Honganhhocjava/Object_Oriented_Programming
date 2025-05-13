package hus.oop.lab5;

public class Ball {
    private float x, y, xDelta, yDelta;
    private int radius;
    public Ball(float x, float y, int radius , int speed , int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        float angle = (float) Math.toRadians(direction);
        this.xDelta = speed * (float) Math.cos(angle);
        this.yDelta = -speed * (float) Math.sin(angle);
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        this.x += xDelta;
        this.y += yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta = - xDelta ;
    }
    public void reflectVertical(){
        this.yDelta = - yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x +"," + y + ")" + ",speed =(" +  xDelta + "," + yDelta +")]";
    }
}
