package Main4;

public class Main4 {
    public static void main(String[] args) {
    Weapon sword = new Weapon();
    
    sword.name = "伝説の剣";
    sword.setWeapon(sword.name, 100);
    
    sword.use();
    sword.use();
    sword.use();
    sword.use();
    sword.use();
    sword.use();
    sword.use();
    sword.use();
    sword.use();
    sword.use();
    sword.use();
    sword.repair();
    sword.use();
    }
}