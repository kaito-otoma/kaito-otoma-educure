public class Main3 {
    public static void main(String[] args) {

        int attackPower =15; 
        int defensePower =5; 
        int totalDamage =(attackPower * 2 - defensePower)/3; //小数点切り捨て

        System.out.println("与えるダメージ:"+ totalDamage);
    }

    
}
