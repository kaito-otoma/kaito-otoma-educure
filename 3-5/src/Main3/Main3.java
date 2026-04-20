package Main3;

public class Main3 {
    public static void main(String[] args) {
    BankAccount account1 = new BankAccount();
    account1.balance = 3000;
    System.out.println("口座1の残高:" + account1.balance);

    BankAccount account2 = new BankAccount();
    account2.balance = 3000;
    System.out.println("口座2の残高:" + account1.balance);
    
    }
}
