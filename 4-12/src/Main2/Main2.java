package Main2;

public class Main2 {
        public static void main(String[] args) {
            Monster mons1 = new Monster("スライム", 5);
            Monster mons2 = new Monster("スライム", 5);
            Monster mons3 = new Monster("スライム", 10);

            boolean result = mons1.equals(mons2);
            boolean results = mons1.equals(mons3);

        if (result) {
        System.out.println(mons1 + " と " + mons2 + " は同じモンスターです");
    } else {
        System.out.println(mons1 + " と " + mons2 + " は違うモンスターです");
    }
    if (results) {
        System.out.println(mons1 + " と " + mons3 + " は同じモンスターです");
    } else {
        System.out.println(mons1 + " と " + mons3 + " は違うモンスターです");
    }
    }
}
