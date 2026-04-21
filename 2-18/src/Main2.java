public class Main2 {
    public static void main(String[] args) {
        int score = 90;  // 学生の得点

        String result = scoreRank(score);
        System.out.println(result);
    }
    public static String scoreRank(int score){

        if (score >= 80) {
            return"成績:優";
        } else if (score >= 70) {
            return"成績:良";
        } else if (score >= 60) {
            return"成績:可";
        } else {
            return"成績:不可";
        }
    }
}