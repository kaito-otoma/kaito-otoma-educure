import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler {
    
    public void exportToCSV(List<Word> words, String filename) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Word word : words) {
                bw.write(word.getEnglish() + "," + word.getJapanese());
                bw.newLine();
            }
        }
    }

    public void importFromCSV(String filename, WordManager wordManager) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    Word word = new Word(data[0].trim(), data[1].trim());
                    wordManager.addWord(word);
                }
            }
        }
    }
}