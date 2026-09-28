import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz {
    private WordManager wordManager;
    private int score;
    private int totalQuestions;
    private List<Word> usedWords;

    public Quiz(WordManager wordManager) {
        this.wordManager = wordManager;
        this.score = 0;
        this.totalQuestions = 0;
        this.usedWords = new ArrayList<>();
    }

    public boolean checkAnswer(Word word, String answer) {
        totalQuestions++;
        
        if (word.getJapanese() == null || answer == null) {
            return false;
        }

        String cleanCorrect = word.getJapanese().replaceAll("[\\s\\p{Z}\\p{C}\\r\\n]+", "").trim();
        String cleanUser = answer.replaceAll("[\\s\\p{Z}\\p{C}\\r\\n]+", "").trim();
        
        if (cleanCorrect.equals(cleanUser)) {
            score++;
            return true;
        }

        try {
            byte[] userBytes = answer.getBytes(System.getProperty("file.encoding", "UTF-8"));
            String decodedMS932 = new String(userBytes, "MS932").replaceAll("[\\s\\p{Z}\\p{C}\\r\\n]+", "").trim();
            String decodedUTF8 = new String(userBytes, "UTF-8").replaceAll("[\\s\\p{Z}\\p{C}\\r\\n]+", "").trim();

            if (cleanCorrect.equals(decodedMS932) || cleanCorrect.equals(decodedUTF8)) {
                score++;
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public Word getRandomWord() {
        List<Word> allWords = wordManager.getWords();
        
        List<Word> availableWords = new ArrayList<>();
        for (Word w : allWords) {
            boolean alreadyUsed = false;
            for (Word used : usedWords) {
                if (w.getEnglish().equals(used.getEnglish())) {
                    alreadyUsed = true;
                    break;
                }
            }
            if (!alreadyUsed) {
                availableWords.add(w);
            }
        }

        if (availableWords.isEmpty()) {
            return null;
        }

        Random random = new Random();
        Word selectedWord = availableWords.get(random.nextInt(availableWords.size()));
        
        usedWords.add(selectedWord);
        
        return selectedWord;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }
}
