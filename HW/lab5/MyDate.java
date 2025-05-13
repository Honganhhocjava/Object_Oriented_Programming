package hus.oop.lab5;

public class MyDate {
    private  int year;
    private int month;
    private int day;
    public static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    public static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };
    public static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
    public boolean isValidDate(int year, int month, int day){
        if(year < 0 || year > 9999 || month < 1 || month > 12){
            return false;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1 ];
        if(month == 2 && isLeapYear(year)){
            maxDay = 29;
        }
        return day >=1 && day <= maxDay;
    }
    public  int getDayOfWeek(int year, int month, int day){
        //using Zeller's Congruence
        if(month < 3){
            month += 12;
            year -= 1;
        }
        int century = year / 100;
        int yearOfCentury = year % 100;

        int dayOfWeek = (day + ((13 * (month + 1)) / 5) + yearOfCentury + (yearOfCentury / 4)
                + (century / 4) - (2 * century)) % 7;
        if(dayOfWeek < 0 ){
            dayOfWeek += 7;
        }
        return dayOfWeek;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)){
            throw new IllegalArgumentException("Invalid year, month, or day!");
        } else {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }
    public void setYear(int year) {
        if (year < 1 || year > 9999)
            throw new IllegalArgumentException("Invalid year!");
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            throw new IllegalArgumentException("Invalid month!");
        this.month = month;
    }
    public void setDay(int day){
        int maxDay = DAYS_IN_MONTHS[this.month - 1];
        if (this.month == 2 && isLeapYear(this.year))
            maxDay = 29;
        if (day < 1 || day > maxDay)
            throw new IllegalArgumentException("Invalid day!");
        this.day = day;
    }
    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }
    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return String.format("%s %d %s %d", DAYS[dayOfWeek], day, MONTHS[month - 1], year);
    }
    public MyDate nextDay() {
        int maxDay = DAYS_IN_MONTHS[this.month - 1];
        if (this.month == 2 && isLeapYear(this.year)) {
            maxDay = 29;
        }
        if (this.day < maxDay) {
            this.day++;
        } else {
            if (this.month < 12) {
                this.day = 1;
                this.month++;
            } else {
                this.day = 1;
                this.month = 1;
                this.year++;
            }
        }
        return this;
    }
    public MyDate nextMonth(){
        if(month < 12){
            this.month++;
        }else {
            this.month = 1;
            this.year++;
        }
        return this;
    }
    public MyDate nextYear(){
        this.year++;
        return this;
    }
    public MyDate previousDay() {
        if (this.day > 1) {
            this.day--;
        } else {
            if (this.month > 1) {
                this.month--;
                this.day = DAYS_IN_MONTHS[this.month - 1];
                if (this.month == 2 && isLeapYear(this.year))
                    this.day++;
            } else {
                this.year--;
                this.month = 12;
                this.day = 31;
            }
        }
        return this;
    }
    public MyDate previousMonth(){
        if(month > 1 ){
            this.month--;
        }else {
            this.year--;
            this.month = 12 ;
        }
        return this;
    }
    public MyDate previousYear(){
        this.year--;
        return this;
    }

}
