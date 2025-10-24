import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    private String accountNumber;
    private double accountBalance;
    private String accountBranch;
    private List<String> transactions; 

    public Account(String accountNumber, String accountBranch, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountBranch = accountBranch;
        this.accountBalance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            String transactionRecord = String.format("DEPOSIT: +%.2f (Branch: %s) New Balance: %.2f", amount, this.accountBranch, this.accountBalance);
            this.transactions.add(transactionRecord); 
            System.out.println(transactionRecord);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public abstract void withdraw(double amount); 

    public double getBalance() {
        return accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
    public List<String> getTransactions() {
        return transactions;
    }

    protected void setBalance(double newBalance) {
        this.accountBalance = newBalance;
    }

    protected void recordWithdrawal(double amount) {
        String transactionRecord = String.format("WITHDRAWAL: -%.2f (Branch: %s) New Balance: %.2f", amount, this.accountBranch, this.accountBalance);
        this.transactions.add(transactionRecord); 
        System.out.println(transactionRecord);
    }
}
