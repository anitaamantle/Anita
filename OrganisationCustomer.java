public class Organisation extends Customer {


    private String organisationName;
    private String registrationNumber;



    public Organisation(String customerID, String organisationName, String registrationNumber) {
        // Use organisationName for the base class CustomerName
        super(customerID, organisationName);
        this.organisationName = organisationName;
        this.registrationNumber = registrationNumber;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
