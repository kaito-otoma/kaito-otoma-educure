package Main5;

public class Main5 {
    public static void main(String[] args) {
        Book book1 = new Book("山田太郎");
        System.out.println("本" + book1.id + ":" + book1.title + "-" + book1.author + "(" + book1.pages + "ページ)");

        Book book2 = new Book();
        System.out.println("本" + book2.id + ":" + book2.title + "-" + book2.author + "(" + book2.pages + "ページ)");

    }
}
