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
        player.sortEquipment();
        player.showEquipment();

        Equipment sword2 = sword.clone();

        int result = sword.compareTo(shield);

        System.out.println("\n--- テスト結果確認 ---");
        if (sword2 != null && sword.equals(sword2)) {
            System.out.println("武器の複製テスト：ＯＫ (" + sword2.toString() + " が正しく複製されました)");
        } else {
            System.out.println("武器の複製テスト：ＮＧ");
        }

        if (result < 0) {
            System.out.println("武器の比較テスト：ＯＫ");
        } else {
            System.out.println("武器の比較テスト：ＮＧ");
        }

        if (player.isEquipmentSorted()) {
            System.out.println("武器の強さソート：ＯＫ");
        } else {
            System.out.println("武器の強さソート：ＮＧ");
        }
    }
}
