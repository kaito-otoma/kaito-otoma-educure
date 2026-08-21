import java.io.IOException;
import java.util.Scanner;

public class VocabularyApp {
    private WordManager wordManager;
    private Quiz quiz;
    private FileHandler fileHandler;
    private Scanner scanner;

    public VocabularyApp() {
        this.wordManager = new WordManager();
        this.fileHandler = new FileHandler();
        this.scanner = new Scanner(System.in, "UTF-8"); 
    }

    public void start() {
        while (true) {
            System.out.println("\n--- メニュー選択 ---");
            System.out.println("1. 単語を登録する");
            System.out.println("2. クイズを受ける");
            System.out.println("3. CSVファイルから単語をインポート");
            System.out.println("4. CSVファイルに単語をエクスポート");
            System.out.println("5. 終了する");
            System.out.print("選択してください（1-5）: ");
            
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    registerWord();
                    break;
                case "2":
                    startQuiz();
                    break;
                case "3":
                    importWords();
                    break;
                case "4":
                    exportWords();
                    break;
                case "5":
                    System.out.println("アプリケーションを終了します。");
                    scanner.close();
                    return;
                default:
                    System.out.println("「1-5の数字を正しく入力してください」");
            }
        }
    }

    private void registerWord() {
        System.out.print("英単語を入力してください: ");
        String english = scanner.nextLine();
        System.out.print("日本語訳を入力してください: ");
        String japanese = scanner.nextLine();

        if (english.trim().isEmpty() || japanese.trim().isEmpty()) {
            System.out.println("空白は使用できません。");
            return;
        }

        Word word = new Word(english.trim(), japanese.trim());
        wordManager.addWord(word);
        System.out.println("単語を登録しました。");
    }

    private void startQuiz() {
        if (wordManager.getWordCount() == 0) {
            System.out.println("登録された単語がありません。");
            return;
        }

        System.out.println("クイズを開始します。");
        quiz = new Quiz(wordManager);

        for (int i = 0; i < quiz.getTotalQuestions(); i++) {
            Word word = quiz.getRandomWord();
            if (word == null) break;

            System.out.println("\n問題：" + word.getEnglish());
            System.out.print("解答：");
            String answer = scanner.nextLine();

            if (quiz.checkAnswer(word, answer)) {
                System.out.println("正解です！");
            } else {
                System.out.println("不正解です。正解は「" + word.getJapanese() + "」でした。");
            }
        }

        System.out.println("\n成績表示：" + quiz.getTotalQuestions() + "問中" + quiz.getScore() + "問正解でした！");
    }

    private void importWords() {
        System.out.print("インポートするCSVファイル名を入力してください: ");
        String filename = scanner.nextLine();
        try {
            fileHandler.importFromCSV(filename, wordManager);
            System.out.println("インポートが完了しました。現在の総単語数: " + wordManager.getWordCount());
        } catch (IOException e) {
            System.out.println("ファイルの読み込みに失敗しました: " + e.getMessage());
        }
    }

    private void exportWords() {
        if (wordManager.getWordCount() == 0) {
            System.out.println("エクスポートする単語がありません。");
            return;
        }
        System.out.print("エクスポートするCSVファイル名を入力してください: ");
        String filename = scanner.nextLine();
        try {
            fileHandler.exportToCSV(wordManager.getWords(), filename);
            System.out.println("エクスポートが完了しました。");
        } catch (IOException e) {
            System.out.println("ファイルの書き込みに失敗しました: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        VocabularyApp app = new VocabularyApp();
        app.start();
    }
}