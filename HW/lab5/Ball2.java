package hus.oop.lab5;

public class Ball2 {
    private float x,y,z;
    public Ball2(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }
    public void setXYZ(float x , float y , float z ){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString(){
        return "(" + x +y +z +")";
    }
}
