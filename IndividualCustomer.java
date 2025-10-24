public class Individual extends Customer {

    private String firstName;
    private String lastName;
    private String maritalStatus;
    private String sourceOfFunds;
    private String employer;

    public Individual(String customerID, String firstName, String lastName, String contactNumber, String email, String dateOfBirth, String maritalStatus, String sourceOfFunds, String employer) {
        super(customerID, firstName + " " + lastName, contactNumber, email, dateOfBirth);
        this.firstName = firstName;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.sourceOfFunds = sourceOfFunds;
        this.employer = employer;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMaritalStatus() { return maritalStatus; }
    public String getSourceOfFunds() { return sourceOfFunds; }
    public String getEmployer() { return employer; }
    
    public void setMaritalStatus(String maritalStatus) { this.maritalStatus = maritalStatus; }
    public void setSourceOfFunds(String sourceOfFunds) { this.sourceOfFunds = sourceOfFunds; }
    public void setEmployer(String employer) { this.employer = employer; }
}
