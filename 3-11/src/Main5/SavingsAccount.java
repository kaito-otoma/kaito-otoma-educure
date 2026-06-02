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
        this.balance += amount;
        System.out.println(amount + "円入金しました");
    }

    @Override
    public void withdraw(int amount){
        this.balance -= amount;
        System.out.println(amount + "円出金しました");
    if(balance < 0){
        System.out.println("お金を引き出すことが出来ませんでした");
    }
    }

     @Override
    public void getBalance(){
    if (balance < 0){
        System.out.println("残高がありません");
    } else {
        System.out.println("残高:" + this.balance);
        }
    }

    @Override
    public void displayAccountlnfo(){
        System.out.println("口座名義人:" + this.name);
    if (balance < 0){
        System.out.println("残高がありません");
    } else {
        System.out.println("残高:" + this.balance);
        }
    }
}