public class Main2 {
    public static void main(String[] args) {

        int 定価 = 2500;
        double 率 = 0.2;
        double 額 = (定価 * 率);

        System.out.println("割引額："+ 額 +"円");
        System.out.println("販売価格："+(定価 - 額) +"円");

    }
}