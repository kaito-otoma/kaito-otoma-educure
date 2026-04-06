public class Main8 {
     public static void main(String[] args) {
        int attackPower = 50;
        int defensePower = 20;
        int damage = attackPower - defensePower;
        double criticalPercent = damage * 1.5;
        int criticaldamage = (int)criticalPercent;

        System.out.println("攻撃力を入力してください：" + attackPower);
        System.out.println("防御力を入力してください：" + defensePower);
        System.out.println("通常ダメージ：" + damage);
        System.out.println("クリティカルダメージ：" + criticaldamage);
     }
}
