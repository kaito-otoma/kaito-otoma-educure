import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler {
    public void exportToCSV(List<Word> words, String filename) {
        try {
            File file = new File(filename);
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }

            try (FileOutputStream fos = new FileOutputStream(file);
                 OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
                 BufferedWriter writer = new BufferedWriter(osw)) {
                
                fos.write(new byte[]{(byte)0xEF, (byte)0xBB, (byte)0xBF});

                for (Word word : words) {
                    writer.write(word.getEnglish() + "," + word.getJapanese());
                    writer.newLine();
                }
                System.out.println("CSVファイルのエクスポートに成功しました。");
            }
        } catch (IOException e) {
            System.out.println("エラー: エクスポートに失敗しました。");
        }
    }

    public void importFromCSV(String filename, WordManager wordManager) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("エラー: 指定されたファイル「" + filename + "」が見つかりません。");
            return;
        }

        boolean hasValidLine = false;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("\uFEFF")) {
                    line = line.substring(1);
                }
                
                if (line.trim().isEmpty()) {
                    continue;
                }

                if (!line.contains(",")) {
                    System.out.println("エラー: 不正な形式の行が含まれています。");
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String english = parts[0].replaceAll("[\\s\\p{Z}\\p{C}\\r\\n]+", "").trim();
                    String japanese = parts[1].replaceAll("[\\s\\p{Z}\\p{C}\\r\\n]+", "").trim();
                    
                    if (!english.isEmpty() && !japanese.isEmpty()) {
                        Word word = new Word(english, japanese);
                        wordManager.addWord(word);
                        hasValidLine = true;
                    }
                }
            }

            if (hasValidLine) {
                System.out.println("CSVファイルからのインポートに成功しました。");
            }
        } catch (IOException e) {
            System.out.println("エラー: インポートに失敗しました。");
        }
    }
}
