package case_study.mvc.model;

public class Room extends Facility {
    private String freeService;


    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, double usableArea, double rentalCosts, int maximum, String typeRental, String freeService) {
        super(serviceName, usableArea, rentalCosts, maximum, typeRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' + super.toString();
    }
}
