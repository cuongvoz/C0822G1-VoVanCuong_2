package case_study.mvc.controllers;

import case_study.mvc.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityController {
    public static void getFacilityManagement() {
        System.out.println();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Facility Management");
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");
        System.out.print("Enter your choice : ");
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 4) {
                System.out.print("Số Bạn Nhập Không Hợp Lệ Vui Lòng Nhập Lại Từ [1-4] : ");
            }
            switch (choice) {
                case 1:
                    facilityService.display();
                    getFacilityManagement();
                    break;
                case 2:
                    facilityService.add();
                    getFacilityManagement();
                    break;
                case 3:
                    facilityService.displayMaintenance();
                    getFacilityManagement();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
            }
        } while (choice <= 0 || choice >= 4);

    }
}



