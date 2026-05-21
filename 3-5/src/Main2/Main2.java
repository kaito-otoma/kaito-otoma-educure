package Main2;

public class Main2 {
    public static void main(String[] args) {

    Player character = new Player();
    character.name = "勇者";
    character.hp = 30;
    HealingPotion potion = new HealingPotion();

    character.displayInfo();

    potion.heal(character);
    System.out.println("プレイヤーのＨＰ:" + character.hp);

    }
}
