package Main4.main;

import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void processNumbers(ArrayList<Integer> numbers) {

        System.out.println("元のリスト：" + numbers);
        Collections.sort(numbers);
        System.out.println("ソート後：" + numbers);

        System.out.println("最大値:" + Collections.max(numbers));
        System.out.println("最小値:" + Collections.min(numbers));
    }
}
