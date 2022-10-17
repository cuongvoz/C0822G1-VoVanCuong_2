package case_study.mvc.controllers;

import case_study.mvc.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController{
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int choice;
        System.out.println("=====Menu====");
        System.out.println("1. \tEmployee Management");
        System.out.println("2. \tCustomer Management");
        System.out.println("3. \tFacility Management ");
        System.out.println("4. \tBooking Management");
        System.out.println("5. \tPromotion Management");
        System.out.println("6. \tExit");
        System.out.println("Enter your choice");
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tDelete employee\n" +
                            "4\tEdit employee\n" +
                            "5\tReturn main menu\n");
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");

                    break;
                case 3:
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tReturn main menu\n");
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    break;
                case 6:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Enter again 1,2,3,4,5,6");
            }

        } while (choice != 6);
    }
}
