import java.util.Scanner;


public class Word {
    public static void start(WordManager manager, Scanner scanner) {
        
            System.out.print("英単語を入力してください: ");
            String eng = scanner.nextLine();

            System.out.print("日本語訳を入力してください: ");
            String jap = scanner.nextLine();

            if (eng.trim().isEmpty() || jap.trim().isEmpty()) {
                System.out.println("空白は使用できません。");
                return;
            }
            
            boolean isSuccess = manager.addWord(eng, jap);
        if (isSuccess) {
            System.out.println("単語を登録しました。");
        }else{
            System.out.println("空白は使用できません");
        }
    }
}