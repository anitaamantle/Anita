public class Organisation extends Customer {

    private String organisationName;
    private String registrationNumber;

    public Organisation(String customerID, String organisationName, String registrationNumber, String contactNumber, String email, String dateOfEstablishment) {
        super(customerID, organisationName, contactNumber, email, dateOfEstablishment); 
        this.organisationName = organisationName;
        this.registrationNumber = registrationNumber;
    }

    public String getOrganisationName() { return organisationName; }
    public String getRegistrationNumber() { return registrationNumber; }
    
    public void setOrganisationName(String organisationName) { this.organisationName = organisationName; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
}
