package ss12_java_collection_framework.exercise.exercise_1.controller;
import ss12_java_collection_framework.exercise.exercise_1.model.ListProduct;
import ss12_java_collection_framework.exercise.exercise_1.service.ChoiceProduct;
import ss12_java_collection_framework.exercise.exercise_1.service.Reverse;
import ss12_java_collection_framework.exercise.exercise_1.service.Sort;
import java.util.Scanner;

public class SortProductController {
    public static void sortProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Hiển Thị Giá Thấp Trước");
        System.out.println("2. Hiển Thị Giá Cao Trước");
        System.out.print("Hãy Nhập Lựa Chọn : ");
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ListProduct.arrayList.sort(new Sort());
                    System.out.println("Đã Chỉnh Sửa Thành Giá Thấp Trước , Hãy Nhập Số 4 Để Kiểm Tra");
                    break;
                case 2:
                    ListProduct.arrayList.sort(new Reverse());
                    System.out.println("Đã Chỉnh Sửa Thành Giá Cao Trước , Hãy Nhập Số 4 Để Kiểm Tra");
                    break;
                default:
                    System.out.print("Hãy Nhập Lại Từ [1-2] : ");
            }
        } while (choice < 1 || choice > 2);
        ChoiceProduct.choiceProduct();
    }
}
