package case_study.mvc.controllers;

import case_study.mvc.service.impl.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    public static void getCustomerManagement() {
        System.out.println();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer Management");
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        System.out.print("Enter your choice : ");
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerService.display();
                    getCustomerManagement();
                    break;
                case 2:
                    customerService.add();
                    getCustomerManagement();
                    break;
                case 3:
                    customerService.edit();
                    getCustomerManagement();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.print("Số Bạn Nhập Không Hợp Lệ Vui Lòng Nhập Lại Từ [1-4] : ");
            }
        } while (choice <= 0 || choice > 4);
    }
}
