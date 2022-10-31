package case_study.mvc.model;

public class Customer extends Person {

    private int customerCode;
    private String typeGuest;
    private String address;

    public Customer() {
    }

    public Customer(int customerCode, String typeGuest, String address) {
        this.customerCode = customerCode;
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public Customer(String dateOfBirth, String name, String gender, String identityCard, String email, String phoneNumber, int customerCode, String typeGuest, String address) {
        super(dateOfBirth, name, gender, identityCard, email, phoneNumber);
        this.customerCode = customerCode;
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode=" + customerCode +
                ", typeGuest='" + typeGuest + '\'' +
                ", address='" + address + '\'' + super.toString();
    }
}
