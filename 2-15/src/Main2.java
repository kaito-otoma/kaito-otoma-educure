public class Main2 {
    public static void main(String[] args) {
        int[] sales = {1000, 2000, 1500, 1800, 2200};
        int totalSales = sales[1] + sales[2] + sales[3] + sales[4] + sales[0];

        System.out.println("合計金額:" + totalSales + "円");
    }
}
