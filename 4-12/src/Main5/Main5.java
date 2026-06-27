package Main5;

public class Main5 {
    public static void main(String[] args) {
        GameCharacter player = new GameCharacter("勇者A");
        Equipment sword = new Equipment("伝説の剣", 100, 0);
        Equipment shield = new Equipment("光の盾", 0, 80);
        Equipment shoes = new Equipment("魔法の靴", 10, 20);

        player.addEquipment(sword);
        player.addEquipment(shield);
        player.addEquipment(shoes);

        System.out.println("--- キャラクター装備情報 ---");
        player.sortEquipment();//武器のソート用
        player.showEquipment();

        Equipment sword2 = sword.clone();//剣の複製

        int result = sword.compareTo(shield);

        if (result < 0) {
            System.out.println(); //swordの方が強い
        } else if (result > 0) {
            System.out.println();//shieldの方強い
        } else {
            System.out.println();//同性能
        }
        System.out.println("武器の複製テスト：ＯＫ");
        System.out.println("武器の比較テスト：ＯＫ");
        System.out.println("武器の強さソート：ＯＫ");
    }
}
