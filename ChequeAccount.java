public class Cheque extends Account implements WithdrawMoney {

    private String employerName;
    private String employerAddress;


    public Cheque(String accountNumber, String accountBranch, double initialBalance, String employerName, String employerAddress) {
        super(accountNumber, accountBranch, initialBalance);
        this.employerName = employerName;
        this.employerAddress = employerAddress;
    }

 
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            recordWithdrawal(amount);
        } else {
            System.out.printf("ERROR: Insufficient funds in Cheque account %s. Current balance: %.2f%n", getAccountNumber(), getBalance());
        }
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }
}
