package Main5;

public class Book {
    String title;
    String author;
    int id;
    int pages;

    public Book(String author){
        this.title = "java入門";
        this.author = "山田太郎";
        this.id = 1;
        this.pages = 0;
    }
    public Book(){
        this.title = "Python実践";
        this.author = "鈴木次郎";
        this.id = 2;
        this.pages = 300;
    }
}
