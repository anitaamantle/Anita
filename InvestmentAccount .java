public class Investment extends Account implements InterestBearing, WithdrawMoney {
    
    private static final double MONTHLY_INTEREST_RATE = 0.05;
    private static final double MIN_INITIAL_DEPOSIT = 500.00;

    public Investment(String accountNumber, String accountBranch, double initialBalance) {
        super(accountNumber, accountBranch, initialBalance);

        if (initialBalance < MIN_INITIAL_DEPOSIT) {
            throw new IllegalArgumentException(
                "Initial deposit for Investment account must be at least BWP" + MIN_INITIAL_DEPOSIT
            );
        }
    }


    @Override
    public double calculateInterest() {
        double interestAmount = getBalance() * MONTHLY_INTEREST_RATE;
        deposit(interestAmount); 
        System.out.printf("Applied interest of %.2f to Investment account %s.%n", interestAmount, getAccountNumber());
        return interestAmount;
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
            System.out.printf("ERROR: Insufficient funds in Investment account %s. Current balance: %.2f%n", getAccountNumber(), getBalance());
        }
    }
}
