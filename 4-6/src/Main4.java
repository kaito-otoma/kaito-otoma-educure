import java.util.ArrayList;
import java.util.HashSet;

public class Main4 {
    public static void main(String[] args) {
        HashSet<String> allMonsters = new HashSet<>();
        allMonsters.add("スライム");
        allMonsters.add("ドラゴン");
        allMonsters.add("ゴブリン");
        allMonsters.add("フェニックス");
        allMonsters.add("ユニコーン");

        HashSet<String> monsterList = new HashSet<String>();
        ArrayList<String> monster = new ArrayList<>();
        ArrayList<Integer> fight = new ArrayList<>();

        addBattle("スライム", monsterList, monster, fight);
        addBattle("スライム", monsterList, monster, fight);
        addBattle("スライム", monsterList, monster, fight);
        addBattle("スライム", monsterList, monster, fight);
        addBattle("スライム", monsterList, monster, fight);

        addBattle("ドラゴン", monsterList, monster, fight);
        addBattle("ドラゴン", monsterList, monster, fight);

        addBattle("ゴブリン", monsterList, monster, fight);
        addBattle("ゴブリン", monsterList, monster, fight);


        System.out.println("発見済みモンスター:" + monster);
        System.out.println("発見済モンスター数：" + monster.size());
        
        String target = "スライム";
        int number = monster.indexOf(target);
        if (number != -1) {
            System.out.println(target + "との戦闘回数: " + fight.get(number));

        HashSet<String> notFound = new HashSet<>(allMonsters);
        notFound.removeAll(monsterList);
        System.out.println("未発見のモンスター" + notFound);
        }
    }
    
        public static void addBattle(String name, HashSet<String> mList, ArrayList<String> mArray, ArrayList<Integer> fArray) {
        if (!mList.contains(name)) {
            mList.add(name);
            mArray.add(name);
            fArray.add(1);
        } else {
            int index = mArray.indexOf(name);
            int currentCount = fArray.get(index);
            fArray.set(index, currentCount + 1);
        }
    }
}
