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
            System.out.println("取り出し: " + itemList);
        } else {
            System.out.println("取り出し: [商品は入っていません]");
        }
        return itemList;
    }

    public boolean isEmpty() {
        if (item == null){
            System.out.println("空チェック: true");
            return true;
        } else {
            System.out.println("空チェック: false");
            return false;
        }
    }
}
