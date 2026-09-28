import java.io.File;
import java.util.Scanner;

public class VocabularyApp {
    private WordManager wordManager;
    private Quiz quiz;
    private FileHandler fileHandler;
    private Scanner scanner;
    private DBManager dbManager;

    public VocabularyApp() {
        this.dbManager = new DBManager();
        this.wordManager = new WordManager(dbManager);
        this.fileHandler = new FileHandler();
        
        String consoleEncoding = System.getProperty("sun.stdout.encoding");
        if (consoleEncoding == null) {
            consoleEncoding = System.getProperty("native.encoding");
        }
        if (consoleEncoding == null) {
            consoleEncoding = java.nio.charset.Charset.defaultCharset().name();
        }

        try {
            this.scanner = new Scanner(System.in, consoleEncoding);
        } catch (Exception e) {
            this.scanner = new Scanner(System.in);
        }
    }

    public void start() {
        while (true) {
            System.out.println("\nメニュー選択");
            System.out.println("1.単語を登録する");
            System.out.println("2.クイズを受ける");
            System.out.println("3.CSVファイルから単語をインポート");
            System.out.println("4.CSVファイルに単語をエクスポート");
            System.out.println("5.単語を削除する");
            System.out.println("6.単語を更新する");
            System.out.println("0.終了する");
            System.out.print("メニューを選択してください: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1": registerWord(); break;
                case "2": startQuiz(); break;
                case "3": importWords(); break;
                case "4": exportWords(); break;
                case "5": deleteWord(); break;
                case "6": updateWord(); break;
                case "0": cleanup(); return;
                default: System.out.println("「0-6の数字を正しく入力してください」");
            }
        }
    }

    private void registerWord() {
        System.out.print("英単語を入力してください: ");
        String eng = scanner.nextLine();
        System.out.print("日本語訳を入力してください: ");
        String jap = scanner.nextLine();

        if (eng.trim().isEmpty() && jap.trim().isEmpty()) {
            System.out.println("エラー: 英単語と日本語訳が空文字です。");
            return;
        }
        if (eng.trim().isEmpty()) {
            System.out.println("エラー: 英単語が空文字です。");
            return;
        }
        if (jap.trim().isEmpty()) {
            System.out.println("エラー: 日本語訳が空文字です。");
            return;
        }

        Word word = new Word(eng, jap);
        wordManager.addWord(word);
        System.out.println("単語を登録しました。");
    }

    private void startQuiz() {
        int count = wordManager.getWordCount();
        if (count == 0) {
            System.out.println("登録された単語がありません。");
            return;
        }

        System.out.println("クイズ実施");
        this.quiz = new Quiz(wordManager);
        
        for (int test = 0; test < count; test++) {
            Word word = quiz.getRandomWord();
            if (word == null) break;

            System.out.println("問題：" + word.getEnglish());
            System.out.print("解答：");
            String answer = scanner.nextLine();

            if (quiz.checkAnswer(word, answer)) {
                System.out.println("正解です！");
            } else {
                System.out.println("不正解です。正解は" + word.getJapanese() + "でした。");
            }
        }
        System.out.println(quiz.getTotalQuestions() + "問中" + quiz.getScore() + "問正解でした！");
    }

    private String resolveCsvPath(String defaultName) {
        File csvFile = new File(defaultName);
        if (!csvFile.exists()) {
            File fallbackFile = new File("5-15/" + defaultName);
            if (fallbackFile.exists() || fallbackFile.getParentFile().exists()) {
                csvFile = fallbackFile;
            }
        }
        return csvFile.getAbsolutePath();
    }

    private void importWords() {
        System.out.print("インポートするファイル名を入力してください: ");
        String fileName = scanner.nextLine();
        String file = resolveCsvPath(fileName);
        fileHandler.importFromCSV(file, wordManager);
    }

    private void exportWords() {
        System.out.print("エクスポートするファイル名を入力してください: ");
        String fileName = scanner.nextLine();
        String file = resolveCsvPath(fileName);
        fileHandler.exportToCSV(wordManager.getWords(), file);
    }

    private void deleteWord() {
        System.out.println("--- 単語の削除 ---");
        System.out.print("削除したい英単語を入力してください: ");
        String english = scanner.nextLine();
        wordManager.deleteWord(english);
    }

    private void updateWord() {
        System.out.println("--- 単語の更新 ---");
        System.out.print("更新したい英単語を入力してください: ");
        String english = scanner.nextLine();
        System.out.print("新しい日本語訳を入力してください: ");
        String newJapanese = scanner.nextLine();
        wordManager.updateWord(english, newJapanese);
    }

    private void cleanup() {
        dbManager.close();
        scanner.close();
        System.out.println("終了");
    }

    public static void main(String[] args) {
        new VocabularyApp().start();
    }
}
