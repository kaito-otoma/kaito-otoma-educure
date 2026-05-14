package Main3;

public class Inventory<T> {
    private T item;
    private final ProductCategory category;
    
    public Inventory(ProductCategory category) {
        this.category = category;
    }
    
    public void stockIn( T item) {
        this.item = item;
        System.out.println(category.getDisplayName() + "コーナー: " + item + "を入荷");
    }
    
    public T stockOut() {
        T itemList = this.item;
        this.item = null;
        return itemList;
    }

    public T getCurrentStock() {
        if (item != null) {
            System.out.println(category.getDisplayName() + ":" + item );
            return item;
        } else {
            System.out.println(category.getDisplayName() + ": なし");
            return item;
        }
    }
}
