public class Main2 {
    public static void main(String[] args) {
        int[] sales = {1000, 2000, 1500, 1800, 2200};
        int totalSales = 0;
        for (int price = 0; price < sales.length; price++){
            totalSales += sales[price];
        }
        
        System.out.println("売上合計:" + totalSales + "円");
    }
}
