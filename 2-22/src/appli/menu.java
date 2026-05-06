package appli;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        String[] englishWord = new String[20];
        String[] japaneseWord = new String[20];
        Scanner scanner = new Scanner(System.in);

        int count = 0;        

        System.out.print("開始");

        while (true) {
            System.out.println("メニュー選択");
            System.out.println("1.単語登録");
            System.out.println("2.クイズ実施");
            System.out.println("3.終了");
            String input = scanner.nextLine();

        if (input.equals("1")) {
            System.out.println("単語登録");
            note.start(englishWord, japaneseWord, count); // noteクラスのメソッドを呼ぶ
            count++;
        } else if (input.equals("2")) {
            if (count == 0) {
            System.out.println("単語が登録されていません。");
        } else {    
            System.out.println("クイズ実施");
            quiz.start(englishWord, japaneseWord);  // Quizクラスのメソッドを呼ぶ
        }
        } else if (input.equals("3")) {
            System.out.println("終了");
            break;
        } else {
            System.out.println("「1-3の数字を正しく入力してください」");
            }
        }
        scanner.close();
    }
}
