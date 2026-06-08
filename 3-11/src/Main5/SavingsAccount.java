package Main5;

public class SavingsAccount implements BankAccount{
    String name;
    int balance;

    public SavingsAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void name(){
        System.out.println("口座名義人:" + this.name);
    }

    @Override
    public void deposit(int amount){
        if (amount <= 0) {
            System.out.println("無効な金額です。");
            return;
        }
        this.balance += amount;
        System.out.println(amount + "円入金しました");
    }

    @Override
    public void withdraw(int amount){
        if (amount <= 0) {
            System.out.println("無効な金額です。");
            return;
        }
            if(balance < 0){
        System.out.println("お金を引き出すことが出来ませんでした");
        return;
    }
        this.balance -= amount;
        System.out.println(amount + "円出金しました");
    }

     @Override
    public int getBalance(){
        System.out.println("残高:" + this.balance);
        return this.balance;
    }

    @Override
    public void displayAccountInfo(){
        System.out.println("口座名義人:" + this.name);
    if (balance < 0){
        System.out.println("残高がありません");
    } else {
        System.out.println("残高:" + this.balance);
        }
    }
}