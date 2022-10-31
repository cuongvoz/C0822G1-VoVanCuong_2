package case_study.mvc.model;

public class Employee extends Person {
    private String employeeCode;
    private String level;
    private double salary;
    private String position;

    public Employee() {
    }

    public Employee(String employeeCode, String level, double salary, String position) {
        this.employeeCode = employeeCode;
        this.level = level;
        this.salary = salary;
        this.position = position;
    }

    public Employee(String dateOfBirth, String name, String gender, String identityCard, String email, String phoneNumber, String employeeCode, String level, double salary, String position) {
        super(dateOfBirth, name, gender, identityCard, email, phoneNumber);
        this.employeeCode = employeeCode;
        this.level = level;
        this.salary = salary;
        this.position = position;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' + super.toString();
    }
}
