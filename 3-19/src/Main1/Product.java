package Main1;

public class Product {
    private static String name;
    private static int price;

    public Product(String name, int price){
        Product.name = name;
        Product.price = price;
    }

    @Override
    public String toString(){
        return "商品名:" + name + "(" + price + "円)";
    }
}
