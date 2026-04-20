package Main2;

public class HealingPotion {
    int heal;

    public void heal(Player caracter) {
        caracter.hp += 50;
        System.out.println("回復ポーションを使用しました");
        
    }
}