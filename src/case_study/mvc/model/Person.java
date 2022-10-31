package case_study.mvc.model;

public abstract class Person {
    private String dateOfBirth;
    private String name;
    private String gender;
    private String identityCard;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String dateOfBirth, String name, String gender, String identityCard, String email, String phoneNumber) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.gender = gender;
        this.identityCard = identityCard;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard=" + identityCard +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
