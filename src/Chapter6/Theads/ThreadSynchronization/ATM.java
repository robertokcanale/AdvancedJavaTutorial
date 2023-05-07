package Chapter6.Theads.ThreadSynchronization;

public class ATM {
    //SYNCHRONIZED = only1 thread can enter the method at a time
    static synchronized void withdraw(BankAccount account, int amount){
        int balance = account.getBalance();
        if((balance-amount) < -account.getOverdraft()){
            System.out.println("Transaction Denied.");
        } else {
            account.debit(amount);
            System.out.println("$"+ amount + "Withdrawn.");
        }
        System.out.println("Current Balance: "+ account.getBalance());

    }
}
