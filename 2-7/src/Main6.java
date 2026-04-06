public class Main6 {
    public static void main(String[] args) {
        int nowExp = 1000;
        double bonusPercent = nowExp + nowExp  *  0.25;
        int bonusExp = (int)bonusPercent;

        System.out.println("現在の経験値を入力してください:" + nowExp);
        System.out.println("ボーナス後の経験値:" + bonusExp);
    }
}
