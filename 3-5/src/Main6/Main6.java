package Main6;

public class Main6 {
    public static void main(String[] args) {
    Account sm = new Account(12345);
    System.out.println("口座番号" + sm.accountNumber);

    sm.deposit(sm);
    sm.Withdrawal(sm);

    }
}