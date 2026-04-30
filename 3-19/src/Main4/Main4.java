package Main4;

public class Main4 {
    public static void main(String[] args) {
        int amount = 100;
        
        System.out.println(amount + "ドル = " + ExchangeRate.toJPY("USD", amount) + "円");
        ExchangeRate.updateRates(150.0, 160.0);
        System.out.println(amount + "ドル = " + ExchangeRate.toJPY("USD", amount) + "円");
        amount = 80;
        System.out.println(amount + "ユーロ = " + ExchangeRate.toJPY("EUR", amount) + "円");
    }
}
