public class Main1 {
    public static void main(String[] args) {
        int[] scores = {85,90,75,95,80};

        for (int student = 0; student < scores.length; student++) {
            System.out.println((student + 1) + "番目の生徒 : " + scores[student] + "点");
        }
    }
}
