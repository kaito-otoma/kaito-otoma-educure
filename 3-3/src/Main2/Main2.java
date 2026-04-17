package Main2;

public class Main2 {
    public static void main(String[] args) {
        Book bookName = new Book();

        bookName.title = "Java入門";
        bookName.isLent = false;

        System.out.println("「" + bookName.title + "」" + "を登録しました");

        bookName.lend();
        bookName.lend();
        bookName.returnBook();
        bookName.lend();
    }
}