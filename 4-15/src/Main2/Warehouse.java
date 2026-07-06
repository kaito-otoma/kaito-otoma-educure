package Main2;

public class Warehouse<T> {
    private T item;

    public void store(T item) {
        this.item = item;
        System.out.println("商品追加: " + item );
    }
    
    public T retrieve() {
        T itemList = this.item;
        this.item = null;

        if (itemList != null) {
        }
        return itemList;
    }

    public boolean isEmpty() {
        if (item == null){
            return true;
        } else {
            return false;
        }
    }
}
