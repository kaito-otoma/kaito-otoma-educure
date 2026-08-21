import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {
    private WordManager wordManager;
    private int score;
    private int totalQuestions;
    
    private List<Integer> indices;
    private int currentIndex;

    public Quiz(WordManager wordManager) {
        this.wordManager = wordManager;
        this.score = 0;
        this.totalQuestions = wordManager.getWordCount();
        this.currentIndex = 0;
        
        this.indices = new ArrayList<>();
        for (int i = 0; i < this.totalQuestions; i++) {
            this.indices.add(i);
        }
        Collections.shuffle(this.indices); 
    }

    public Word getRandomWord() {
        if (currentIndex >= indices.size()) {
            return null;
        }

        List<Word> words = wordManager.getWords();
        
        int targetIndex = indices.get(currentIndex);
        currentIndex++;
        
        return words.get(targetIndex);
    }

    public boolean checkAnswer(Word word, String answer) {
        if (word.getJapanese().equals(answer.trim())) {
            score++;
            return true;
        }
        return false;
    }

    public int getScore() { return score; }
    public int getTotalQuestions() { return totalQuestions; }
}