package Main3;

public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock){
        this.name = name;
        this.stock = stock;
    }
    public String getName(){
        return this.name;
    }
    public int getStock(){
        return this.stock;
    }
    public void addStock(int amount){
        if (amount <= 0) {
            System.out.println("エラー:追加する在庫数には1以上の整数を指定してください。");
            return;
        }
        stock += amount;
        System.out.println("商品名:" + name);
        System.out.println(amount + "個追加しました");
        System.out.println("在庫数:" + stock);
    }
    public void removeStock(int amount){
        if (amount <= 0) {
            System.out.println("エラー:在庫数には1以上の正の整数を指定してください。");
            return;
        }

        if (this.stock < amount) {
            System.out.println("エラー:在庫が不足しています");
            return;
        }
        stock -= amount;
        System.out.println("商品名:" + name);
        System.out.println(amount + "個販売しました");
        System.out.println("在庫数:" + stock);

    }
}
