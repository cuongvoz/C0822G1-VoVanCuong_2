package ss2_loop_java.exercise;

import java.util.Scanner;

public class MenuDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter height : ");
                    int height = scanner.nextInt();
                    System.out.println("Enter weight : ");
                    int weight = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < weight; j++) {
                            System.out.print("*" + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter height");
                    int size = scanner.nextInt();
                    for (int i = 0; i <= size; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*" + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter height");
                    int height1 = scanner.nextInt();
                    for (int i = 1; i <= height1; i++) {
                        for (int j = 1; j <= height1 + 3; j++) {
                            if (i + j < 6 || j - i > 4 || i == 6) {
                                System.out.print(" " + "\t");
                            } else {
                                System.out.print("*" + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("End");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (choice != 4);
    }
}
