package Main4;

import java.util.Collections;
import java.util.List;

public class listups {
    public static void main(String[] args) {

        collections(collect.ristNumber);
}

public static void collections(List<Integer> list) {
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);
        System.out.println("最大値:" + max);
        System.out.println("最小値:" + min);
    }
}
