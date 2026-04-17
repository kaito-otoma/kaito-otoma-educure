package Main1;

public class Main1 {
    public static void main(String[] args) {
        Pet pets = new Pet();

        pets.name = "ポチ";
        pets.energy = 100;

        System.out.println(pets.name + "を生み出しました!");
        System.out.println("初期体力 ： " + pets.energy);

        pets.eat();
        pets.showEnergy();
        pets.play();
        pets.showEnergy();
    }
}
