import java.util.Scanner;

public class Quiz {
    public static void start(WordManager manager, Scanner scanner){
    int score = 0;
    int totalQuestions = manager.getCount();

    for (int test = 0; test < totalQuestions; test++){
        
        System.out.println("問題：" + manager.getEnglish(test));
        System.out.print("解答：");
        String answer = scanner.nextLine();
        
        boolean modelAnswer = answer.equals(manager.getJapanese(test));

        if (modelAnswer) {
            System.out.println("正解です！");
            score++;
        }else{
            System.out.println("不正解です。正解は" + manager.getJapanese(test) + "でした。");
            }
        }
            System.out.println("成績表示：" + totalQuestions + "問中" + score + "問正解でした！");
        return;
    }
}
