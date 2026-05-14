package Main3;

public class BankAccount {
    int balance;
    

public void getBalance(){
    System.out.println("残高 ：" + this.balance + "円");
}

public void deposit(int amount){
    this.balance += amount;
    System.out.println(amount + "円預けました");
    System.out.println("残高 ：" + this.balance + "円");
}

public void withdraw(int amount){
if (this.balance >= amount) {
    this.balance -= amount;
    System.out.println(amount + "円引き出しました");
    System.out.println("残高 ：" + this.balance + "円");
 } else {
        System.out.println("残高が不足しています");
        }
    }
}