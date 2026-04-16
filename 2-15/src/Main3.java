public class Main3 {
    public static void main(String[] args) {
        double[] temperatures = {25.5, 26.0, 24.5, 26.5, 27.0, 25.0, 24.0};
        String[] week = {"月", "火", "水", "木", "金", "土", "日"};
        double totalTemperatures = 0;
        
        for (double temp : temperatures){
            totalTemperatures += temp;
        }
            double average = totalTemperatures / temperatures.length;

        for (int day = 0; day < temperatures.length; day++) {

            System.out.println(week[day] + "曜日 : " + temperatures[day] + "度");
    }
    System.out.println("平均気温:" + average + "度");
        }
}
