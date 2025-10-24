public class Savings extends Account implements InterestBearing {

    private static final double MONTHLY_INTEREST_RATE = 0.0005; // 0.05%


    public Savings(String accountNumber, String accountBranch, double initialBalance) {
        super(accountNumber, accountBranch, initialBalance);
    }


    @Override
    public double calculateInterest() {
        double interestAmount = getBalance() * MONTHLY_INTEREST_RATE;
        deposit(interestAmount);
        System.out.printf("Applied interest of %.2f to Savings account %s.%n", interestAmount, getAccountNumber());
        return interestAmount;
    }

   
    @Override
    public void withdraw(double amount) {
        System.out.printf("ERROR: Withdrawals are NOT allowed for Savings account %s.%n", getAccountNumber());
    }
}
