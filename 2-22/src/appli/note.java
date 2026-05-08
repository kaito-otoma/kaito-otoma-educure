package appli;
import java.util.Scanner;

public class note {
    public static int start(String[] englishWord, String[] japaneseWord, int count) {
        Scanner scanner = new Scanner(System.in);

        while (count < 20) {
            
            System.out.print("英単語を入力してください: ");
            englishWord[count] = scanner.nextLine();
            System.out.print("日本語訳を入力してください: ");
            japaneseWord[count] = scanner.nextLine();
            count++;

        if (count <= 20) {
            break;
        } else if (count > 20) {
            System.out.println("エラー表示: 登録可能な単語数は20個までです");
        } else {
            System.out.println("「はい or いいえで正しく入力してください」");
            }
        }
        return count;
    } 
}
