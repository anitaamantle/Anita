
   public class mainClass {
     public static void main(String[] args) {
       
        System.out.println("Creating Customers");
        
    
        Individual AnitaThamage = new Individual("CUST001", "Anita", "Thamage"); 
        AnitaThamage.setCustomerAddress("2933 Kgonono St"); 
        AnitaThamage.setCustomerPhone("72725894");
        System.out.println("Individual Customer: " + Anita.getFirstName() + " " + Thamage.getLastName() + " (ID: " + AnitaThamage.getCustomerID() + ")");

       
        Organisation bigCorp = new Organisation("CUST002", "Big Corp Inc.", "REG456");
        bigCorp.setCustomerAddress("456 Fairgrounds Ave");
        System.out.println("Organisation Customer: " + bigCorp.getOrganisationName() + " (Reg: " + bigCorp.getRegistrationNumber() + ")");


        System.out.println("Creating Accounts");
        
        
        Savings AnitaSavings = new Savings("S-1001", 5000.00, "BranchA"); 
        AnitaSavings.deposit(100.00);
        System.out.println("Anita Savings Balance: $" + AnitaSavings.getBalance());
        
        // Call a method specific to Savings via the interface method
        double interest = AnitaSavings.calculateInterest();
        System.out.println("Calculated Interest: $" + interest);
        
        // Create an Investment Account (for Big Corp)
        Investment bigCorpInvestment = new Investment("I-2002", 50000.00, "BranchB"); 
        bigCorpInvestment.withdraw(2000.00);
        System.out.println("Big Corp Investment Balance after withdrawal: $" + bigCorpInvestment.getBalance());
       
        System.out.println("Account Operations");
        
  
        Account myAccount = AnitaSavings;
        myAccount.deposit(50.00);
        System.out.println("Balance after $50 deposit: $" + myAccount.getBalance());
        
       
        Cheque bigCorpCheque = new Cheque("C-3003", 10000.00, "BranchB", "Big Corp Inc.", "456 Fairgrounds Ave");
        bigCorpCheque.withdraw(500.00); 
        System.out.println("Big Corp Cheque Balance: $" + bigCorpCheque.getBalance());
    }
}