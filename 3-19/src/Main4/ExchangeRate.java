package Main4;

public class ExchangeRate {
    private static double usdRate = 145.0;
    private static double eurRate = 160.0;

    // レートを更新するメソッド（静的メソッド）
    public static void updateRates(double newUsdRate, double newEurRate) {
        usdRate = newUsdRate;
        eurRate = newEurRate;
        System.out.println("レート更新");
    }

    // 通貨を日本円に換算するメソッド（静的メソッド）
    public static int toJPY(String currency, double amount) {
        if (currency.equals("USD")) {
            return (int)(amount * usdRate);  // ドルから日本円に換算し、小数点以下を切り捨て
        } else if (currency.equals("EUR")) {
            return (int)(amount * eurRate);  // ユーロから日本円に換算し、小数点以下を切り捨て
        } else {
            return -1;  // その他の通貨の場合
        }
    }

}
