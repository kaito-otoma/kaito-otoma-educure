package Main3;

public class GameScoreException extends Exception {
    int score;
    String message;

    public GameScoreException(String message, int score) {
    super(message);
    this.score = score;
    }
    public int getScore(){
        return score;
    }
}
