package appli;
import java.util.Scanner;

public class note {
    public static void start(String[] englishWord, String[] japaneseWord, int count) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("20単語未満？");
            System.out.println("1.はい");
            System.out.println("2.いいえ");
            String input = scanner.nextLine();

        if (input.equals("1")) {
            break;
        } else if (input.equals("2")) {
            System.out.println("エラー表示: 登録可能な単語数は20個までです");
            return;
        } else {
            System.out.println("「はい or いいえで正しく入力してください」");
            }
        }

            System.out.print("英単語を入力してください: ");
            englishWord[count] = scanner.nextLine();

            System.out.print("日本語訳を入力してください: ");
            japaneseWord[count] = scanner.nextLine();
            

    } 
}
