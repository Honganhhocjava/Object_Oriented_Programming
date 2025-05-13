package hus.oop.lab5;

public class TestBallPlayer {
    public static void main(String[] args){
        Player player = new Player(1, 0, 0);
        System.out.println("Player's Initial Information:");
        System.out.println(player);
        player.move(2, 3);
        player.jump(1);
        System.out.println("\nPlayer's Information After Movement:");
        System.out.println(player);
        Ball2 ball = new Ball2(5, 5, 0);
        System.out.println("\nChecking if the Player is Near the Ball:");
        if (player.near(ball)) {
            System.out.println("The player is near the ball.");
        } else {
            System.out.println("The player is not near the ball.");
        }
        System.out.println("\nKicking the Ball:");
        player.kick(ball);
        System.out.println("Ball's New Position:");
        System.out.println(ball);
        System.out.println("\nMoving the Player Again:");
        player.move(3, -2);
        System.out.println("Checking if the Player is Near the Ball After Another Movement:");
        if (player.near(ball)) {
            System.out.println("The player is near the ball.");
        } else {
            System.out.println("The player is not near the ball.");
        }
    }
}
