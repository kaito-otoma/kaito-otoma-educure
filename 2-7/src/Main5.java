public class Main5 {
     public static void main(String[] args) {

        int ノートの値段 = 280; 
        int ノート購入数 =3; 
        int 鉛筆の値段 = 120; 
        int 鉛筆購入数 = 5; 
        int 消しゴムの値段 = 100; 
        int 消しゴム購入数 = 2; 
        double 税率 = 0.1;
        int 合計 = ノートの値段 * ノート購入数 + 鉛筆の値段 * 鉛筆購入数 + 消しゴムの値段 * 消しゴム購入数;
        double 税抜き小計 = (int)合計;
        double TAX = 税抜き小計 * 税率;
        int 切り捨て消費税 = (int)TAX;
        int totalAmount = 切り捨て消費税 + 合計;
        int 預り金 = 2000;
        int change = 預り金 - totalAmount;
    
        System.out.println("小計:"+合計+ "円");
        System.out.println("消費税:"+ 切り捨て消費税 + "円");
        System.out.println("合計金額:" + totalAmount + "円");
        System.out.println("おつり:" + change + "円");
        

     }
    
}
