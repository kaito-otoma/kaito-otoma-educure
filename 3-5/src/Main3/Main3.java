package Main3;

public class Main3 {
    public static void main(String[] args) {
    BankAccount account2 = new BankAccount(0);
    account2.balance = 3000;
    BankAccount account1 = account2;

    System.out.println("口座1の残高:" + account1.balance);
    System.out.println("口座2の残高:" + account2.balance);
    
    }
}
