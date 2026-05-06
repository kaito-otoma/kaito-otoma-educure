package appli;

import java.util.Scanner;

public class quiz {
    public static void start(String[] englishWord, String[] japaneseWord){
    Scanner scanner = new Scanner(System.in);

    int score = 0; 
    int totalQuestions = 0;

    for (int test = 0; test < englishWord.length; test++){
        totalQuestions++;
        System.out.println("問題：" + englishWord[test]);
        System.out.print("解答：");
        String answer = scanner.nextLine();
        boolean modelAnswer = answer.equals(japaneseWord[test]);

        if (modelAnswer) {
            System.out.println("正解です！");
            score++;
        }else{
            System.out.println("不正解です");
        }
        if (test < englishWord.length - 1) {
            System.out.println("全問終了？");
            System.out.println("1.はい （成績発表）/ 2.いいえ（解答を続ける）");
            String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("成績表示：" + totalQuestions + "問中" + score + "問正解でした！");
            return;
        }
    }
        }
    }
}
