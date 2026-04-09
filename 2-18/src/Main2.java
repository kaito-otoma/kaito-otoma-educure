public class Main2 {
    public static void main(String[] args) {
        int score = 90;  // 学生の得点
        int scorePercent = score/10;

        scoreRank(score , scorePercent);
    }
    public static void scoreRank(int score, int scorePrercent){

        switch (scorePrercent) {
            case 10:
                System.out.println("成績:優");
                break;
            case 9:
                System.out.println("成績:優");
                break;
            case 8:
                System.out.println("成績:優");
                break;
            case 7:
                System.out.println("成績:良");
                break;
            case 6:
                System.out.println("成績:可");
                break;
            default:
                System.out.println("成績:不可");
                break;
        }
    }
}
