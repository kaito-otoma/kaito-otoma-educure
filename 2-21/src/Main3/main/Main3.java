package Main3.main;

public class Main3 {
public static void Calendar(int day, int hour, int minute, int year, int week, int month, int seconds) {

    String[] weekDays =  {" ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    String weekStr = weekDays[week];
    String[] monthNames = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    String monthStr = monthNames[month];  

    System.out.println("現在の日時 :" + weekStr + " " + monthStr + " " + day + " " + hour + ":" + minute + ":" + seconds + " " + "JST" + " " + year);
    }
}
