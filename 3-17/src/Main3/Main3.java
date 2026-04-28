package Main3;

public class Main3 {
     public static void main(String[] args) {
        Product product = new Product("りんご", 100);

        product.reniveStock(50);
        product.addStock(10);
        product.reniveStock(50000);
     }
}
