public class Main5 {
     public static void main(String[] args) {

        int notePrice = 280; 
        int notePurchases =3; 
        int penPrice = 120; 
        int penPurchases = 5; 
        int eraserPrice = 100; 
        int eraserPurchases = 2; 
        double taxPercent = 0.1;
        int totalPrice = notePrice * notePurchases + penPrice * penPurchases + eraserPrice * eraserPurchases;
        double minitotalprice = (int)totalPrice;
        double tax = minitotalprice * taxPercent;
        int miniTax = (int)tax;
        int totalAmount = miniTax + totalPrice;
        int custody = 2000;
        int change = custody - totalAmount;
    
        System.out.println("小計:"+totalPrice+ "円");
        System.out.println("消費税:"+ miniTax + "円");
        System.out.println("合計金額:" + totalAmount + "円");
        System.out.println("おつり:" + change + "円");
        

     }
    
}
