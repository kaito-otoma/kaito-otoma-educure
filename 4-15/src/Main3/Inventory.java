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
        return item;
    }

    public String getWrappedStock() {
        return this.item != null ? this.item.toString() : "なし";
    }
    public ProductCategory getCategory() {
        return this.category;
    }
}
