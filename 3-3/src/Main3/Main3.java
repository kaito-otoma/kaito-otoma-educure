package Main3;


public class Main3 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        bank.balance = 0;
        System.out.println("残高 : " + bank.balance + "円");

        bank.deposit();
        bank.withdraw();
        bank.withdraw();
    }
}
