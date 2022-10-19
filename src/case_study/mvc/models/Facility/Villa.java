package case_study.mvc.models.Facility;

public class Villa extends Facility{
    private String standardRoom;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String serviceName, int usableArea, double rentCosts, String rentalType, String standardRoom, double poolArea, int floor) {
        super(serviceName, usableArea, rentCosts, rentalType);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}' + super.toString();
    }
}
