import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

    private String customerID;
    private String customerName;
    private String contactNumber;
    private String email;
    private String dateOfBirth;
    private List<Account> accounts; 

    public Customer(String customerID, String customerName, String contactNumber, String email, String dateOfBirth) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        if (account != null) {
            this.accounts.add(account);
            System.out.println("Account " + account.getAccountNumber() + " opened for " + this.customerName);
        }
    }

    public String getCustomerID() { return customerID; }
    public String getCustomerName() { return customerName; }
    public String getContactNumber() { return contactNumber; }
    public String getEmail() { return email; }
    public String getDateOfBirth() { return dateOfBirth; }
    public List<Account> getAccounts() { return accounts; }
    
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public void setEmail(String email) { this.email = email; }
}
