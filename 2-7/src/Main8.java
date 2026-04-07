import java.util.Scanner;

public class Main8 {
     public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

         System.out.println("攻撃力を入力してください：");
         String inpattack = scanner.nextLine();
         int attackPower = Integer.parseInt(inpattack);

         System.out.println("防御力を入力してください：");
         String inpDefense = scanner.nextLine();
         int defensePower = Integer.parseInt(inpDefense);

        int damage = attackPower - defensePower;
        double criticalPercent = damage * 1.5;
        int criticaldamage = (int)criticalPercent;

        System.out.println("通常ダメージ：" + damage);
        System.out.println("クリティカルダメージ：" + criticaldamage);

        scanner.close();
     }
}
