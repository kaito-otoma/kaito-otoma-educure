public class Main4 {
    public static void main(String[] args) {

        double G = 138;  //サラダ100ｇの金額
        double B = 315.8/100; //サラダの購入量
        double T =G * B; //合計金額（小数点あり）
        int Ta =(int)T; //合計金額（小数点切り捨て）

        System.out.println("合計金額：" + Ta + "円です");
    }
}
