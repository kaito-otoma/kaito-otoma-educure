package Main3;

public class Character {
    int hp;
    String name;

public Character(String name, int hp) {
    this.name = name;
    this.hp = hp;
}
    
public void showStatus() {
    System.out.println("名前：" + this.name);
    System.out.println("HP：" + this.hp); 

    }
}
