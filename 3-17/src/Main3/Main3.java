package Main3;

public class Main3 {
     public static void main(String[] args) {
        Product product = new Product("りんご", 100);

      System.out.println("商品名：" + product.getName() + "\n在庫数：" + product.getStock() + "個");
        product.removeStock(50);
        product.addStock(10);
        product.removeStock(50);
     }
}
