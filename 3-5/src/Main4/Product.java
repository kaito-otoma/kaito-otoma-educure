package Main4;

public class Product {
    String name;
    int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("商品名:" + this.name);
        System.out.println("価格:" + this.price + "円");
    }
}
