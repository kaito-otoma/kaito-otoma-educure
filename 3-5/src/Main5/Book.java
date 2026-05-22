package Main5;

public class Book {
    String title;
    String author;
    int id;
    int pages;

    public Book(String title, String author, int id){
        this.title = title;
        this.author = author;
        this.id = id;
        this.pages = 0;
    }
    public Book(String title, String author, int id, int pages){
        this.title = title;
        this.author = author;
        this.id = id;
        this.pages = pages;
    }
}
