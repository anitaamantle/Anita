public class Investment extends Account implements InterestBearing, WithdrawMoney {
    // Constants
    private static final double MONTHLY_INTEREST_RATE = 0.05; // 5%
    private static final double MIN_INITIAL_DEPOSIT = 500.00; // BWP500

    // Constructor with initial deposit validation (from Activity Diagram)
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
        deposit(interestAmount); // Use the deposit method to apply interest
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
            System.out.printf("Withdrew %.2f from Investment account %s. New balance: %.2f%n", amount, getAccountNumber(), getBalance());
        } else {
            System.out.printf("ERROR: Insufficient funds in Investment account %s. Current balance: %.2f%n", getAccountNumber(), getBalance());
        }
    }
}
