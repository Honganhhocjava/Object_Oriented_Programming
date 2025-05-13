package hus.oop.lab5;

public class Player {
    private int number ;
    float x ,y ,z ;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f;
    }
    public void move(float xDisp , float yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }
    public void jump(float zDisp){
        this.z += zDisp;
    }
    public boolean near(Ball2 ball){
        float distance = (float) Math.sqrt(Math.pow((this.x - ball.getX()), 2) +
                Math.pow((this.y - ball.getY()), 2) + Math.pow((this.z - ball.getZ()), 2));
        return distance < 8;
    }
    public void kick(Ball2 ball) {
        ball.setXYZ(ball.getX() + 1, ball.getY() + 1, ball.getZ() + 1);
    }
    @Override
    public String toString() {
        return "Player[" +
                "number=" + number +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ']';
    }
}
