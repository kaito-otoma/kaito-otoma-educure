package Main3;

public class Main3 {
    public static void main(String[] args) {
        Inventory<String> fruits = new Inventory<>(ProductCategory.FRUITS);
        Inventory<String> vegetables = new Inventory<>( ProductCategory.VEGETABLES); 
        Inventory<String> dairy = new Inventory<>( ProductCategory.DAIRY);


        fruits.stockIn("りんご");
        vegetables.stockIn("トマト");
        dairy.stockIn("牛乳");
        
        System.out.println();
        System.out.println(fruits.stockOut() + "を出荷しました");
        
        System.out.println("現在の在庫状態:");
        fruits.getCurrentStock();
        vegetables.getCurrentStock();
        dairy.getCurrentStock();

    }
}
