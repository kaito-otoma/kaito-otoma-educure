package Main6;

public class Account {
    int accountNumber;
    int balance;

    public Account(int accountNumber){
        this.accountNumber = 12345;
        this.balance = 0;
    }
    public void deposit(Account sm) {
        balance += 1000;
        System.out.println( "残高:" + balance + "円");
    }
    public void Withdrawal(Account sm) {
        balance -= 500;
        System.out.println( "出金後残高:" + balance + "円");
    }

}