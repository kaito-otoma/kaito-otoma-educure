package Main2;

public class Student {
    private String name;
    private int score;
    
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("エラー：点数は0-100の範囲で設定してください");
        }
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("エラー：名前を設定してください（nullは不可）");
            return;
        }
        if (name.length() >= 1 && name.length() <= 20) {
            this.name = name;
        } else {
            System.out.println("エラー：名前は1-20文字で設定してください");
        }
    }
}
