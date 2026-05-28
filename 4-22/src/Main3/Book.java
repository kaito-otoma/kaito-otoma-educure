package Main3;

public class Book {
    
    private String title;
    private String author;
    private String price;

    // ゲッターメソッド
    public String gettitle() { return title; }
    public String getauthor() { return author; }
    public String getprice() { return price; }

    public void settitle(String title) { this.title = title; }
    public void setauthor(String author) { this.author = author; }
    public void setprice(String price) { this.price = price; }
}
