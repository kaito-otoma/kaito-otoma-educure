package Main3;

import java.util.ArrayList;
import java.util.Comparator;

public class Main3 {
        public static void main(String[] args) {
        ArrayList<Character> characterList = new ArrayList<>();

        characterList.add(new Character("勇者A", 100, 50));
        characterList.add(new Character("魔法使いB", 70, 70));
        characterList.add(new Character("戦士C", 80, 40));

        characterList.sort(Comparator.reverseOrder());
        System.out.println("---戦闘力順---");
        for (Character list : characterList) {
                System.out.println(list + "戦闘力:" + list.getBattlePower());
        }
    }
}
