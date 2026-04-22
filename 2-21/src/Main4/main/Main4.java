package Main4.main;

import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void processNumbers(ArrayList<Integer> numbers) {

        System.out.println("元のリスト：" + numbers);
        Collections.sort(numbers);
        System.out.println("ソート後：" + numbers);

        int min = numbers.get(0);
        int max = numbers.get(numbers.size() - 1);

        System.out.println("最大値:" + max);
        System.out.println("最小値:" + min);
    }
}
