package hus.oop.lab5;

public class TestMyTime {
    public static void main(String[] args) {
        // Tạo một đối tượng MyTime mới với thời gian ban đầu là 12:30:45
        MyTime time = new MyTime(12, 30, 45);
        // In ra thời gian ban đầu
        System.out.println("Initial Time: " + time);
        // Kiểm tra phương thức nextSecond()
        time.nextSecond();
        System.out.println("Next Second: " + time);
        // Kiểm tra phương thức nextMinute()
        time.nextMinute();
        System.out.println("Next Minute: " + time);
        // Kiểm tra phương thức nextHour()
        time.nextHour();
        System.out.println("Next Hour: " + time);
        // Kiểm tra phương thức previousSecond()
        time.previousSecond();
        System.out.println("Previous Second: " + time);
        // Kiểm tra phương thức previousMinute()
        time.previousMinute();
        System.out.println("Previous Minute: " + time);
        // Kiểm tra phương thức previousHour()
        time.previousHour();
        System.out.println("Previous Hour: " + time);

    }
}

