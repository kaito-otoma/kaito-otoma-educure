package Main1;

public class BankAccount {
    private int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public void getBalance(){
        System.out.println("残高:" + balance + "円");
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println(amount + "円入金しました");
        System.out.println("残高:" + balance + "円");
    }

    public void withdraw(int amount){
        balance -= amount;
            System.out.println(amount + "円引き出しました");
            System.out.println("残高:" + balance + "円");
        if(0 > balance){
            System.out.println("引き出しに失敗しました。残高が不足しています");
        }
    }
}
