package Chapter6.Theads.ThreadSynchronization;

public class BankAccount {
    private int balance = 0;
    private final int overdraft;

    public BankAccount(int overdraft) {
        this.overdraft = overdraft;
    }

    void topUp(int amount){
        this.balance += amount;
    }
    void debit(int amount){
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getOverdraft() {
        return overdraft;
    }
}
