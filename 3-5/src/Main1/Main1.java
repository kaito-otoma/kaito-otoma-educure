package Main1;

public class Main1 {
     public static void main(String[] args) {
        Weapon weapons = new Weapon();
        weapons.name = "魔法の剣";
        weapons.power = 50;

        GameCharacter character = new GameCharacter();
        character.name = "剣士アレックス";
        character.hp = 100;
        character.weapon = weapons;

        System.out.println(character.name + "は" + character.weapon.name + "を装備しています");
    }
}
