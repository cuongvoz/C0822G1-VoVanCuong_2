package case_study.mvc.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("==========Menu=========");
        System.out.println("1. \tEmployee Management");
        System.out.println("2. \tCustomer Management");
        System.out.println("3. \tFacility Management ");
        System.out.println("4. \tBooking Management");
        System.out.println("5. \tPromotion Management");
        System.out.println("6. \tExit");
        System.out.print("Enter your choice : ");
        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    EmployeeController.getEmployeeManagement();
                    break;
                case 2:
                    CustomerController.getCustomerManagement();
                    break;
                case 3:
                    FacilityController.getFacilityManagement();
                    break;
                case 4:
                    BookingController.getBookingManagement();
                    break;
                case 5:
                    PromotionController.getPromotionManagement();
                    break;
                case 6:
                    System.out.println("Exit System");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Số Bạn Nhập Không Hợp Lệ Vui Lòng Nhập Lại [1-6] : ");
            }
        } while (choice <= 0 || choice > 6);
    }


}

