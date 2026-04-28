package Main1;

public class Main1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.getBalance();
        account.deposit(2000);
        account.withdraw(1500);

        }
    }
