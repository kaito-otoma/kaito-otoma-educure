import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
        public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<Integer>();
        score.add(85);
        score.add(92);
        score.add(78);
        score.add(55);
        score.add(43);
        System.out.println("点数リスト：" + score);

        double sum = 0;
        for(int all : score) sum += all;
        double average = sum /  score.size();
        System.out.println("平均点：" + average);

        int max = Collections.max(score);
        System.out.println("最高点：" + max);

        int count = 0;
        for(int out : score){
            if(out <= 60){
            count++;
            }
        }
        System.out.println("不合格者数：" + count);
    }
}
