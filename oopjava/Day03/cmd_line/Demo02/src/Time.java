package p2;

public class Time {
    int hour;
    int minute;

    public void acceptTime(int hr, int min) {
        hour = hr;
        minute = min;
    }

    public void displayTime() {
        System.out.println("Time = " + hour + " : " + minute);
    }
}
