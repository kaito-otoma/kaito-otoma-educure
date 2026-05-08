package appli;

import java.util.Scanner;

public class quiz {
    public static void start(String[] englishWord, String[] japaneseWord, int count){
    Scanner scanner = new Scanner(System.in);

    int score = 0; 
    int totalQuestions = 0;

    for (int test = 0; test < count; test++){
        
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
        }
            System.out.println("成績表示：" + count + "問中" + score + "問正解でした！");
        return;
    }
}
