import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("現在の経験値を入力してください:");
        String inpExp = scanner.nextLine();
        int nowExp = Integer.parseInt(inpExp);

        double bonusPercent = nowExp + nowExp  *  0.25;
        int bonusExp = (int)bonusPercent;

        System.out.println("ボーナス後の経験値:" + bonusExp);

        scanner.close();
    }
}
