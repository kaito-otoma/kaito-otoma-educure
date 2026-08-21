import java.util.ArrayList;
import java.util.List;

public class WordManager {
    private List<Word> words;

    public WordManager() {
        this.words = new ArrayList<>();
    }

    public void addWord(Word word) {
        this.words.add(word);
    }

    public List<Word> getWords() {
        return this.words;
    }

    public int getWordCount() {
        return this.words.size();
    }
}