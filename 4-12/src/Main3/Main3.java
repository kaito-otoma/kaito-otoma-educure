package Main3;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
        public static void main(String[] args) {
        ArrayList<Character> characterList = new ArrayList<>();

        characterList.add(new Character("勇者A", 100, 50));
        characterList.add(new Character("魔法使いB", 70, 70));
        characterList.add(new Character("戦士C", 80, 40));

        System.out.println("---戦闘力順---");
        Collections.sort(characterList);
        for (Character list : characterList) {
                System.out.println(list);
        }
    }
}
