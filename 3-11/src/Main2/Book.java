package Main2;
import Main1.Product;

public class Book extends Product{
    String author;
    int stockQuantity;

    public Book(String name, int price, String author, int stockQuantity){
        super(name, price);
        this.author = author;
        this.stockQuantity = stockQuantity;
    }

    public String getStockStatus() {
        if(stockQuantity > 0){
            return"在庫有り";
        }else{
            return"在庫なし";
        }
    }
}
