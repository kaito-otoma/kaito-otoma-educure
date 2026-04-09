import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};  // 商品価格
        int[] quantities = {1, 2, 3};    // 数量

        totalPrices (prices, quantities);
    }
    public static void totalPrices(int[] prices , int[] quantities){
        int[] totals = {0, 0, 0};
        int[] taxs = {0, 0, 0};
        double taxPercent = 0.1;
        
        for (int price = 0; price < prices.length; price++) {
            int subtotal = prices[price] * quantities[price];
            taxs [price] = (int)(subtotal * taxPercent);
            totals [price] = subtotal + taxs[price];
        }

        System.out.print("商品価格: " +  Arrays.toString(prices));
        System.out.println("数量:" + Arrays.toString(quantities));
        System.out.println("合計金額: " + Arrays.toString(totals));
    }
}
