import java.util.HashMap;

public class Main3 {
        public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<String, Integer>();
        stock.put("おにぎり", 15);
        stock.put("サンドイッチ", 8);
        stock.put("お弁当", 5);
        System.out.println("在庫状況:" + stock);

        System.out.println("おにぎりを一個販売しました");
        stock.replace("おにぎり", stock.get("おにぎり") - 1);
        System.out.println("在庫状況:" + stock);

        boolean pick = stock.containsKey("アイスクリーム");
        System.out.println("アイスクリームは在庫がありますか？：" + pick);
    }
}
