public class Main5 {
    public static void main(String[] args) {
        int stock = 10;
        for (int box = 1; stock >= box; stock--){
             System.out.println("現在の在庫数:" + stock);
        }

        System.out.println("在庫がなくなりました！");
    }
}
