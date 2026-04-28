package Main4;

public class Main4 {
    public static void main(String[] args) {
        Book book = new Book("Java入門", false);
        Library library = new Library();

        library.checkOut(book);
        library.checkOut(book);
        library.returnItem(book);
        library.checkOut(book);
    }
}
