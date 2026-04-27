package Main3.main;

import java.util.Date;

public class showCurrentTime {
    public static void main(String[] args) {
        Date now = new Date();

        int day = now.getDate();
        int hour = now.getHours();
        int minute = now.getMinutes();
        int year = now.getYear() + 1900;
        int week = now.getDay() + 1;
        int month = now.getMonth() + 1;
        int seconds = now.getSeconds();

        Main3.Calendar(day, hour, minute, year, week,month,seconds);
    }
}
