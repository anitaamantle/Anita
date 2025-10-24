import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BankService {

    private Map<String, Customer> customerMap;
    private Map<String, Account> accountMap;
    private List<Transaction> allTransactions;
    private Customer loggedInCustomer;

    public BankService() {
        this.customerMap = new HashMap<>();
        this.accountMap = new HashMap<>();
        this.allTransactions = new ArrayList<>();
        initializeTestData(); 
    }

    private void initializeTestData() {
        Individual customerAmantle = new Individual(
            "AM1234", "Amantle", "Motsumi", 
            "71223344", "amantle.motsumi@email.com", "1990-05-15", 
            "Single", "Investment Income", "Self-Employed"
        );
        customerMap.put(customerAmantle.getCustomerID(), customerAmantle);

        Account savingsAmantle = new Savings("SAV001", "Gaborone Branch", 8500.50);
        customerAmantle.openAccount(savingsAmantle);
        accountMap.put(savingsAmantle.getAccountNumber(), savingsAmantle);

        Account chequeAmantle = new Cheque("CHQ002", "Gaborone Branch", 2100.00, "Amantle's Consulting", "Plot 101, Main Mall");
        customerAmantle.openAccount(chequeAmantle);
        accountMap.put(chequeAmantle.getAccountNumber(), chequeAmantle);


        Organisation customerIITA = new Organisation(
            "ORG555", "IITA Solutions (Pty) Ltd", "BW/001/2021", 
            "3901000", "finance@iitasolutions.com", "2021-01-20"
        );
        customerMap.put(customerIITA.getCustomerID(), customerIITA);

        Account investmentIITA = new Investment("INV003", "Fairgrounds Branch", 50000.00);
        customerIITA.openAccount(investmentIITA);
        accountMap.put(investmentIITA.getAccountNumber(), investmentIITA);
    }
    
    public Customer login(String customerID) {
        Customer customer = customerMap.get(customerID);
        if (customer != null) {
            this.loggedInCustomer = customer;
            return customer;
        }
        return null;
    }

    public void logout() {
        this.loggedInCustomer = null;
    }
    
    public Customer getLoggedInCustomer() {
        return loggedInCustomer;
    }

    public boolean openAccount(Customer customer, Account newAccount) {
        if (customer == null || newAccount == null) return false;

        customer.openAccount(newAccount);
        accountMap.put(newAccount.getAccountNumber(), newAccount);
        return true;
    }
    
    public boolean registerCustomer(Customer newCustomer) {
        if (customerMap.containsKey(newCustomer.getCustomerID())) {
            return false;
        }
        customerMap.put(newCustomer.getCustomerID(), newCustomer);
        return true;
    }
    
    private void recordTransaction(String accountNumber, String type, double amount) {
        String id = UUID.randomUUID().toString();
        Transaction t = new Transaction(id, accountNumber, type, amount);
        allTransactions.add(t);
    }

    public boolean depositFunds(String accountNumber, double amount) {
        Account account = accountMap.get(accountNumber);
        if (account != null && amount > 0) {
            account.deposit(amount);
            recordTransaction(accountNumber, "DEPOSIT", amount);
            return true;
        }
        return false;
    }

    public boolean withdrawFunds(String accountNumber, double amount) {
        Account account = accountMap.get(accountNumber);
        if (account != null && amount > 0) {
            double oldBalance = account.getBalance();
            
            account.withdraw(amount); 
            
            if (account.getBalance() < oldBalance) {
                recordTransaction(accountNumber, "WITHDRAWAL", amount);
                return true;
            }
        }
        return false;
    }

    public List<Transaction> getTransactionsForCustomer(String customerID) {
        Customer customer = customerMap.get(customerID);
        if (customer == null) return new ArrayList<>();

        List<Transaction> customerTransactions = new ArrayList<>();
        List<String> customerAccountNumbers = new ArrayList<>();
        
        for (Account acc : customer.getAccounts()) {
            customerAccountNumbers.add(acc.getAccountNumber());
        }

        for (Transaction t : allTransactions) {
            if (customerAccountNumbers.contains(t.getAccountNumber())) {
                customerTransactions.add(t);
            }
        }
        return customerTransactions;
    }
}
