package ss12_java_collection_framework.exercise.exercise_1.controller;
import ss12_java_collection_framework.exercise.exercise_1.model.ListProduct;
import ss12_java_collection_framework.exercise.exercise_1.service.ChoiceProduct;

import java.util.Scanner;

public class GetProductController {
    public static void getProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Tên Sản Phẩm Bạn Muốn Tìm Kiếm : ");
        String name = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < ListProduct.arrayList.size(); i++) {
            if (ListProduct.arrayList.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Sản Phẩm Không Tồn Tại");
        } else {
            System.out.println(ListProduct.arrayList.get(index));
        }
        ChoiceProduct.choiceProduct();
    }
}
