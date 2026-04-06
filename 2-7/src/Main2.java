public class Main2 {
    public static void main(String[] args) {

        int price = 2500;
        double taxPercent = 0.2;
        double tax = (price * taxPercent);

        System.out.println("割引額："+ tax +"円");
        System.out.println("販売価格："+(price - tax) +"円");

    }
}