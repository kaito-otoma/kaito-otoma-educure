package Main2;

public class Book {
    String title;
    boolean isLent;

public void setTitle(String title){
        this.title = title;
    }

public String getTitle() {
        return this.title;
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
        if (this.isLent){
            this.isLent = false;
            System.out.println("本が返却されました");
        } else {
            return;
        }
    }
}
