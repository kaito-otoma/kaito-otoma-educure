package Main2;

public class Book {
    String title;
    boolean isLent;

public String getTitle() {
        return title;
    }

public boolean isBorrowed() {
        return isLent;
}

public void lend() {
        if (isLent) {
            System.out.println("申し訳ありません。この本は貸出中です");
        } else {
            isLent = true;
            System.out.println("本を貸し出しました");
        }
    }
public void returnBook() {
        this.isLent = false;
        System.out.println("本が返却されました");
    }
}
