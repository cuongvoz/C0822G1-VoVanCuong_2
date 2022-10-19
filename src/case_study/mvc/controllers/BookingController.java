package case_study.mvc.controllers;

import java.util.Scanner;

public class BookingController {
    public static void getBookingManagement() {
        System.out.println();
        System.out.println("Booking Management");
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tReturn main menu\n");
        System.out.print("Enter your choice : ");
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.print("Số Bạn Nhập Không Hợp Lệ Vui Lòng Nhập Lại Từ [1-3] : ");
            }
        } while (choice <= 0 || choice > 3);
    }
}
