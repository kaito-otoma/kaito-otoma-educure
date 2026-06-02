package Main2;
import Main1.Product;

public class Book extends Product{
    String name;
    int price;
    String author;
    int stockQuantity;

    public Book(String name, String author, int price, int stockQuantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    @Override
    public void displayInfo(){
        System.out.println("書籍名：" + name);
        System.out.println("著者" + author);
        System.err.println("価格" + price + "円");
    }

    public String getStockStatus() {
        if(stockQuantity > 0){
            return "在庫有り";
        }else{
            return "在庫なし";
        }
    }
}
