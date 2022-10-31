package case_study.mvc.controllers;

import case_study.mvc.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    public static void getEmployeeManagement() {
        System.out.println();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee Management");
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tDelete employee\n" +
                "4\tEdit employee\n" +
                "5\tReturn main menu\n");
        System.out.print("Enter your choice : ");
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    employeeService.display();
                   getEmployeeManagement();
                    break;
                case 2:
                    employeeService.add();
                    getEmployeeManagement();
                    break;
                case 3:
                    employeeService.delete();
                    getEmployeeManagement();
                    break;
                case 4:
                    employeeService.edit();
                    getEmployeeManagement();
                    break;
                case 5:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.print("Số Bạn Nhập Không Hợp Lệ Vui Lòng Nhập Lại Từ [1-5] : ");
            }
        } while (choice <= 0 || choice > 5);
    }
}
