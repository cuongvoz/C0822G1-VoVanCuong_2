package ss2_loop_java.practice;

import java.util.Scanner;

public class DrawMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("1. Draw Triangle");
        System.out.println("2. Draw Square");
        System.out.println("3. Draw Rectangle");
        System.out.println("0. Exit menu");
        System.out.println("Enter your choice");
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Draw Triangle");
                System.out.println("*************");
                System.out.println("**********");
                System.out.println("*******");
                System.out.println("****");
                System.out.println("*");
                break;
                case 2:
                    System.out.println("Draw Square");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    break;
                case 3:
                    System.out.println("Draw Rectangle");
                    System.out.println("********************");
                    System.out.println("********************");
                    System.out.println("********************");
                    System.out.println("********************");
                    break;
                case 0:
                    System.out.println("End Game");
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;
            }
        }
    }
}
