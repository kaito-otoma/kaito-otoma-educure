public class Main1 {
    public static void main(String[] args) {
        int price = 1000;  // 商品価格
        int quantity = 3;  // 数量

        pay(price , quantity);
    }

    public static void pay(int price, int quantity) {
        int total = price * quantity;
        int result = total + (total / 10);

        System.out.println("商品価格：" + price + "円" + ", 数量：" + quantity );
        System.out.println (" 合計金額 " + result + "円");
    }
}