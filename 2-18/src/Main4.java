import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};  
        int[] quantities = {1, 2, 3};    

        int[] totals = totalPrices(prices, quantities);

        System.out.print("商品価格: " +  Arrays.toString(prices));
        System.out.println("数量:" + Arrays.toString(quantities));
        System.out.println("合計金額: " + Arrays.toString(totals));
    }
    public static int[] totalPrices(int[] prices , int[] quantities){
        int[] totals = new int[prices.length];
        double taxPercent = 0.1;
        
        for (int price = 0; price < prices.length; price++) {
            int subtotal = prices[price] * quantities[price];
            int tax = (int)(subtotal * taxPercent);
            totals [price] = subtotal + tax;
        }
        return totals;
    }
}