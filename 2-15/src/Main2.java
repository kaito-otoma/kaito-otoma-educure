public class Main2 {
    public static void main(String[] args) {
        int[] sales = {1000, 2000, 1500, 1800, 2200};
        int totalSales = 0;
        for (int price = 0; price < 5; price++){
            totalSales += sales[price];
        }
        
        System.out.println("合計金額:" + totalSales + "円");
    }
}
