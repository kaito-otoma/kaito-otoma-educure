package Main5;
import java.util.ArrayList;
import java.util.List;


public class GameCharacter {
    private String name;
    private List<Equipment> weapons;

    public GameCharacter(String name){
        this.name = name;
        this.weapons = new ArrayList<>();
    }
    public void addEquipment(Equipment equipment) {
        this.weapons.add(equipment);
    }
    public void showEquipment() {
        System.out.println(this.name + " の装備一覧:");
        for (int i = 0; i < weapons.size(); i++) {
            System.out.println((i + 1) + ". " + weapons.get(i));
        }
    }
    public void sortEquipment() {
        java.util.Collections.sort(this.weapons);
    }

    public boolean isEquipmentSorted() {
    for (int i = 0; i < weapons.size() - 1; i++) {
        if (weapons.get(i).getPower() < weapons.get(i + 1).getPower()) {
            return false;
        }
    }
    return true;
    }
}