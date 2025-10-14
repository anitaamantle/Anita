import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

    private String customerID;
    private String customerName;
    private List<Account> accounts; 


    public Customer(String customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.accounts = new ArrayList<>();
    }




    public void openAccount(Account account) {
        if (account != null) {
            this.accounts.add(account);
            System.out.println("Account " + account.getAccountNumber() + " opened for " + this.customerName);
        }
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
