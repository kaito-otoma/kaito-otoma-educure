package Main3;

public class Library {
    static int availableBooks = 100;

    public  void view(){
        System.out.println("貸し出し可能な本:" + availableBooks + "冊");
    }
    public void borrowBook(){
    if(availableBooks <= 0){
        System.out.println("貸し出し可能な本がありません");
        return;
    }
        availableBooks--;
        System.out.println("1冊借りました");
        System.out.println("貸し出し可能な本:" + availableBooks + "冊");
    }
    public void returnBook(){
        availableBooks++;
        System.out.println("本を返却しました");
        System.out.println("貸し出し可能な本:" + availableBooks + "冊");
    }
    public static int getAvailableBooks() {
        return availableBooks;
    }
}