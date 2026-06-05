import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "MS932");
        String file = "WordList.csv";

        WordManager manager = new WordManager();

    while (true) {
            System.out.println("メニュー選択\n");
            System.out.println("1.単語を登録する");
            System.out.println("2.クイズを受ける");
            System.out.println("3.CSVファイルから単語をインポート");
            System.out.println("4.CSVファイルに単語をエクスポート");
            System.out.println("5.終了する");
            String input = scanner.nextLine();

        if (input.equals("1")) {
            Word.start(manager, scanner);

        } else if (input.equals("2")) {
            if (manager.getCount() == 0) {
            System.out.println("登録された単語がありません。");
        } else {
            System.out.println("クイズ実施");
            Quiz.start(manager, scanner);
        }
        } else if (input.equals("2")) {
            if (manager.getCount() == 0) {
                System.out.println("単語が登録されていません。");
        } else {
                System.out.println("クイズ実施");
                    // managerを渡す
                Quiz.start(manager, scanner);
        }
                
        } else if (input.equals("3")) {
            manager.importFromCSV(file, scanner);

        } else if (input.equals("4")){
            manager.exportToCSV(file);
                
        } else if (input.equals("5")) {
            System.out.println("終了");
            break;
        } else {
            System.out.println("「1-5の数字を正しく入力してください」");
        }
    }
        scanner.close();
    }
}
        