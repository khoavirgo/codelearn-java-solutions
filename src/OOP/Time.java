package OOP;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
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

    public void nextSecond() {
        if (this.hour == 23 && this.minute == 59 && this.second == 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        } else if (this.minute == 59 && this.second == 59) {
            this.hour++;
            this.minute = 0;
            this.second = 0;
        } else if (this.second == 59) {
            this.minute++;
            this.second = 0;
        } else this.second++;
    }

    public void previousSecond() {
        if (this.hour == 0 && this.minute == 0 && this.second == 0) {
            this.hour = 23;
            this.minute = 59;
            this.second = 59;
        } else if (this.minute == 0 && this.second == 0) {
            this.hour--;
            this.minute = 59;
            this.second = 59;
        } else if (this.second == 0) {
            this.minute--;
            this.second = 59;
        } else this.second--;
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d%n", this.hour, this.minute, this.second);
    }
}