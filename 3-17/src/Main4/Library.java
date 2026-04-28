package Main4;

public class Library {

     public void checkOut(Book book) {
        if (book.isLent()) {
            System.out.println("エラー：この本は既に貸し出し中です");
        } else {
            book.setLent(true);
            System.out.println("「" + book.getter() + "」が貸し出しました");
        }
    }
     public void returnItem(Book book) {
        if (book.isLent()) {
            book.setLent(false);
            System.out.println("「" + book.getter() + "」が返却されました");
        }
    }
}
