package case_study.mvc.service.impl;

import case_study.mvc.controllers.FacilityController;
import case_study.mvc.model.Room;
import case_study.mvc.model.Villa;
import case_study.mvc.service.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {

    static Map<Integer, Room> roomMap = new LinkedHashMap<>();
    static Map<Integer, Villa> villaMap = new LinkedHashMap<>();

    static {
        Room room1 = new Room("Phòng thường", 25.0, 1000000, 2, "month", "Tặng kèm khăn giấy");
        Room room2 = new Room("Phòng đặc biệt", 30.0, 1500000, 2, "day", "Có nước trong tủ lạnh");
        Room room3 = new Room("Phòng vip", 40.0, 4000000, 4, "day", "Có bình nước nóng");
        Room room4 = new Room("Phòng rẻ", 10.0, 500000, 1, "year", "Tặng cái nịt");

        Villa villa1 = new Villa("Villa thường", 50.0, 10000000, 6, "day", "Ở vừa 2 gia đình", 8.0, 3);
        Villa villa2 = new Villa("Villa đặc biệt", 60.0, 15000000, 8, "day", "Ở vừa 3 gia đình", 10.0, 4);
        Villa villa3 = new Villa("Villa vip", 100.0, 100000000, 12, "month", "Ở vừa 4 gia đình", 12.0, 5);
        Villa villa4 = new Villa("Villa rẻ", 40.0, 8000000, 4, "year", "Ở vừa 1 gia đình", 4.0, 2);

        roomMap.put(1, room1);
        roomMap.put(2, room2);
        roomMap.put(3, room3);
        roomMap.put(4, room4);

        villaMap.put(1, villa1);
        villaMap.put(2, villa2);
        villaMap.put(3, villa3);
        villaMap.put(4, villa4);

    }

    @Override
    public void display() {
        System.out.println("Room List");
        for (Map.Entry<Integer, Room> x : roomMap.entrySet()) {
            System.out.println(x.getValue());
        }
        System.out.println("Villa List");
        for (Map.Entry<Integer, Villa> x : villaMap.entrySet()) {
            System.out.println(x.getValue());
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New Room");
        System.out.println("3. Back to menu");
        System.out.print("enter your choice: ");
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addVilla();
                    break;
                case 2:
                    addRoom();
                    break;
                case 3:
                    FacilityController.getFacilityManagement();
                default:
                    System.out.print("your choice is not available, pls enter again...: ");
            }
        } while (choice < 1 || choice > 3);

    }

    @Override
    public void displayMaintenance() {
       for (Map.Entry<Integer,Villa> x : villaMap.entrySet()) {
           if (x.getValue().getMaximum() <= 4) {
               System.out.println(x.getValue());
           }
       }
        for (Map.Entry<Integer,Room> x : roomMap.entrySet()) {
            if (x.getValue().getMaximum() < 2) {
                System.out.println(x.getValue());
            }
        }
    }


    void addVilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Add new villa by step: ");
        System.out.print("1. Enter service name: ");
        String name = scanner.nextLine();
        System.out.print("2. usable area: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.print("3. rentaCost: ");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.print("4. Maximum of People: ");
        int maximum = Integer.parseInt(scanner.nextLine());
        System.out.print("5. Type rental: ");
        String type = scanner.nextLine();
        System.out.print("6. Room Standard: ");
        String standard = scanner.nextLine();
        System.out.print("7. Pool area: ");
        double pool = Double.parseDouble(scanner.nextLine());
        System.out.print("8. Floor: ");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(name,area,cost,maximum,type,standard,pool,floor);
        villaMap.put(villaMap.size(),villa);
        System.out.println("Complete");
    }

    void addRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Add new Room by step: ");
        System.out.print("1. Enter service name: ");
        String name = scanner.nextLine();
        System.out.print("2. usable area: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.print("3. rentaCost: ");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.print("4. Maximum of People: ");
        int maximum = Integer.parseInt(scanner.nextLine());
        System.out.print("5. Type rental: ");
        String type = scanner.nextLine();
        String service = scanner.nextLine();
        Room room = new Room(name,area,cost,maximum,type,service);
        roomMap.put(roomMap.size(),room);
        System.out.println("Complete");
    }
}
