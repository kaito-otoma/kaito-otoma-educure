public class Main4 {
    public static void main(String[] args) {

        double saladGram = 138;  
        double saladAmount = 315.8/100; //サラダの購入量
        double miniTax =saladGram * saladAmount; //（小数点あり）
        int tax =(int)miniTax; //（小数点切り捨て）

        System.out.println("合計金額：" + tax + "円です");
    }
}
