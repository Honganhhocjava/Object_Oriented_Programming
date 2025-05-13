package hus.oop.lab6;

public class Point2D {
    private float x , y ;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
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

    public void setXY(float x , float y) {
        this.x = x ;
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = new float[2];
        xy[0] = this.x; // Gán giá trị x cho phần tử đầu tiên của mảng
        xy[1] = this.y; // Gán giá trị y cho phần tử thứ hai của mảng
        return xy;
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}
