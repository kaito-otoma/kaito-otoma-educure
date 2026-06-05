import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class WordManager {
     private ArrayList<String> englishList = new ArrayList<>();
     private ArrayList<String> japaneseList = new ArrayList<>();

      public boolean addWord(String english, String japanese) {
         if (english.trim().isEmpty() || japanese.trim().isEmpty()) {
            System.out.println("空白は使用できません。");
        return false;
        }

        if (englishList.size() >= 1000) {
            System.out.println("登録可能な単語数は1000個までです");
            return false;
        }
        englishList.add(english);
        japaneseList.add(japanese);
        return true;
    }

    // 現在の登録件数を取得
    public int getCount() {
        return englishList.size();
    }

    // 指定したインデックスの英単語を取得
    public String getEnglish(int index) {
        return englishList.get(index);
    }

    // 指定したインデックスの日本語訳を取得
    public String getJapanese(int index) {
        return japaneseList.get(index);
    }

    // CSVファイルからインポート
    public void importFromCSV(String fileName, Scanner scanner) {
        String filePath = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            englishList.clear(); 
            japaneseList.clear();
            
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                if (data.length == 2) {
                    englishList.add(data[0].trim()); 
                    japaneseList.add(data[1].trim()); 
                }
            }
            System.out.println(getCount() + "件の単語をインポートしました。");
        } catch (IOException e) {
            System.out.println("ファイルの読み込みに失敗しました: " + e.getMessage());
        }
    }
    public void exportToCSV(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < englishList.size(); i++) {
                bw.write(englishList.get(i) + "," + japaneseList.get(i));
                bw.newLine();
            }
            System.out.println("CSVファイルへのエクスポートが完了しました。");
        } catch (IOException e) {
            System.out.println("ファイルの書き込みに失敗しました: " + e.getMessage());
        }
    }
}
