package case_study.mvc.controllers;

import java.util.Scanner;

public abstract class  FuramaController {
    void displayMainMenu() {
        System.out.println("1. \tEmployee Management");
        System.out.println("2. \tCustomer Management");
        System.out.println("3. \tFacility Management ");
        System.out.println("4. \tBooking Management");
        System.out.println("5. \tPromotion Management");
        System.out.println("6. \tExit");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
           choice = scanner.nextInt();
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tDelete employee");
            System.out.println("4\tEdit employee");
            System.out.println("5\tReturn main menu");

        } while (choice != 5);
    };
}
