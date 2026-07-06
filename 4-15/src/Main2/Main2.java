package Main2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("果物倉庫: ");

        Warehouse<String> fruitWarehouse = new Warehouse<>();
        
        fruitWarehouse.store("バナナ");
        System.out.println("取り出し：" + fruitWarehouse.retrieve());
        System.out.println("空チェック：" + fruitWarehouse.isEmpty());

        System.out.println("\n日用品倉庫:");
        Warehouse <String> itemwarehouse = new Warehouse<>();

        itemwarehouse.store("ティッシュ");
        System.out.println("取り出し：" + itemwarehouse.retrieve());
        System.out.println("空チェック：" + itemwarehouse.isEmpty());
    }
}
