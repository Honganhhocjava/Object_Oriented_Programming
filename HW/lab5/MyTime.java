package hus.oop.lab5;

public class MyTime {
    private int hour;
    private int minute;
    private int second;
    public MyTime(){
        this(0,0,0);
    }
    public MyTime(int hour , int minute , int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTimme(int hour, int minute, int second){
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour!");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute!");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second!");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return "\"" + hour + ":" + minute + ":" + second + "\"";
    }
    public MyTime nextSecond(){
        this.second++;
        if(second >= 60){
            this.second = 0;
            nextMinute();
        }
        return this;
    }
    public MyTime nextMinute(){
        this.minute++;
        if(minute >= 60){
            this.minute = 0 ;
            nextHour();
        }
        return this;
    }
    public MyTime nextHour(){
        this.hour++;
        if(hour >= 24){
            this.hour = 0;
        }
        return this;
    }
    public MyTime previousSecond() {
        this.second--;
        if (this.second < 0) {
            this.second = 59;
            this.previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        this.minute--;
        if (this.minute < 0) {
            this.minute = 59;
            this.previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        this.hour--;
        if (this.hour < 0) {
            this.hour = 23;
        }
        return this;
    }
}
