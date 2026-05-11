package appli;
import java.util.Scanner;

public class note {
    public static int start(String[] englishWord, String[] japaneseWord, int count) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (count >= 20) {
            System.out.println("エラー表示: 登録可能な単語数は20個までです");
            break;
            }

            System.out.print("英単語を入力してください: ");
            englishWord[count] = scanner.nextLine();
            System.out.print("日本語訳を入力してください: ");
            japaneseWord[count] = scanner.nextLine();
            count++;
        
        }
        return count;
    } 
}
