package case_study.mvc.models.Facility;

public abstract class Facility {
    private String serviceName;
    private int usableArea;
    private double rentCosts;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, int usableArea, double rentCosts, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentCosts = rentCosts;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentCosts() {
        return rentCosts;
    }

    public void setRentCosts(double rentCosts) {
        this.rentCosts = rentCosts;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentCosts=" + rentCosts +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
