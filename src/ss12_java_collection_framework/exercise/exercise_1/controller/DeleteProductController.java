package ss12_java_collection_framework.exercise.exercise_1.controller;
import ss12_java_collection_framework.exercise.exercise_1.model.ListProduct;
import ss12_java_collection_framework.exercise.exercise_1.service.ChoiceProduct;

import java.util.Scanner;
public class DeleteProductController {
    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy Nhập ID Sản Phẩm Mà Bạn Muốn Xóa : ");
        int id = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < ListProduct.arrayList.size(); i++) {
            if (ListProduct.arrayList.get(i).getId() == id) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Sản Phẩm Không Tồn Tại");
            ChoiceProduct.choiceProduct();
        } else {
            System.out.println("Sản Phẩm " + ListProduct.arrayList.get(index).getName() + " Đã Được Xóa");
            ListProduct.arrayList.remove(index);
            ChoiceProduct.choiceProduct();
        }

    }
}

