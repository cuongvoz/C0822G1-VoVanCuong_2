package ss12_java_collection_framework.exercise.exercise_1.service;

import ss12_java_collection_framework.exercise.exercise_1.controller.*;

import java.util.Scanner;

public class ChoiceProduct {
    public static void choiceProduct() {
        System.out.print("Hãy Nhập Lựa Chọn Của Bạn : ");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddProductController.addProduct();
                    break;
                case 2:
                    EditProductController.editProduct();
                    break;
                case 3:
                    DeleteProductController.deleteProduct();
                    break;
                case 4:
                    DisplayProductController.displayProduct();
                    break;
                case 5:
                    GetProductController.getProduct();
                    break;
                case 6:
                    SortProductController.sortProduct();
                    break;
                case 7:
                    System.out.println("Thoát Chương Trình");
                    System.exit(0);
                default:
                    System.out.print("Hãy Nhập Lại Từ [1-6] : ");
            }
        } while (choice <= 0 || choice > 6);
    }
}
