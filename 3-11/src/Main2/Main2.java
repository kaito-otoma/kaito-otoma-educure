package Main2;

public class Main2 {
    public static void main(String[] args) {
        Book book = new Book("Java入門", 2500, "山田太郎", 2);

        System.out.println("書籍名:" + book.name);
        System.out.println("著者:" + book.author);
        System.out.println("価格:" + book.price);
        System.out.println(book.getStockStatus());
    }
}
