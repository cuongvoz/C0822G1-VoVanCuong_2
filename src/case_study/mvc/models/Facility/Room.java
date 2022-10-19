package case_study.mvc.models.Facility;

public class Room extends Facility {
   private String freeService;

   public Room(){
   }

    public Room(String serviceName, int usableArea, double rentCosts, String rentalType, String freeService) {
        super(serviceName, usableArea, rentCosts, rentalType);
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
                "freeService='" + freeService + '\'' +
                '}' + super.toString();
    }
}
