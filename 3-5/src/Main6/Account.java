package Main6;

public class Account {
    int accountNumber;
    int balance;

    public Account(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(int dep) {
        balance += dep;
        System.out.println( "残高:" + balance + "円");
    }
    public void Withdrawal(int with) {
        balance -= with;
        System.out.println( "出金後残高:" + balance + "円");
    }

}