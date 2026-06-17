package Main1;

public class Main1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        System.out.println("残高: " + account.getBalance() + " 円");

        account.getBalance();
        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(15000000);

        }
    }
