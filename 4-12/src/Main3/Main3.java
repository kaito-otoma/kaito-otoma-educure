package Main3;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
        public static void main(String[] args) {
        ArrayList<Character> character = new ArrayList<>();
        character.add(new Character("勇者A", 100, 50));
        character.add(new Character("魔法使いB", 70, 70));
        character.add(new Character("戦士C", 80, 40));

        Collections.sort(character);
        System.out.println("---戦闘力順---");
            for (Character list : character) {
                System.out.println(list.compareTo(list) + "戦闘力:" + list.getBattlePower());
        }
    }
}
