package Main3;

public class clock {
    public static void main(String[] args) {

    java.util.Calendar cal = java.util.Calendar.getInstance();
    int hour = cal.get(java.util.Calendar.HOUR);
    int monute = cal.get(java.util.Calendar.MINUTE);
    int year = cal.get(java.util.Calendar.YEAR);
    int week = cal.get(java.util.Calendar.DAY_OF_WEEK);
    int day = cal.get(java.util.Calendar.DATE);
    int month = cal.get(java.util.Calendar.MONTH) + 1;

    answer3.Calendar(day, hour, monute, year, week,month);
    } 
}
